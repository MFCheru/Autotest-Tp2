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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.Transformer transformer28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map18, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.String str20 = defaultedMap16.toString();
        java.util.Set set21 = defaultedMap16.entrySet();
        boolean b22 = defaultedMap8.containsValue((java.lang.Object) set21);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        java.util.Set set12 = defaultedMap1.keySet();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) "{}");
        boolean b35 = defaultedMap3.equals((java.lang.Object) defaultedMap29);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.equals((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (byte) 0);
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) 0L);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        boolean b27 = defaultedMap16.containsKey((java.lang.Object) predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate25);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate(map28, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        boolean b25 = defaultedMap7.equals((java.lang.Object) 0L);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 0);
        java.util.Collection collection28 = defaultedMap7.values();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        boolean b51 = defaultedMap46.equals((java.lang.Object) "{}");
        java.lang.Object obj52 = defaultedMap44.get((java.lang.Object) defaultedMap46);
        boolean b53 = defaultedMap25.equals(obj52);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap24.equals((java.lang.Object) 10);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        boolean b35 = defaultedMap32.equals((java.lang.Object) 10);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate28, predicate36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b46 = defaultedMap43.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        boolean b54 = defaultedMap51.equals((java.lang.Object) 10);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b62 = defaultedMap59.equals((java.lang.Object) 10);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate63);
        java.lang.Object obj67 = defaultedMap43.put((java.lang.Object) (-1), (java.lang.Object) predicate55);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate36, predicate55);
        collections.Transformer transformer69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate(map68, transformer69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set9 = defaultedMap8.entrySet();
        boolean b10 = defaultedMap3.containsKey((java.lang.Object) defaultedMap8);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        boolean b25 = defaultedMap7.equals((java.lang.Object) 0L);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 0);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 100);
        boolean b7 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) -1 + "'", obj6.equals((short) -1));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        java.lang.Object obj30 = defaultedMap3.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        boolean b31 = defaultedMap3.isEmpty();
        java.lang.Object obj32 = null;
        boolean b33 = defaultedMap3.containsKey(obj32);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set9 = defaultedMap8.entrySet();
        boolean b10 = defaultedMap3.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap3.containsKey((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate29);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) "{}");
        boolean b41 = defaultedMap9.equals((java.lang.Object) defaultedMap35);
        boolean b42 = defaultedMap3.containsValue((java.lang.Object) defaultedMap35);
        java.util.Set set43 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.String str55 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b62 = defaultedMap57.equals((java.lang.Object) (byte) 0);
        boolean b64 = defaultedMap57.containsValue((java.lang.Object) 0L);
        defaultedMap51.putAll((java.util.Map) defaultedMap57);
        java.util.Set set66 = defaultedMap51.keySet();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap51);
        boolean b69 = defaultedMap51.equals((java.lang.Object) 0L);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (byte) 0);
        java.lang.Object obj72 = defaultedMap3.get((java.lang.Object) defaultedMap51);
        int i73 = defaultedMap3.size();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (short) -1 + "'", obj72.equals((short) -1));
        org.junit.Assert.assertTrue(i73 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        defaultedMap7.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        boolean b31 = defaultedMap28.equals((java.lang.Object) 10);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b39 = defaultedMap36.equals((java.lang.Object) 10);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap47.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        boolean b58 = defaultedMap55.equals((java.lang.Object) 10);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        boolean b66 = defaultedMap63.equals((java.lang.Object) 10);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate67);
        java.lang.Object obj71 = defaultedMap47.put((java.lang.Object) (-1), (java.lang.Object) predicate59);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate40, predicate59);
        java.lang.Object obj73 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) -1 + "'", obj73.equals((short) -1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.lang.String str19 = defaultedMap3.toString();
        java.lang.String str20 = defaultedMap3.toString();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap23.equals((java.lang.Object) 10);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap31.equals((java.lang.Object) 10);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate35);
        java.lang.Object obj39 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b46 = defaultedMap41.equals((java.lang.Object) "{}");
        boolean b47 = defaultedMap15.equals((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        boolean b54 = defaultedMap51.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b62 = defaultedMap59.equals((java.lang.Object) 10);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap65.putAll((java.util.Map) defaultedMap67);
        boolean b70 = defaultedMap67.equals((java.lang.Object) 10);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate71);
        java.lang.Object obj75 = defaultedMap51.put((java.lang.Object) (-1), (java.lang.Object) predicate63);
        boolean b76 = defaultedMap15.equals((java.lang.Object) defaultedMap51);
        java.util.Set set77 = defaultedMap51.entrySet();
        java.lang.Object obj78 = defaultedMap1.get((java.lang.Object) defaultedMap51);
        java.util.Set set79 = defaultedMap51.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (short) -1 + "'", obj78.equals((short) -1));
        org.junit.Assert.assertNotNull(set79);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap20.toString();
        java.util.Set set25 = defaultedMap20.entrySet();
        java.lang.String str26 = defaultedMap20.toString();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.String str33 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) (byte) 0);
        boolean b42 = defaultedMap35.containsValue((java.lang.Object) 0L);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        boolean b46 = defaultedMap35.containsKey((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate27, predicate44);
        defaultedMap3.putAll(map47);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.String str12 = defaultedMap6.toString();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 0);
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        boolean b32 = defaultedMap21.containsKey((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map33);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate(map33, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b21 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) "{}");
        java.util.Collection collection26 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap28.toString();
        java.util.Set set33 = defaultedMap28.entrySet();
        java.lang.String str34 = defaultedMap28.toString();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        boolean b48 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        boolean b50 = defaultedMap43.containsValue((java.lang.Object) 0L);
        defaultedMap37.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        boolean b54 = defaultedMap43.containsKey((java.lang.Object) predicate52);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate52);
        java.lang.Object obj56 = defaultedMap23.get((java.lang.Object) map55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap60.equals((java.lang.Object) 10);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b71 = defaultedMap68.equals((java.lang.Object) 10);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate72);
        java.util.Set set76 = defaultedMap60.keySet();
        java.lang.Object obj77 = defaultedMap23.get((java.lang.Object) set76);
        boolean b78 = defaultedMap1.containsValue((java.lang.Object) defaultedMap23);
        int i79 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) -1 + "'", obj56.equals((short) -1));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) -1 + "'", obj77.equals((short) -1));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i79 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        java.util.Set set43 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.lang.String str51 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        boolean b58 = defaultedMap53.equals((java.lang.Object) (byte) 0);
        boolean b60 = defaultedMap53.containsValue((java.lang.Object) 0L);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        java.util.Set set62 = defaultedMap47.keySet();
        defaultedMap47.clear();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Object obj66 = defaultedMap7.put((java.lang.Object) defaultedMap47, obj65);
        collections.Factory factory67 = null;
        try {
            java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, factory67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.lang.String str19 = defaultedMap3.toString();
        defaultedMap3.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) "{}");
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) defaultedMap24);
        java.util.Set set31 = defaultedMap22.keySet();
        boolean b32 = defaultedMap3.equals((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap54.equals((java.lang.Object) 10);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        boolean b65 = defaultedMap62.equals((java.lang.Object) 10);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate66);
        java.lang.Object obj70 = defaultedMap46.put((java.lang.Object) (-1), (java.lang.Object) predicate58);
        java.util.Set set71 = defaultedMap46.keySet();
        boolean b72 = defaultedMap25.containsKey((java.lang.Object) set71);
        defaultedMap25.clear();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (byte) 0);
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) 0L);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b25 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.lang.String str19 = defaultedMap3.toString();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap3.containsValue(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap23.equals((java.lang.Object) "{}");
        boolean b29 = defaultedMap3.containsValue((java.lang.Object) defaultedMap23);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate29);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) "{}");
        boolean b41 = defaultedMap9.equals((java.lang.Object) defaultedMap35);
        boolean b42 = defaultedMap3.containsValue((java.lang.Object) defaultedMap35);
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.String str12 = defaultedMap6.toString();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 0);
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        boolean b32 = defaultedMap21.containsKey((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b43 = defaultedMap38.equals((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) "{}");
        java.util.Collection collection50 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.String str56 = defaultedMap52.toString();
        java.util.Set set57 = defaultedMap52.entrySet();
        java.lang.String str58 = defaultedMap52.toString();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.lang.String str65 = defaultedMap61.toString();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b72 = defaultedMap67.equals((java.lang.Object) (byte) 0);
        boolean b74 = defaultedMap67.containsValue((java.lang.Object) 0L);
        defaultedMap61.putAll((java.util.Map) defaultedMap67);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) predicate76);
        boolean b78 = defaultedMap67.containsKey((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate59, predicate76);
        java.lang.Object obj80 = defaultedMap47.get((java.lang.Object) map79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) predicate81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap84.putAll((java.util.Map) defaultedMap86);
        boolean b89 = defaultedMap84.equals((java.lang.Object) "{}");
        java.lang.Object obj90 = defaultedMap82.get((java.lang.Object) defaultedMap84);
        java.lang.Object obj91 = defaultedMap47.get((java.lang.Object) defaultedMap82);
        boolean b92 = defaultedMap1.containsKey(obj91);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) -1 + "'", obj80.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) -1 + "'", obj91.equals((short) -1));
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate(map5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        java.util.Set set12 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str30 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        boolean b39 = defaultedMap32.containsValue((java.lang.Object) 0L);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        java.util.Set set41 = defaultedMap26.keySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap26);
        int i43 = defaultedMap20.size();
        java.util.Set set44 = defaultedMap20.entrySet();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap20);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.lang.String str19 = defaultedMap3.toString();
        java.lang.Object obj21 = defaultedMap3.remove((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        defaultedMap25.clear();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.equals((java.lang.Object) 10);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap54.equals((java.lang.Object) 10);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        boolean b68 = defaultedMap65.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap71.putAll((java.util.Map) defaultedMap73);
        boolean b76 = defaultedMap73.equals((java.lang.Object) 10);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap79.putAll((java.util.Map) defaultedMap81);
        boolean b84 = defaultedMap81.equals((java.lang.Object) 10);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate77, predicate85);
        java.lang.Object obj89 = defaultedMap65.put((java.lang.Object) (-1), (java.lang.Object) predicate77);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate58, predicate77);
        collections.Predicate predicate91 = null;
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate77, predicate91);
        boolean b93 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.lang.String str19 = defaultedMap3.toString();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap3.containsValue(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap23.equals((java.lang.Object) "{}");
        boolean b29 = defaultedMap3.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set30 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.equals((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap21.equals((java.lang.Object) 10);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate25);
        java.lang.String str29 = defaultedMap13.toString();
        defaultedMap13.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap13);
        java.lang.String str32 = defaultedMap3.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.util.Set set18 = defaultedMap13.entrySet();
        java.lang.String str19 = defaultedMap13.toString();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        boolean b33 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) 0L);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        boolean b39 = defaultedMap28.containsKey((java.lang.Object) predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b53 = defaultedMap50.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        boolean b61 = defaultedMap58.equals((java.lang.Object) 10);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        boolean b69 = defaultedMap66.equals((java.lang.Object) 10);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate62, predicate70);
        java.lang.Object obj74 = defaultedMap50.put((java.lang.Object) (-1), (java.lang.Object) predicate62);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        boolean b81 = defaultedMap76.equals((java.lang.Object) "{}");
        boolean b82 = defaultedMap50.equals((java.lang.Object) defaultedMap76);
        boolean b83 = defaultedMap44.containsValue((java.lang.Object) defaultedMap76);
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) predicate37, (java.lang.Object) defaultedMap76);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        java.lang.String str28 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        boolean b35 = defaultedMap32.equals((java.lang.Object) 10);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b43 = defaultedMap40.equals((java.lang.Object) 10);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate44);
        java.lang.String str48 = defaultedMap32.toString();
        java.lang.Object obj50 = defaultedMap32.remove((java.lang.Object) (short) 100);
        java.lang.Object obj51 = defaultedMap3.get(obj50);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) -1 + "'", obj51.equals((short) -1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.lang.String str19 = defaultedMap3.toString();
        java.util.Set set20 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate29);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) "{}");
        boolean b41 = defaultedMap9.equals((java.lang.Object) defaultedMap35);
        boolean b42 = defaultedMap3.containsValue((java.lang.Object) defaultedMap35);
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b21 = defaultedMap1.isEmpty();
        java.util.Collection collection22 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.lang.String str19 = defaultedMap3.toString();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap3.containsValue(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap23.equals((java.lang.Object) "{}");
        boolean b29 = defaultedMap3.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set30 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) "{}");
        java.util.Collection collection35 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap37.toString();
        java.util.Set set42 = defaultedMap37.entrySet();
        java.lang.String str43 = defaultedMap37.toString();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.String str50 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap52.equals((java.lang.Object) (byte) 0);
        boolean b59 = defaultedMap52.containsValue((java.lang.Object) 0L);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        boolean b63 = defaultedMap52.containsKey((java.lang.Object) predicate61);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate44, predicate61);
        java.lang.Object obj65 = defaultedMap32.get((java.lang.Object) map64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b72 = defaultedMap69.equals((java.lang.Object) 10);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        boolean b80 = defaultedMap77.equals((java.lang.Object) 10);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate73, predicate81);
        java.util.Set set85 = defaultedMap69.keySet();
        java.lang.Object obj86 = defaultedMap32.get((java.lang.Object) set85);
        boolean b87 = defaultedMap23.containsKey((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) -1 + "'", obj65.equals((short) -1));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (short) -1 + "'", obj86.equals((short) -1));
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (byte) 0);
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) 0L);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b25 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        defaultedMap27.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        int i30 = defaultedMap27.size();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate35);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Predicate predicate3 = null;
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate21);
        java.util.Set set25 = defaultedMap9.keySet();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        java.util.Set set12 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str30 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        boolean b39 = defaultedMap32.containsValue((java.lang.Object) 0L);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        java.util.Set set41 = defaultedMap26.keySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap26);
        int i43 = defaultedMap20.size();
        java.util.Set set44 = defaultedMap20.entrySet();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set49 = defaultedMap48.entrySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap51);
        java.lang.Object obj53 = defaultedMap20.put((java.lang.Object) (byte) 1, (java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.equals((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap21.equals((java.lang.Object) 10);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate25);
        java.lang.String str29 = defaultedMap13.toString();
        defaultedMap13.clear();
        defaultedMap3.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.equals((java.lang.Object) 10);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b46 = defaultedMap43.equals((java.lang.Object) 10);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate39, predicate47);
        java.lang.String str51 = defaultedMap35.toString();
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap35.containsValue(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        boolean b60 = defaultedMap55.equals((java.lang.Object) "{}");
        boolean b61 = defaultedMap35.containsValue((java.lang.Object) defaultedMap55);
        java.util.Set set62 = defaultedMap55.keySet();
        java.lang.Object obj63 = defaultedMap13.get((java.lang.Object) defaultedMap55);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + (short) -1 + "'", obj63.equals((short) -1));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        java.util.Set set19 = defaultedMap3.keySet();
        java.util.Collection collection20 = defaultedMap3.values();
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        boolean b25 = defaultedMap7.equals((java.lang.Object) 0L);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap31.equals((java.lang.Object) 10);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap39.equals((java.lang.Object) 10);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate43);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate35, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "{}");
        java.util.Collection collection53 = defaultedMap50.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.String str59 = defaultedMap55.toString();
        java.util.Set set60 = defaultedMap55.entrySet();
        java.lang.String str61 = defaultedMap55.toString();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.lang.String str68 = defaultedMap64.toString();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        boolean b75 = defaultedMap70.equals((java.lang.Object) (byte) 0);
        boolean b77 = defaultedMap70.containsValue((java.lang.Object) 0L);
        defaultedMap64.putAll((java.util.Map) defaultedMap70);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) predicate79);
        boolean b81 = defaultedMap70.containsKey((java.lang.Object) predicate79);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate79);
        java.lang.Object obj83 = defaultedMap50.get((java.lang.Object) map82);
        java.util.Set set84 = defaultedMap50.entrySet();
        java.lang.Object obj85 = defaultedMap7.get((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) -1 + "'", obj83.equals((short) -1));
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (short) -1 + "'", obj85.equals((short) -1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i16 = defaultedMap7.size();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.equals((java.lang.Object) 10);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate17);
        java.lang.String str21 = defaultedMap5.toString();
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap5.containsValue(obj22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap25.equals((java.lang.Object) "{}");
        boolean b31 = defaultedMap5.containsValue((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) b31, (java.lang.Object) defaultedMap34);
        defaultedMap34.clear();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        boolean b7 = defaultedMap4.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b15 = defaultedMap12.equals((java.lang.Object) 10);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap20.equals((java.lang.Object) 10);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate24);
        java.lang.Object obj28 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) predicate16);
        java.lang.Object obj31 = defaultedMap4.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) "{}");
        boolean b35 = defaultedMap3.equals((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap39.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap47.equals((java.lang.Object) 10);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        boolean b58 = defaultedMap55.equals((java.lang.Object) 10);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate59);
        java.lang.Object obj63 = defaultedMap39.put((java.lang.Object) (-1), (java.lang.Object) predicate51);
        boolean b64 = defaultedMap3.equals((java.lang.Object) defaultedMap39);
        defaultedMap39.clear();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        java.util.Set set12 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str30 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        boolean b39 = defaultedMap32.containsValue((java.lang.Object) 0L);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        java.util.Set set41 = defaultedMap26.keySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap26);
        int i43 = defaultedMap20.size();
        java.util.Set set44 = defaultedMap20.entrySet();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) "{}");
        java.util.Collection collection50 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.String str56 = defaultedMap52.toString();
        java.util.Set set57 = defaultedMap52.entrySet();
        java.lang.String str58 = defaultedMap52.toString();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.lang.String str65 = defaultedMap61.toString();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b72 = defaultedMap67.equals((java.lang.Object) (byte) 0);
        boolean b74 = defaultedMap67.containsValue((java.lang.Object) 0L);
        defaultedMap61.putAll((java.util.Map) defaultedMap67);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) predicate76);
        boolean b78 = defaultedMap67.containsKey((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate59, predicate76);
        java.lang.Object obj80 = defaultedMap47.get((java.lang.Object) map79);
        java.util.Set set81 = defaultedMap47.entrySet();
        java.lang.Object obj82 = defaultedMap1.remove((java.lang.Object) set81);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) -1 + "'", obj80.equals((short) -1));
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) "{}");
        boolean b35 = defaultedMap3.equals((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap39.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap47.equals((java.lang.Object) 10);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        boolean b58 = defaultedMap55.equals((java.lang.Object) 10);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate59);
        java.lang.Object obj63 = defaultedMap39.put((java.lang.Object) (-1), (java.lang.Object) predicate51);
        boolean b64 = defaultedMap3.equals((java.lang.Object) defaultedMap39);
        java.util.Set set65 = defaultedMap39.entrySet();
        java.lang.Object obj67 = defaultedMap39.remove((java.lang.Object) 1.0d);
        collections.PredicateUtils predicateUtils68 = new collections.PredicateUtils();
        java.lang.Object obj69 = defaultedMap39.get((java.lang.Object) predicateUtils68);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (short) -1 + "'", obj69.equals((short) -1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "{}");
        java.util.Collection collection11 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        java.util.Set set18 = defaultedMap13.entrySet();
        java.lang.String str19 = defaultedMap13.toString();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        boolean b33 = defaultedMap28.equals((java.lang.Object) (byte) 0);
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) 0L);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        boolean b39 = defaultedMap28.containsKey((java.lang.Object) predicate37);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate20, predicate37);
        java.lang.Object obj41 = defaultedMap8.get((java.lang.Object) map40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap45.equals((java.lang.Object) "{}");
        java.lang.Object obj51 = defaultedMap43.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj52 = defaultedMap8.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj53 = defaultedMap3.get(obj52);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) -1 + "'", obj6.equals((short) -1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) -1 + "'", obj52.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) -1 + "'", obj53.equals((short) -1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        boolean b18 = defaultedMap7.containsKey((java.lang.Object) predicate16);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap33.equals((java.lang.Object) 10);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b44 = defaultedMap41.equals((java.lang.Object) 10);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate45);
        java.lang.Object obj49 = defaultedMap25.put((java.lang.Object) (-1), (java.lang.Object) predicate37);
        java.lang.Object obj52 = defaultedMap25.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap53);
        collections.Transformer transformer55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate(map54, transformer55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        java.util.Set set12 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.String str24 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str30 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        boolean b39 = defaultedMap32.containsValue((java.lang.Object) 0L);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        java.util.Set set41 = defaultedMap26.keySet();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap26);
        int i43 = defaultedMap20.size();
        java.util.Set set44 = defaultedMap20.entrySet();
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap20);
        java.util.Set set46 = defaultedMap20.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap33.equals((java.lang.Object) 10);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b44 = defaultedMap41.equals((java.lang.Object) 10);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate45);
        java.lang.Object obj49 = defaultedMap25.put((java.lang.Object) (-1), (java.lang.Object) predicate37);
        java.lang.Object obj52 = defaultedMap25.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        boolean b61 = defaultedMap58.equals((java.lang.Object) 10);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        boolean b69 = defaultedMap66.equals((java.lang.Object) 10);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate62, predicate70);
        java.util.Set set74 = defaultedMap58.keySet();
        java.util.Collection collection75 = defaultedMap58.values();
        java.lang.Object obj76 = defaultedMap53.remove((java.lang.Object) collection75);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap5.equals((java.lang.Object) 10);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap13.equals((java.lang.Object) 10);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate17);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate21);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = defaultedMap7.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) defaultedMap12);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) b14);
        int i16 = defaultedMap1.size();
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.String str12 = defaultedMap6.toString();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 0);
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        boolean b32 = defaultedMap21.containsKey((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map33);
        java.util.Set set35 = defaultedMap1.entrySet();
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        boolean b9 = defaultedMap6.equals((java.lang.Object) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap14.equals((java.lang.Object) 10);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate18);
        java.lang.String str22 = defaultedMap6.toString();
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap6.containsValue(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        boolean b31 = defaultedMap26.equals((java.lang.Object) "{}");
        boolean b32 = defaultedMap6.containsValue((java.lang.Object) defaultedMap26);
        java.util.Set set33 = defaultedMap26.keySet();
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap26);
        java.util.Set set35 = defaultedMap26.entrySet();
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = defaultedMap5.equals((java.lang.Object) (byte) 0);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b25 = defaultedMap20.equals((java.lang.Object) (byte) 0);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) 0L);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        boolean b29 = defaultedMap5.equals((java.lang.Object) defaultedMap20);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap20);
        java.lang.String str31 = defaultedMap20.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (byte) 0);
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) 0L);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        boolean b25 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        defaultedMap27.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap27);
        int i30 = defaultedMap27.size();
        java.util.Set set31 = defaultedMap27.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.lang.String str16 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap18.equals((java.lang.Object) (byte) 0);
        boolean b25 = defaultedMap18.containsValue((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        java.util.Set set27 = defaultedMap12.keySet();
        java.lang.String str28 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.String str34 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        boolean b41 = defaultedMap36.equals((java.lang.Object) (byte) 0);
        boolean b43 = defaultedMap36.containsValue((java.lang.Object) 0L);
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj46 = defaultedMap12.put((java.lang.Object) defaultedMap36, (java.lang.Object) (byte) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate15);
        boolean b19 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap23.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap31.equals((java.lang.Object) 10);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap39.equals((java.lang.Object) 10);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate43);
        java.lang.Object obj47 = defaultedMap23.put((java.lang.Object) (-1), (java.lang.Object) predicate35);
        java.lang.Object obj50 = defaultedMap23.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        java.lang.String str52 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        java.lang.String str58 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        boolean b65 = defaultedMap60.equals((java.lang.Object) (byte) 0);
        boolean b67 = defaultedMap60.containsValue((java.lang.Object) 0L);
        defaultedMap54.putAll((java.util.Map) defaultedMap60);
        java.util.Set set69 = defaultedMap54.keySet();
        boolean b70 = defaultedMap23.containsKey((java.lang.Object) set69);
        boolean b71 = defaultedMap3.containsValue((java.lang.Object) b70);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b21 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) "{}");
        java.util.Collection collection26 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap28.toString();
        java.util.Set set33 = defaultedMap28.entrySet();
        java.lang.String str34 = defaultedMap28.toString();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        boolean b48 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        boolean b50 = defaultedMap43.containsValue((java.lang.Object) 0L);
        defaultedMap37.putAll((java.util.Map) defaultedMap43);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        boolean b54 = defaultedMap43.containsKey((java.lang.Object) predicate52);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate52);
        java.lang.Object obj56 = defaultedMap23.get((java.lang.Object) map55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap60.equals((java.lang.Object) 10);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap66.putAll((java.util.Map) defaultedMap68);
        boolean b71 = defaultedMap68.equals((java.lang.Object) 10);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate72);
        java.util.Set set76 = defaultedMap60.keySet();
        java.lang.Object obj77 = defaultedMap23.get((java.lang.Object) set76);
        boolean b78 = defaultedMap1.containsValue((java.lang.Object) defaultedMap23);
        java.util.Set set79 = defaultedMap1.entrySet();
        java.lang.String str80 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) -1 + "'", obj56.equals((short) -1));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) -1 + "'", obj77.equals((short) -1));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        java.lang.Object obj30 = defaultedMap3.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        java.lang.String str32 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.String str38 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        boolean b45 = defaultedMap40.equals((java.lang.Object) (byte) 0);
        boolean b47 = defaultedMap40.containsValue((java.lang.Object) 0L);
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        java.util.Set set49 = defaultedMap34.keySet();
        boolean b50 = defaultedMap3.containsKey((java.lang.Object) set49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b59 = defaultedMap54.equals((java.lang.Object) "{}");
        java.lang.Object obj60 = defaultedMap52.get((java.lang.Object) defaultedMap54);
        java.util.Set set61 = defaultedMap52.keySet();
        java.util.Collection collection62 = defaultedMap52.values();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection62);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.String str12 = defaultedMap6.toString();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 0);
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        boolean b32 = defaultedMap21.containsKey((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b43 = defaultedMap38.equals((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = defaultedMap36.remove(obj46);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set16 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.String str25 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b32 = defaultedMap27.equals((java.lang.Object) (byte) 0);
        boolean b34 = defaultedMap27.containsValue((java.lang.Object) 0L);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        java.util.Set set36 = defaultedMap21.keySet();
        defaultedMap21.clear();
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap42.equals((java.lang.Object) "{}");
        java.lang.Object obj48 = defaultedMap40.get((java.lang.Object) defaultedMap42);
        java.util.Set set49 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap53.equals((java.lang.Object) 10);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap19.put((java.lang.Object) set49, (java.lang.Object) map59);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) "{}");
        boolean b35 = defaultedMap3.equals((java.lang.Object) defaultedMap29);
        boolean b36 = defaultedMap3.isEmpty();
        java.util.Set set37 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        java.lang.String str43 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap51.equals((java.lang.Object) (byte) 0);
        boolean b58 = defaultedMap51.containsValue((java.lang.Object) 0L);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        java.util.Set set60 = defaultedMap45.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        java.lang.String str67 = defaultedMap63.toString();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        boolean b74 = defaultedMap69.equals((java.lang.Object) (byte) 0);
        boolean b76 = defaultedMap69.containsValue((java.lang.Object) 0L);
        defaultedMap63.putAll((java.util.Map) defaultedMap69);
        java.util.Set set78 = defaultedMap63.keySet();
        java.util.Set set79 = defaultedMap63.keySet();
        boolean b80 = defaultedMap45.containsKey((java.lang.Object) defaultedMap63);
        java.util.Set set81 = defaultedMap45.entrySet();
        java.lang.Object obj82 = defaultedMap3.get((java.lang.Object) set81);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) -1 + "'", obj82.equals((short) -1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.String str15 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) 0L);
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        java.util.Set set26 = defaultedMap11.keySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap11);
        boolean b29 = defaultedMap11.equals((java.lang.Object) 0L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.equals((java.lang.Object) 10);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b46 = defaultedMap43.equals((java.lang.Object) 10);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate39, predicate47);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate39, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) predicate51);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b21 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        boolean b36 = defaultedMap29.containsValue((java.lang.Object) 0L);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        java.util.Set set38 = defaultedMap23.keySet();
        java.lang.String str39 = defaultedMap23.toString();
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) str39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap44.equals((java.lang.Object) 10);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap1.remove((java.lang.Object) predicate48);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b15 = defaultedMap12.equals((java.lang.Object) 10);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b25 = defaultedMap20.equals((java.lang.Object) (byte) 0);
        boolean b27 = defaultedMap20.containsValue((java.lang.Object) 0L);
        boolean b29 = defaultedMap20.containsKey((java.lang.Object) 1.0f);
        java.lang.String str30 = defaultedMap20.toString();
        boolean b31 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        boolean b45 = defaultedMap42.equals((java.lang.Object) 10);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b53 = defaultedMap50.equals((java.lang.Object) 10);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate54);
        java.util.Collection collection58 = defaultedMap42.values();
        defaultedMap35.putAll((java.util.Map) defaultedMap42);
        defaultedMap20.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) predicate17, (java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        java.util.Collection collection12 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) -1 + "'", obj8.equals((short) -1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.String str23 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap25.equals((java.lang.Object) (byte) 0);
        boolean b32 = defaultedMap25.containsValue((java.lang.Object) 0L);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.util.Set set34 = defaultedMap19.keySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap19);
        int i36 = defaultedMap13.size();
        java.util.Set set37 = defaultedMap13.entrySet();
        boolean b38 = defaultedMap1.containsKey((java.lang.Object) set37);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        java.util.Set set43 = defaultedMap7.entrySet();
        boolean b44 = defaultedMap7.isEmpty();
        defaultedMap7.clear();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b21 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.String str27 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.lang.String str33 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) (byte) 0);
        boolean b42 = defaultedMap35.containsValue((java.lang.Object) 0L);
        defaultedMap29.putAll((java.util.Map) defaultedMap35);
        java.util.Set set44 = defaultedMap29.keySet();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap29);
        boolean b47 = defaultedMap29.equals((java.lang.Object) 0L);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap53.equals((java.lang.Object) 10);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        boolean b64 = defaultedMap61.equals((java.lang.Object) 10);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate57, predicate65);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate57, predicate69);
        boolean b71 = defaultedMap1.equals((java.lang.Object) map70);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "{}");
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (byte) 0);
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) 0L);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        boolean b27 = defaultedMap16.containsKey((java.lang.Object) predicate25);
        java.lang.Object obj28 = defaultedMap5.remove((java.lang.Object) defaultedMap16);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10L + "'", obj29.equals(10L));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        int i11 = defaultedMap1.size();
        java.util.Set set12 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.String str20 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap22.equals((java.lang.Object) (byte) 0);
        boolean b29 = defaultedMap22.containsValue((java.lang.Object) 0L);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.util.Set set31 = defaultedMap16.keySet();
        defaultedMap16.clear();
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        int i34 = defaultedMap14.size();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b43 = defaultedMap38.equals((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) defaultedMap38);
        java.util.Set set45 = defaultedMap36.keySet();
        java.util.Collection collection46 = defaultedMap36.values();
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) i34, (java.lang.Object) defaultedMap36);
        java.util.Set set48 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        java.lang.Object obj30 = defaultedMap3.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        java.lang.String str32 = defaultedMap3.toString();
        java.util.Collection collection33 = defaultedMap3.values();
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.String str12 = defaultedMap6.toString();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 0);
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        boolean b32 = defaultedMap21.containsKey((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        boolean b41 = defaultedMap38.equals((java.lang.Object) 10);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.equals((java.lang.Object) 10);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate42, predicate50);
        java.util.Set set54 = defaultedMap38.keySet();
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) set54);
        int i56 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
        org.junit.Assert.assertTrue(i56 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap3.containsKey(obj6);
        boolean b9 = defaultedMap3.equals((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap3.values();
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        java.util.Set set11 = defaultedMap6.entrySet();
        java.lang.String str12 = defaultedMap6.toString();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 0);
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        boolean b32 = defaultedMap21.containsKey((java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        boolean b43 = defaultedMap38.equals((java.lang.Object) "{}");
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap36);
        java.util.Set set46 = defaultedMap36.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set16 = defaultedMap1.keySet();
        java.lang.String str17 = defaultedMap1.toString();
        int i18 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.equals((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap1.keySet();
        java.lang.String str11 = defaultedMap1.toString();
        java.util.Collection collection12 = defaultedMap1.values();
        boolean b14 = defaultedMap1.equals((java.lang.Object) false);
        java.util.Set set15 = defaultedMap1.keySet();
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        int i43 = defaultedMap25.size();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap25.get(obj44);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        defaultedMap3.clear();
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 100);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) -1 + "'", obj6.equals((short) -1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        defaultedMap8.clear();
        java.util.Collection collection16 = defaultedMap8.values();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        java.util.Set set43 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        java.lang.String str51 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        boolean b58 = defaultedMap53.equals((java.lang.Object) (byte) 0);
        boolean b60 = defaultedMap53.containsValue((java.lang.Object) 0L);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        java.util.Set set62 = defaultedMap47.keySet();
        defaultedMap47.clear();
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Object obj66 = defaultedMap7.put((java.lang.Object) defaultedMap47, obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        java.lang.String str72 = defaultedMap68.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap74.putAll((java.util.Map) defaultedMap76);
        boolean b79 = defaultedMap74.equals((java.lang.Object) (byte) 0);
        boolean b81 = defaultedMap74.containsValue((java.lang.Object) 0L);
        defaultedMap68.putAll((java.util.Map) defaultedMap74);
        java.util.Set set83 = defaultedMap68.keySet();
        java.util.Set set84 = defaultedMap68.keySet();
        java.lang.Object obj85 = defaultedMap7.get((java.lang.Object) defaultedMap68);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate29);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) "{}");
        boolean b41 = defaultedMap9.equals((java.lang.Object) defaultedMap35);
        boolean b42 = defaultedMap3.containsValue((java.lang.Object) defaultedMap35);
        java.util.Set set43 = defaultedMap3.entrySet();
        java.lang.String str44 = defaultedMap3.toString();
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set16 = defaultedMap1.keySet();
        java.lang.String str17 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        boolean b26 = defaultedMap19.containsValue((java.lang.Object) 0L);
        boolean b28 = defaultedMap19.containsKey((java.lang.Object) 1.0f);
        int i29 = defaultedMap19.size();
        java.util.Set set30 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.String str36 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.String str42 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.lang.String str48 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b55 = defaultedMap50.equals((java.lang.Object) (byte) 0);
        boolean b57 = defaultedMap50.containsValue((java.lang.Object) 0L);
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        java.util.Set set59 = defaultedMap44.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) defaultedMap44);
        int i61 = defaultedMap38.size();
        java.util.Set set62 = defaultedMap38.entrySet();
        java.lang.Object obj63 = defaultedMap19.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap38);
        boolean b64 = defaultedMap1.equals(obj63);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap14.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set20 = defaultedMap19.entrySet();
        boolean b21 = defaultedMap14.containsKey((java.lang.Object) defaultedMap19);
        java.lang.Object obj22 = defaultedMap8.get((java.lang.Object) b21);
        java.util.Set set23 = defaultedMap8.entrySet();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) set23);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) -1 + "'", obj24.equals((short) -1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set30 = defaultedMap29.entrySet();
        java.lang.String str31 = defaultedMap29.toString();
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) str31);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) -1 + "'", obj32.equals((short) -1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Set set4 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.equals((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.util.Set set10 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap14.equals((java.lang.Object) 10);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.lang.String str26 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b39 = defaultedMap34.equals((java.lang.Object) (byte) 0);
        boolean b41 = defaultedMap34.containsValue((java.lang.Object) 0L);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.util.Set set43 = defaultedMap28.keySet();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap28);
        boolean b46 = defaultedMap28.equals((java.lang.Object) 0L);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        boolean b55 = defaultedMap52.equals((java.lang.Object) 10);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap60.equals((java.lang.Object) 10);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate64);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate56, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate19, predicate68);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        java.util.Set set43 = defaultedMap7.entrySet();
        boolean b44 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        boolean b51 = defaultedMap48.equals((java.lang.Object) 10);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b59 = defaultedMap56.equals((java.lang.Object) 10);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate60);
        java.lang.String str64 = defaultedMap48.toString();
        java.lang.Object obj65 = null;
        boolean b66 = defaultedMap48.containsValue(obj65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        boolean b73 = defaultedMap68.equals((java.lang.Object) "{}");
        boolean b74 = defaultedMap48.containsValue((java.lang.Object) defaultedMap68);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap68);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) str5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap10.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap18.equals((java.lang.Object) 10);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap26.equals((java.lang.Object) 10);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate30);
        java.lang.Object obj34 = defaultedMap10.put((java.lang.Object) (-1), (java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        boolean b41 = defaultedMap36.equals((java.lang.Object) "{}");
        boolean b42 = defaultedMap10.equals((java.lang.Object) defaultedMap36);
        boolean b43 = defaultedMap10.isEmpty();
        java.util.Set set44 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap46);
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap6.put((java.lang.Object) defaultedMap10, (java.lang.Object) defaultedMap46);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b62 = defaultedMap59.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        java.util.Set set65 = defaultedMap64.entrySet();
        boolean b66 = defaultedMap59.containsKey((java.lang.Object) defaultedMap64);
        java.lang.Object obj67 = defaultedMap53.get((java.lang.Object) b66);
        int i68 = defaultedMap53.size();
        java.lang.Object obj69 = defaultedMap10.get((java.lang.Object) defaultedMap53);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (short) -1 + "'", obj69.equals((short) -1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate29);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) "{}");
        boolean b41 = defaultedMap9.equals((java.lang.Object) defaultedMap35);
        boolean b42 = defaultedMap3.containsValue((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.equals((java.lang.Object) 10);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.lang.Object obj54 = defaultedMap3.put((java.lang.Object) predicate50, (java.lang.Object) 100L);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) 0L);
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        java.util.Set set21 = defaultedMap6.keySet();
        defaultedMap6.clear();
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b32 = defaultedMap27.equals((java.lang.Object) "{}");
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) defaultedMap27);
        java.util.Set set34 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        boolean b41 = defaultedMap38.equals((java.lang.Object) 10);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate42, predicate43);
        java.lang.Object obj45 = defaultedMap4.put((java.lang.Object) set34, (java.lang.Object) map44);
        java.lang.Object obj46 = defaultedMap1.put((java.lang.Object) 1.0f, obj45);
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 10L + "'", obj48.equals(10L));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap46.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap54.equals((java.lang.Object) 10);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        boolean b65 = defaultedMap62.equals((java.lang.Object) 10);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate58, predicate66);
        java.lang.Object obj70 = defaultedMap46.put((java.lang.Object) (-1), (java.lang.Object) predicate58);
        java.util.Set set71 = defaultedMap46.keySet();
        boolean b72 = defaultedMap25.containsKey((java.lang.Object) set71);
        boolean b73 = defaultedMap25.isEmpty();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i21 = defaultedMap1.size();
        java.util.Set set22 = defaultedMap1.keySet();
        java.util.Collection collection23 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap27.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap35.equals((java.lang.Object) 10);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        boolean b46 = defaultedMap43.equals((java.lang.Object) 10);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate39, predicate47);
        java.lang.Object obj51 = defaultedMap27.put((java.lang.Object) (-1), (java.lang.Object) predicate39);
        java.lang.Object obj54 = defaultedMap27.put((java.lang.Object) (short) 100, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap55);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) "{}");
        boolean b35 = defaultedMap3.equals((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap39.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap47.equals((java.lang.Object) 10);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        boolean b58 = defaultedMap55.equals((java.lang.Object) 10);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate59);
        java.lang.Object obj63 = defaultedMap39.put((java.lang.Object) (-1), (java.lang.Object) predicate51);
        boolean b64 = defaultedMap3.equals((java.lang.Object) defaultedMap39);
        java.util.Set set65 = defaultedMap39.entrySet();
        java.lang.Object obj67 = defaultedMap39.remove((java.lang.Object) 1.0d);
        java.lang.String str68 = defaultedMap39.toString();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        boolean b77 = defaultedMap72.equals((java.lang.Object) "{}");
        java.lang.Object obj78 = defaultedMap70.get((java.lang.Object) defaultedMap72);
        java.util.Set set79 = defaultedMap72.keySet();
        boolean b80 = defaultedMap39.containsValue((java.lang.Object) set79);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b5 = defaultedMap3.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate21);
        java.lang.String str25 = defaultedMap9.toString();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap9.containsValue(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) "{}");
        boolean b35 = defaultedMap9.containsValue((java.lang.Object) defaultedMap29);
        defaultedMap3.putAll((java.util.Map) defaultedMap29);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set22 = defaultedMap7.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 0);
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) 0L);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Set set40 = defaultedMap25.keySet();
        java.util.Set set41 = defaultedMap25.keySet();
        boolean b42 = defaultedMap7.containsKey((java.lang.Object) defaultedMap25);
        java.util.Set set43 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap53.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        boolean b64 = defaultedMap61.equals((java.lang.Object) 10);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap67.putAll((java.util.Map) defaultedMap69);
        boolean b72 = defaultedMap69.equals((java.lang.Object) 10);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate65, predicate73);
        java.lang.Object obj77 = defaultedMap53.put((java.lang.Object) (-1), (java.lang.Object) predicate65);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap79.putAll((java.util.Map) defaultedMap81);
        boolean b84 = defaultedMap79.equals((java.lang.Object) "{}");
        boolean b85 = defaultedMap53.equals((java.lang.Object) defaultedMap79);
        boolean b86 = defaultedMap47.containsValue((java.lang.Object) defaultedMap79);
        java.util.Set set87 = defaultedMap47.entrySet();
        java.util.Set set88 = defaultedMap47.entrySet();
        boolean b89 = defaultedMap7.equals((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue(b89 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        boolean b9 = defaultedMap6.equals((java.lang.Object) 10);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap14.equals((java.lang.Object) 10);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate18);
        java.lang.String str22 = defaultedMap6.toString();
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap6.containsValue(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        boolean b31 = defaultedMap26.equals((java.lang.Object) "{}");
        boolean b32 = defaultedMap6.containsValue((java.lang.Object) defaultedMap26);
        java.util.Set set33 = defaultedMap26.keySet();
        java.lang.Object obj34 = defaultedMap2.get((java.lang.Object) defaultedMap26);
        int i35 = defaultedMap26.size();
        java.util.Set set36 = defaultedMap26.keySet();
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) 0L);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) 0L);
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        boolean b23 = defaultedMap12.containsKey((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        defaultedMap12.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) 0L);
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        boolean b23 = defaultedMap12.containsKey((java.lang.Object) predicate21);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (short) 100);
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b32);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) -1 + "'", obj31.equals((short) -1));
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.equals((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.String str10 = defaultedMap3.toString();
        java.util.Set set11 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.String str23 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap25.equals((java.lang.Object) (byte) 0);
        boolean b32 = defaultedMap25.containsValue((java.lang.Object) 0L);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.util.Set set34 = defaultedMap19.keySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        boolean b48 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        boolean b50 = defaultedMap43.containsValue((java.lang.Object) 0L);
        defaultedMap37.putAll((java.util.Map) defaultedMap43);
        java.util.Set set52 = defaultedMap37.keySet();
        java.util.Set set53 = defaultedMap37.keySet();
        boolean b54 = defaultedMap19.containsKey((java.lang.Object) defaultedMap37);
        java.util.Set set55 = defaultedMap19.entrySet();
        boolean b56 = defaultedMap19.isEmpty();
        java.lang.Object obj57 = defaultedMap3.get((java.lang.Object) defaultedMap19);
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) -1 + "'", obj57.equals((short) -1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap17.equals((java.lang.Object) 10);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap25.equals((java.lang.Object) 10);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate29);
        java.lang.Object obj33 = defaultedMap9.put((java.lang.Object) (-1), (java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) "{}");
        boolean b41 = defaultedMap9.equals((java.lang.Object) defaultedMap35);
        boolean b42 = defaultedMap3.containsValue((java.lang.Object) defaultedMap35);
        java.util.Set set43 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.String str55 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        boolean b62 = defaultedMap57.equals((java.lang.Object) (byte) 0);
        boolean b64 = defaultedMap57.containsValue((java.lang.Object) 0L);
        defaultedMap51.putAll((java.util.Map) defaultedMap57);
        java.util.Set set66 = defaultedMap51.keySet();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap51);
        boolean b69 = defaultedMap51.equals((java.lang.Object) 0L);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (byte) 0);
        java.lang.Object obj72 = defaultedMap3.get((java.lang.Object) defaultedMap51);
        java.util.Set set73 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) set73);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (short) -1 + "'", obj72.equals((short) -1));
        org.junit.Assert.assertNotNull(set73);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = defaultedMap5.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap12);
        java.util.Set set19 = defaultedMap12.keySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) set19);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        boolean b8 = defaultedMap3.equals((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        java.lang.String str10 = defaultedMap3.toString();
        java.util.Set set11 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.String str23 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap25.equals((java.lang.Object) (byte) 0);
        boolean b32 = defaultedMap25.containsValue((java.lang.Object) 0L);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.util.Set set34 = defaultedMap19.keySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.String str41 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        boolean b48 = defaultedMap43.equals((java.lang.Object) (byte) 0);
        boolean b50 = defaultedMap43.containsValue((java.lang.Object) 0L);
        defaultedMap37.putAll((java.util.Map) defaultedMap43);
        java.util.Set set52 = defaultedMap37.keySet();
        java.util.Set set53 = defaultedMap37.keySet();
        boolean b54 = defaultedMap19.containsKey((java.lang.Object) defaultedMap37);
        java.util.Set set55 = defaultedMap19.entrySet();
        boolean b56 = defaultedMap19.isEmpty();
        java.lang.Object obj57 = defaultedMap3.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap59);
        defaultedMap3.putAll((java.util.Map) defaultedMap60);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) -1 + "'", obj57.equals((short) -1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap11.equals((java.lang.Object) 10);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap19.equals((java.lang.Object) 10);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate23);
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) "{}");
        boolean b35 = defaultedMap3.equals((java.lang.Object) defaultedMap29);
        boolean b36 = defaultedMap3.isEmpty();
        java.util.Set set37 = defaultedMap3.keySet();
        boolean b39 = defaultedMap3.equals((java.lang.Object) 10);
        collections.Transformer transformer40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 0);
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) 0L);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.util.Set set18 = defaultedMap3.keySet();
        defaultedMap3.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i21 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        boolean b31 = defaultedMap24.containsValue((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        boolean b44 = defaultedMap39.equals((java.lang.Object) (byte) 0);
        boolean b46 = defaultedMap39.containsValue((java.lang.Object) 0L);
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        boolean b48 = defaultedMap24.equals((java.lang.Object) defaultedMap39);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        java.lang.String str50 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
    }
}

