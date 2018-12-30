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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 10, 100.0d);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        java.util.Set set47 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap49);
        collections.Factory factory52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1));
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (-1), (double) 10L);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.util.Set set25 = defaultedMap19.entrySet();
        defaultedMap19.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.Transformer transformer38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, transformer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
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
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) (short) -1);
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) (-1.0d));
        java.util.Collection collection29 = defaultedMap11.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0f + "'", obj26.equals(10.0f));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 10.0f + "'", obj28.equals(10.0f));
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        java.util.Set set36 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap11.containsValue((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b48 = defaultedMap46.isEmpty();
        defaultedMap42.putAll((java.util.Map) defaultedMap46);
        java.util.Set set50 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        boolean b54 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b62 = defaultedMap60.isEmpty();
        defaultedMap56.putAll((java.util.Map) defaultedMap60);
        java.util.Set set64 = defaultedMap60.keySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap60);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        int i69 = defaultedMap60.size();
        boolean b70 = defaultedMap32.containsKey((java.lang.Object) defaultedMap60);
        java.util.Collection collection71 = defaultedMap32.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0f + "'", obj26.equals(10.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection71);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        java.util.Set set47 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap49);
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap5.equals(obj52);
        collections.Factory factory54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (-1), obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.util.Set set39 = defaultedMap35.keySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) map43);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap44);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0f + "'", obj45.equals(10.0f));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        int i13 = defaultedMap11.size();
        java.lang.String str14 = defaultedMap11.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        java.util.Set set47 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap49);
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap5.equals(obj52);
        defaultedMap5.clear();
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap5.containsKey(obj55);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        java.util.Set set36 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap11.containsValue((java.lang.Object) defaultedMap32);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b49 = defaultedMap47.isEmpty();
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.util.Set set51 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        boolean b55 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b59 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b63 = defaultedMap61.isEmpty();
        defaultedMap57.putAll((java.util.Map) defaultedMap61);
        java.util.Set set65 = defaultedMap61.keySet();
        defaultedMap53.putAll((java.util.Map) defaultedMap61);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate41, predicate68);
        java.util.Set set71 = defaultedMap11.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0f + "'", obj26.equals(10.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(set71);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        java.util.Set set19 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b23 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b27 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        java.util.Set set33 = defaultedMap29.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap29);
        java.lang.Object obj36 = defaultedMap21.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b40 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        boolean b50 = defaultedMap21.containsValue((java.lang.Object) defaultedMap42);
        boolean b52 = defaultedMap21.containsValue((java.lang.Object) ' ');
        java.lang.Object obj53 = defaultedMap9.get((java.lang.Object) defaultedMap21);
        collections.Factory factory54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 10.0f + "'", obj36.equals(10.0f));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) map27);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 10L);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b40 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b51 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b55 = defaultedMap53.isEmpty();
        defaultedMap49.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj58 = defaultedMap49.remove((java.lang.Object) (short) 0);
        java.lang.Object obj59 = defaultedMap42.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set60 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) set60);
        java.lang.Object obj62 = defaultedMap30.put((java.lang.Object) false, (java.lang.Object) defaultedMap61);
        int i63 = defaultedMap30.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i63 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 100, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) map27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b36 = defaultedMap34.isEmpty();
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj39 = defaultedMap30.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b43 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b47 = defaultedMap45.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        java.util.Set set49 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b53 = defaultedMap52.isEmpty();
        boolean b54 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap52.putAll((java.util.Map) defaultedMap56);
        java.lang.Object obj61 = defaultedMap52.remove((java.lang.Object) (short) 0);
        java.lang.Object obj62 = defaultedMap45.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set63 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) set63);
        boolean b65 = defaultedMap30.equals((java.lang.Object) set63);
        boolean b66 = defaultedMap28.containsValue((java.lang.Object) set63);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Collection collection13 = defaultedMap5.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 0, (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        java.util.Set set36 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap11.containsValue((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b48 = defaultedMap46.isEmpty();
        defaultedMap42.putAll((java.util.Map) defaultedMap46);
        java.util.Set set50 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        boolean b54 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b62 = defaultedMap60.isEmpty();
        defaultedMap56.putAll((java.util.Map) defaultedMap60);
        java.util.Set set64 = defaultedMap60.keySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap60);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        int i69 = defaultedMap60.size();
        boolean b70 = defaultedMap32.containsKey((java.lang.Object) defaultedMap60);
        java.util.Collection collection71 = defaultedMap60.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0f + "'", obj26.equals(10.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection71);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj11 = defaultedMap5.put((java.lang.Object) 10.0f, (java.lang.Object) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (byte) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.util.Set set34 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        boolean b38 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b42 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b45 = defaultedMap44.isEmpty();
        boolean b46 = defaultedMap44.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        java.util.Set set48 = defaultedMap44.keySet();
        defaultedMap36.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj51 = defaultedMap36.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b55 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b59 = defaultedMap57.isEmpty();
        defaultedMap53.putAll((java.util.Map) defaultedMap57);
        java.util.Set set61 = defaultedMap57.keySet();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap57.putAll((java.util.Map) defaultedMap63);
        boolean b65 = defaultedMap36.containsValue((java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b68 = defaultedMap67.isEmpty();
        boolean b69 = defaultedMap67.isEmpty();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b72 = defaultedMap71.isEmpty();
        boolean b73 = defaultedMap71.isEmpty();
        defaultedMap67.putAll((java.util.Map) defaultedMap71);
        java.util.Set set75 = defaultedMap71.keySet();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap71.putAll((java.util.Map) defaultedMap77);
        boolean b79 = defaultedMap77.isEmpty();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b82 = defaultedMap81.isEmpty();
        boolean b83 = defaultedMap81.isEmpty();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b86 = defaultedMap85.isEmpty();
        boolean b87 = defaultedMap85.isEmpty();
        defaultedMap81.putAll((java.util.Map) defaultedMap85);
        java.util.Set set89 = defaultedMap85.keySet();
        defaultedMap77.putAll((java.util.Map) defaultedMap85);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate91, predicate92);
        int i94 = defaultedMap85.size();
        boolean b95 = defaultedMap57.containsKey((java.lang.Object) defaultedMap85);
        boolean b96 = defaultedMap57.isEmpty();
        java.lang.Object obj98 = defaultedMap57.remove((java.lang.Object) (byte) 1);
        boolean b99 = defaultedMap16.containsValue((java.lang.Object) defaultedMap57);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 10.0f + "'", obj51.equals(10.0f));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 0, (double) 10L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b40 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b51 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b55 = defaultedMap53.isEmpty();
        defaultedMap49.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj58 = defaultedMap49.remove((java.lang.Object) (short) 0);
        java.lang.Object obj59 = defaultedMap42.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set60 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) set60);
        java.lang.Object obj62 = defaultedMap30.put((java.lang.Object) false, (java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b66 = defaultedMap64.isEmpty();
        defaultedMap64.clear();
        boolean b68 = defaultedMap30.containsKey((java.lang.Object) defaultedMap64);
        java.lang.Object obj69 = new java.lang.Object();
        boolean b70 = defaultedMap64.containsKey(obj69);
        boolean b71 = defaultedMap64.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.clear();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 0, (double) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        java.util.Collection collection26 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b49 = defaultedMap47.isEmpty();
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.util.Set set51 = defaultedMap47.keySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj53 = defaultedMap21.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap39);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj55 = defaultedMap39.remove((java.lang.Object) predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate54, predicate56);
        boolean b59 = defaultedMap13.containsKey((java.lang.Object) (short) 1);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b5 = defaultedMap4.isEmpty();
        boolean b6 = defaultedMap4.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b9 = defaultedMap8.isEmpty();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        java.util.Set set12 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b20 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap18.putAll((java.util.Map) defaultedMap22);
        java.util.Set set26 = defaultedMap22.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.util.Set set39 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap35.putAll((java.util.Map) defaultedMap41);
        boolean b43 = defaultedMap14.containsValue((java.lang.Object) defaultedMap35);
        java.lang.String str44 = defaultedMap35.toString();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) defaultedMap35);
        java.util.Set set46 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10.0f + "'", obj29.equals(10.0f));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b49 = defaultedMap47.isEmpty();
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.util.Set set51 = defaultedMap47.keySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap47);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        java.lang.String str56 = defaultedMap47.toString();
        boolean b57 = defaultedMap11.containsValue((java.lang.Object) str56);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0f + "'", obj27.equals(10.0f));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        boolean b24 = defaultedMap5.containsKey((java.lang.Object) (byte) -1);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 10L);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        java.util.Collection collection38 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b43 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b47 = defaultedMap45.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        java.util.Set set49 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        boolean b53 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b56 = defaultedMap55.isEmpty();
        boolean b57 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b61 = defaultedMap59.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap59);
        java.util.Set set63 = defaultedMap59.keySet();
        defaultedMap51.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj65 = defaultedMap33.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap51);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap51.remove((java.lang.Object) predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate27, predicate66);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        java.util.Collection collection24 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        boolean b39 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b43 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b47 = defaultedMap45.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        java.util.Set set49 = defaultedMap45.keySet();
        defaultedMap37.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj51 = defaultedMap19.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap37);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj53 = defaultedMap37.remove((java.lang.Object) predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate52, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b59 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b62 = defaultedMap61.isEmpty();
        boolean b63 = defaultedMap61.isEmpty();
        defaultedMap57.putAll((java.util.Map) defaultedMap61);
        java.util.Set set65 = defaultedMap61.keySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap61.putAll((java.util.Map) defaultedMap67);
        boolean b69 = defaultedMap67.isEmpty();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b72 = defaultedMap71.isEmpty();
        boolean b73 = defaultedMap71.isEmpty();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b76 = defaultedMap75.isEmpty();
        boolean b77 = defaultedMap75.isEmpty();
        defaultedMap71.putAll((java.util.Map) defaultedMap75);
        java.util.Set set79 = defaultedMap75.keySet();
        defaultedMap67.putAll((java.util.Map) defaultedMap75);
        java.lang.Object obj82 = defaultedMap67.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b85 = defaultedMap84.isEmpty();
        boolean b86 = defaultedMap84.isEmpty();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b89 = defaultedMap88.isEmpty();
        boolean b90 = defaultedMap88.isEmpty();
        defaultedMap84.putAll((java.util.Map) defaultedMap88);
        java.util.Set set92 = defaultedMap88.keySet();
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap88.putAll((java.util.Map) defaultedMap94);
        boolean b96 = defaultedMap67.containsValue((java.lang.Object) defaultedMap88);
        boolean b97 = defaultedMap11.equals((java.lang.Object) defaultedMap67);
        collections.Transformer transformer98 = null;
        try {
            java.util.Map map99 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 10.0f + "'", obj82.equals(10.0f));
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue(b97 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b3 = defaultedMap2.isEmpty();
        boolean b4 = defaultedMap2.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap6.isEmpty();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome3 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(iterator_chromosome3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) defaultedMap25);
        java.lang.String str28 = defaultedMap11.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0f + "'", obj27.equals(10.0f));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate26);
        java.util.Set set28 = defaultedMap19.keySet();
        boolean b30 = defaultedMap19.containsKey((java.lang.Object) (byte) 10);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object obj32 = defaultedMap19.get(obj31);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 10.0f + "'", obj32.equals(10.0f));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (-1), obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.util.Set set39 = defaultedMap35.keySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) map43);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b49 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b52 = defaultedMap51.isEmpty();
        boolean b53 = defaultedMap51.isEmpty();
        defaultedMap47.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.util.Collection collection56 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b60 = defaultedMap58.isEmpty();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b63 = defaultedMap62.isEmpty();
        boolean b64 = defaultedMap62.isEmpty();
        defaultedMap58.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj66 = defaultedMap5.put((java.lang.Object) collection56, (java.lang.Object) defaultedMap58);
        java.util.Set set67 = defaultedMap58.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0f + "'", obj45.equals(10.0f));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        java.util.Set set36 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap11.containsValue((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b47 = defaultedMap46.isEmpty();
        boolean b48 = defaultedMap46.isEmpty();
        defaultedMap42.putAll((java.util.Map) defaultedMap46);
        java.util.Set set50 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        boolean b54 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b61 = defaultedMap60.isEmpty();
        boolean b62 = defaultedMap60.isEmpty();
        defaultedMap56.putAll((java.util.Map) defaultedMap60);
        java.util.Set set64 = defaultedMap60.keySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap60);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate67);
        int i69 = defaultedMap60.size();
        boolean b70 = defaultedMap32.containsKey((java.lang.Object) defaultedMap60);
        int i71 = defaultedMap32.size();
        defaultedMap32.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0f + "'", obj26.equals(10.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0f + "'", obj20.equals(10.0f));
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        boolean b10 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b23 = defaultedMap22.isEmpty();
        boolean b24 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        java.lang.Object obj31 = defaultedMap12.get((java.lang.Object) defaultedMap30);
        boolean b32 = defaultedMap5.containsKey(obj31);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 10.0f + "'", obj31.equals(10.0f));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate26);
        java.util.Set set28 = defaultedMap19.keySet();
        defaultedMap19.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        try {
            elitisticListPopulation2.setPopulationLimit((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d3 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b11 = defaultedMap9.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap9);
        java.util.Set set13 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap9.put((java.lang.Object) (-1), obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b27 = defaultedMap25.isEmpty();
        defaultedMap21.putAll((java.util.Map) defaultedMap25);
        java.util.Set set29 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b37 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b41 = defaultedMap39.isEmpty();
        defaultedMap35.putAll((java.util.Map) defaultedMap39);
        java.util.Set set43 = defaultedMap39.keySet();
        defaultedMap31.putAll((java.util.Map) defaultedMap39);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) map47);
        java.lang.Object obj49 = defaultedMap9.get((java.lang.Object) defaultedMap48);
        java.util.Collection collection50 = defaultedMap48.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection50);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 10.0f + "'", obj49.equals(10.0f));
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b15 = defaultedMap14.isEmpty();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj23 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap7.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        boolean b26 = defaultedMap7.containsKey((java.lang.Object) (byte) -1);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b49 = defaultedMap47.isEmpty();
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.util.Set set51 = defaultedMap47.keySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap47);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate27, predicate54);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b61 = defaultedMap59.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b65 = defaultedMap63.isEmpty();
        defaultedMap59.putAll((java.util.Map) defaultedMap63);
        java.util.Set set67 = defaultedMap63.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap63.putAll((java.util.Map) defaultedMap69);
        boolean b71 = defaultedMap69.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b74 = defaultedMap73.isEmpty();
        boolean b75 = defaultedMap73.isEmpty();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b78 = defaultedMap77.isEmpty();
        boolean b79 = defaultedMap77.isEmpty();
        defaultedMap73.putAll((java.util.Map) defaultedMap77);
        java.util.Set set81 = defaultedMap77.keySet();
        defaultedMap69.putAll((java.util.Map) defaultedMap77);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate57, predicate84);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d91 = elitisticListPopulation90.getElitismRate();
        math.genetics.Population population92 = elitisticListPopulation90.nextGeneration();
        boolean b93 = defaultedMap7.equals((java.lang.Object) elitisticListPopulation90);
        int i94 = elitisticListPopulation90.getPopulationLimit();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue(d91 == 1.0d);
        org.junit.Assert.assertNotNull(population92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(i94 == 32);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap6.isEmpty();
        boolean b8 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Collection collection15 = defaultedMap10.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj33 = defaultedMap16.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) set34);
        boolean b36 = defaultedMap1.equals((java.lang.Object) set34);
        java.util.Set set37 = defaultedMap1.keySet();
        java.lang.Object obj38 = new java.lang.Object();
        boolean b39 = defaultedMap1.equals(obj38);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        elitisticListPopulation2.setElitismRate(0.0d);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap21);
        java.lang.String str27 = defaultedMap21.toString();
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b4 = defaultedMap3.isEmpty();
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b15 = defaultedMap14.isEmpty();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj23 = defaultedMap14.remove((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap7.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        boolean b26 = defaultedMap7.containsKey((java.lang.Object) (byte) -1);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b49 = defaultedMap47.isEmpty();
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.util.Set set51 = defaultedMap47.keySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap47);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate27, predicate54);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b61 = defaultedMap59.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b65 = defaultedMap63.isEmpty();
        defaultedMap59.putAll((java.util.Map) defaultedMap63);
        java.util.Set set67 = defaultedMap63.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap63.putAll((java.util.Map) defaultedMap69);
        boolean b71 = defaultedMap69.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b74 = defaultedMap73.isEmpty();
        boolean b75 = defaultedMap73.isEmpty();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b78 = defaultedMap77.isEmpty();
        boolean b79 = defaultedMap77.isEmpty();
        defaultedMap73.putAll((java.util.Map) defaultedMap77);
        java.util.Set set81 = defaultedMap77.keySet();
        defaultedMap69.putAll((java.util.Map) defaultedMap77);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate57, predicate84);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        math.genetics.ElitisticListPopulation elitisticListPopulation90 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d91 = elitisticListPopulation90.getElitismRate();
        math.genetics.Population population92 = elitisticListPopulation90.nextGeneration();
        boolean b93 = defaultedMap7.equals((java.lang.Object) elitisticListPopulation90);
        java.lang.String str94 = elitisticListPopulation90.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue(d91 == 1.0d);
        org.junit.Assert.assertNotNull(population92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "[]" + "'", str94.equals("[]"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj36 = null;
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj36);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        math.genetics.Population population3 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(population3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.util.Collection collection10 = defaultedMap5.values();
        boolean b11 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d3 = elitisticListPopulation2.getElitismRate();
        try {
            elitisticListPopulation2.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        java.lang.String str38 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b42 = defaultedMap41.isEmpty();
        java.lang.Object obj44 = defaultedMap41.remove((java.lang.Object) 'a');
        java.lang.Object obj45 = defaultedMap23.put((java.lang.Object) "{}", (java.lang.Object) defaultedMap41);
        java.util.Set set46 = defaultedMap41.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        int i13 = defaultedMap11.size();
        java.util.Set set14 = defaultedMap11.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) '4');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        java.util.Set set47 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        boolean b51 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b55 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b58 = defaultedMap57.isEmpty();
        boolean b59 = defaultedMap57.isEmpty();
        defaultedMap53.putAll((java.util.Map) defaultedMap57);
        java.util.Set set61 = defaultedMap57.keySet();
        defaultedMap49.putAll((java.util.Map) defaultedMap57);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate63, predicate64);
        int i66 = defaultedMap57.size();
        java.util.Set set67 = defaultedMap57.keySet();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) set67);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (-1), obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.util.Set set39 = defaultedMap35.keySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) map43);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap44);
        boolean b47 = defaultedMap44.containsKey((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0f + "'", obj45.equals(10.0f));
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap23.remove((java.lang.Object) predicate38);
        java.util.Set set40 = defaultedMap23.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set23 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        defaultedMap24.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b40 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b51 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b54 = defaultedMap53.isEmpty();
        boolean b55 = defaultedMap53.isEmpty();
        defaultedMap49.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj58 = defaultedMap49.remove((java.lang.Object) (short) 0);
        java.lang.Object obj59 = defaultedMap42.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set60 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) set60);
        java.lang.Object obj62 = defaultedMap30.put((java.lang.Object) false, (java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b65 = defaultedMap64.isEmpty();
        boolean b66 = defaultedMap64.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b69 = defaultedMap68.isEmpty();
        boolean b70 = defaultedMap68.isEmpty();
        defaultedMap64.putAll((java.util.Map) defaultedMap68);
        java.util.Set set72 = defaultedMap68.keySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap68.putAll((java.util.Map) defaultedMap74);
        boolean b76 = defaultedMap74.isEmpty();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b79 = defaultedMap78.isEmpty();
        boolean b80 = defaultedMap78.isEmpty();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b83 = defaultedMap82.isEmpty();
        boolean b84 = defaultedMap82.isEmpty();
        defaultedMap78.putAll((java.util.Map) defaultedMap82);
        java.util.Set set86 = defaultedMap82.keySet();
        defaultedMap74.putAll((java.util.Map) defaultedMap82);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate88, predicate89);
        int i91 = defaultedMap82.size();
        boolean b92 = defaultedMap61.containsKey((java.lang.Object) defaultedMap82);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation2.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) map27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b36 = defaultedMap34.isEmpty();
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Collection collection39 = defaultedMap34.values();
        java.lang.Object obj40 = defaultedMap28.remove((java.lang.Object) collection39);
        java.util.Collection collection41 = defaultedMap28.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Set set13 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        boolean b27 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Set set42 = defaultedMap33.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b47 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b50 = defaultedMap49.isEmpty();
        boolean b51 = defaultedMap49.isEmpty();
        defaultedMap45.putAll((java.util.Map) defaultedMap49);
        java.util.Set set53 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap49.put((java.lang.Object) (-1), obj58);
        java.util.Set set60 = defaultedMap49.keySet();
        boolean b61 = defaultedMap11.equals((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        math.genetics.ElitisticListPopulation elitisticListPopulation12 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome13 = elitisticListPopulation12.spliterator();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) elitisticListPopulation12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(spliterator_chromosome13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        int i13 = defaultedMap5.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b41 = defaultedMap23.containsKey((java.lang.Object) 10.0f);
        java.util.Collection collection42 = defaultedMap23.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        math.genetics.Chromosome[] chromosome_array5 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome6 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome6, chromosome_array5);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome6);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(chromosome_array5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b14 = defaultedMap13.isEmpty();
        boolean b15 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        java.util.Set set21 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj37 = defaultedMap5.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        java.util.Set set47 = defaultedMap43.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap49);
        boolean b52 = defaultedMap49.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b55 = defaultedMap54.isEmpty();
        boolean b56 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b60 = defaultedMap58.isEmpty();
        defaultedMap54.putAll((java.util.Map) defaultedMap58);
        java.util.Set set62 = defaultedMap58.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        boolean b66 = defaultedMap64.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b69 = defaultedMap68.isEmpty();
        boolean b70 = defaultedMap68.isEmpty();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b73 = defaultedMap72.isEmpty();
        boolean b74 = defaultedMap72.isEmpty();
        defaultedMap68.putAll((java.util.Map) defaultedMap72);
        java.util.Set set76 = defaultedMap72.keySet();
        defaultedMap64.putAll((java.util.Map) defaultedMap72);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b80 = defaultedMap79.isEmpty();
        boolean b81 = defaultedMap79.isEmpty();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b84 = defaultedMap83.isEmpty();
        boolean b85 = defaultedMap83.isEmpty();
        defaultedMap79.putAll((java.util.Map) defaultedMap83);
        java.util.Set set87 = defaultedMap83.keySet();
        defaultedMap72.putAll((java.util.Map) defaultedMap83);
        java.util.Set set89 = defaultedMap72.keySet();
        int i90 = defaultedMap72.size();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap72);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set23 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        java.lang.String str25 = defaultedMap24.toString();
        boolean b26 = defaultedMap24.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 100);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Set set13 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        boolean b27 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b41 = defaultedMap40.isEmpty();
        boolean b42 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b45 = defaultedMap44.isEmpty();
        boolean b46 = defaultedMap44.isEmpty();
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        java.util.Set set48 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        boolean b52 = defaultedMap50.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b55 = defaultedMap54.isEmpty();
        boolean b56 = defaultedMap54.isEmpty();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b59 = defaultedMap58.isEmpty();
        boolean b60 = defaultedMap58.isEmpty();
        defaultedMap54.putAll((java.util.Map) defaultedMap58);
        java.util.Set set62 = defaultedMap58.keySet();
        java.util.Collection collection63 = defaultedMap58.values();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b67 = defaultedMap66.isEmpty();
        boolean b68 = defaultedMap66.isEmpty();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b71 = defaultedMap70.isEmpty();
        boolean b72 = defaultedMap70.isEmpty();
        defaultedMap66.putAll((java.util.Map) defaultedMap70);
        java.util.Set set74 = defaultedMap70.keySet();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap70.putAll((java.util.Map) defaultedMap76);
        boolean b78 = defaultedMap76.isEmpty();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b81 = defaultedMap80.isEmpty();
        boolean b82 = defaultedMap80.isEmpty();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b85 = defaultedMap84.isEmpty();
        boolean b86 = defaultedMap84.isEmpty();
        defaultedMap80.putAll((java.util.Map) defaultedMap84);
        java.util.Set set88 = defaultedMap84.keySet();
        defaultedMap76.putAll((java.util.Map) defaultedMap84);
        java.lang.Object obj90 = defaultedMap58.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap76);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj92 = defaultedMap76.remove((java.lang.Object) predicate91);
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate91, predicate93);
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) predicate93);
        boolean b96 = defaultedMap33.containsValue((java.lang.Object) predicate93);
        java.lang.Object obj97 = defaultedMap11.get((java.lang.Object) b96);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + 10.0f + "'", obj97.equals(10.0f));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        java.util.Collection collection10 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) set24);
        java.lang.Object obj27 = defaultedMap5.put((java.lang.Object) defaultedMap25, (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap25.containsValue((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b12 = defaultedMap11.isEmpty();
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        java.util.Collection collection21 = defaultedMap19.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0f + "'", obj20.equals(10.0f));
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d8 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome9, 100, (double) 32);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d8 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        int i11 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome15 = elitisticListPopulation14.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome16 = elitisticListPopulation14.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d20 = elitisticListPopulation19.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation14.setChromosomes(list_chromosome21);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome21);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertTrue(i11 == 32);
        org.junit.Assert.assertNotNull(spliterator_chromosome15);
        org.junit.Assert.assertNotNull(spliterator_chromosome16);
        org.junit.Assert.assertTrue(d20 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b27 = defaultedMap26.isEmpty();
        boolean b28 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        defaultedMap26.putAll((java.util.Map) defaultedMap30);
        java.util.Set set34 = defaultedMap30.keySet();
        defaultedMap19.putAll((java.util.Map) defaultedMap30);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d39 = elitisticListPopulation38.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome40 = elitisticListPopulation38.iterator();
        java.lang.Object obj41 = defaultedMap19.get((java.lang.Object) iterator_chromosome40);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(d39 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0f + "'", obj41.equals(10.0f));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d8 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = list_chromosome9.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj33 = defaultedMap16.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        boolean b35 = defaultedMap16.containsKey((java.lang.Object) (byte) -1);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b39 = defaultedMap38.isEmpty();
        boolean b40 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap38.putAll((java.util.Map) defaultedMap42);
        java.util.Set set46 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        boolean b50 = defaultedMap48.isEmpty();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b53 = defaultedMap52.isEmpty();
        boolean b54 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b57 = defaultedMap56.isEmpty();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap52.putAll((java.util.Map) defaultedMap56);
        java.util.Set set60 = defaultedMap56.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap56);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate36, predicate63);
        java.lang.Object obj66 = defaultedMap1.get((java.lang.Object) predicate36);
        boolean b67 = defaultedMap1.isEmpty();
        java.util.Collection collection68 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 10.0f + "'", obj66.equals(10.0f));
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Set set13 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        boolean b27 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b34 = defaultedMap33.isEmpty();
        boolean b35 = defaultedMap33.isEmpty();
        defaultedMap29.putAll((java.util.Map) defaultedMap33);
        java.util.Set set37 = defaultedMap33.keySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate40);
        java.util.Set set42 = defaultedMap33.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap33);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        math.genetics.Chromosome chromosome5 = null;
        elitisticListPopulation2.addChromosome(chromosome5);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        int i5 = elitisticListPopulation2.getPopulationSize();
        math.genetics.Population population6 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(population6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (-1), obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.util.Set set39 = defaultedMap35.keySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) map43);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap44);
        java.util.Collection collection46 = defaultedMap44.values();
        java.util.Collection collection47 = defaultedMap44.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0f + "'", obj45.equals(10.0f));
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b15 = defaultedMap14.isEmpty();
        boolean b16 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b19 = defaultedMap18.isEmpty();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap14.putAll((java.util.Map) defaultedMap18);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        java.util.Collection collection24 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap27.putAll((java.util.Map) defaultedMap31);
        java.util.Set set35 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        boolean b39 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b43 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b47 = defaultedMap45.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        java.util.Set set49 = defaultedMap45.keySet();
        defaultedMap37.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj51 = defaultedMap19.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap37);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj53 = defaultedMap37.remove((java.lang.Object) predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate52, predicate54);
        boolean b57 = defaultedMap11.containsKey((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b61 = defaultedMap59.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b64 = defaultedMap63.isEmpty();
        boolean b65 = defaultedMap63.isEmpty();
        defaultedMap59.putAll((java.util.Map) defaultedMap63);
        java.util.Set set67 = defaultedMap63.keySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b71 = defaultedMap70.isEmpty();
        boolean b72 = defaultedMap70.isEmpty();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b75 = defaultedMap74.isEmpty();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap70.putAll((java.util.Map) defaultedMap74);
        java.lang.Object obj79 = defaultedMap70.remove((java.lang.Object) (short) 0);
        java.lang.Object obj80 = defaultedMap63.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set81 = defaultedMap63.keySet();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) set81);
        boolean b83 = defaultedMap11.containsKey((java.lang.Object) set81);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        math.genetics.Chromosome chromosome4 = null;
        elitisticListPopulation2.addChromosome(chromosome4);
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        boolean b24 = defaultedMap5.containsKey((java.lang.Object) (byte) -1);
        boolean b25 = defaultedMap5.isEmpty();
        int i26 = defaultedMap5.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        int i5 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome10);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        defaultedMap1.clear();
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        double d6 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
        org.junit.Assert.assertTrue(d6 == 1.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d12 = elitisticListPopulation11.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome13 = elitisticListPopulation11.iterator();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) elitisticListPopulation11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(d12 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation7 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d8 = elitisticListPopulation7.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome9 = elitisticListPopulation7.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome9);
        math.genetics.Population population11 = elitisticListPopulation2.nextGeneration();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome12 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(d8 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome9);
        org.junit.Assert.assertNotNull(population11);
        org.junit.Assert.assertNotNull(iterator_chromosome12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome4 = elitisticListPopulation2.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome5 = elitisticListPopulation2.iterator();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome4);
        org.junit.Assert.assertNotNull(iterator_chromosome5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        java.util.Set set36 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap11.containsValue((java.lang.Object) defaultedMap32);
        java.lang.String str41 = defaultedMap32.toString();
        java.lang.String str42 = defaultedMap32.toString();
        java.util.Set set43 = defaultedMap32.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0f + "'", obj26.equals(10.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        try {
            elitisticListPopulation2.setPopulationLimit((-1));
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b24 = defaultedMap23.isEmpty();
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b28 = defaultedMap27.isEmpty();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj32 = defaultedMap23.remove((java.lang.Object) (short) 0);
        java.lang.Object obj33 = defaultedMap16.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) set34);
        boolean b36 = defaultedMap1.equals((java.lang.Object) set34);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap1.get(obj37);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b42 = defaultedMap41.isEmpty();
        boolean b43 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b46 = defaultedMap45.isEmpty();
        boolean b47 = defaultedMap45.isEmpty();
        defaultedMap41.putAll((java.util.Map) defaultedMap45);
        java.util.Set set49 = defaultedMap45.keySet();
        boolean b50 = defaultedMap45.isEmpty();
        java.lang.Object obj51 = defaultedMap1.remove((java.lang.Object) b50);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 10.0f + "'", obj38.equals(10.0f));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        java.lang.Object obj26 = defaultedMap11.get((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b33 = defaultedMap32.isEmpty();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap32);
        java.util.Set set36 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap38);
        boolean b40 = defaultedMap11.containsValue((java.lang.Object) defaultedMap32);
        java.lang.String str41 = defaultedMap32.toString();
        java.lang.String str42 = defaultedMap32.toString();
        int i43 = defaultedMap32.size();
        int i44 = defaultedMap32.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 10.0f + "'", obj26.equals(10.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) defaultedMap25);
        boolean b28 = defaultedMap11.isEmpty();
        java.util.Collection collection29 = defaultedMap11.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0f + "'", obj27.equals(10.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d3 = elitisticListPopulation2.getElitismRate();
        math.genetics.Population population4 = elitisticListPopulation2.nextGeneration();
        double d5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(population4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        double d3 = elitisticListPopulation2.getElitismRate();
        double d4 = elitisticListPopulation2.getElitismRate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b7 = defaultedMap6.isEmpty();
        boolean b8 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b11 = defaultedMap10.isEmpty();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap6.putAll((java.util.Map) defaultedMap10);
        java.util.Set set14 = defaultedMap10.keySet();
        java.util.Collection collection15 = defaultedMap10.values();
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) collection15);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome17 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertTrue(d4 == 1.0d);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(spliterator_chromosome17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.put((java.lang.Object) (-1), obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b18 = defaultedMap17.isEmpty();
        boolean b19 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b22 = defaultedMap21.isEmpty();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap21);
        java.util.Set set25 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        boolean b29 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b32 = defaultedMap31.isEmpty();
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.util.Set set39 = defaultedMap35.keySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) map43);
        java.lang.Object obj45 = defaultedMap5.get((java.lang.Object) defaultedMap44);
        java.lang.String str46 = defaultedMap44.toString();
        int i47 = defaultedMap44.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0f + "'", obj45.equals(10.0f));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        int i7 = elitisticListPopulation2.getPopulationLimit();
        math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = elitisticListPopulation10.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome12 = elitisticListPopulation10.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation15 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d16 = elitisticListPopulation15.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome17 = elitisticListPopulation15.getChromosomes();
        elitisticListPopulation10.setChromosomes(list_chromosome17);
        math.genetics.ElitisticListPopulation elitisticListPopulation21 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome22 = elitisticListPopulation21.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = elitisticListPopulation21.spliterator();
        math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d27 = elitisticListPopulation26.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome28 = elitisticListPopulation26.getChromosomes();
        elitisticListPopulation21.setChromosomes(list_chromosome28);
        elitisticListPopulation10.setChromosomes(list_chromosome28);
        elitisticListPopulation2.setChromosomes(list_chromosome28);
        try {
            elitisticListPopulation2.setElitismRate((double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
        org.junit.Assert.assertNotNull(spliterator_chromosome12);
        org.junit.Assert.assertTrue(d16 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome17);
        org.junit.Assert.assertNotNull(spliterator_chromosome22);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
        org.junit.Assert.assertTrue(d27 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome28);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap19);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate26);
        java.lang.String str28 = defaultedMap19.toString();
        int i29 = defaultedMap19.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d9 = elitisticListPopulation8.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome11 = elitisticListPopulation8.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome12 = elitisticListPopulation8.getChromosomes();
        elitisticListPopulation2.setChromosomes(list_chromosome12);
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertTrue(d9 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(list_chromosome11);
        org.junit.Assert.assertNotNull(list_chromosome12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Set set13 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) set13);
        int i15 = defaultedMap14.size();
        java.util.Collection collection16 = defaultedMap14.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b13 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        java.util.Set set23 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = defaultedMap11.get((java.lang.Object) defaultedMap25);
        boolean b28 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b31 = defaultedMap30.isEmpty();
        boolean b32 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b35 = defaultedMap34.isEmpty();
        boolean b36 = defaultedMap34.isEmpty();
        defaultedMap30.putAll((java.util.Map) defaultedMap34);
        java.util.Set set38 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        boolean b42 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b45 = defaultedMap44.isEmpty();
        boolean b46 = defaultedMap44.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b49 = defaultedMap48.isEmpty();
        boolean b50 = defaultedMap48.isEmpty();
        defaultedMap44.putAll((java.util.Map) defaultedMap48);
        java.util.Set set52 = defaultedMap48.keySet();
        defaultedMap40.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b56 = defaultedMap55.isEmpty();
        boolean b57 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b60 = defaultedMap59.isEmpty();
        boolean b61 = defaultedMap59.isEmpty();
        defaultedMap55.putAll((java.util.Map) defaultedMap59);
        java.util.Set set63 = defaultedMap59.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap59);
        java.util.Set set65 = defaultedMap48.keySet();
        int i66 = defaultedMap48.size();
        defaultedMap11.putAll((java.util.Map) defaultedMap48);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0f + "'", obj27.equals(10.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(i66 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 1, (double) 1.0f);
        double d3 = elitisticListPopulation2.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome4 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome5 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome6 = elitisticListPopulation2.getChromosomes();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation2.getChromosomes();
        org.junit.Assert.assertTrue(d3 == 1.0d);
        org.junit.Assert.assertNotNull(list_chromosome4);
        org.junit.Assert.assertNotNull(list_chromosome5);
        org.junit.Assert.assertNotNull(list_chromosome6);
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) ' ', (double) (byte) 1);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome4 = elitisticListPopulation2.spliterator();
        double d5 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
        org.junit.Assert.assertNotNull(spliterator_chromosome4);
        org.junit.Assert.assertTrue(d5 == 1.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b6 = defaultedMap5.isEmpty();
        boolean b7 = defaultedMap5.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b17 = defaultedMap16.isEmpty();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) (short) 0);
        java.lang.Object obj22 = defaultedMap5.put((java.lang.Object) 10.0f, (java.lang.Object) (short) 0);
        java.util.Set set23 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b26 = defaultedMap25.isEmpty();
        boolean b27 = defaultedMap25.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b30 = defaultedMap29.isEmpty();
        boolean b31 = defaultedMap29.isEmpty();
        defaultedMap25.putAll((java.util.Map) defaultedMap29);
        java.util.Set set33 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        boolean b37 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b40 = defaultedMap39.isEmpty();
        boolean b41 = defaultedMap39.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b44 = defaultedMap43.isEmpty();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap39.putAll((java.util.Map) defaultedMap43);
        java.util.Set set47 = defaultedMap43.keySet();
        java.util.Collection collection48 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b52 = defaultedMap51.isEmpty();
        boolean b53 = defaultedMap51.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b56 = defaultedMap55.isEmpty();
        boolean b57 = defaultedMap55.isEmpty();
        defaultedMap51.putAll((java.util.Map) defaultedMap55);
        java.util.Set set59 = defaultedMap55.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        defaultedMap55.putAll((java.util.Map) defaultedMap61);
        boolean b63 = defaultedMap61.isEmpty();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b66 = defaultedMap65.isEmpty();
        boolean b67 = defaultedMap65.isEmpty();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        boolean b70 = defaultedMap69.isEmpty();
        boolean b71 = defaultedMap69.isEmpty();
        defaultedMap65.putAll((java.util.Map) defaultedMap69);
        java.util.Set set73 = defaultedMap69.keySet();
        defaultedMap61.putAll((java.util.Map) defaultedMap69);
        java.lang.Object obj75 = defaultedMap43.put((java.lang.Object) (short) 10, (java.lang.Object) defaultedMap61);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj77 = defaultedMap61.remove((java.lang.Object) predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate76, predicate78);
        java.lang.Object obj80 = defaultedMap5.get((java.lang.Object) predicate78);
        java.util.Collection collection81 = defaultedMap5.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 10.0f + "'", obj80.equals(10.0f));
        org.junit.Assert.assertNotNull(collection81);
    }
}

