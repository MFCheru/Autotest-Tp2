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
        collections.Predicate predicate1 = null;
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 0);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        defaultedMap1.clear();
        java.util.Map map5 = null;
        try {
            defaultedMap1.putAll(map5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = new java.lang.Object();
        boolean b6 = defaultedMap1.equals(obj5);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj2 = null;
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) collection5);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        defaultedMap1.clear();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set11 = defaultedMap1.entrySet();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap1.remove(obj12);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) collection5);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap11.isEmpty();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (byte) 1);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b24 = defaultedMap23.isEmpty();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate25, predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.util.Set set29 = defaultedMap23.keySet();
        java.lang.Object obj32 = defaultedMap23.put((java.lang.Object) 10L, (java.lang.Object) (short) 1);
        defaultedMap11.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) (byte) 1);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap18.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        java.util.Set set24 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap29.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        defaultedMap27.putAll(map33);
        java.lang.String str35 = defaultedMap27.toString();
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b39 = defaultedMap38.isEmpty();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        boolean b43 = defaultedMap27.equals((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b46 = defaultedMap45.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map49, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate41, predicate50);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate41);
        int i55 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Set set15 = defaultedMap14.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        defaultedMap3.putAll(map9);
        boolean b12 = defaultedMap3.containsValue((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) (byte) 1);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap14.putAll((java.util.Map) defaultedMap20);
        java.util.Set set26 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap31.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        defaultedMap29.putAll(map35);
        java.lang.String str37 = defaultedMap29.toString();
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap40.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        boolean b45 = defaultedMap29.equals((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b48 = defaultedMap47.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map51, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate43, predicate52);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) predicate43);
        java.lang.Object obj57 = defaultedMap1.remove((java.lang.Object) map56);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) (byte) 1);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap18.putAll(map24);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set28 = defaultedMap18.entrySet();
        boolean b29 = defaultedMap12.containsKey((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap31.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate34, predicate36);
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj41 = null;
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, obj41);
        boolean b43 = defaultedMap10.equals(obj41);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj2 = null;
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj2);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj2 = null;
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj6 = null;
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map7);
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj2 = null;
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj6 = null;
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map7);
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap7.putAll(map13);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set17 = defaultedMap7.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection29 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) collection32);
        java.lang.Object obj35 = defaultedMap28.remove((java.lang.Object) (byte) -1);
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        java.util.Set set37 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        defaultedMap3.putAll(map9);
        boolean b12 = defaultedMap3.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap3.containsKey(obj13);
        boolean b15 = defaultedMap3.isEmpty();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap12.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) predicate15);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0.0d + "'", obj17.equals(0.0d));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Collection collection12 = defaultedMap11.values();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        boolean b6 = defaultedMap1.equals((java.lang.Object) 0.0d);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap18.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        defaultedMap16.putAll(map22);
        java.lang.String str24 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap27.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b32 = defaultedMap16.equals((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap34.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate30, predicate39);
        java.lang.Object obj44 = defaultedMap14.remove((java.lang.Object) (-1L));
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        java.lang.String str9 = defaultedMap1.toString();
        defaultedMap1.clear();
        boolean b11 = defaultedMap1.isEmpty();
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) (byte) 1);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap22.isEmpty();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap14.put((java.lang.Object) defaultedMap22, obj28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) (short) 10);
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) map31);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.String str2 = defaultedMap1.toString();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = null;
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj4);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection9 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) collection12);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap18.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        defaultedMap16.putAll(map22);
        java.lang.String str24 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap27.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b32 = defaultedMap16.equals((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap34.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate30, predicate39);
        java.util.Map map43 = null;
        try {
            defaultedMap14.putAll(map43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate(map7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) predicate8);
        java.lang.String str12 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection15 = defaultedMap14.values();
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap14.remove((java.lang.Object) (byte) 10);
        java.util.Set set20 = defaultedMap14.entrySet();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) set20);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection8 = defaultedMap7.values();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (byte) 1);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap13.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        java.util.Set set19 = defaultedMap13.keySet();
        java.lang.Object obj22 = defaultedMap13.put((java.lang.Object) 10L, (java.lang.Object) (short) 1);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.String str24 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{10=1}" + "'", str24.equals("{10=1}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) collection21);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap26);
        java.lang.String str29 = defaultedMap17.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b6 = defaultedMap5.isEmpty();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) map9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map9, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) 0L);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) collection21);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap32.isEmpty();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        defaultedMap30.putAll(map36);
        boolean b39 = defaultedMap30.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap30.containsKey(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b46 = defaultedMap45.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        defaultedMap43.putAll(map49);
        boolean b52 = defaultedMap43.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set53 = defaultedMap43.entrySet();
        boolean b54 = defaultedMap30.containsKey((java.lang.Object) defaultedMap43);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) b54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap60.isEmpty();
        boolean b62 = defaultedMap60.isEmpty();
        java.lang.Object obj63 = null;
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, obj63);
        boolean b65 = defaultedMap60.isEmpty();
        boolean b66 = defaultedMap58.containsKey((java.lang.Object) defaultedMap60);
        boolean b67 = defaultedMap1.containsKey((java.lang.Object) b66);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) (byte) 1);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap29.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) defaultedMap36, (java.lang.Object) 100);
        boolean b39 = defaultedMap7.equals((java.lang.Object) defaultedMap16);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        boolean b41 = defaultedMap16.equals((java.lang.Object) predicate40);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) map18);
        int i20 = defaultedMap19.size();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap7.putAll(map13);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set17 = defaultedMap7.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) set17);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) (byte) 1);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        java.util.Set set20 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) 100);
        java.util.Set set24 = defaultedMap21.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap6.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b13 = defaultedMap12.isEmpty();
        boolean b14 = defaultedMap12.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (byte) 1);
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap25.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        defaultedMap23.putAll(map29);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set33 = defaultedMap23.entrySet();
        boolean b34 = defaultedMap17.containsKey((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap36.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate39, predicate41);
        java.lang.Object obj43 = defaultedMap6.put((java.lang.Object) defaultedMap15, (java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.util.Collection collection45 = defaultedMap15.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertNotNull(collection45);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection5 = defaultedMap4.values();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) collection5);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        int i9 = defaultedMap1.size();
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap18.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        defaultedMap16.putAll(map22);
        java.lang.String str24 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap27.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        boolean b32 = defaultedMap16.equals((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap34.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate30, predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b45 = defaultedMap44.isEmpty();
        boolean b46 = defaultedMap44.isEmpty();
        java.lang.Object obj47 = null;
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, obj47);
        boolean b49 = defaultedMap14.equals(obj47);
        collections.Factory factory50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) (byte) 1);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap29.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) defaultedMap36, (java.lang.Object) 100);
        boolean b39 = defaultedMap7.equals((java.lang.Object) defaultedMap16);
        java.util.Collection collection40 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap42.isEmpty();
        boolean b44 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b49 = defaultedMap48.isEmpty();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        defaultedMap46.putAll(map52);
        java.lang.String str54 = defaultedMap46.toString();
        java.util.Set set55 = defaultedMap46.keySet();
        java.lang.Object obj56 = defaultedMap42.get((java.lang.Object) defaultedMap46);
        java.lang.Object obj57 = defaultedMap7.get(obj56);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b12 = defaultedMap11.isEmpty();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate(map15, predicate16, predicate17);
        boolean b19 = defaultedMap9.containsValue((java.lang.Object) predicate16);
        java.lang.String str20 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) str20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap25.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        defaultedMap23.putAll(map29);
        boolean b32 = defaultedMap23.containsValue((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.get((java.lang.Object) (byte) 1);
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b41 = defaultedMap40.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        defaultedMap34.putAll((java.util.Map) defaultedMap40);
        java.util.Set set46 = defaultedMap40.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b52 = defaultedMap51.isEmpty();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate53, predicate54);
        defaultedMap49.putAll(map55);
        java.lang.String str57 = defaultedMap49.toString();
        defaultedMap49.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap60.isEmpty();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate62, predicate63);
        boolean b65 = defaultedMap49.equals((java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b68 = defaultedMap67.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate69, predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate(map71, predicate72, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate63, predicate72);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate63);
        boolean b77 = defaultedMap21.equals((java.lang.Object) map76);
        java.lang.Object obj78 = defaultedMap1.put((java.lang.Object) 10, (java.lang.Object) map76);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap7.putAll(map13);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set17 = defaultedMap7.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) predicate25);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap3.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (byte) 1);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap3.put((java.lang.Object) defaultedMap23, (java.lang.Object) 100);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap28.putAll(map34);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) (byte) -1);
        boolean b38 = defaultedMap1.equals((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap42.isEmpty();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        defaultedMap40.putAll(map46);
        java.lang.String str48 = defaultedMap40.toString();
        java.util.Set set49 = defaultedMap40.keySet();
        boolean b50 = defaultedMap40.isEmpty();
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) b50);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0.0d + "'", obj51.equals(0.0d));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) (byte) 1);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        java.util.Set set20 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) 100);
        int i24 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b27 = defaultedMap26.isEmpty();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) predicate28);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        boolean b16 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap18.isEmpty();
        boolean b21 = defaultedMap18.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) (byte) 1);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap31.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        defaultedMap29.putAll(map35);
        boolean b38 = defaultedMap29.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set39 = defaultedMap29.entrySet();
        boolean b40 = defaultedMap23.containsKey((java.lang.Object) set39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) b40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) b40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b48 = defaultedMap47.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        defaultedMap45.putAll(map51);
        java.lang.String str53 = defaultedMap45.toString();
        defaultedMap45.clear();
        java.lang.String str55 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection58 = defaultedMap57.values();
        java.lang.Object obj60 = defaultedMap57.get((java.lang.Object) (byte) 1);
        defaultedMap57.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b64 = defaultedMap63.isEmpty();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate65, predicate66);
        defaultedMap57.putAll((java.util.Map) defaultedMap63);
        java.util.Set set69 = defaultedMap63.keySet();
        java.lang.Object obj70 = defaultedMap45.get((java.lang.Object) defaultedMap63);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.String str72 = defaultedMap45.toString();
        boolean b73 = defaultedMap1.containsValue((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + "" + "'", obj70.equals(""));
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) collection21);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap26);
        java.util.Collection collection29 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate(map24, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.get(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) predicate7);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.get(obj2);
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 100);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0d + "'", obj3.equals(0.0d));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b23);
        java.util.Set set26 = defaultedMap25.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap28.putAll(map34);
        java.lang.String str36 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.String str38 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.get((java.lang.Object) (byte) 1);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap46.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        defaultedMap40.putAll((java.util.Map) defaultedMap46);
        java.util.Set set52 = defaultedMap46.keySet();
        java.lang.Object obj53 = defaultedMap28.get((java.lang.Object) defaultedMap46);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection57 = defaultedMap56.values();
        java.lang.Object obj59 = defaultedMap56.get((java.lang.Object) (byte) 1);
        defaultedMap56.clear();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b63 = defaultedMap62.isEmpty();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate64, predicate65);
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        java.util.Set set68 = defaultedMap62.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap62);
        java.lang.Object obj70 = defaultedMap28.get((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + "" + "'", obj70.equals(""));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b19 = defaultedMap18.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate24);
        boolean b26 = defaultedMap16.containsValue((java.lang.Object) predicate23);
        java.lang.String str27 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) str27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap32.isEmpty();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        defaultedMap30.putAll(map36);
        boolean b39 = defaultedMap30.containsValue((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection42 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap41.get((java.lang.Object) (byte) 1);
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b48 = defaultedMap47.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        defaultedMap41.putAll((java.util.Map) defaultedMap47);
        java.util.Set set53 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b59 = defaultedMap58.isEmpty();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate60, predicate61);
        defaultedMap56.putAll(map62);
        java.lang.String str64 = defaultedMap56.toString();
        defaultedMap56.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b68 = defaultedMap67.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate69, predicate70);
        boolean b72 = defaultedMap56.equals((java.lang.Object) predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b75 = defaultedMap74.isEmpty();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map78, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate70, predicate79);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) predicate70);
        boolean b84 = defaultedMap28.equals((java.lang.Object) map83);
        java.lang.Object obj85 = defaultedMap14.get((java.lang.Object) map83);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) (byte) 1);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj31 = null;
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection35 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap34.get((java.lang.Object) (byte) 1);
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b43 = defaultedMap42.isEmpty();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        defaultedMap40.putAll(map46);
        boolean b49 = defaultedMap40.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set50 = defaultedMap40.entrySet();
        boolean b51 = defaultedMap34.containsKey((java.lang.Object) set50);
        java.lang.Object obj52 = defaultedMap24.get((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate(map5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) map5);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap14.putAll(map20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate(map25, (java.lang.Object) "hi!");
        defaultedMap14.putAll(map25);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) map25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap18.putAll(map24);
        java.lang.String str26 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap29.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        boolean b34 = defaultedMap18.equals((java.lang.Object) predicate32);
        boolean b35 = defaultedMap9.equals((java.lang.Object) b34);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) collection21);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap26);
        java.util.Set set29 = defaultedMap26.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = defaultedMap7.get((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection19 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) collection22);
        boolean b24 = defaultedMap7.containsKey(obj23);
        java.util.Set set25 = defaultedMap7.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) (byte) 1);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b29 = defaultedMap28.isEmpty();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        defaultedMap26.putAll(map32);
        boolean b35 = defaultedMap26.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set36 = defaultedMap26.entrySet();
        boolean b37 = defaultedMap20.containsKey((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b40 = defaultedMap39.isEmpty();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        collections.Predicate predicate44 = null;
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate42, predicate44);
        java.lang.Object obj46 = defaultedMap9.put((java.lang.Object) defaultedMap18, (java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj50 = null;
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, obj50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj54 = null;
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, obj54);
        java.util.Map map57 = collections.map.DefaultedMap.decorate(map55, (java.lang.Object) "hi!");
        defaultedMap49.putAll(map55);
        boolean b59 = defaultedMap1.equals((java.lang.Object) map55);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        java.util.Collection collection25 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap7.putAll(map13);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set17 = defaultedMap7.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate25);
        int i27 = defaultedMap1.size();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap5.putAll(map11);
        java.lang.String str13 = defaultedMap5.toString();
        java.util.Set set14 = defaultedMap5.keySet();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        java.lang.Object obj20 = defaultedMap17.remove((java.lang.Object) predicateUtils19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b23 = defaultedMap22.isEmpty();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b29 = defaultedMap28.isEmpty();
        boolean b30 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) b30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection34 = defaultedMap33.values();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) (byte) 1);
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b42 = defaultedMap41.isEmpty();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        defaultedMap39.putAll(map45);
        boolean b48 = defaultedMap39.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set49 = defaultedMap39.entrySet();
        boolean b50 = defaultedMap33.containsKey((java.lang.Object) set49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b53 = defaultedMap52.isEmpty();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        collections.Predicate predicate57 = null;
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate55, predicate57);
        java.lang.Object obj59 = defaultedMap22.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate57);
        java.lang.Object obj60 = defaultedMap17.get((java.lang.Object) defaultedMap31);
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj29 = defaultedMap26.get((java.lang.Object) true);
        java.util.Map map30 = collections.map.DefaultedMap.decorate(map24, (java.lang.Object) true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        java.lang.String str9 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.String str11 = defaultedMap1.toString();
        java.util.Set set12 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) (byte) 1);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap18.putAll(map24);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set28 = defaultedMap18.entrySet();
        boolean b29 = defaultedMap12.containsKey((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap31.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate34, predicate36);
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        boolean b41 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj44 = null;
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj48 = null;
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, obj48);
        java.util.Map map51 = collections.map.DefaultedMap.decorate(map49, (java.lang.Object) "hi!");
        defaultedMap43.putAll(map49);
        boolean b53 = defaultedMap1.containsValue((java.lang.Object) map49);
        collections.Transformer transformer54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate(map49, transformer54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap3.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (byte) 1);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap3.put((java.lang.Object) defaultedMap23, (java.lang.Object) 100);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (byte) 1);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap36.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        defaultedMap34.putAll(map40);
        boolean b43 = defaultedMap34.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set44 = defaultedMap34.entrySet();
        boolean b45 = defaultedMap28.containsKey((java.lang.Object) set44);
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) b45);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection9 = defaultedMap8.values();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) (byte) 1);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        java.util.Set set20 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap27.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        defaultedMap25.putAll(map31);
        java.lang.String str33 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.lang.String str35 = defaultedMap25.toString();
        java.util.Set set36 = defaultedMap25.keySet();
        boolean b37 = defaultedMap1.containsValue((java.lang.Object) set36);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection29 = defaultedMap28.values();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (byte) 1);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap34.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap26.put((java.lang.Object) defaultedMap34, obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection44 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap43.get((java.lang.Object) (byte) 1);
        defaultedMap34.putAll((java.util.Map) defaultedMap43);
        java.util.Map map48 = collections.map.DefaultedMap.decorate(map24, (java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) collection24);
        java.lang.Object obj27 = defaultedMap20.remove((java.lang.Object) (byte) -1);
        int i28 = defaultedMap20.size();
        java.util.Set set29 = defaultedMap20.entrySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) set29);
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) map30, (java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) predicateUtils3);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap3.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (byte) 1);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap3.put((java.lang.Object) defaultedMap23, (java.lang.Object) 100);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap28.putAll(map34);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) (byte) -1);
        boolean b38 = defaultedMap1.equals((java.lang.Object) (byte) -1);
        java.util.Set set39 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap28.putAll(map34);
        java.lang.String str36 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.String str38 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.get((java.lang.Object) (byte) 1);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap46.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        defaultedMap40.putAll((java.util.Map) defaultedMap46);
        java.util.Set set52 = defaultedMap46.keySet();
        java.lang.Object obj53 = defaultedMap28.get((java.lang.Object) defaultedMap46);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str55 = defaultedMap28.toString();
        java.lang.Object obj57 = defaultedMap28.remove((java.lang.Object) '4');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        java.lang.String str9 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap13.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) b21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) (byte) 1);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap32.isEmpty();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        defaultedMap30.putAll(map36);
        boolean b39 = defaultedMap30.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set40 = defaultedMap30.entrySet();
        boolean b41 = defaultedMap24.containsKey((java.lang.Object) set40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b44 = defaultedMap43.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate45, predicate46);
        collections.Predicate predicate48 = null;
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate46, predicate48);
        java.lang.Object obj50 = defaultedMap13.put((java.lang.Object) defaultedMap22, (java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        boolean b53 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj56 = null;
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, obj56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj60 = null;
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, obj60);
        java.util.Map map63 = collections.map.DefaultedMap.decorate(map61, (java.lang.Object) "hi!");
        defaultedMap55.putAll(map61);
        boolean b65 = defaultedMap13.containsValue((java.lang.Object) map61);
        java.lang.String str66 = defaultedMap13.toString();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        java.util.Set set68 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{{}=null}" + "'", str66.equals("{{}=null}"));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(set68);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        java.lang.String str9 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b14 = defaultedMap13.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b20 = defaultedMap19.isEmpty();
        boolean b21 = defaultedMap19.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) b21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection25 = defaultedMap24.values();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) (byte) 1);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b33 = defaultedMap32.isEmpty();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        defaultedMap30.putAll(map36);
        boolean b39 = defaultedMap30.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set40 = defaultedMap30.entrySet();
        boolean b41 = defaultedMap24.containsKey((java.lang.Object) set40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b44 = defaultedMap43.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate45, predicate46);
        collections.Predicate predicate48 = null;
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate46, predicate48);
        java.lang.Object obj50 = defaultedMap13.put((java.lang.Object) defaultedMap22, (java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        boolean b53 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj56 = null;
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, obj56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj60 = null;
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, obj60);
        java.util.Map map63 = collections.map.DefaultedMap.decorate(map61, (java.lang.Object) "hi!");
        defaultedMap55.putAll(map61);
        boolean b65 = defaultedMap13.containsValue((java.lang.Object) map61);
        java.lang.String str66 = defaultedMap13.toString();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        int i68 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{{}=null}" + "'", str66.equals("{{}=null}"));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(i68 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate(map7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) predicate8);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap14.putAll(map20);
        java.lang.String str22 = defaultedMap14.toString();
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b26 = defaultedMap25.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        boolean b30 = defaultedMap14.equals((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap34.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate36, predicate37);
        defaultedMap32.putAll(map38);
        boolean b41 = defaultedMap32.containsValue((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection44 = defaultedMap43.values();
        java.lang.Object obj46 = defaultedMap43.get((java.lang.Object) (byte) 1);
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b50 = defaultedMap49.isEmpty();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate52);
        defaultedMap43.putAll((java.util.Map) defaultedMap49);
        java.util.Set set55 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap60.isEmpty();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate62, predicate63);
        defaultedMap58.putAll(map64);
        java.lang.String str66 = defaultedMap58.toString();
        defaultedMap58.clear();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b70 = defaultedMap69.isEmpty();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate71, predicate72);
        boolean b74 = defaultedMap58.equals((java.lang.Object) predicate72);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b77 = defaultedMap76.isEmpty();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate78, predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate(map80, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate72, predicate81);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate72);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate72);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap3.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection11 = defaultedMap10.values();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (byte) 1);
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b17 = defaultedMap16.isEmpty();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap3.put((java.lang.Object) defaultedMap23, (java.lang.Object) 100);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap28.putAll(map34);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) (byte) -1);
        boolean b38 = defaultedMap1.equals((java.lang.Object) (byte) -1);
        java.util.Set set39 = defaultedMap1.keySet();
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0.0d + "'", obj26.equals(0.0d));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) collection21);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection31 = defaultedMap30.values();
        java.lang.Object obj33 = defaultedMap30.get((java.lang.Object) (byte) 1);
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b37 = defaultedMap36.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        defaultedMap30.putAll((java.util.Map) defaultedMap36);
        java.util.Set set42 = defaultedMap36.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        boolean b44 = defaultedMap17.equals((java.lang.Object) defaultedMap43);
        collections.Transformer transformer45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, transformer45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) b17);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap21.get(obj22);
        defaultedMap21.clear();
        java.util.Collection collection25 = defaultedMap21.values();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) collection25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap28.putAll(map34);
        boolean b37 = defaultedMap28.containsValue((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.get((java.lang.Object) (byte) 1);
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b46 = defaultedMap45.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        defaultedMap39.putAll((java.util.Map) defaultedMap45);
        java.util.Set set51 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b57 = defaultedMap56.isEmpty();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        defaultedMap54.putAll(map60);
        java.lang.String str62 = defaultedMap54.toString();
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b66 = defaultedMap65.isEmpty();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate67, predicate68);
        boolean b70 = defaultedMap54.equals((java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap72.isEmpty();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate74, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate(map76, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate68, predicate77);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection84 = defaultedMap83.values();
        java.lang.Object obj86 = defaultedMap83.get((java.lang.Object) (byte) 1);
        defaultedMap83.clear();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b90 = defaultedMap89.isEmpty();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap89, predicate91, predicate92);
        defaultedMap83.putAll((java.util.Map) defaultedMap89);
        java.lang.Object obj95 = defaultedMap1.put((java.lang.Object) defaultedMap28, (java.lang.Object) defaultedMap83);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0.0d + "'", obj23.equals(0.0d));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + "" + "'", obj86.equals(""));
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(obj95);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj16 = null;
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate(map17, (java.lang.Object) "hi!");
        defaultedMap11.putAll(map17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) map17);
        boolean b22 = defaultedMap1.containsKey((java.lang.Object) map17);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap7.putAll(map13);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set17 = defaultedMap7.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) (byte) 1);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b27 = defaultedMap26.isEmpty();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        java.util.Set set32 = defaultedMap26.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection38 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) collection41);
        boolean b43 = defaultedMap26.containsKey(obj42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b49 = defaultedMap48.isEmpty();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map52, predicate53, predicate54);
        boolean b56 = defaultedMap46.containsValue((java.lang.Object) predicate53);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate44, predicate53);
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection7 = defaultedMap6.values();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (byte) 1);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b15 = defaultedMap14.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        defaultedMap12.putAll(map18);
        boolean b21 = defaultedMap12.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set22 = defaultedMap12.entrySet();
        boolean b23 = defaultedMap6.containsKey((java.lang.Object) set22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) b23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b31 = defaultedMap30.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        defaultedMap28.putAll(map34);
        java.lang.String str36 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.String str38 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap40.values();
        java.lang.Object obj43 = defaultedMap40.get((java.lang.Object) (byte) 1);
        defaultedMap40.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b47 = defaultedMap46.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        defaultedMap40.putAll((java.util.Map) defaultedMap46);
        java.util.Set set52 = defaultedMap46.keySet();
        java.lang.Object obj53 = defaultedMap28.get((java.lang.Object) defaultedMap46);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.String str55 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b61 = defaultedMap60.isEmpty();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate62, predicate63);
        defaultedMap58.putAll(map64);
        boolean b67 = defaultedMap58.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj68 = null;
        boolean b69 = defaultedMap58.containsKey(obj68);
        defaultedMap58.clear();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap72.isEmpty();
        boolean b74 = defaultedMap72.isEmpty();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) b74);
        java.util.Set set76 = defaultedMap75.keySet();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = defaultedMap78.get(obj79);
        defaultedMap78.clear();
        java.util.Collection collection82 = defaultedMap78.values();
        java.lang.Object obj83 = defaultedMap58.put((java.lang.Object) defaultedMap75, (java.lang.Object) collection82);
        java.lang.Object obj84 = defaultedMap28.put((java.lang.Object) '#', obj83);
        java.util.Set set85 = defaultedMap28.keySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0.0d + "'", obj80.equals(0.0d));
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b16 = defaultedMap15.isEmpty();
        boolean b17 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) b17);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0.0d);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap21.get(obj22);
        defaultedMap21.clear();
        java.util.Collection collection25 = defaultedMap21.values();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) defaultedMap18, (java.lang.Object) collection25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection29 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) collection32);
        java.lang.Object obj35 = defaultedMap28.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection38 = defaultedMap37.values();
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) (byte) 1);
        java.lang.Object obj42 = defaultedMap37.remove((java.lang.Object) (byte) 10);
        java.util.Set set43 = defaultedMap37.entrySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap37);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap28);
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate(map45, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0.0d + "'", obj23.equals(0.0d));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) (byte) 1);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b25 = defaultedMap24.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj31 = null;
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, obj31);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) true);
        defaultedMap1.clear();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b11 = defaultedMap10.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        defaultedMap8.putAll(map14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj18 = null;
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) "hi!");
        defaultedMap8.putAll(map19);
        defaultedMap1.putAll(map19);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) collection21);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap26);
        boolean b29 = defaultedMap26.isEmpty();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        boolean b9 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection13 = defaultedMap12.values();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) (byte) 1);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        defaultedMap18.putAll(map24);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set28 = defaultedMap18.entrySet();
        boolean b29 = defaultedMap12.containsKey((java.lang.Object) set28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b32 = defaultedMap31.isEmpty();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate34, predicate36);
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        boolean b41 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj44 = null;
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj48 = null;
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, obj48);
        java.util.Map map51 = collections.map.DefaultedMap.decorate(map49, (java.lang.Object) "hi!");
        defaultedMap43.putAll(map49);
        boolean b53 = defaultedMap1.containsValue((java.lang.Object) map49);
        int i54 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b6 = defaultedMap5.isEmpty();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 0.0f);
        java.util.Set set9 = defaultedMap5.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) set9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) "hi!");
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection21 = defaultedMap20.values();
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) collection21);
        java.lang.Object obj24 = defaultedMap17.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap26.values();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap26);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) (byte) 1);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b38 = defaultedMap37.isEmpty();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        java.util.Set set43 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b49 = defaultedMap48.isEmpty();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate50, predicate51);
        defaultedMap46.putAll(map52);
        java.lang.String str54 = defaultedMap46.toString();
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b58 = defaultedMap57.isEmpty();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate59, predicate60);
        boolean b62 = defaultedMap46.equals((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b65 = defaultedMap64.isEmpty();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map68, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate60, predicate69);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate29, predicate69);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        java.util.Set set14 = defaultedMap7.entrySet();
        java.lang.String str15 = defaultedMap7.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        int i19 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) (byte) 1);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap27.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap34.isEmpty();
        boolean b36 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.get((java.lang.Object) (byte) 1);
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b46 = defaultedMap45.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        defaultedMap39.putAll((java.util.Map) defaultedMap45);
        java.util.Set set51 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b57 = defaultedMap56.isEmpty();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        defaultedMap54.putAll(map60);
        java.lang.String str62 = defaultedMap54.toString();
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b66 = defaultedMap65.isEmpty();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate67, predicate68);
        boolean b70 = defaultedMap54.equals((java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap72.isEmpty();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate74, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate(map76, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate68, predicate77);
        java.lang.Object obj81 = defaultedMap27.put((java.lang.Object) b36, (java.lang.Object) predicate77);
        java.lang.Object obj82 = defaultedMap1.get((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b88 = defaultedMap87.isEmpty();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate89, predicate90);
        defaultedMap85.putAll(map91);
        java.lang.String str93 = defaultedMap85.toString();
        defaultedMap85.clear();
        boolean b95 = defaultedMap85.isEmpty();
        java.util.Set set96 = defaultedMap85.keySet();
        java.lang.Object obj97 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) set96);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (-1.0f) + "'", obj82.equals((-1.0f)));
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
        org.junit.Assert.assertTrue(b95 == true);
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection4 = defaultedMap3.values();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (byte) 1);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap3.putAll((java.util.Map) defaultedMap9);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) defaultedMap9, obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        int i19 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection22 = defaultedMap21.values();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) (byte) 1);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b28 = defaultedMap27.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b35 = defaultedMap34.isEmpty();
        boolean b36 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj42 = defaultedMap39.get((java.lang.Object) (byte) 1);
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b46 = defaultedMap45.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        defaultedMap39.putAll((java.util.Map) defaultedMap45);
        java.util.Set set51 = defaultedMap45.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b57 = defaultedMap56.isEmpty();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate58, predicate59);
        defaultedMap54.putAll(map60);
        java.lang.String str62 = defaultedMap54.toString();
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b66 = defaultedMap65.isEmpty();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate67, predicate68);
        boolean b70 = defaultedMap54.equals((java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b73 = defaultedMap72.isEmpty();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate74, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate(map76, predicate77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate68, predicate77);
        java.lang.Object obj81 = defaultedMap27.put((java.lang.Object) b36, (java.lang.Object) predicate77);
        java.lang.Object obj82 = defaultedMap1.get((java.lang.Object) predicate77);
        boolean b83 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (-1.0f) + "'", obj82.equals((-1.0f)));
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        java.util.Set set14 = defaultedMap7.entrySet();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap7.containsValue(obj15);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b4 = defaultedMap3.isEmpty();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate6);
        defaultedMap1.putAll(map7);
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection11 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) collection14);
        java.lang.Object obj17 = defaultedMap10.remove((java.lang.Object) (byte) -1);
        defaultedMap10.clear();
        java.util.Collection collection19 = defaultedMap10.values();
        java.lang.Object obj21 = defaultedMap8.put((java.lang.Object) collection19, (java.lang.Object) (-1L));
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b7 = defaultedMap6.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate(map10, predicate11, predicate12);
        boolean b14 = defaultedMap4.containsValue((java.lang.Object) predicate11);
        java.lang.String str15 = defaultedMap4.toString();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b10 = defaultedMap9.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap7.putAll(map13);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) (byte) -1);
        java.util.Set set17 = defaultedMap7.entrySet();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) set17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b21 = defaultedMap20.isEmpty();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection29 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) collection32);
        java.lang.Object obj35 = defaultedMap28.remove((java.lang.Object) (byte) -1);
        boolean b36 = defaultedMap1.containsKey((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj39 = null;
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.lang.Object obj43 = null;
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, obj43);
        java.util.Map map46 = collections.map.DefaultedMap.decorate(map44, (java.lang.Object) "hi!");
        defaultedMap38.putAll(map44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) map44);
        boolean b49 = defaultedMap1.containsValue((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (byte) 1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b8 = defaultedMap7.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate9, predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection17 = defaultedMap16.values();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj26 = defaultedMap23.get((java.lang.Object) (byte) 1);
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b30 = defaultedMap29.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate32);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        java.util.Set set35 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.lang.Object obj38 = defaultedMap16.put((java.lang.Object) defaultedMap36, (java.lang.Object) 100);
        boolean b39 = defaultedMap7.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Collection collection42 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap41.get((java.lang.Object) (byte) 1);
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b48 = defaultedMap47.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate49, predicate50);
        defaultedMap41.putAll((java.util.Map) defaultedMap47);
        java.util.Set set53 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b59 = defaultedMap58.isEmpty();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate60, predicate61);
        defaultedMap56.putAll(map62);
        java.lang.String str64 = defaultedMap56.toString();
        defaultedMap56.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b68 = defaultedMap67.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate69, predicate70);
        boolean b72 = defaultedMap56.equals((java.lang.Object) predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b75 = defaultedMap74.isEmpty();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map78, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate70, predicate79);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) "");
        boolean b85 = defaultedMap84.isEmpty();
        boolean b86 = defaultedMap84.isEmpty();
        java.lang.Object obj87 = null;
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, obj87);
        boolean b89 = defaultedMap54.equals(obj87);
        boolean b90 = defaultedMap7.containsKey(obj87);
        java.lang.Object obj91 = null;
        java.lang.Object obj92 = defaultedMap7.get(obj91);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + "" + "'", obj92.equals(""));
    }
}

