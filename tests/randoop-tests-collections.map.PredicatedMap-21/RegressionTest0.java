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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate17);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj9 = new java.lang.Object();
        boolean b10 = defaultedMap8.equals(obj9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap8);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.util.Set set12 = defaultedMap1.keySet();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.lang.String str27 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj9 = new java.lang.Object();
        boolean b10 = defaultedMap8.equals(obj9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap8);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        java.util.Set set47 = defaultedMap38.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        int i16 = defaultedMap12.size();
        java.util.Set set17 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        int i6 = defaultedMap1.size();
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str9 = defaultedMap8.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str12 = defaultedMap7.toString();
        int i13 = defaultedMap7.size();
        java.lang.String str14 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = new java.lang.Object();
        boolean b18 = defaultedMap16.equals(obj17);
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str21 = defaultedMap16.toString();
        int i22 = defaultedMap16.size();
        java.lang.Object obj23 = defaultedMap7.get((java.lang.Object) defaultedMap16);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 10);
        boolean b29 = defaultedMap5.equals(obj28);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) b29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap5.equals(obj6);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str10 = defaultedMap5.toString();
        int i11 = defaultedMap5.size();
        java.lang.String str12 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate15, predicate21);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) predicate15);
        java.lang.String str25 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false + "'", obj3.equals(false));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap5.equals(obj6);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str10 = defaultedMap5.toString();
        int i11 = defaultedMap5.size();
        boolean b13 = defaultedMap5.equals((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 10L, (java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap5.put((java.lang.Object) map26, obj33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap3.equals(obj4);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str8 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap10.equals(obj11);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str15 = defaultedMap10.toString();
        int i16 = defaultedMap10.size();
        java.lang.String str17 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = defaultedMap19.equals(obj20);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.lang.Object obj24 = defaultedMap10.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate33, predicate35);
        java.lang.Object obj37 = defaultedMap3.put((java.lang.Object) defaultedMap10, (java.lang.Object) predicate35);
        boolean b38 = defaultedMap1.equals((java.lang.Object) predicate35);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.util.Collection collection26 = defaultedMap15.values();
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        java.util.Collection collection29 = defaultedMap28.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object obj18 = defaultedMap1.put(obj8, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 10.0d);
        java.util.Set set26 = defaultedMap20.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) set26);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj9 = new java.lang.Object();
        boolean b10 = defaultedMap8.equals(obj9);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str13 = defaultedMap8.toString();
        int i14 = defaultedMap8.size();
        java.lang.String str15 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap17.equals(obj18);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) (byte) 10);
        java.lang.Object obj22 = defaultedMap8.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate31, predicate33);
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) predicate33);
        java.lang.String str36 = defaultedMap1.toString();
        collections.Factory factory37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap10.equals(obj11);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        java.lang.String str16 = defaultedMap1.toString();
        java.lang.String str17 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection13 = defaultedMap12.values();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) collection13);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 100 + "'", obj8.equals((short) 100));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object obj18 = defaultedMap1.put(obj8, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 10.0d);
        java.util.Set set26 = defaultedMap20.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) set26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        int i38 = defaultedMap34.size();
        java.util.Set set39 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj42 = new java.lang.Object();
        boolean b43 = defaultedMap41.equals(obj42);
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str46 = defaultedMap41.toString();
        int i47 = defaultedMap41.size();
        java.lang.String str48 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate51, predicate57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj62 = new java.lang.Object();
        boolean b63 = defaultedMap61.equals(obj62);
        boolean b65 = defaultedMap61.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str66 = defaultedMap61.toString();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj69 = new java.lang.Object();
        boolean b70 = defaultedMap68.equals(obj69);
        boolean b72 = defaultedMap68.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str73 = defaultedMap68.toString();
        int i74 = defaultedMap68.size();
        java.lang.String str75 = defaultedMap68.toString();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj78 = new java.lang.Object();
        boolean b79 = defaultedMap77.equals(obj78);
        java.lang.Object obj81 = defaultedMap77.get((java.lang.Object) (byte) 10);
        java.lang.Object obj82 = defaultedMap68.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate85, predicate86);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap89, predicate90, predicate91);
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate91, predicate93);
        java.lang.Object obj95 = defaultedMap61.put((java.lang.Object) defaultedMap68, (java.lang.Object) predicate93);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate51, predicate93);
        java.lang.Object obj97 = defaultedMap1.put((java.lang.Object) map32, (java.lang.Object) predicate93);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + false + "'", obj81.equals(false));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap3.equals(obj4);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str8 = defaultedMap3.toString();
        int i9 = defaultedMap3.size();
        java.lang.String str10 = defaultedMap3.toString();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        java.util.Collection collection19 = defaultedMap13.values();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate17);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) (-1));
        java.lang.Object obj30 = defaultedMap1.put(obj22, (java.lang.Object) (-1));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate15, predicate17);
        defaultedMap7.putAll(map18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate30);
        java.util.Collection collection32 = defaultedMap21.values();
        boolean b33 = defaultedMap7.equals((java.lang.Object) defaultedMap21);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        defaultedMap1.clear();
        int i36 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        boolean b13 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = defaultedMap15.equals(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = defaultedMap19.equals(obj20);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str24 = defaultedMap19.toString();
        int i25 = defaultedMap19.size();
        boolean b27 = defaultedMap19.equals((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap15.containsKey((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate37, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) 10L, (java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap19.put((java.lang.Object) map40, obj47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj52 = new java.lang.Object();
        boolean b53 = defaultedMap51.equals(obj52);
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str56 = defaultedMap51.toString();
        int i57 = defaultedMap51.size();
        boolean b59 = defaultedMap51.equals((java.lang.Object) 100.0f);
        java.lang.String str60 = defaultedMap51.toString();
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap51);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        int i23 = defaultedMap19.size();
        java.util.Set set24 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj27 = new java.lang.Object();
        boolean b28 = defaultedMap26.equals(obj27);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str31 = defaultedMap26.toString();
        int i32 = defaultedMap26.size();
        java.lang.String str33 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate36, predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj47 = new java.lang.Object();
        boolean b48 = defaultedMap46.equals(obj47);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str51 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj54 = new java.lang.Object();
        boolean b55 = defaultedMap53.equals(obj54);
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str58 = defaultedMap53.toString();
        int i59 = defaultedMap53.size();
        java.lang.String str60 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj63 = new java.lang.Object();
        boolean b64 = defaultedMap62.equals(obj63);
        java.lang.Object obj66 = defaultedMap62.get((java.lang.Object) (byte) 10);
        java.lang.Object obj67 = defaultedMap53.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate76, predicate78);
        java.lang.Object obj80 = defaultedMap46.put((java.lang.Object) defaultedMap53, (java.lang.Object) predicate78);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate36, predicate78);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate78);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + false + "'", obj66.equals(false));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap5.equals(obj6);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str10 = defaultedMap5.toString();
        int i11 = defaultedMap5.size();
        boolean b13 = defaultedMap5.equals((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap17.equals(obj18);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str22 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = defaultedMap24.equals(obj25);
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str29 = defaultedMap24.toString();
        int i30 = defaultedMap24.size();
        java.lang.String str31 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj34 = new java.lang.Object();
        boolean b35 = defaultedMap33.equals(obj34);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) (byte) 10);
        java.lang.Object obj38 = defaultedMap24.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate49);
        java.lang.Object obj51 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) predicate49);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) predicate49);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + false + "'", obj52.equals(false));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        boolean b12 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        int i19 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.isEmpty();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str14 = defaultedMap9.toString();
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate19, predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map33);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        boolean b47 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap3.equals(obj4);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str8 = defaultedMap3.toString();
        int i9 = defaultedMap3.size();
        java.lang.String str10 = defaultedMap3.toString();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        int i12 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj18 = defaultedMap3.remove((java.lang.Object) predicate16);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate17);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection24 = defaultedMap23.values();
        boolean b25 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate33);
        defaultedMap23.putAll(map34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate44, predicate46);
        java.util.Collection collection48 = defaultedMap37.values();
        boolean b49 = defaultedMap23.equals((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        boolean b52 = defaultedMap37.equals((java.lang.Object) (short) 10);
        java.lang.Object obj53 = defaultedMap1.get((java.lang.Object) b52);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false + "'", obj53.equals(false));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b10 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate30);
        java.util.Collection collection33 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.util.Collection collection26 = defaultedMap15.values();
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        int i29 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection32 = defaultedMap31.values();
        boolean b33 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate39, predicate41);
        defaultedMap31.putAll(map42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate52, predicate54);
        java.util.Collection collection56 = defaultedMap45.values();
        boolean b57 = defaultedMap31.equals((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap45);
        int i59 = defaultedMap45.size();
        boolean b60 = defaultedMap15.containsKey((java.lang.Object) defaultedMap45);
        boolean b61 = defaultedMap45.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap10.equals(obj11);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        int i16 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b8 = defaultedMap1.isEmpty();
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap3.equals(obj4);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str8 = defaultedMap3.toString();
        int i9 = defaultedMap3.size();
        java.lang.String str10 = defaultedMap3.toString();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object obj18 = defaultedMap1.put(obj8, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 10.0d);
        java.util.Set set26 = defaultedMap20.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) set26);
        java.util.Set set28 = defaultedMap1.entrySet();
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap3.equals(obj4);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str8 = defaultedMap3.toString();
        int i9 = defaultedMap3.size();
        java.lang.String str10 = defaultedMap3.toString();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        int i12 = defaultedMap3.size();
        java.util.Set set13 = defaultedMap3.entrySet();
        java.util.Set set14 = defaultedMap3.entrySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) b9);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 10);
        boolean b11 = defaultedMap8.isEmpty();
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) (short) 10);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        int i15 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        int i52 = defaultedMap48.size();
        java.util.Set set53 = defaultedMap48.entrySet();
        boolean b54 = defaultedMap38.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate66);
        defaultedMap56.putAll(map67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate77, predicate79);
        java.util.Collection collection81 = defaultedMap70.values();
        boolean b82 = defaultedMap56.equals((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap70);
        boolean b85 = defaultedMap70.equals((java.lang.Object) (short) 10);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (short) 10);
        defaultedMap48.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        int i52 = defaultedMap48.size();
        java.util.Set set53 = defaultedMap48.entrySet();
        boolean b54 = defaultedMap38.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate66);
        defaultedMap56.putAll(map67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate77, predicate79);
        java.util.Collection collection81 = defaultedMap70.values();
        boolean b82 = defaultedMap56.equals((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap70);
        int i84 = defaultedMap70.size();
        java.lang.Object obj85 = defaultedMap48.get((java.lang.Object) defaultedMap70);
        defaultedMap48.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + false + "'", obj85.equals(false));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = defaultedMap19.equals(obj20);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str24 = defaultedMap19.toString();
        int i25 = defaultedMap19.size();
        java.lang.String str26 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate29, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate29);
        defaultedMap7.putAll(map38);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        int i52 = defaultedMap48.size();
        java.util.Set set53 = defaultedMap48.entrySet();
        boolean b54 = defaultedMap38.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate66);
        defaultedMap56.putAll(map67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate77, predicate79);
        java.util.Collection collection81 = defaultedMap70.values();
        boolean b82 = defaultedMap56.equals((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap70);
        int i84 = defaultedMap70.size();
        java.lang.Object obj85 = defaultedMap48.get((java.lang.Object) defaultedMap70);
        java.lang.String str86 = defaultedMap48.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + false + "'", obj85.equals(false));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) 10.0d);
        java.util.Collection collection18 = defaultedMap12.values();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj14 = new java.lang.Object();
        boolean b15 = defaultedMap13.equals(obj14);
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str18 = defaultedMap13.toString();
        int i19 = defaultedMap13.size();
        boolean b21 = defaultedMap13.equals((java.lang.Object) 100.0f);
        java.lang.String str22 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj29 = defaultedMap24.get((java.lang.Object) (-1));
        boolean b31 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap33);
        boolean b38 = defaultedMap13.containsKey((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        java.util.Collection collection44 = defaultedMap40.values();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj47 = new java.lang.Object();
        boolean b48 = defaultedMap46.equals(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        java.lang.Object obj55 = defaultedMap50.get((java.lang.Object) 10.0d);
        java.util.Set set56 = defaultedMap50.keySet();
        java.lang.Object obj57 = defaultedMap40.put(obj47, (java.lang.Object) defaultedMap50);
        java.lang.Object obj58 = defaultedMap13.get((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.lang.Object obj64 = defaultedMap50.get((java.lang.Object) predicate62);
        java.util.Map map65 = collections.map.DefaultedMap.decorate(map11, obj64);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + false + "'", obj55.equals(false));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + false + "'", obj58.equals(false));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + false + "'", obj64.equals(false));
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj14 = new java.lang.Object();
        boolean b15 = defaultedMap13.equals(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) 10.0d);
        java.util.Set set23 = defaultedMap17.keySet();
        java.lang.Object obj24 = defaultedMap7.put(obj14, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) 10.0d);
        java.util.Set set32 = defaultedMap26.keySet();
        java.lang.Object obj33 = defaultedMap7.get((java.lang.Object) set32);
        java.util.Set set34 = defaultedMap7.entrySet();
        boolean b35 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj38 = new java.lang.Object();
        boolean b39 = defaultedMap37.equals(obj38);
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str42 = defaultedMap37.toString();
        int i43 = defaultedMap37.size();
        java.lang.String str44 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate47, predicate53);
        defaultedMap7.putAll((java.util.Map) defaultedMap37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        int i52 = defaultedMap48.size();
        java.util.Set set53 = defaultedMap48.entrySet();
        boolean b54 = defaultedMap38.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate66);
        defaultedMap56.putAll(map67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate77, predicate79);
        java.util.Collection collection81 = defaultedMap70.values();
        boolean b82 = defaultedMap56.equals((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap70);
        int i84 = defaultedMap70.size();
        java.lang.Object obj85 = defaultedMap48.get((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate88, predicate89);
        java.lang.Object obj92 = defaultedMap87.get((java.lang.Object) 10.0d);
        java.util.Set set93 = defaultedMap87.keySet();
        boolean b94 = defaultedMap48.containsValue((java.lang.Object) set93);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + false + "'", obj85.equals(false));
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + false + "'", obj92.equals(false));
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap3.equals(obj4);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) b5);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap15.clear();
        boolean b17 = defaultedMap15.isEmpty();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (short) 100);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) map19);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap10.equals(obj11);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        int i12 = defaultedMap8.size();
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b15 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object obj18 = defaultedMap1.put(obj8, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 10.0d);
        java.util.Set set26 = defaultedMap20.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) set26);
        boolean b28 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str14 = defaultedMap9.toString();
        int i15 = defaultedMap9.size();
        boolean b17 = defaultedMap9.equals((java.lang.Object) 100.0f);
        boolean b19 = defaultedMap9.equals((java.lang.Object) '#');
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) b19);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        boolean b12 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.util.Set set19 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 100 + "'", obj8.equals((short) 100));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0f);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 1);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.lang.Object obj52 = defaultedMap38.get((java.lang.Object) predicate50);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + false + "'", obj52.equals(false));
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj9 = new java.lang.Object();
        boolean b10 = defaultedMap8.equals(obj9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap8);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) predicateUtils12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection16 = defaultedMap15.values();
        int i17 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        int i23 = defaultedMap19.size();
        java.util.Set set24 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) set24);
        boolean b26 = defaultedMap15.equals((java.lang.Object) set24);
        boolean b27 = defaultedMap1.equals((java.lang.Object) b26);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        defaultedMap1.putAll(map12);
        int i14 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap5.equals(obj6);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str10 = defaultedMap5.toString();
        int i11 = defaultedMap5.size();
        boolean b13 = defaultedMap5.equals((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 10L, (java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap5.put((java.lang.Object) map26, obj33);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) set6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap9.equals(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj14 = new java.lang.Object();
        boolean b15 = defaultedMap13.equals(obj14);
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str18 = defaultedMap13.toString();
        int i19 = defaultedMap13.size();
        boolean b21 = defaultedMap13.equals((java.lang.Object) 100.0f);
        boolean b22 = defaultedMap9.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate31, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) 10L, (java.lang.Object) (byte) 1);
        java.lang.Object obj42 = defaultedMap13.put((java.lang.Object) map34, obj41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        java.lang.String str44 = defaultedMap13.toString();
        java.lang.Object obj45 = defaultedMap7.get((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{{}=null}" + "'", str44.equals("{{}=null}"));
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = new java.lang.Object();
        boolean b18 = defaultedMap16.equals(obj17);
        java.lang.Object obj19 = defaultedMap9.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap16);
        java.util.Set set20 = defaultedMap9.keySet();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set20);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap7.equals(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object obj18 = defaultedMap1.put(obj8, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 10.0d);
        java.util.Set set26 = defaultedMap20.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) set26);
        java.util.Set set28 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap30.clear();
        boolean b32 = defaultedMap30.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = defaultedMap30.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap30.get(obj38);
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) defaultedMap30);
        java.lang.String str41 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 100 + "'", obj37.equals((short) 100));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 100 + "'", obj39.equals((short) 100));
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) (-1));
        boolean b19 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap21);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.util.Set set44 = defaultedMap38.keySet();
        java.lang.Object obj45 = defaultedMap28.put(obj35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        int i52 = defaultedMap48.size();
        java.util.Set set53 = defaultedMap48.entrySet();
        boolean b54 = defaultedMap38.equals((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate64, predicate66);
        defaultedMap56.putAll(map67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate76, predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate77, predicate79);
        java.util.Collection collection81 = defaultedMap70.values();
        boolean b82 = defaultedMap56.equals((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap70);
        int i84 = defaultedMap70.size();
        java.lang.Object obj85 = defaultedMap48.get((java.lang.Object) defaultedMap70);
        java.lang.String str86 = defaultedMap70.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + false + "'", obj85.equals(false));
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        int i12 = defaultedMap8.size();
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) 10);
        boolean b15 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        boolean b16 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap10.equals(obj11);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) (byte) 10);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        java.lang.String str16 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate26, predicate28);
        defaultedMap18.putAll(map29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate39, predicate41);
        java.util.Collection collection43 = defaultedMap32.values();
        boolean b44 = defaultedMap18.equals((java.lang.Object) defaultedMap32);
        java.util.Set set45 = defaultedMap18.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false + "'", obj20.equals(false));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate11);
        defaultedMap1.putAll(map12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.util.Collection collection26 = defaultedMap15.values();
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        java.util.Set set28 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = new java.lang.Object();
        boolean b36 = defaultedMap34.equals(obj35);
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str39 = defaultedMap34.toString();
        int i40 = defaultedMap34.size();
        java.lang.String str41 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate44, predicate50);
        java.lang.Object obj53 = defaultedMap30.remove((java.lang.Object) predicate44);
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + false + "'", obj32.equals(false));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap5.equals(obj6);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str10 = defaultedMap5.toString();
        int i11 = defaultedMap5.size();
        boolean b13 = defaultedMap5.equals((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate23, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 10L, (java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap5.put((java.lang.Object) map26, obj33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection37 = defaultedMap36.values();
        boolean b38 = defaultedMap36.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate46);
        defaultedMap36.putAll(map47);
        boolean b49 = defaultedMap5.equals((java.lang.Object) defaultedMap36);
        java.lang.String str50 = defaultedMap5.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{{}=null}" + "'", str50.equals("{{}=null}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj28 = new java.lang.Object();
        boolean b29 = defaultedMap27.equals(obj28);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str32 = defaultedMap27.toString();
        int i33 = defaultedMap27.size();
        java.lang.String str34 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate37, predicate43);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate37);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate37);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap9.equals(obj10);
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str14 = defaultedMap9.toString();
        int i15 = defaultedMap9.size();
        java.lang.String str16 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate19, predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate19);
        boolean b29 = defaultedMap1.isEmpty();
        java.util.Set set30 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) (-1));
        boolean b48 = defaultedMap41.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) (byte) 10);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) map39, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.lang.String str10 = defaultedMap1.toString();
        boolean b11 = defaultedMap1.isEmpty();
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj15 = new java.lang.Object();
        boolean b16 = defaultedMap14.equals(obj15);
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str19 = defaultedMap14.toString();
        int i20 = defaultedMap14.size();
        java.lang.String str21 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap23.equals(obj24);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = defaultedMap14.remove((java.lang.Object) (byte) 10);
        java.lang.String str29 = defaultedMap14.toString();
        java.util.Set set30 = defaultedMap14.keySet();
        java.util.Set set31 = defaultedMap14.entrySet();
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        int i4 = defaultedMap1.size();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap3.equals(obj4);
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str8 = defaultedMap3.toString();
        int i9 = defaultedMap3.size();
        java.lang.String str10 = defaultedMap3.toString();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        int i12 = defaultedMap3.size();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap17.equals(obj18);
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str22 = defaultedMap17.toString();
        int i23 = defaultedMap17.size();
        java.lang.String str24 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj27 = new java.lang.Object();
        boolean b28 = defaultedMap26.equals(obj27);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str31 = defaultedMap26.toString();
        int i32 = defaultedMap26.size();
        java.lang.Object obj33 = defaultedMap17.get((java.lang.Object) defaultedMap26);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj36 = defaultedMap15.get((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj40 = defaultedMap3.put((java.lang.Object) defaultedMap15, (java.lang.Object) set39);
        java.lang.Object obj42 = defaultedMap15.remove((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap10.equals(obj11);
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str15 = defaultedMap10.toString();
        int i16 = defaultedMap10.size();
        java.lang.String str17 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = defaultedMap19.equals(obj20);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str24 = defaultedMap19.toString();
        int i25 = defaultedMap19.size();
        java.lang.Object obj26 = defaultedMap10.get((java.lang.Object) defaultedMap19);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj29 = defaultedMap8.get((java.lang.Object) false);
        java.lang.Object obj30 = defaultedMap1.get(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection33 = defaultedMap32.values();
        boolean b34 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate42);
        defaultedMap32.putAll(map43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj47 = new java.lang.Object();
        boolean b48 = defaultedMap46.equals(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj51 = new java.lang.Object();
        boolean b52 = defaultedMap50.equals(obj51);
        boolean b54 = defaultedMap50.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str55 = defaultedMap50.toString();
        int i56 = defaultedMap50.size();
        boolean b58 = defaultedMap50.equals((java.lang.Object) 100.0f);
        boolean b59 = defaultedMap46.containsKey((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate68, predicate70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj78 = defaultedMap73.put((java.lang.Object) 10L, (java.lang.Object) (byte) 1);
        java.lang.Object obj79 = defaultedMap50.put((java.lang.Object) map71, obj78);
        boolean b80 = defaultedMap50.isEmpty();
        java.lang.Object obj81 = defaultedMap1.put((java.lang.Object) map43, (java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj9 = new java.lang.Object();
        boolean b10 = defaultedMap8.equals(obj9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap8);
        java.util.Set set12 = defaultedMap1.keySet();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap10.clear();
        boolean b12 = defaultedMap10.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 10.0d);
        java.util.Collection collection26 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate33, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj47 = new java.lang.Object();
        boolean b48 = defaultedMap46.equals(obj47);
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str51 = defaultedMap46.toString();
        int i52 = defaultedMap46.size();
        java.lang.String str53 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate56, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate56);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate33, predicate56);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate70);
        java.lang.Object obj73 = defaultedMap68.get((java.lang.Object) 10.0d);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj77 = new java.lang.Object();
        boolean b78 = defaultedMap76.equals(obj77);
        boolean b80 = defaultedMap76.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str81 = defaultedMap76.toString();
        int i82 = defaultedMap76.size();
        java.lang.String str83 = defaultedMap76.toString();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate86, predicate87);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap90, predicate91, predicate92);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate86, predicate92);
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate74, predicate86);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate56, predicate86);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 100 + "'", obj17.equals((short) 100));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false + "'", obj43.equals(false));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + false + "'", obj73.equals(false));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) (-1));
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        boolean b13 = defaultedMap1.equals((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = defaultedMap19.equals(obj20);
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str24 = defaultedMap19.toString();
        int i25 = defaultedMap19.size();
        java.lang.String str26 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate29, predicate35);
        java.lang.Object obj38 = defaultedMap15.remove((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 10);
        boolean b43 = defaultedMap40.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj46 = new java.lang.Object();
        boolean b47 = defaultedMap45.equals(obj46);
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str50 = defaultedMap45.toString();
        int i51 = defaultedMap45.size();
        java.lang.String str52 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate55, predicate61);
        java.lang.Object obj64 = defaultedMap40.remove((java.lang.Object) map63);
        java.lang.Object obj65 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) map63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate74, predicate76);
        java.util.Collection collection78 = defaultedMap67.values();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate83, predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate84, predicate86);
        java.lang.Object obj88 = defaultedMap67.remove((java.lang.Object) predicate84);
        java.lang.Object obj89 = defaultedMap15.get((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + false + "'", obj17.equals(false));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + false + "'", obj89.equals(false));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap5.equals(obj6);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str10 = defaultedMap5.toString();
        int i11 = defaultedMap5.size();
        java.lang.String str12 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate15, predicate21);
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) predicate15);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false + "'", obj3.equals(false));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str6 = defaultedMap1.toString();
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap1.equals((java.lang.Object) '#');
        int i12 = defaultedMap1.size();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = new java.lang.Object();
        boolean b3 = defaultedMap1.equals(obj2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap5.equals(obj6);
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str10 = defaultedMap5.toString();
        int i11 = defaultedMap5.size();
        boolean b13 = defaultedMap5.equals((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 10);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 10.0d);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj31 = new java.lang.Object();
        boolean b32 = defaultedMap30.equals(obj31);
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str35 = defaultedMap30.toString();
        int i36 = defaultedMap30.size();
        java.lang.String str37 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate40, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate40);
        boolean b50 = defaultedMap22.isEmpty();
        boolean b51 = defaultedMap22.isEmpty();
        java.lang.Object obj52 = defaultedMap16.remove((java.lang.Object) b51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj28 = new java.lang.Object();
        boolean b29 = defaultedMap27.equals(obj28);
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) (byte) 1);
        java.lang.String str32 = defaultedMap27.toString();
        int i33 = defaultedMap27.size();
        java.lang.String str34 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate37, predicate43);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate37);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate37);
        java.lang.Object obj48 = null;
        boolean b49 = defaultedMap1.containsValue(obj48);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b49 == false);
    }
}

