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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Map map12 = null;
        try {
            defaultedMap1.putAll(map12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj7 = defaultedMap2.get((java.lang.Object) 0.0f);
        int i8 = defaultedMap2.size();
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) i8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.containsValue(obj10);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate(map24, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        java.lang.String str32 = defaultedMap12.toString();
        java.util.Set set33 = defaultedMap12.entrySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.util.Collection collection14 = defaultedMap10.values();
        boolean b15 = defaultedMap1.equals((java.lang.Object) collection14);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate(map23, predicate24, predicate39);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        boolean b48 = defaultedMap44.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj54 = defaultedMap51.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        boolean b58 = defaultedMap56.containsValue((java.lang.Object) 0.0f);
        java.lang.String str59 = defaultedMap56.toString();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) defaultedMap56);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate61, predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate(map63, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        boolean b76 = defaultedMap74.containsValue((java.lang.Object) 0.0f);
        java.lang.String str77 = defaultedMap74.toString();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) defaultedMap74);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate(map42, predicate49, predicate80);
        java.lang.Object obj83 = defaultedMap6.get((java.lang.Object) predicate80);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        java.util.Collection collection32 = defaultedMap12.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 0.0f);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.String str39 = defaultedMap36.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate41);
        java.lang.String str43 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Collection collection27 = defaultedMap19.values();
        boolean b28 = defaultedMap6.equals((java.lang.Object) defaultedMap19);
        java.lang.String str29 = defaultedMap19.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        boolean b39 = defaultedMap31.equals((java.lang.Object) 'a');
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) 0.0f);
        java.lang.String str44 = defaultedMap41.toString();
        boolean b45 = defaultedMap41.isEmpty();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 0.0f);
        java.lang.String str56 = defaultedMap53.toString();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap53);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        boolean b66 = defaultedMap31.containsKey((java.lang.Object) defaultedMap65);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.lang.String str18 = defaultedMap15.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap15);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj31 = defaultedMap15.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        int i35 = defaultedMap15.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i35 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = null;
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate30);
        boolean b32 = defaultedMap6.containsValue((java.lang.Object) predicate30);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Collection collection27 = defaultedMap19.values();
        boolean b28 = defaultedMap6.equals((java.lang.Object) defaultedMap19);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.String str39 = defaultedMap36.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) 0.0f);
        java.lang.String str53 = defaultedMap50.toString();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap50);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map57, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate59);
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj68 = defaultedMap63.get((java.lang.Object) 0.0f);
        java.util.Collection collection69 = defaultedMap63.values();
        java.lang.String str70 = defaultedMap63.toString();
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        boolean b76 = defaultedMap74.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj77 = defaultedMap72.get((java.lang.Object) 0.0f);
        java.util.Collection collection78 = defaultedMap72.values();
        java.lang.String str79 = defaultedMap72.toString();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj84 = defaultedMap81.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj85 = null;
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap(obj85);
        boolean b88 = defaultedMap86.containsValue((java.lang.Object) 0.0f);
        java.lang.String str89 = defaultedMap86.toString();
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) defaultedMap86);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap86.putAll((java.util.Map) defaultedMap92);
        java.util.Collection collection94 = defaultedMap86.values();
        java.lang.Object obj95 = defaultedMap63.put((java.lang.Object) str79, (java.lang.Object) collection94);
        boolean b96 = defaultedMap31.containsKey(obj95);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue("'" + str89 + "' != '" + "{}" + "'", str89.equals("{}"));
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.util.Set set27 = defaultedMap25.keySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap25);
        java.lang.String str29 = defaultedMap25.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj10 = defaultedMap7.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 0.0f);
        java.lang.String str15 = defaultedMap12.toString();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap12);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate20, predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj28 = defaultedMap12.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        java.util.Set set30 = defaultedMap25.keySet();
        boolean b31 = defaultedMap1.equals((java.lang.Object) set30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 0.0f);
        java.lang.String str41 = defaultedMap38.toString();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap38);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.lang.Object obj46 = defaultedMap12.get((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 0.0f);
        java.lang.String str56 = defaultedMap53.toString();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap53.putAll((java.util.Map) defaultedMap59);
        defaultedMap12.putAll((java.util.Map) defaultedMap59);
        int i62 = defaultedMap12.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (-1.0d) + "'", obj46.equals((-1.0d)));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(i62 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        java.lang.String str15 = defaultedMap6.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 0.0f);
        java.lang.String str41 = defaultedMap38.toString();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap38);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.lang.Object obj46 = defaultedMap12.get((java.lang.Object) predicate44);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Collection collection49 = defaultedMap48.values();
        java.lang.Object obj50 = defaultedMap12.get((java.lang.Object) defaultedMap48);
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap12.put(obj51, obj52);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (-1.0d) + "'", obj46.equals((-1.0d)));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (-1.0d) + "'", obj50.equals((-1.0d)));
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.String str10 = defaultedMap7.toString();
        boolean b11 = defaultedMap7.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate28);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 100);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        java.util.Set set34 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        java.util.Collection collection27 = defaultedMap19.values();
        boolean b28 = defaultedMap6.equals((java.lang.Object) defaultedMap19);
        java.util.Set set29 = defaultedMap19.keySet();
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        defaultedMap6.clear();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate15);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap19);
        boolean b23 = defaultedMap6.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.String str14 = defaultedMap11.toString();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 0.0f);
        java.lang.String str26 = defaultedMap23.toString();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap23);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate(map30, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate(map15, predicate16, predicate31);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate35);
        boolean b37 = defaultedMap1.isEmpty();
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsValue((java.lang.Object) 0.0f);
        java.lang.String str46 = defaultedMap43.toString();
        boolean b47 = defaultedMap43.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj53 = defaultedMap50.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        boolean b57 = defaultedMap55.containsValue((java.lang.Object) 0.0f);
        java.lang.String str58 = defaultedMap55.toString();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) defaultedMap55);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate60, predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate(map62, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate64);
        java.lang.Object obj67 = defaultedMap39.get((java.lang.Object) defaultedMap43);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj72 = defaultedMap69.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        boolean b76 = defaultedMap74.containsValue((java.lang.Object) 0.0f);
        java.lang.String str77 = defaultedMap74.toString();
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) defaultedMap74);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj80 = defaultedMap39.put((java.lang.Object) defaultedMap69, (java.lang.Object) predicate79);
        java.util.Set set81 = defaultedMap69.entrySet();
        boolean b82 = defaultedMap1.containsValue((java.lang.Object) set81);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.String str10 = defaultedMap7.toString();
        boolean b11 = defaultedMap7.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate28);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 100);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        java.util.Set set35 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 0.0f);
        java.lang.String str41 = defaultedMap38.toString();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap38);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.lang.Object obj46 = defaultedMap12.get((java.lang.Object) predicate44);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Collection collection49 = defaultedMap48.values();
        java.lang.Object obj50 = defaultedMap12.get((java.lang.Object) defaultedMap48);
        java.util.Set set51 = defaultedMap48.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (-1.0d) + "'", obj46.equals((-1.0d)));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + (-1.0d) + "'", obj50.equals((-1.0d)));
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        int i8 = defaultedMap1.size();
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 0.0f);
        java.lang.String str41 = defaultedMap38.toString();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap38);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.lang.Object obj46 = defaultedMap12.get((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj51 = defaultedMap48.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        boolean b55 = defaultedMap53.containsValue((java.lang.Object) 0.0f);
        java.lang.String str56 = defaultedMap53.toString();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap53.putAll((java.util.Map) defaultedMap59);
        defaultedMap12.putAll((java.util.Map) defaultedMap59);
        defaultedMap59.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (-1.0d) + "'", obj46.equals((-1.0d)));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = defaultedMap10.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.lang.String str18 = defaultedMap15.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap15);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate24);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj31 = defaultedMap15.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) 10.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.String str39 = defaultedMap36.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate41);
        defaultedMap31.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 0.0f);
        java.util.Collection collection12 = defaultedMap6.values();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 0.0f);
        int i21 = defaultedMap15.size();
        boolean b22 = defaultedMap15.isEmpty();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) 0.0f);
        int i30 = defaultedMap24.size();
        boolean b31 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj36 = defaultedMap33.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 0.0f);
        java.lang.String str41 = defaultedMap38.toString();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap38);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate47 = null;
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate46, predicate47);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj54 = defaultedMap38.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap51);
        java.lang.Object obj56 = defaultedMap38.get((java.lang.Object) 10.0f);
        defaultedMap24.putAll((java.util.Map) defaultedMap38);
        java.lang.Object obj58 = defaultedMap15.get((java.lang.Object) defaultedMap24);
        defaultedMap24.clear();
        boolean b60 = defaultedMap1.containsKey((java.lang.Object) defaultedMap24);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        int i18 = defaultedMap6.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0d) + "'", obj25.equals((-1.0d)));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b8 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 0.0f);
        int i16 = defaultedMap10.size();
        boolean b17 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj22 = defaultedMap19.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 0.0f);
        java.lang.String str27 = defaultedMap24.toString();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap24);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = null;
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate32, predicate33);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj40 = defaultedMap24.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap37);
        java.lang.Object obj42 = defaultedMap24.get((java.lang.Object) 10.0f);
        defaultedMap10.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        defaultedMap10.clear();
        java.util.Set set46 = defaultedMap10.entrySet();
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) '#');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        java.util.Set set29 = defaultedMap21.entrySet();
        java.lang.Object obj30 = defaultedMap12.remove((java.lang.Object) defaultedMap21);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 0.0f);
        java.lang.String str61 = defaultedMap58.toString();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map65, predicate66, predicate67);
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) predicate66);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        boolean b80 = defaultedMap78.containsValue((java.lang.Object) 0.0f);
        java.lang.String str81 = defaultedMap78.toString();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) defaultedMap78);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate83, predicate84);
        java.util.Set set86 = defaultedMap78.entrySet();
        java.lang.Object obj87 = defaultedMap1.get((java.lang.Object) defaultedMap78);
        java.util.Set set88 = defaultedMap78.keySet();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) (byte) 100);
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) (byte) 100);
        java.lang.Object obj92 = null;
        boolean b93 = defaultedMap78.containsValue(obj92);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 0.0f);
        java.lang.String str11 = defaultedMap8.toString();
        boolean b12 = defaultedMap8.isEmpty();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate13, predicate29);
        java.lang.Object obj32 = defaultedMap4.get((java.lang.Object) defaultedMap8);
        java.lang.Object obj33 = defaultedMap1.get(obj32);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (byte) -1 + "'", obj33.equals((byte) -1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Collection collection16 = defaultedMap15.values();
        int i17 = defaultedMap15.size();
        java.lang.Object obj18 = defaultedMap6.remove((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        boolean b25 = defaultedMap21.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 0.0f);
        java.lang.String str36 = defaultedMap33.toString();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap33);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map40, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate42);
        java.util.Collection collection45 = defaultedMap21.values();
        java.util.Set set46 = defaultedMap21.entrySet();
        java.lang.Object obj47 = defaultedMap19.get((java.lang.Object) set46);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        java.util.Set set25 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 0.0f);
        java.lang.String str35 = defaultedMap32.toString();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Collection collection40 = defaultedMap32.values();
        boolean b41 = defaultedMap19.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 0.0f);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.String str50 = defaultedMap43.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.String str59 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 0.0f);
        java.lang.String str69 = defaultedMap66.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        java.util.Collection collection74 = defaultedMap66.values();
        java.lang.Object obj75 = defaultedMap43.put((java.lang.Object) str59, (java.lang.Object) collection74);
        boolean b76 = defaultedMap32.containsKey(obj75);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate15);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap19);
        defaultedMap19.clear();
        java.util.Set set24 = defaultedMap19.keySet();
        boolean b26 = defaultedMap19.equals((java.lang.Object) '4');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.lang.String str14 = defaultedMap6.toString();
        defaultedMap6.clear();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        boolean b25 = defaultedMap21.isEmpty();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 0.0f);
        java.lang.String str36 = defaultedMap33.toString();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap33);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map40, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate42);
        java.lang.Object obj45 = defaultedMap17.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) 0.0f);
        java.lang.String str55 = defaultedMap52.toString();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap52);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj58 = defaultedMap17.put((java.lang.Object) defaultedMap47, (java.lang.Object) predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 0.0f);
        java.lang.String str69 = defaultedMap66.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap66);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map73, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate59, predicate75);
        boolean b78 = defaultedMap6.containsValue((java.lang.Object) predicate75);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) 0.0f);
        java.util.Collection collection38 = defaultedMap32.values();
        java.lang.Object obj39 = defaultedMap27.remove((java.lang.Object) collection38);
        boolean b40 = defaultedMap1.containsValue(obj39);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0d) + "'", obj25.equals((-1.0d)));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 0.0f);
        java.lang.String str12 = defaultedMap9.toString();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap9);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 0.0f);
        java.lang.String str31 = defaultedMap28.toString();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap28);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 0.0f);
        java.lang.String str43 = defaultedMap40.toString();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap40);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map47, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate(map32, predicate33, predicate48);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate48, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate48);
        boolean b55 = defaultedMap1.isEmpty();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj62 = defaultedMap57.get((java.lang.Object) 0.0f);
        int i63 = defaultedMap57.size();
        int i64 = defaultedMap57.size();
        boolean b65 = defaultedMap1.equals((java.lang.Object) defaultedMap57);
        java.lang.String str66 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 0.0f);
        java.lang.String str61 = defaultedMap58.toString();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map65, predicate66, predicate67);
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) predicate66);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate66);
        java.lang.Object obj71 = null;
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap(obj71);
        boolean b74 = defaultedMap72.containsValue((java.lang.Object) 0.0f);
        java.lang.String str75 = defaultedMap72.toString();
        boolean b76 = defaultedMap72.isEmpty();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj82 = defaultedMap79.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        boolean b86 = defaultedMap84.containsValue((java.lang.Object) 0.0f);
        java.lang.String str87 = defaultedMap84.toString();
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) defaultedMap84);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate89, predicate90);
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate(map91, predicate92, predicate93);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate77, predicate93);
        boolean b96 = defaultedMap1.equals((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap97 = new collections.map.DefaultedMap((java.lang.Object) b96);
        java.util.Collection collection98 = defaultedMap97.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "{}" + "'", str87.equals("{}"));
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertNotNull(collection98);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.util.Set set9 = defaultedMap6.entrySet();
        boolean b10 = defaultedMap6.isEmpty();
        boolean b12 = defaultedMap6.containsKey((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = defaultedMap13.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.lang.String str21 = defaultedMap18.toString();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap18);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate(map25, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map10, predicate11, predicate26);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        boolean b35 = defaultedMap31.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsValue((java.lang.Object) 0.0f);
        java.lang.String str46 = defaultedMap43.toString();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) defaultedMap43);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsValue((java.lang.Object) 0.0f);
        java.lang.String str64 = defaultedMap61.toString();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) defaultedMap61);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate(map29, predicate36, predicate67);
        collections.Factory factory70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate(map29, factory70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj12);
        java.util.Collection collection14 = defaultedMap6.values();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) predicate15, (java.lang.Object) defaultedMap17);
        java.util.Set set22 = defaultedMap6.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        defaultedMap6.clear();
        java.util.Set set12 = defaultedMap6.keySet();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        java.util.Set set25 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 0.0f);
        java.lang.String str35 = defaultedMap32.toString();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Collection collection40 = defaultedMap32.values();
        boolean b41 = defaultedMap19.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 0.0f);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.String str50 = defaultedMap43.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.String str59 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 0.0f);
        java.lang.String str69 = defaultedMap66.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        java.util.Collection collection74 = defaultedMap66.values();
        java.lang.Object obj75 = defaultedMap43.put((java.lang.Object) str59, (java.lang.Object) collection74);
        boolean b76 = defaultedMap32.containsKey(obj75);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        defaultedMap32.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        boolean b39 = defaultedMap31.equals((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 0.0f);
        java.lang.String str49 = defaultedMap46.toString();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = null;
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate54, predicate55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate(map56, (java.lang.Object) 10);
        java.lang.Object obj59 = defaultedMap31.remove((java.lang.Object) map58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        boolean b39 = defaultedMap31.equals((java.lang.Object) 'a');
        boolean b40 = defaultedMap31.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        java.util.Collection collection25 = defaultedMap1.values();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        boolean b35 = defaultedMap31.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj41 = defaultedMap38.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        boolean b45 = defaultedMap43.containsValue((java.lang.Object) 0.0f);
        java.lang.String str46 = defaultedMap43.toString();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) defaultedMap43);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate52);
        java.lang.Object obj55 = defaultedMap27.get((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsValue((java.lang.Object) 0.0f);
        java.lang.String str65 = defaultedMap62.toString();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) defaultedMap62);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj68 = defaultedMap27.put((java.lang.Object) defaultedMap57, (java.lang.Object) predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj74 = defaultedMap71.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        boolean b78 = defaultedMap76.containsValue((java.lang.Object) 0.0f);
        java.lang.String str79 = defaultedMap76.toString();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) defaultedMap76);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate81, predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate(map83, predicate84, predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate69, predicate85);
        java.lang.Object obj88 = defaultedMap1.get((java.lang.Object) defaultedMap57);
        java.util.Set set89 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(set89);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate15);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap19);
        defaultedMap19.clear();
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        defaultedMap6.clear();
        java.lang.String str15 = defaultedMap6.toString();
        java.lang.Object obj17 = defaultedMap6.remove((java.lang.Object) 10);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0d) + "'", obj25.equals((-1.0d)));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.String str10 = defaultedMap7.toString();
        boolean b11 = defaultedMap7.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate28);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 100);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        java.util.Set set34 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.String str12 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection14 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj31 = defaultedMap28.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 0.0f);
        java.lang.String str36 = defaultedMap33.toString();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap33);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map40, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map25, predicate26, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 0.0f);
        java.lang.String str54 = defaultedMap51.toString();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap51);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate(map44, (java.lang.Object) defaultedMap51);
        boolean b60 = defaultedMap13.containsValue((java.lang.Object) map44);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b63 = defaultedMap62.isEmpty();
        java.lang.Object obj65 = defaultedMap62.remove((java.lang.Object) 100L);
        java.lang.Object obj66 = defaultedMap13.get(obj65);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(obj66);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.String str10 = defaultedMap7.toString();
        boolean b11 = defaultedMap7.isEmpty();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate12, predicate28);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (byte) 100);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        java.util.Set set34 = defaultedMap7.entrySet();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 0.0f);
        java.lang.String str43 = defaultedMap40.toString();
        boolean b44 = defaultedMap40.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) 0.0f);
        java.lang.String str55 = defaultedMap52.toString();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap52);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate61);
        java.lang.Object obj64 = defaultedMap36.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        boolean b73 = defaultedMap71.containsValue((java.lang.Object) 0.0f);
        java.lang.String str74 = defaultedMap71.toString();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) defaultedMap71);
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj77 = defaultedMap36.put((java.lang.Object) defaultedMap66, (java.lang.Object) predicate76);
        boolean b78 = defaultedMap7.containsValue((java.lang.Object) predicate76);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.lang.String str14 = defaultedMap6.toString();
        defaultedMap6.clear();
        defaultedMap6.clear();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap6.equals(obj17);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) b2);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 0.0f);
        java.lang.String str61 = defaultedMap58.toString();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map65, predicate66, predicate67);
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) predicate66);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        boolean b80 = defaultedMap78.containsValue((java.lang.Object) 0.0f);
        java.lang.String str81 = defaultedMap78.toString();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) defaultedMap78);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate83, predicate84);
        java.util.Set set86 = defaultedMap78.entrySet();
        java.lang.Object obj87 = defaultedMap1.get((java.lang.Object) defaultedMap78);
        java.lang.Object obj89 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        int i90 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(i90 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        java.util.Collection collection25 = defaultedMap1.values();
        int i26 = defaultedMap1.size();
        java.util.Set set27 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.String str12 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        defaultedMap20.clear();
        java.lang.String str29 = defaultedMap20.toString();
        java.lang.Object obj30 = defaultedMap13.get((java.lang.Object) str29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj35 = defaultedMap32.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 0.0f);
        java.lang.String str40 = defaultedMap37.toString();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap37);
        boolean b42 = defaultedMap37.isEmpty();
        java.util.Set set43 = defaultedMap37.entrySet();
        java.util.Set set44 = defaultedMap37.entrySet();
        java.lang.Object obj45 = defaultedMap13.get((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.String str39 = defaultedMap36.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj48 = defaultedMap45.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) 0.0f);
        java.lang.String str53 = defaultedMap50.toString();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap50);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map57, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate43, predicate59);
        collections.Factory factory62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, factory62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b8 = defaultedMap1.isEmpty();
        boolean b9 = defaultedMap1.isEmpty();
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = defaultedMap4.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 0.0f);
        java.lang.String str12 = defaultedMap9.toString();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) defaultedMap9);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj26 = defaultedMap23.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 0.0f);
        java.lang.String str31 = defaultedMap28.toString();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap28);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 0.0f);
        java.lang.String str43 = defaultedMap40.toString();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap40);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map47, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate(map32, predicate33, predicate48);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate48, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate48);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        java.lang.String str14 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) str14);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 0.0f);
        java.lang.String str61 = defaultedMap58.toString();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map65, predicate66, predicate67);
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) predicate66);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        boolean b80 = defaultedMap78.containsValue((java.lang.Object) 0.0f);
        java.lang.String str81 = defaultedMap78.toString();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) defaultedMap78);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate83, predicate84);
        java.util.Set set86 = defaultedMap78.entrySet();
        java.lang.Object obj87 = defaultedMap1.get((java.lang.Object) defaultedMap78);
        java.lang.Object obj89 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.String str90 = defaultedMap1.toString();
        boolean b92 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        boolean b93 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        java.util.Set set13 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 0.0f);
        java.lang.String str37 = defaultedMap34.toString();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map41, predicate42, predicate43);
        boolean b45 = defaultedMap26.containsValue((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj50 = defaultedMap47.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) 0.0f);
        java.lang.String str55 = defaultedMap52.toString();
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) defaultedMap52);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate58);
        java.lang.Object obj60 = defaultedMap26.get((java.lang.Object) predicate58);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.util.Collection collection63 = defaultedMap62.values();
        java.lang.Object obj64 = defaultedMap26.get((java.lang.Object) defaultedMap62);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        boolean b70 = defaultedMap68.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj71 = defaultedMap66.get((java.lang.Object) 0.0f);
        int i72 = defaultedMap66.size();
        boolean b74 = defaultedMap66.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set75 = defaultedMap66.keySet();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj80 = defaultedMap77.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj81 = null;
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap(obj81);
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        boolean b86 = defaultedMap84.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj87 = defaultedMap82.get((java.lang.Object) 0.0f);
        java.util.Collection collection88 = defaultedMap82.values();
        java.lang.Object obj89 = defaultedMap77.remove((java.lang.Object) collection88);
        boolean b90 = defaultedMap66.containsValue((java.lang.Object) collection88);
        java.lang.Object obj91 = defaultedMap62.remove((java.lang.Object) collection88);
        java.lang.Object obj92 = defaultedMap6.get((java.lang.Object) collection88);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (-1.0d) + "'", obj60.equals((-1.0d)));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (-1.0d) + "'", obj64.equals((-1.0d)));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b14 = defaultedMap13.isEmpty();
        java.util.Set set15 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) set15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.lang.String str21 = defaultedMap18.toString();
        boolean b22 = defaultedMap18.isEmpty();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 0.0f);
        java.lang.String str27 = defaultedMap24.toString();
        boolean b28 = defaultedMap24.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.String str39 = defaultedMap36.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate41, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate(map43, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate45);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (byte) 100);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap24);
        java.util.Set set51 = defaultedMap24.entrySet();
        boolean b52 = defaultedMap1.containsKey((java.lang.Object) set51);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        java.util.Set set25 = defaultedMap1.keySet();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 0.0f);
        java.lang.String str30 = defaultedMap27.toString();
        boolean b31 = defaultedMap27.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.util.Set set33 = defaultedMap27.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        java.util.Set set29 = defaultedMap21.entrySet();
        java.lang.Object obj30 = defaultedMap12.remove((java.lang.Object) defaultedMap21);
        defaultedMap21.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        java.util.Set set25 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 0.0f);
        java.lang.String str35 = defaultedMap32.toString();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Collection collection40 = defaultedMap32.values();
        boolean b41 = defaultedMap19.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 0.0f);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.String str50 = defaultedMap43.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.String str59 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 0.0f);
        java.lang.String str69 = defaultedMap66.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        java.util.Collection collection74 = defaultedMap66.values();
        java.lang.Object obj75 = defaultedMap43.put((java.lang.Object) str59, (java.lang.Object) collection74);
        boolean b76 = defaultedMap32.containsKey(obj75);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj79 = defaultedMap1.get((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj9 = defaultedMap6.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.String str14 = defaultedMap11.toString();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj21 = defaultedMap18.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 0.0f);
        java.lang.String str26 = defaultedMap23.toString();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap23);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate(map30, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate(map15, predicate16, predicate31);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate35);
        boolean b38 = defaultedMap1.equals((java.lang.Object) 0.0f);
        int i39 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 0.0f);
        java.lang.String str61 = defaultedMap58.toString();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map65, predicate66, predicate67);
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) predicate66);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str72 = defaultedMap71.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.util.Collection collection11 = defaultedMap6.values();
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj12);
        java.util.Collection collection14 = defaultedMap6.values();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) predicate15, (java.lang.Object) defaultedMap17);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) 0.0f);
        java.lang.String str7 = defaultedMap4.toString();
        boolean b8 = defaultedMap4.isEmpty();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj14 = defaultedMap11.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 0.0f);
        java.lang.String str19 = defaultedMap16.toString();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap16);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate(map23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate9, predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 0.0f);
        java.lang.String str37 = defaultedMap34.toString();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        boolean b39 = defaultedMap34.isEmpty();
        defaultedMap4.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj45 = defaultedMap42.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 0.0f);
        java.lang.String str50 = defaultedMap47.toString();
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj59 = defaultedMap56.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        boolean b63 = defaultedMap61.containsValue((java.lang.Object) 0.0f);
        java.lang.String str64 = defaultedMap61.toString();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) defaultedMap61);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map68, predicate69, predicate70);
        boolean b72 = defaultedMap53.containsValue((java.lang.Object) predicate69);
        boolean b73 = defaultedMap4.equals((java.lang.Object) predicate69);
        boolean b74 = defaultedMap1.equals((java.lang.Object) predicate69);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        int i38 = defaultedMap31.size();
        boolean b39 = defaultedMap31.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.String str12 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = null;
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate28);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj35 = defaultedMap19.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap32);
        defaultedMap32.clear();
        java.util.Set set37 = defaultedMap32.keySet();
        java.util.Collection collection38 = defaultedMap32.values();
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) collection38);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        java.lang.String str32 = defaultedMap12.toString();
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) 0.0f);
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) 0.0f);
        java.lang.String str42 = defaultedMap39.toString();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap39);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj49 = defaultedMap46.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 0.0f);
        java.lang.String str54 = defaultedMap51.toString();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap51);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate(map58, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map43, predicate44, predicate59);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate59, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate59);
        int i66 = defaultedMap12.size();
        java.util.Collection collection67 = defaultedMap12.values();
        defaultedMap12.clear();
        java.lang.Object obj69 = defaultedMap7.get((java.lang.Object) defaultedMap12);
        boolean b70 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 0.0f);
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) collection12);
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        java.util.Set set29 = defaultedMap21.entrySet();
        java.lang.Object obj30 = defaultedMap12.remove((java.lang.Object) defaultedMap21);
        java.util.Collection collection31 = defaultedMap12.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 0.0f);
        java.lang.String str61 = defaultedMap58.toString();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map65, predicate66, predicate67);
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) predicate66);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj76 = defaultedMap73.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        boolean b80 = defaultedMap78.containsValue((java.lang.Object) 0.0f);
        java.lang.String str81 = defaultedMap78.toString();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) defaultedMap78);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate83, predicate84);
        java.util.Set set86 = defaultedMap78.entrySet();
        java.lang.Object obj87 = defaultedMap1.get((java.lang.Object) defaultedMap78);
        java.lang.Object obj89 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.String str90 = defaultedMap1.toString();
        boolean b92 = defaultedMap1.containsKey((java.lang.Object) 0.0f);
        java.lang.String str93 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        defaultedMap6.clear();
        boolean b16 = defaultedMap6.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 0.0f);
        java.lang.Object obj24 = defaultedMap6.get((java.lang.Object) defaultedMap18);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.lang.String str18 = defaultedMap17.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap17.toString();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate10, predicate26);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj34 = defaultedMap31.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.String str39 = defaultedMap36.toString();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap1.put((java.lang.Object) defaultedMap31, (java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = null;
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate15);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap19);
        defaultedMap19.clear();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "{}");
        java.lang.String str26 = defaultedMap19.toString();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = defaultedMap5.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 0.0f);
        java.lang.String str13 = defaultedMap10.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate19);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj33 = defaultedMap30.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b37 = defaultedMap35.containsValue((java.lang.Object) 0.0f);
        java.lang.String str38 = defaultedMap35.toString();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap35);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate(map42, predicate43, predicate44);
        boolean b46 = defaultedMap27.containsValue((java.lang.Object) predicate43);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj53 = defaultedMap48.get((java.lang.Object) 0.0f);
        java.util.Collection collection54 = defaultedMap48.values();
        java.lang.String str55 = defaultedMap48.toString();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap48.remove((java.lang.Object) predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate43, predicate56);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b11 = defaultedMap6.isEmpty();
        java.util.Set set12 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        defaultedMap19.clear();
        boolean b29 = defaultedMap19.containsValue((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap6.get((java.lang.Object) b29);
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        defaultedMap6.clear();
        java.util.Set set15 = defaultedMap6.keySet();
        java.lang.Object obj16 = null;
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, obj16);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) map26);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) 0.0f);
        java.lang.String str32 = defaultedMap29.toString();
        boolean b33 = defaultedMap29.isEmpty();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj39 = defaultedMap36.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) 0.0f);
        java.lang.String str44 = defaultedMap41.toString();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap41);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate(map48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate34, predicate50);
        boolean b53 = defaultedMap27.containsValue((java.lang.Object) map52);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        java.util.Set set25 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 0.0f);
        java.lang.String str35 = defaultedMap32.toString();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Collection collection40 = defaultedMap32.values();
        boolean b41 = defaultedMap19.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 0.0f);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.String str50 = defaultedMap43.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.String str59 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 0.0f);
        java.lang.String str69 = defaultedMap66.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        java.util.Collection collection74 = defaultedMap66.values();
        java.lang.Object obj75 = defaultedMap43.put((java.lang.Object) str59, (java.lang.Object) collection74);
        boolean b76 = defaultedMap32.containsKey(obj75);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        collections.Transformer transformer78 = null;
        try {
            java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = defaultedMap26.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.lang.String str34 = defaultedMap31.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap31.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap44.putAll((java.util.Map) defaultedMap50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj56 = defaultedMap53.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 0.0f);
        java.lang.String str61 = defaultedMap58.toString();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap58);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate(map65, predicate66, predicate67);
        boolean b69 = defaultedMap50.containsValue((java.lang.Object) predicate66);
        boolean b70 = defaultedMap1.equals((java.lang.Object) predicate66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        java.lang.String str73 = defaultedMap72.toString();
        boolean b74 = defaultedMap1.equals((java.lang.Object) str73);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.String str12 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.lang.String str18 = defaultedMap15.toString();
        boolean b19 = defaultedMap15.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 0.0f);
        java.lang.String str30 = defaultedMap27.toString();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate36);
        java.util.Set set39 = defaultedMap15.keySet();
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        boolean b43 = defaultedMap41.containsValue((java.lang.Object) 0.0f);
        java.lang.String str44 = defaultedMap41.toString();
        boolean b45 = defaultedMap41.isEmpty();
        defaultedMap15.putAll((java.util.Map) defaultedMap41);
        defaultedMap1.putAll((java.util.Map) defaultedMap41);
        int i48 = defaultedMap41.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.lang.String str18 = defaultedMap15.toString();
        boolean b19 = defaultedMap15.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 0.0f);
        java.lang.String str30 = defaultedMap27.toString();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate(map34, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate36);
        java.lang.Object obj39 = defaultedMap11.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 0.0f);
        java.lang.String str49 = defaultedMap46.toString();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj52 = defaultedMap11.put((java.lang.Object) defaultedMap41, (java.lang.Object) predicate51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 0.0f);
        java.lang.String str57 = defaultedMap54.toString();
        boolean b58 = defaultedMap54.isEmpty();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 0.0f);
        java.lang.String str69 = defaultedMap66.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap66);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map73, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate75);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate51, predicate59);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        java.util.Collection collection25 = defaultedMap1.values();
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.Predicate predicate27 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj32 = defaultedMap29.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 0.0f);
        java.lang.String str37 = defaultedMap34.toString();
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj44 = defaultedMap41.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 0.0f);
        java.lang.String str49 = defaultedMap46.toString();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) defaultedMap46);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate(map53, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate(map38, predicate39, predicate54);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 0.0f);
        java.lang.String str62 = defaultedMap59.toString();
        boolean b63 = defaultedMap59.isEmpty();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj69 = defaultedMap66.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        boolean b73 = defaultedMap71.containsValue((java.lang.Object) 0.0f);
        java.lang.String str74 = defaultedMap71.toString();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) defaultedMap71);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map78, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj87 = defaultedMap84.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj88 = null;
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap(obj88);
        boolean b91 = defaultedMap89.containsValue((java.lang.Object) 0.0f);
        java.lang.String str92 = defaultedMap89.toString();
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) defaultedMap89);
        collections.Predicate predicate94 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap89, predicate94, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate(map57, predicate64, predicate95);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate64);
        collections.map.DefaultedMap defaultedMap99 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "{}" + "'", str92.equals("{}"));
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        java.util.Collection collection25 = defaultedMap1.values();
        int i26 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) (-1.0d));
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        boolean b18 = defaultedMap13.isEmpty();
        java.util.Set set19 = defaultedMap13.entrySet();
        java.util.Set set20 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj25 = defaultedMap22.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 0.0f);
        java.lang.String str30 = defaultedMap27.toString();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj37 = defaultedMap34.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) 0.0f);
        java.lang.String str42 = defaultedMap39.toString();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap39);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate(map46, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map31, predicate32, predicate47);
        boolean b51 = defaultedMap13.equals((java.lang.Object) map31);
        boolean b52 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        defaultedMap6.clear();
        java.lang.String str15 = defaultedMap6.toString();
        int i16 = defaultedMap6.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.String str9 = defaultedMap6.toString();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj18 = defaultedMap15.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        boolean b22 = defaultedMap20.containsValue((java.lang.Object) 0.0f);
        java.lang.String str23 = defaultedMap20.toString();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate(map27, predicate28, predicate29);
        boolean b31 = defaultedMap12.containsValue((java.lang.Object) predicate28);
        int i32 = defaultedMap12.size();
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = defaultedMap8.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.String str16 = defaultedMap13.toString();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate22);
        java.util.Set set25 = defaultedMap1.keySet();
        java.util.Set set26 = defaultedMap1.keySet();
        java.util.Collection collection27 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) 0.0f);
        java.lang.String str12 = defaultedMap9.toString();
        boolean b13 = defaultedMap9.isEmpty();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj19 = defaultedMap16.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.String str24 = defaultedMap21.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate(map28, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate14, predicate30);
        java.lang.Object obj33 = defaultedMap5.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj38 = defaultedMap35.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 0.0f);
        java.lang.String str43 = defaultedMap40.toString();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap40);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap5.put((java.lang.Object) defaultedMap35, (java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj52 = defaultedMap49.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 0.0f);
        java.lang.String str57 = defaultedMap54.toString();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap54);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate(map61, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate47, predicate63);
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate47);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.lang.Object obj69 = null;
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap(obj69);
        boolean b72 = defaultedMap70.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj73 = defaultedMap68.get((java.lang.Object) 0.0f);
        int i74 = defaultedMap68.size();
        boolean b76 = defaultedMap68.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set77 = defaultedMap68.keySet();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj82 = defaultedMap79.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj83 = null;
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap(obj83);
        java.lang.Object obj85 = null;
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap(obj85);
        boolean b88 = defaultedMap86.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj89 = defaultedMap84.get((java.lang.Object) 0.0f);
        java.util.Collection collection90 = defaultedMap84.values();
        java.lang.Object obj91 = defaultedMap79.remove((java.lang.Object) collection90);
        boolean b92 = defaultedMap68.containsValue((java.lang.Object) collection90);
        boolean b93 = defaultedMap1.containsValue((java.lang.Object) defaultedMap68);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        boolean b11 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.util.Set set12 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = defaultedMap14.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.String str22 = defaultedMap19.toString();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap19);
        boolean b24 = defaultedMap19.isEmpty();
        java.util.Set set25 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 0.0f);
        java.lang.String str35 = defaultedMap32.toString();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Collection collection40 = defaultedMap32.values();
        boolean b41 = defaultedMap19.equals((java.lang.Object) defaultedMap32);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap43.get((java.lang.Object) 0.0f);
        java.util.Collection collection49 = defaultedMap43.values();
        java.lang.String str50 = defaultedMap43.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        boolean b56 = defaultedMap54.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.util.Collection collection58 = defaultedMap52.values();
        java.lang.String str59 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj64 = defaultedMap61.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        boolean b68 = defaultedMap66.containsValue((java.lang.Object) 0.0f);
        java.lang.String str69 = defaultedMap66.toString();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        java.util.Collection collection74 = defaultedMap66.values();
        java.lang.Object obj75 = defaultedMap43.put((java.lang.Object) str59, (java.lang.Object) collection74);
        boolean b76 = defaultedMap32.containsKey(obj75);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        java.util.Collection collection78 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(collection78);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 0.0f);
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 100);
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap17.values();
        java.lang.Object obj24 = defaultedMap12.remove((java.lang.Object) collection23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) collection23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = defaultedMap27.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 0.0f);
        java.lang.String str35 = defaultedMap32.toString();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap39.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.String str47 = defaultedMap44.toString();
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap44);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map51, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map36, predicate37, predicate52);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        java.lang.Object obj60 = defaultedMap57.put((java.lang.Object) 10.0d, (java.lang.Object) (byte) 100);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        boolean b64 = defaultedMap62.containsValue((java.lang.Object) 0.0f);
        java.lang.String str65 = defaultedMap62.toString();
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) defaultedMap62);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate67, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map69, predicate70, predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate52, predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b76 = defaultedMap75.isEmpty();
        boolean b77 = defaultedMap75.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap75);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b77 == true);
    }
}

