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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        int i2 = defaultedMap1.size();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) predicate23);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate26);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate(map27, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) predicate23);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate26);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) '#');
        boolean b11 = defaultedMap5.containsValue((java.lang.Object) 0);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0d);
        defaultedMap1.putAll(map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) predicateUtils21);
        defaultedMap16.clear();
        java.util.Set set24 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) '#');
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "");
        defaultedMap16.putAll(map32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 100.0f);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) '#');
        boolean b41 = defaultedMap35.containsValue((java.lang.Object) 0);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 1.0d);
        java.lang.Object obj44 = defaultedMap16.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj45 = defaultedMap1.get(obj44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 0);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) 1.0f, (java.lang.Object) predicate15);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) '#');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) (byte) 10);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        boolean b56 = defaultedMap50.containsValue((java.lang.Object) 0);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 1.0d);
        java.lang.Object obj59 = defaultedMap31.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        java.util.Collection collection61 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        int i19 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.PredicateUtils predicateUtils51 = new collections.PredicateUtils();
        boolean b52 = defaultedMap20.containsValue((java.lang.Object) predicateUtils51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) 0);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) b15);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate(map5, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        defaultedMap9.clear();
        java.util.Collection collection20 = defaultedMap9.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        boolean b35 = defaultedMap31.equals((java.lang.Object) (short) 10);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) (short) 1);
        boolean b38 = defaultedMap20.equals((java.lang.Object) map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 100.0f);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        java.lang.Object obj46 = defaultedMap40.get((java.lang.Object) predicateUtils45);
        defaultedMap40.clear();
        java.util.Set set48 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "");
        defaultedMap40.putAll(map56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) 100.0f);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) '#');
        boolean b65 = defaultedMap59.containsValue((java.lang.Object) 0);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 1.0d);
        java.lang.Object obj68 = defaultedMap40.get((java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 100.0f);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils75 = new collections.PredicateUtils();
        java.lang.Object obj76 = defaultedMap70.get((java.lang.Object) predicateUtils75);
        defaultedMap70.clear();
        java.util.Set set78 = defaultedMap70.entrySet();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) 100.0f);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) '#');
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) "");
        defaultedMap70.putAll(map86);
        defaultedMap59.putAll((java.util.Map) defaultedMap70);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b92 = defaultedMap90.containsKey((java.lang.Object) 100.0f);
        boolean b94 = defaultedMap90.equals((java.lang.Object) (short) 10);
        boolean b96 = defaultedMap90.containsValue((java.lang.Object) 10.0f);
        defaultedMap59.putAll((java.util.Map) defaultedMap90);
        collections.map.DefaultedMap defaultedMap98 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap90);
        java.lang.Object obj99 = defaultedMap20.get((java.lang.Object) defaultedMap90);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "" + "'", obj68.equals(""));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "" + "'", obj76.equals(""));
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue("'" + obj99 + "' != '" + "" + "'", obj99.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) "");
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        java.lang.String str51 = defaultedMap50.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        boolean b59 = defaultedMap51.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        java.util.Map map8 = null;
        try {
            defaultedMap1.putAll(map8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.lang.String str23 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) 100.0f);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils30 = new collections.PredicateUtils();
        java.lang.Object obj31 = defaultedMap25.get((java.lang.Object) predicateUtils30);
        defaultedMap25.clear();
        java.util.Set set33 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 100.0f);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) '#');
        java.lang.Object obj41 = defaultedMap35.get((java.lang.Object) 0.0f);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, obj41);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 0);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap17.get((java.lang.Object) predicate48);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) predicate48);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "" + "'", obj41.equals(""));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "" + "'", obj50.equals(""));
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 100);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) '#');
        java.lang.Object obj22 = defaultedMap16.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0f);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        java.lang.Object obj30 = defaultedMap24.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) 100.0f);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) predicateUtils37);
        defaultedMap32.clear();
        java.util.Set set40 = defaultedMap32.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 0);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) predicate46);
        java.lang.Object obj48 = defaultedMap32.put((java.lang.Object) 1.0f, (java.lang.Object) predicate46);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate46, predicate49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) map50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap9.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) predicateUtils22);
        defaultedMap17.clear();
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate31, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map35);
        collections.Transformer transformer37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        boolean b17 = defaultedMap11.containsValue((java.lang.Object) 0);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0d);
        defaultedMap7.putAll(map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        java.util.Map map26 = collections.map.DefaultedMap.decorate(map5, (java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) false);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) false);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) predicate21);
        java.util.Set set23 = defaultedMap18.entrySet();
        java.lang.String str24 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap26.get((java.lang.Object) predicateUtils31);
        defaultedMap26.clear();
        java.util.Set set34 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0f);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) '#');
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) 0.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, obj42);
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) 0);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) predicate49);
        java.lang.Object obj51 = defaultedMap18.get((java.lang.Object) predicate49);
        java.lang.Object obj52 = defaultedMap7.remove(obj51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "" + "'", obj48.equals(""));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (short) 10);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (short) 1);
        java.util.Set set23 = defaultedMap16.entrySet();
        java.lang.Object obj24 = defaultedMap8.remove((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.util.Set set60 = defaultedMap59.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 100.0f);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) '#');
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 100.0f);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) '#');
        boolean b76 = defaultedMap70.containsValue((java.lang.Object) 0);
        boolean b77 = defaultedMap62.containsValue((java.lang.Object) b76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) "");
        int i81 = defaultedMap80.size();
        java.util.Set set82 = defaultedMap80.keySet();
        java.lang.Object obj83 = defaultedMap62.put((java.lang.Object) ' ', (java.lang.Object) set82);
        boolean b84 = defaultedMap59.containsKey((java.lang.Object) ' ');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(i81 == 0);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        boolean b56 = defaultedMap50.containsValue((java.lang.Object) 0);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 1.0d);
        java.lang.Object obj59 = defaultedMap31.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        java.lang.String str61 = defaultedMap31.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) false);
        java.util.Set set16 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) set16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        boolean b50 = defaultedMap31.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsValue(obj11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        java.util.Set set10 = defaultedMap1.entrySet();
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.String str23 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 100.0f);
        boolean b56 = defaultedMap52.equals((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap52.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) 100.0f);
        boolean b64 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) (short) 1);
        java.util.Set set67 = defaultedMap60.entrySet();
        java.lang.Object obj68 = defaultedMap52.remove((java.lang.Object) defaultedMap60);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.util.Collection collection70 = defaultedMap52.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection70);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) map16);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        boolean b51 = defaultedMap20.containsValue((java.lang.Object) 'a');
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap20.get((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) "");
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        boolean b15 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        java.util.Collection collection51 = defaultedMap50.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0f);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) '#');
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) 0.0f);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj25);
        boolean b27 = defaultedMap1.equals(obj25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap9.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) predicateUtils22);
        defaultedMap17.clear();
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate31, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (short) 10);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap1.remove((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 100.0f);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) '#');
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) "");
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) map54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) 100.0f);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) 100.0f);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) '#');
        java.lang.Object obj69 = defaultedMap63.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) 100.0f);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) '#');
        java.lang.Object obj77 = defaultedMap71.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b81 = defaultedMap79.containsKey((java.lang.Object) 100.0f);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils84 = new collections.PredicateUtils();
        java.lang.Object obj85 = defaultedMap79.get((java.lang.Object) predicateUtils84);
        defaultedMap79.clear();
        java.util.Set set87 = defaultedMap79.entrySet();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj92 = defaultedMap90.get((java.lang.Object) 0);
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        boolean b94 = defaultedMap90.containsKey((java.lang.Object) predicate93);
        java.lang.Object obj95 = defaultedMap79.put((java.lang.Object) 1.0f, (java.lang.Object) predicate93);
        collections.Predicate predicate96 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate93, predicate96);
        java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) map97);
        java.lang.Object obj99 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) map98);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + "" + "'", obj85.equals(""));
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + "" + "'", obj92.equals(""));
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 100);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils21 = new collections.PredicateUtils();
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) predicateUtils21);
        defaultedMap16.clear();
        java.util.Set set24 = defaultedMap16.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) '#');
        java.lang.Object obj32 = defaultedMap26.get((java.lang.Object) 0.0f);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, obj32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 100.0f);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) '#');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) "");
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap35.containsKey(obj42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) 100.0f);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) '#');
        java.lang.Object obj51 = defaultedMap45.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 100.0f);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        java.lang.Object obj59 = defaultedMap53.get((java.lang.Object) predicateUtils58);
        defaultedMap53.clear();
        java.util.Set set61 = defaultedMap53.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) 0);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        boolean b68 = defaultedMap64.containsKey((java.lang.Object) predicate67);
        java.lang.Object obj69 = defaultedMap53.put((java.lang.Object) 1.0f, (java.lang.Object) predicate67);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate67, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate70, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map33, predicate70, predicate74);
        boolean b76 = defaultedMap9.equals((java.lang.Object) predicate74);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        defaultedMap20.putAll((java.util.Map) defaultedMap60);
        java.util.Collection collection62 = defaultedMap60.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap9.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) predicateUtils22);
        defaultedMap17.clear();
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate31, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (short) 10);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap1.remove((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 100.0f);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) '#');
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) "");
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) map54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 0);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        boolean b61 = defaultedMap57.containsKey((java.lang.Object) predicate60);
        java.util.Set set62 = defaultedMap57.entrySet();
        java.lang.String str63 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 100.0f);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils70 = new collections.PredicateUtils();
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) predicateUtils70);
        defaultedMap65.clear();
        java.util.Set set73 = defaultedMap65.entrySet();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b77 = defaultedMap75.containsKey((java.lang.Object) 100.0f);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) '#');
        java.lang.Object obj81 = defaultedMap75.get((java.lang.Object) 0.0f);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, obj81);
        defaultedMap57.putAll((java.util.Map) defaultedMap65);
        java.lang.Object obj86 = defaultedMap65.put((java.lang.Object) '#', (java.lang.Object) true);
        java.lang.Object obj87 = defaultedMap1.remove((java.lang.Object) defaultedMap65);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + "" + "'", obj71.equals(""));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + "" + "'", obj81.equals(""));
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) predicate23);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) map27);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        java.util.Set set40 = defaultedMap31.keySet();
        java.lang.Object obj41 = defaultedMap28.remove((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0f);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        boolean b30 = defaultedMap24.containsValue((java.lang.Object) 0);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 1.0d);
        defaultedMap20.putAll(map32);
        java.util.Set set34 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0f);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) predicateUtils41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) set34, (java.lang.Object) defaultedMap36);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (short) 10);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap9.entrySet();
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0f);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) '#');
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "");
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) (short) 10);
        java.util.Set set28 = defaultedMap19.entrySet();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) set28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        java.lang.Object obj26 = defaultedMap20.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) 100.0f);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) '#');
        java.lang.Object obj34 = defaultedMap28.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0f);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils41 = new collections.PredicateUtils();
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) predicateUtils41);
        defaultedMap36.clear();
        java.util.Set set44 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) predicate50);
        java.lang.Object obj52 = defaultedMap36.put((java.lang.Object) 1.0f, (java.lang.Object) predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate50, predicate53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) map54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) 100.0f);
        boolean b61 = defaultedMap57.equals((java.lang.Object) (short) 10);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap20.remove((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap20.get((java.lang.Object) 1L);
        java.util.Collection collection67 = defaultedMap20.values();
        boolean b68 = defaultedMap1.containsValue((java.lang.Object) collection67);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) 100.0f);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) '#');
        java.lang.Object obj66 = defaultedMap60.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) '#');
        java.lang.Object obj74 = defaultedMap68.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b78 = defaultedMap76.containsKey((java.lang.Object) 100.0f);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils81 = new collections.PredicateUtils();
        java.lang.Object obj82 = defaultedMap76.get((java.lang.Object) predicateUtils81);
        defaultedMap76.clear();
        java.util.Set set84 = defaultedMap76.entrySet();
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj89 = defaultedMap87.get((java.lang.Object) 0);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        boolean b91 = defaultedMap87.containsKey((java.lang.Object) predicate90);
        java.lang.Object obj92 = defaultedMap76.put((java.lang.Object) 1.0f, (java.lang.Object) predicate90);
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate90, predicate93);
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) map94);
        java.util.Collection collection96 = defaultedMap60.values();
        boolean b97 = defaultedMap51.equals((java.lang.Object) collection96);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + "" + "'", obj82.equals(""));
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + "" + "'", obj89.equals(""));
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(collection96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) 0);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) b15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils23 = new collections.PredicateUtils();
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) predicateUtils23);
        defaultedMap18.clear();
        java.util.Set set26 = defaultedMap18.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) 100.0f);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) '#');
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) "");
        defaultedMap18.putAll(map34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) 100.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) '#');
        boolean b43 = defaultedMap37.containsValue((java.lang.Object) 0);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 1.0d);
        java.lang.Object obj46 = defaultedMap18.get((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) 100.0f);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        java.lang.Object obj54 = defaultedMap48.get((java.lang.Object) predicateUtils53);
        defaultedMap48.clear();
        java.util.Set set56 = defaultedMap48.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100.0f);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) '#');
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) "");
        defaultedMap48.putAll(map64);
        defaultedMap37.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) 100.0f);
        boolean b72 = defaultedMap68.equals((java.lang.Object) (short) 10);
        boolean b74 = defaultedMap68.containsValue((java.lang.Object) 10.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap68);
        boolean b77 = defaultedMap68.containsKey((java.lang.Object) (-1.0d));
        boolean b78 = defaultedMap1.containsKey((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        defaultedMap1.clear();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (short) 10);
        boolean b23 = defaultedMap17.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) defaultedMap17, (java.lang.Object) false);
        java.util.Set set26 = defaultedMap11.entrySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set32 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        boolean b35 = defaultedMap1.equals((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map4 = null;
        try {
            defaultedMap1.putAll(map4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        boolean b51 = defaultedMap20.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) 100.0f);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        java.lang.Object obj59 = defaultedMap53.get((java.lang.Object) predicateUtils58);
        defaultedMap53.clear();
        java.util.Set set61 = defaultedMap53.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) 0);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        boolean b68 = defaultedMap64.containsKey((java.lang.Object) predicate67);
        java.lang.Object obj69 = defaultedMap53.put((java.lang.Object) 1.0f, (java.lang.Object) predicate67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) 100.0f);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils76 = new collections.PredicateUtils();
        java.lang.Object obj77 = defaultedMap71.get((java.lang.Object) predicateUtils76);
        defaultedMap71.clear();
        java.util.Set set79 = defaultedMap71.entrySet();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj84 = defaultedMap82.get((java.lang.Object) 0);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        boolean b86 = defaultedMap82.containsKey((java.lang.Object) predicate85);
        java.lang.Object obj87 = defaultedMap71.put((java.lang.Object) 1.0f, (java.lang.Object) predicate85);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate67, predicate85);
        java.util.Collection collection89 = defaultedMap20.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "" + "'", obj77.equals(""));
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + "" + "'", obj84.equals(""));
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(collection89);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        boolean b56 = defaultedMap50.containsValue((java.lang.Object) 0);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 1.0d);
        java.lang.Object obj59 = defaultedMap31.get((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 100.0f);
        boolean b65 = defaultedMap61.equals((java.lang.Object) (short) 10);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) (short) 1);
        boolean b68 = defaultedMap50.equals((java.lang.Object) map67);
        java.lang.Object obj69 = defaultedMap20.remove((java.lang.Object) map67);
        collections.Transformer transformer70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate(map67, transformer70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0f);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) '#');
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) 0.0f);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj25);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        boolean b33 = defaultedMap29.containsKey((java.lang.Object) predicate32);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0f);
        boolean b40 = defaultedMap36.equals((java.lang.Object) (short) 10);
        boolean b42 = defaultedMap36.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) 100.0f);
        boolean b48 = defaultedMap44.equals((java.lang.Object) (short) 10);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) (short) 1);
        java.util.Set set51 = defaultedMap44.entrySet();
        java.lang.Object obj52 = defaultedMap36.remove((java.lang.Object) defaultedMap44);
        boolean b53 = defaultedMap1.containsKey(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) '#');
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) "");
        java.lang.Object obj62 = null;
        boolean b63 = defaultedMap55.containsKey(obj62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 100.0f);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) '#');
        java.lang.Object obj71 = defaultedMap65.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) 100.0f);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils78 = new collections.PredicateUtils();
        java.lang.Object obj79 = defaultedMap73.get((java.lang.Object) predicateUtils78);
        defaultedMap73.clear();
        java.util.Set set81 = defaultedMap73.entrySet();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj86 = defaultedMap84.get((java.lang.Object) 0);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        boolean b88 = defaultedMap84.containsKey((java.lang.Object) predicate87);
        java.lang.Object obj89 = defaultedMap73.put((java.lang.Object) 1.0f, (java.lang.Object) predicate87);
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate87, predicate90);
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate90, predicate92);
        java.util.Collection collection94 = defaultedMap55.values();
        collections.Predicate predicate95 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj96 = defaultedMap1.put((java.lang.Object) defaultedMap55, (java.lang.Object) predicate95);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + "" + "'", obj79.equals(""));
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + "" + "'", obj86.equals(""));
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        boolean b51 = defaultedMap20.containsValue((java.lang.Object) 'a');
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap20.get((java.lang.Object) predicate52);
        boolean b54 = defaultedMap20.isEmpty();
        java.util.Set set55 = defaultedMap20.keySet();
        java.lang.String str56 = defaultedMap20.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) predicateUtils25);
        defaultedMap20.clear();
        java.util.Set set28 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0f);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '#');
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) "");
        defaultedMap20.putAll(map36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 100.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) '#');
        boolean b45 = defaultedMap39.containsValue((java.lang.Object) 0);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 1.0d);
        java.lang.Object obj48 = defaultedMap20.get((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) predicateUtils55);
        defaultedMap50.clear();
        java.util.Set set58 = defaultedMap50.entrySet();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) 100.0f);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) '#');
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) "");
        defaultedMap50.putAll(map66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 100.0f);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) '#');
        boolean b75 = defaultedMap69.containsValue((java.lang.Object) 0);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 1.0d);
        java.lang.Object obj78 = defaultedMap50.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj79 = defaultedMap20.remove((java.lang.Object) defaultedMap50);
        java.util.Set set80 = defaultedMap20.keySet();
        java.lang.Object obj81 = defaultedMap1.remove((java.lang.Object) set80);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "" + "'", obj48.equals(""));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + "" + "'", obj78.equals(""));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        boolean b56 = defaultedMap50.containsValue((java.lang.Object) 0);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 1.0d);
        java.lang.Object obj59 = defaultedMap31.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        java.lang.String str61 = defaultedMap1.toString();
        java.lang.Object obj63 = defaultedMap1.remove((java.lang.Object) 1L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) 0.0d);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0f);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) 100.0f);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) predicateUtils37);
        defaultedMap32.clear();
        java.util.Set set40 = defaultedMap32.entrySet();
        boolean b41 = defaultedMap24.containsKey((java.lang.Object) defaultedMap32);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) b41);
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) predicate23);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) map27);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (short) 10);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (short) 1);
        java.util.Set set16 = defaultedMap9.entrySet();
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        int i18 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) '#');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "");
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap8.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) '#');
        java.lang.Object obj24 = defaultedMap18.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils31 = new collections.PredicateUtils();
        java.lang.Object obj32 = defaultedMap26.get((java.lang.Object) predicateUtils31);
        defaultedMap26.clear();
        java.util.Set set34 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        boolean b41 = defaultedMap37.containsKey((java.lang.Object) predicate40);
        java.lang.Object obj42 = defaultedMap26.put((java.lang.Object) 1.0f, (java.lang.Object) predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate40, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate43, predicate45);
        java.lang.Object obj47 = defaultedMap1.remove((java.lang.Object) predicate45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        defaultedMap20.putAll((java.util.Map) defaultedMap60);
        int i62 = defaultedMap60.size();
        collections.Factory factory63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, factory63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) map16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 100.0f);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) '#');
        java.lang.Object obj27 = defaultedMap21.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0f);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) predicateUtils34);
        defaultedMap29.clear();
        java.util.Set set37 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) predicate43);
        java.lang.Object obj45 = defaultedMap29.put((java.lang.Object) 1.0f, (java.lang.Object) predicate43);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate43, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) map47);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap48);
        collections.Factory factory51 = null;
        try {
            java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, factory51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.util.Set set23 = defaultedMap8.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0f);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        boolean b30 = defaultedMap24.containsValue((java.lang.Object) 0);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 1.0d);
        defaultedMap20.putAll(map32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 0);
        defaultedMap20.putAll((java.util.Map) defaultedMap35);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1));
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        boolean b15 = defaultedMap11.equals((java.lang.Object) (short) 10);
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0f);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) predicateUtils24);
        defaultedMap19.clear();
        java.util.Set set27 = defaultedMap19.entrySet();
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) false);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) map16);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0f);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) predicateUtils29);
        defaultedMap24.clear();
        java.util.Set set32 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) 100.0f);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) '#');
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) "");
        defaultedMap24.putAll(map40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.util.Collection collection60 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 100.0f);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) 100.0f);
        boolean b72 = defaultedMap68.equals((java.lang.Object) (short) 10);
        boolean b74 = defaultedMap68.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj76 = defaultedMap62.put((java.lang.Object) defaultedMap68, (java.lang.Object) false);
        java.util.Set set77 = defaultedMap62.entrySet();
        java.util.Collection collection78 = defaultedMap62.values();
        boolean b79 = defaultedMap51.containsValue((java.lang.Object) collection78);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b79 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) false);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap7.get(obj16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 100);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (short) 10);
        java.util.Collection collection21 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0f);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) '#');
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) 0.0f);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj25);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj30 = defaultedMap9.put((java.lang.Object) '#', (java.lang.Object) true);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.util.Set set60 = defaultedMap59.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 100.0f);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) '#');
        java.lang.Object obj68 = defaultedMap62.remove((java.lang.Object) 'a');
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, obj68);
        int i70 = defaultedMap59.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(i70 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        boolean b56 = defaultedMap50.containsValue((java.lang.Object) 0);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 1.0d);
        java.lang.Object obj59 = defaultedMap31.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj60 = defaultedMap1.remove((java.lang.Object) defaultedMap31);
        java.lang.String str61 = defaultedMap1.toString();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) 100.0f);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils24 = new collections.PredicateUtils();
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) predicateUtils24);
        defaultedMap19.clear();
        java.util.Set set27 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0f);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) '#');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) "");
        defaultedMap19.putAll(map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0f);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) '#');
        boolean b44 = defaultedMap38.containsValue((java.lang.Object) 0);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 1.0d);
        java.lang.Object obj47 = defaultedMap19.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 100.0f);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils54 = new collections.PredicateUtils();
        java.lang.Object obj55 = defaultedMap49.get((java.lang.Object) predicateUtils54);
        defaultedMap49.clear();
        java.util.Set set57 = defaultedMap49.entrySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) 100.0f);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) '#');
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) "");
        defaultedMap49.putAll(map65);
        defaultedMap38.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 100.0f);
        boolean b73 = defaultedMap69.equals((java.lang.Object) (short) 10);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) (short) 1);
        java.lang.Object obj76 = defaultedMap1.put((java.lang.Object) defaultedMap38, (java.lang.Object) defaultedMap69);
        defaultedMap38.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) predicate23);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) map27);
        defaultedMap28.clear();
        java.util.Set set30 = defaultedMap28.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap9.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) predicateUtils22);
        defaultedMap17.clear();
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate31, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (short) 10);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set46 = defaultedMap1.keySet();
        java.util.Set set47 = defaultedMap1.entrySet();
        java.util.Collection collection48 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) predicateUtils55);
        defaultedMap50.clear();
        java.util.Set set58 = defaultedMap50.entrySet();
        java.util.Set set59 = defaultedMap50.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap50);
        boolean b61 = defaultedMap50.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap9.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) predicateUtils22);
        defaultedMap17.clear();
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate31, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (short) 10);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set46 = defaultedMap1.keySet();
        java.util.Set set47 = defaultedMap1.entrySet();
        java.util.Collection collection48 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils55 = new collections.PredicateUtils();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) predicateUtils55);
        defaultedMap50.clear();
        java.util.Set set58 = defaultedMap50.entrySet();
        java.util.Set set59 = defaultedMap50.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap50);
        java.util.Set set61 = defaultedMap50.keySet();
        int i62 = defaultedMap50.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 100.0f);
        boolean b12 = defaultedMap8.equals((java.lang.Object) (short) 10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        boolean b24 = defaultedMap8.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) '#');
        boolean b11 = defaultedMap5.containsValue((java.lang.Object) 0);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0d);
        defaultedMap1.putAll(map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 100.0f);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap21.get((java.lang.Object) predicateUtils26);
        defaultedMap21.clear();
        java.util.Set set29 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) "");
        defaultedMap21.putAll(map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 100.0f);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) '#');
        boolean b46 = defaultedMap40.containsValue((java.lang.Object) 0);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 1.0d);
        java.lang.Object obj49 = defaultedMap21.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        java.lang.Object obj57 = defaultedMap51.get((java.lang.Object) predicateUtils56);
        defaultedMap51.clear();
        java.util.Set set59 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 100.0f);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) '#');
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) "");
        defaultedMap51.putAll(map67);
        defaultedMap40.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) 100.0f);
        boolean b75 = defaultedMap71.equals((java.lang.Object) (short) 10);
        boolean b77 = defaultedMap71.containsValue((java.lang.Object) 10.0f);
        defaultedMap40.putAll((java.util.Map) defaultedMap71);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap71);
        java.util.Set set80 = defaultedMap79.keySet();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b84 = defaultedMap82.containsKey((java.lang.Object) 100.0f);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) '#');
        java.lang.Object obj88 = defaultedMap82.remove((java.lang.Object) 'a');
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, obj88);
        defaultedMap16.putAll((java.util.Map) defaultedMap79);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) "");
        int i93 = defaultedMap92.size();
        defaultedMap92.clear();
        defaultedMap16.putAll((java.util.Map) defaultedMap92);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(i93 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        int i10 = defaultedMap1.size();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap3.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 100.0f);
        boolean b56 = defaultedMap52.equals((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap52.containsValue((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) 100.0f);
        boolean b64 = defaultedMap60.equals((java.lang.Object) (short) 10);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) (short) 1);
        java.util.Set set67 = defaultedMap60.entrySet();
        java.lang.Object obj68 = defaultedMap52.remove((java.lang.Object) defaultedMap60);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) 100.0f);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils76 = new collections.PredicateUtils();
        java.lang.Object obj77 = defaultedMap71.get((java.lang.Object) predicateUtils76);
        java.lang.Object obj78 = defaultedMap50.get((java.lang.Object) predicateUtils76);
        java.lang.Object obj80 = defaultedMap50.remove((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "" + "'", obj77.equals(""));
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) predicate23);
        java.lang.Object obj25 = defaultedMap9.put((java.lang.Object) 1.0f, (java.lang.Object) predicate23);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate26);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) map27);
        java.lang.String str29 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 100.0f);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (short) 10);
        boolean b47 = defaultedMap41.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj49 = defaultedMap35.put((java.lang.Object) defaultedMap41, (java.lang.Object) false);
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b54 = defaultedMap52.containsKey((java.lang.Object) 100.0f);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils57 = new collections.PredicateUtils();
        java.lang.Object obj58 = defaultedMap52.get((java.lang.Object) predicateUtils57);
        defaultedMap52.clear();
        java.util.Set set60 = defaultedMap52.entrySet();
        java.util.Set set61 = defaultedMap52.keySet();
        boolean b62 = defaultedMap52.isEmpty();
        java.util.Set set63 = defaultedMap52.keySet();
        java.lang.Object obj64 = defaultedMap41.get((java.lang.Object) set63);
        boolean b65 = defaultedMap31.equals((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) 100.0f);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) '#');
        java.lang.Object obj72 = defaultedMap41.remove((java.lang.Object) '#');
        boolean b73 = defaultedMap28.containsValue((java.lang.Object) '#');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + "" + "'", obj64.equals(""));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 100);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) '#');
        java.lang.Object obj22 = defaultedMap16.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) 100.0f);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) predicateUtils29);
        defaultedMap24.clear();
        java.util.Set set32 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 0);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) predicate38);
        java.lang.Object obj40 = defaultedMap24.put((java.lang.Object) 1.0f, (java.lang.Object) predicate38);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate38, predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) map42);
        boolean b44 = defaultedMap1.containsValue((java.lang.Object) map42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) 100.0f);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) '#');
        java.lang.Object obj52 = defaultedMap46.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) 100.0f);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        java.lang.Object obj60 = defaultedMap54.get((java.lang.Object) predicateUtils59);
        defaultedMap54.clear();
        java.util.Set set62 = defaultedMap54.entrySet();
        boolean b63 = defaultedMap46.containsKey((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 100.0f);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) '#');
        boolean b75 = defaultedMap69.containsValue((java.lang.Object) 0);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) 1.0d);
        defaultedMap65.putAll(map77);
        java.util.Set set79 = defaultedMap65.keySet();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) 100.0f);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils86 = new collections.PredicateUtils();
        java.lang.Object obj87 = defaultedMap81.get((java.lang.Object) predicateUtils86);
        java.lang.Object obj88 = defaultedMap46.put((java.lang.Object) set79, (java.lang.Object) defaultedMap81);
        boolean b89 = defaultedMap1.equals((java.lang.Object) defaultedMap81);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + "" + "'", obj87.equals(""));
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue(b89 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        java.util.Set set10 = defaultedMap1.keySet();
        int i11 = defaultedMap1.size();
        java.util.Map map12 = null;
        try {
            defaultedMap1.putAll(map12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap9.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) predicateUtils22);
        defaultedMap17.clear();
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap28.containsKey((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap17.put((java.lang.Object) 1.0f, (java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate31, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map35);
        java.util.Collection collection37 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) 100.0f);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils44 = new collections.PredicateUtils();
        java.lang.Object obj45 = defaultedMap39.get((java.lang.Object) predicateUtils44);
        defaultedMap39.clear();
        java.util.Set set47 = defaultedMap39.entrySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) 100.0f);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) '#');
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) "");
        defaultedMap39.putAll(map55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) 100.0f);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) '#');
        boolean b64 = defaultedMap58.containsValue((java.lang.Object) 0);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) 1.0d);
        java.lang.Object obj67 = defaultedMap39.get((java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) 100.0f);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils74 = new collections.PredicateUtils();
        java.lang.Object obj75 = defaultedMap69.get((java.lang.Object) predicateUtils74);
        defaultedMap69.clear();
        java.util.Set set77 = defaultedMap69.entrySet();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b81 = defaultedMap79.containsKey((java.lang.Object) 100.0f);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) '#');
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) "");
        defaultedMap69.putAll(map85);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b90 = defaultedMap88.containsKey((java.lang.Object) 100.0f);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap88, (java.lang.Object) '#');
        boolean b94 = defaultedMap88.containsValue((java.lang.Object) 0);
        java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap88, (java.lang.Object) 1.0d);
        java.lang.Object obj97 = defaultedMap69.get((java.lang.Object) defaultedMap88);
        java.lang.Object obj98 = defaultedMap39.remove((java.lang.Object) defaultedMap69);
        boolean b99 = defaultedMap1.equals(obj98);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "" + "'", obj67.equals(""));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "" + "'", obj75.equals(""));
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + "" + "'", obj97.equals(""));
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        boolean b15 = defaultedMap9.containsValue((java.lang.Object) 0);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) b15);
        java.util.Collection collection17 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) 100.0f);
        boolean b19 = defaultedMap15.equals((java.lang.Object) (short) 10);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) 0.0d);
        boolean b22 = defaultedMap8.containsKey((java.lang.Object) defaultedMap15);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        int i60 = defaultedMap59.size();
        int i61 = defaultedMap59.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue(i61 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) '#');
        boolean b11 = defaultedMap5.containsValue((java.lang.Object) 0);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0d);
        defaultedMap1.putAll(map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) 100.0f);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap21.get((java.lang.Object) predicateUtils26);
        defaultedMap21.clear();
        java.util.Set set29 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) "");
        defaultedMap21.putAll(map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 100.0f);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) '#');
        boolean b46 = defaultedMap40.containsValue((java.lang.Object) 0);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 1.0d);
        java.lang.Object obj49 = defaultedMap21.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        java.lang.Object obj57 = defaultedMap51.get((java.lang.Object) predicateUtils56);
        defaultedMap51.clear();
        java.util.Set set59 = defaultedMap51.entrySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b63 = defaultedMap61.containsKey((java.lang.Object) 100.0f);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) '#');
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) "");
        defaultedMap51.putAll(map67);
        defaultedMap40.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) 100.0f);
        boolean b75 = defaultedMap71.equals((java.lang.Object) (short) 10);
        boolean b77 = defaultedMap71.containsValue((java.lang.Object) 10.0f);
        defaultedMap40.putAll((java.util.Map) defaultedMap71);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap71);
        java.util.Set set80 = defaultedMap79.keySet();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b84 = defaultedMap82.containsKey((java.lang.Object) 100.0f);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) '#');
        java.lang.Object obj88 = defaultedMap82.remove((java.lang.Object) 'a');
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, obj88);
        defaultedMap16.putAll((java.util.Map) defaultedMap79);
        boolean b91 = defaultedMap79.isEmpty();
        java.util.Set set92 = defaultedMap79.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(set92);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) predicateUtils14);
        defaultedMap9.clear();
        java.util.Set set17 = defaultedMap9.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        java.util.Set set19 = defaultedMap9.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) map16);
        java.lang.String str18 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) '#');
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "");
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) "");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        defaultedMap1.putAll((java.util.Map) defaultedMap33);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (short) 10);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) map16);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        java.lang.String str51 = defaultedMap20.toString();
        defaultedMap20.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap7.containsValue((java.lang.Object) 10.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) predicateUtils22);
        defaultedMap17.clear();
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) '#');
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "");
        defaultedMap17.putAll(map33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) 100.0f);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) '#');
        boolean b42 = defaultedMap36.containsValue((java.lang.Object) 0);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 1.0d);
        java.lang.Object obj45 = defaultedMap17.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) 100.0f);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils52 = new collections.PredicateUtils();
        java.lang.Object obj53 = defaultedMap47.get((java.lang.Object) predicateUtils52);
        defaultedMap47.clear();
        java.util.Set set55 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b59 = defaultedMap57.containsKey((java.lang.Object) 100.0f);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) '#');
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) "");
        defaultedMap47.putAll(map63);
        defaultedMap36.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) 100.0f);
        boolean b71 = defaultedMap67.equals((java.lang.Object) (short) 10);
        boolean b73 = defaultedMap67.containsValue((java.lang.Object) 10.0f);
        defaultedMap36.putAll((java.util.Map) defaultedMap67);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap67);
        int i76 = defaultedMap75.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap75);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i76 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.util.Set set60 = defaultedMap59.keySet();
        java.util.Set set61 = defaultedMap59.entrySet();
        int i62 = defaultedMap59.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) predicateUtils6);
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "");
        defaultedMap1.putAll(map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 0);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1.0d);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) predicateUtils36);
        defaultedMap31.clear();
        java.util.Set set39 = defaultedMap31.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) '#');
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) "");
        defaultedMap31.putAll(map47);
        defaultedMap20.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap51.equals((java.lang.Object) (short) 10);
        boolean b57 = defaultedMap51.containsValue((java.lang.Object) 10.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap51);
        boolean b60 = defaultedMap51.containsKey((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) 100.0f);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) '#');
        java.lang.Object obj68 = defaultedMap62.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b72 = defaultedMap70.containsKey((java.lang.Object) 100.0f);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils75 = new collections.PredicateUtils();
        java.lang.Object obj76 = defaultedMap70.get((java.lang.Object) predicateUtils75);
        defaultedMap70.clear();
        java.util.Set set78 = defaultedMap70.entrySet();
        boolean b79 = defaultedMap62.containsKey((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b83 = defaultedMap81.containsKey((java.lang.Object) 100.0f);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) (byte) 100);
        java.lang.Object obj86 = defaultedMap51.put((java.lang.Object) b79, (java.lang.Object) (byte) 100);
        java.util.Collection collection87 = defaultedMap51.values();
        defaultedMap51.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "" + "'", obj68.equals(""));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "" + "'", obj76.equals(""));
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(collection87);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (short) 10);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) predicate13);
        java.util.Set set15 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap17.equals((java.lang.Object) (short) 10);
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap10.containsKey((java.lang.Object) defaultedMap17);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) b24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap27.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) 100.0f);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj41 = defaultedMap35.get((java.lang.Object) predicateUtils40);
        defaultedMap35.clear();
        java.util.Set set43 = defaultedMap35.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) 0);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) predicate49);
        java.lang.Object obj51 = defaultedMap35.put((java.lang.Object) 1.0f, (java.lang.Object) predicate49);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate49, predicate52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) map53);
        defaultedMap54.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap54);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "" + "'", obj12.equals(""));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "" + "'", obj41.equals(""));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "" + "'", obj48.equals(""));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) 100.0f);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) '#');
        boolean b11 = defaultedMap5.containsValue((java.lang.Object) 0);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1.0d);
        defaultedMap1.putAll(map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) '#');
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0f);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap30.get((java.lang.Object) predicateUtils35);
        defaultedMap30.clear();
        java.util.Set set38 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 0);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) predicate44);
        java.lang.Object obj46 = defaultedMap30.put((java.lang.Object) 1.0f, (java.lang.Object) predicate44);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate44, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate47);
        java.lang.String str50 = defaultedMap16.toString();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = null;
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate51, predicate52);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100.0f);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '#');
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) 0);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0d);
        defaultedMap9.putAll(map21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "");
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) predicateUtils7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) 100.0f);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) predicateUtils15);
        defaultedMap10.clear();
        java.util.Set set18 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) '#');
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) "");
        defaultedMap10.putAll(map26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) 100.0f);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) '#');
        boolean b35 = defaultedMap29.containsValue((java.lang.Object) 0);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 1.0d);
        java.lang.Object obj38 = defaultedMap10.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) 100.0f);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        java.lang.Object obj46 = defaultedMap40.get((java.lang.Object) predicateUtils45);
        defaultedMap40.clear();
        java.util.Set set48 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) '#');
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "");
        defaultedMap40.putAll(map56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) 100.0f);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) '#');
        boolean b65 = defaultedMap59.containsValue((java.lang.Object) 0);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 1.0d);
        java.lang.Object obj68 = defaultedMap40.get((java.lang.Object) defaultedMap59);
        java.lang.Object obj69 = defaultedMap10.remove((java.lang.Object) defaultedMap40);
        java.lang.String str70 = defaultedMap10.toString();
        boolean b71 = defaultedMap5.containsKey((java.lang.Object) str70);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "" + "'", obj68.equals(""));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) 100.0f);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) '#');
        boolean b19 = defaultedMap13.containsValue((java.lang.Object) 0);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1.0d);
        defaultedMap9.putAll(map21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0);
        defaultedMap9.putAll((java.util.Map) defaultedMap24);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) 100.0f);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) '#');
        java.lang.Object obj36 = defaultedMap30.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) 100.0f);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        java.lang.Object obj44 = defaultedMap38.get((java.lang.Object) predicateUtils43);
        defaultedMap38.clear();
        java.util.Set set46 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 0);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) predicate52);
        java.lang.Object obj54 = defaultedMap38.put((java.lang.Object) 1.0f, (java.lang.Object) predicate52);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate52, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate28, predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) 100.0f);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) '#');
        collections.PredicateUtils predicateUtils64 = new collections.PredicateUtils();
        java.lang.Object obj65 = defaultedMap59.get((java.lang.Object) predicateUtils64);
        defaultedMap59.clear();
        java.util.Set set67 = defaultedMap59.entrySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) 0);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        boolean b74 = defaultedMap70.containsKey((java.lang.Object) predicate73);
        java.lang.Object obj75 = defaultedMap59.put((java.lang.Object) 1.0f, (java.lang.Object) predicate73);
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map7, predicate55, predicate73);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) map76);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + "" + "'", obj65.equals(""));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "" + "'", obj72.equals(""));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map76);
    }
}

