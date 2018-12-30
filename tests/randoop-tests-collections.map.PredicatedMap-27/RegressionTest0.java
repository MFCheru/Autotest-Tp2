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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map4, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) predicate9);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        java.util.Collection collection8 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        boolean b14 = defaultedMap4.containsKey((java.lang.Object) predicate12);
        boolean b15 = defaultedMap4.isEmpty();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) (byte) -1);
        boolean b13 = defaultedMap6.equals((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) 1);
        java.util.Collection collection17 = defaultedMap6.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + true + "'", obj8.equals(true));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i7 = defaultedMap6.size();
        java.lang.String str8 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i11 = defaultedMap10.size();
        boolean b13 = defaultedMap10.containsValue((java.lang.Object) 10);
        java.lang.String str14 = defaultedMap10.toString();
        int i15 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (-1.0d));
        int i20 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Collection collection24 = defaultedMap22.values();
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = defaultedMap22.containsKey(obj25);
        java.util.Set set27 = defaultedMap22.entrySet();
        java.lang.Object obj28 = defaultedMap10.put((java.lang.Object) i20, (java.lang.Object) set27);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) str8, (java.lang.Object) set27);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true + "'", obj19.equals(true));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate17);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap6.clear();
        defaultedMap6.clear();
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1L) + "'", obj4.equals((-1L)));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i9 = defaultedMap8.size();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 10);
        java.lang.String str12 = defaultedMap8.toString();
        int i13 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (-1.0d));
        int i18 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str21 = defaultedMap20.toString();
        java.util.Collection collection22 = defaultedMap20.values();
        java.lang.Object obj23 = new java.lang.Object();
        boolean b24 = defaultedMap20.containsKey(obj23);
        java.util.Set set25 = defaultedMap20.entrySet();
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) i18, (java.lang.Object) set25);
        boolean b27 = defaultedMap6.containsValue(obj26);
        java.util.Set set28 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        defaultedMap29.clear();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap29);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap7.containsValue(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        int i23 = defaultedMap18.size();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Collection collection29 = defaultedMap25.values();
        defaultedMap25.clear();
        int i31 = defaultedMap25.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i31 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i10 = defaultedMap9.size();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap14.clear();
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap9.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.util.Collection collection24 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        boolean b30 = defaultedMap20.containsKey((java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) (-1L), (java.lang.Object) predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate33, predicate35);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) predicate33);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (-1L) + "'", obj17.equals((-1L)));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap7.containsKey(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap1.put(obj10, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate34);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) (byte) 100);
        java.util.Set set14 = defaultedMap10.keySet();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) set14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) (byte) -1);
        boolean b13 = defaultedMap6.equals((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap16.containsKey((java.lang.Object) predicate24);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (byte) 100);
        boolean b29 = defaultedMap6.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap16.containsValue(obj30);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set4 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.lang.Object obj13 = defaultedMap8.remove((java.lang.Object) (byte) -1);
        boolean b15 = defaultedMap8.equals((java.lang.Object) (short) 100);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.util.Collection collection22 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        boolean b28 = defaultedMap18.containsKey((java.lang.Object) predicate26);
        java.lang.Object obj30 = defaultedMap18.get((java.lang.Object) (byte) 100);
        boolean b31 = defaultedMap8.equals((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        java.lang.Object obj38 = defaultedMap33.remove((java.lang.Object) (byte) -1);
        boolean b40 = defaultedMap33.equals((java.lang.Object) (short) 100);
        java.lang.Object obj42 = defaultedMap33.get((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0d);
        java.util.Set set47 = defaultedMap44.keySet();
        boolean b49 = defaultedMap44.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i64 = defaultedMap63.size();
        java.lang.String str65 = defaultedMap63.toString();
        java.util.Collection collection66 = defaultedMap63.values();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) predicate74);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate74);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str80 = defaultedMap79.toString();
        java.lang.Object obj81 = null;
        java.lang.Object obj82 = defaultedMap79.get(obj81);
        java.util.Set set83 = defaultedMap79.entrySet();
        java.lang.Object obj84 = defaultedMap63.put((java.lang.Object) predicate69, (java.lang.Object) defaultedMap79);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate69);
        java.lang.Object obj86 = defaultedMap18.put(obj42, (java.lang.Object) predicate69);
        boolean b87 = defaultedMap1.equals(obj42);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true + "'", obj5.equals(true));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + true + "'", obj42.equals(true));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0 + "'", obj82.equals(0));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        java.util.Set set5 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0 + "'", obj4.equals(0));
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsKey(obj6);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        defaultedMap29.clear();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj38 = new java.lang.Object();
        boolean b39 = defaultedMap35.containsKey(obj38);
        java.util.Set set40 = defaultedMap35.entrySet();
        java.util.Set set41 = defaultedMap35.entrySet();
        java.lang.Object obj42 = defaultedMap29.remove((java.lang.Object) defaultedMap35);
        int i43 = defaultedMap29.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) (byte) -1);
        boolean b13 = defaultedMap6.equals((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap16.containsKey((java.lang.Object) predicate24);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (byte) 100);
        boolean b29 = defaultedMap6.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 100.0d);
        java.util.Set set34 = defaultedMap31.keySet();
        boolean b35 = defaultedMap16.containsKey((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap6.clear();
        defaultedMap6.clear();
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1L) + "'", obj4.equals((-1L)));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        java.util.Set set28 = defaultedMap1.keySet();
        java.util.Set set29 = defaultedMap1.keySet();
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1L) + "'", obj4.equals((-1L)));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap1.toString();
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0d);
        java.util.Set set11 = defaultedMap8.keySet();
        boolean b13 = defaultedMap8.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i28 = defaultedMap27.size();
        java.lang.String str29 = defaultedMap27.toString();
        java.util.Collection collection30 = defaultedMap27.values();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str44 = defaultedMap43.toString();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap43.get(obj45);
        java.util.Set set47 = defaultedMap43.entrySet();
        java.lang.Object obj48 = defaultedMap27.put((java.lang.Object) predicate33, (java.lang.Object) defaultedMap43);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate22, predicate33);
        int i50 = defaultedMap14.size();
        boolean b51 = defaultedMap1.equals((java.lang.Object) i50);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + true + "'", obj6.equals(true));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap7.containsKey(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap1.put(obj10, (java.lang.Object) defaultedMap13);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Collection collection29 = defaultedMap25.values();
        defaultedMap25.clear();
        int i31 = defaultedMap25.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        int i33 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i33 == 1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) (byte) -1);
        boolean b13 = defaultedMap6.equals((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap16.containsKey((java.lang.Object) predicate24);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (byte) 100);
        boolean b29 = defaultedMap6.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        java.util.Collection collection31 = defaultedMap30.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Set set7 = defaultedMap1.keySet();
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) (byte) 100);
        java.util.Set set14 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) set14);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap15);
        java.lang.String str17 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap6.clear();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate25, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap30.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap35.clear();
        defaultedMap35.clear();
        boolean b38 = defaultedMap30.equals((java.lang.Object) defaultedMap35);
        defaultedMap1.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str42 = defaultedMap41.toString();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = new java.lang.Object();
        boolean b45 = defaultedMap41.containsKey(obj44);
        java.util.Set set46 = defaultedMap41.entrySet();
        java.util.Set set47 = defaultedMap41.entrySet();
        java.lang.Object obj48 = defaultedMap30.get((java.lang.Object) defaultedMap41);
        java.util.Collection collection49 = defaultedMap30.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1L) + "'", obj9.equals((-1L)));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (-1L) + "'", obj33.equals((-1L)));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (-1L) + "'", obj48.equals((-1L)));
        org.junit.Assert.assertNotNull(collection49);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str7 = defaultedMap6.toString();
        java.util.Collection collection8 = defaultedMap6.values();
        int i9 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (-1.0d));
        java.util.Set set14 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) (byte) -1);
        boolean b23 = defaultedMap16.equals((java.lang.Object) (short) 100);
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b36 = defaultedMap26.containsKey((java.lang.Object) predicate34);
        java.lang.Object obj38 = defaultedMap26.get((java.lang.Object) (byte) 100);
        boolean b39 = defaultedMap16.equals((java.lang.Object) defaultedMap26);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap6, (java.lang.Object) b39);
        java.lang.String str41 = defaultedMap1.toString();
        java.lang.Object obj43 = defaultedMap1.remove((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + true + "'", obj13.equals(true));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + true + "'", obj38.equals(true));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{{}=true}" + "'", str41.equals("{{}=true}"));
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Collection collection11 = defaultedMap9.values();
        java.lang.Object obj12 = new java.lang.Object();
        boolean b13 = defaultedMap9.containsKey(obj12);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) map14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap6.clear();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate25, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        java.util.Collection collection34 = defaultedMap30.values();
        defaultedMap30.clear();
        int i36 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) (-1.0d));
        java.lang.Object obj42 = defaultedMap30.remove((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 100.0d);
        java.util.Set set47 = defaultedMap44.keySet();
        boolean b49 = defaultedMap44.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i64 = defaultedMap63.size();
        java.lang.String str65 = defaultedMap63.toString();
        java.util.Collection collection66 = defaultedMap63.values();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) predicate74);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate69, predicate74);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str80 = defaultedMap79.toString();
        java.lang.Object obj81 = null;
        java.lang.Object obj82 = defaultedMap79.get(obj81);
        java.util.Set set83 = defaultedMap79.entrySet();
        java.lang.Object obj84 = defaultedMap63.put((java.lang.Object) predicate69, (java.lang.Object) defaultedMap79);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate69);
        java.lang.Object obj86 = defaultedMap39.get((java.lang.Object) map85);
        defaultedMap1.putAll(map85);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1L) + "'", obj9.equals((-1L)));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + true + "'", obj41.equals(true));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0 + "'", obj82.equals(0));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + true + "'", obj86.equals(true));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str11 = defaultedMap10.toString();
        java.util.Collection collection12 = defaultedMap10.values();
        int i13 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection16 = defaultedMap15.values();
        java.lang.Object obj17 = defaultedMap10.get((java.lang.Object) defaultedMap15);
        boolean b18 = defaultedMap5.containsValue((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap7.containsValue(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 100.0d);
        java.util.Set set21 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.lang.Object obj28 = defaultedMap23.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection31 = defaultedMap30.values();
        defaultedMap23.putAll((java.util.Map) defaultedMap30);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap18.put((java.lang.Object) defaultedMap30, (java.lang.Object) predicateUtils33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicateUtils33);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 100.0d);
        java.util.Set set11 = defaultedMap8.keySet();
        java.util.Collection collection12 = defaultedMap8.values();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str16 = defaultedMap15.toString();
        java.util.Collection collection17 = defaultedMap15.values();
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap15.containsKey(obj18);
        java.util.Set set20 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Collection collection24 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b36 = defaultedMap26.containsKey((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) (-1L), (java.lang.Object) predicate39);
        java.lang.Object obj41 = defaultedMap15.put((java.lang.Object) collection24, obj40);
        java.util.Set set42 = defaultedMap15.keySet();
        java.util.Set set43 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj47 = defaultedMap8.put((java.lang.Object) set43, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) (-1.0d));
        java.util.Set set52 = defaultedMap49.entrySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        java.lang.Object obj59 = defaultedMap54.remove((java.lang.Object) (byte) -1);
        boolean b61 = defaultedMap54.equals((java.lang.Object) (short) 100);
        defaultedMap49.putAll((java.util.Map) defaultedMap54);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) "hi!");
        java.lang.Object obj65 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) map64);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + true + "'", obj51.equals(true));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate18);
        java.lang.Object obj22 = defaultedMap8.get((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 100.0d);
        java.util.Set set27 = defaultedMap24.keySet();
        boolean b29 = defaultedMap24.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection30 = defaultedMap24.values();
        java.util.Collection collection31 = defaultedMap24.values();
        boolean b32 = defaultedMap8.containsKey((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + true + "'", obj22.equals(true));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.lang.Object obj19 = defaultedMap14.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap21.values();
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.util.Collection collection30 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        boolean b36 = defaultedMap26.containsKey((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) (-1L), (java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate24);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        defaultedMap29.clear();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj38 = defaultedMap35.remove((java.lang.Object) (byte) 100);
        java.util.Set set39 = defaultedMap35.keySet();
        boolean b40 = defaultedMap1.equals((java.lang.Object) set39);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i9 = defaultedMap8.size();
        java.lang.String str10 = defaultedMap8.toString();
        java.util.Collection collection11 = defaultedMap8.values();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap24.get(obj26);
        java.util.Set set28 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) defaultedMap24);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) predicate14);
        boolean b31 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap6.clear();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate25, predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate36);
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) predicate31);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1L) + "'", obj9.equals((-1L)));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) b4);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i9 = defaultedMap8.size();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 10);
        java.lang.String str12 = defaultedMap8.toString();
        int i13 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (-1.0d));
        int i18 = defaultedMap15.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str21 = defaultedMap20.toString();
        java.util.Collection collection22 = defaultedMap20.values();
        java.lang.Object obj23 = new java.lang.Object();
        boolean b24 = defaultedMap20.containsKey(obj23);
        java.util.Set set25 = defaultedMap20.entrySet();
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) i18, (java.lang.Object) set25);
        boolean b27 = defaultedMap6.containsValue(obj26);
        int i28 = defaultedMap6.size();
        java.lang.Object obj30 = defaultedMap6.remove((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        defaultedMap29.clear();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap29);
        java.lang.String str34 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{[]=null}" + "'", str34.equals("{[]=null}"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) (-1.0d));
        int i5 = defaultedMap2.size();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) 100.0d);
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + true + "'", obj4.equals(true));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i21 = defaultedMap20.size();
        java.lang.String str22 = defaultedMap20.toString();
        java.util.Collection collection23 = defaultedMap20.values();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str37 = defaultedMap36.toString();
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap36.get(obj38);
        java.util.Set set40 = defaultedMap36.entrySet();
        java.lang.Object obj41 = defaultedMap20.put((java.lang.Object) predicate26, (java.lang.Object) defaultedMap36);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate26);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i45 = defaultedMap44.size();
        boolean b47 = defaultedMap44.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap49.clear();
        java.lang.Object obj52 = defaultedMap49.get((java.lang.Object) (short) 0);
        boolean b53 = defaultedMap44.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i56 = defaultedMap55.size();
        java.lang.String str57 = defaultedMap55.toString();
        java.util.Collection collection58 = defaultedMap55.values();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str72 = defaultedMap71.toString();
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = defaultedMap71.get(obj73);
        java.util.Set set75 = defaultedMap71.entrySet();
        java.lang.Object obj76 = defaultedMap55.put((java.lang.Object) predicate61, (java.lang.Object) defaultedMap71);
        java.lang.Object obj77 = defaultedMap44.get((java.lang.Object) defaultedMap71);
        boolean b78 = defaultedMap7.containsKey((java.lang.Object) defaultedMap71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (-1L) + "'", obj52.equals((-1L)));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0 + "'", obj74.equals(0));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + true + "'", obj77.equals(true));
        org.junit.Assert.assertTrue(b78 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap7.containsKey(obj10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) b11);
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i10 = defaultedMap9.size();
        java.lang.String str11 = defaultedMap9.toString();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        boolean b14 = defaultedMap9.equals((java.lang.Object) defaultedMap13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i19 = defaultedMap18.size();
        java.lang.String str20 = defaultedMap18.toString();
        java.util.Collection collection21 = defaultedMap18.values();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap34.get(obj36);
        java.util.Set set38 = defaultedMap34.entrySet();
        java.lang.Object obj39 = defaultedMap18.put((java.lang.Object) predicate24, (java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i42 = defaultedMap41.size();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) 10);
        java.lang.String str45 = defaultedMap41.toString();
        int i46 = defaultedMap41.size();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i49 = defaultedMap48.size();
        java.lang.String str50 = defaultedMap48.toString();
        java.util.Collection collection51 = defaultedMap48.values();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate54, predicate59);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str65 = defaultedMap64.toString();
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap64.get(obj66);
        java.util.Set set68 = defaultedMap64.entrySet();
        java.lang.Object obj69 = defaultedMap48.put((java.lang.Object) predicate54, (java.lang.Object) defaultedMap64);
        java.lang.Object obj70 = defaultedMap41.get((java.lang.Object) predicate54);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap41);
        java.lang.Object obj72 = defaultedMap13.get((java.lang.Object) defaultedMap34);
        boolean b73 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0 + "'", obj67.equals(0));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + true + "'", obj70.equals(true));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (-1.0d));
        int i8 = defaultedMap5.size();
        java.lang.Object obj10 = defaultedMap5.remove((java.lang.Object) 100.0d);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Collection collection13 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b19 = defaultedMap9.containsKey((java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (-1.0d));
        int i24 = defaultedMap21.size();
        java.lang.Object obj26 = defaultedMap21.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 100.0d);
        java.util.Set set31 = defaultedMap28.keySet();
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i48 = defaultedMap47.size();
        java.lang.String str49 = defaultedMap47.toString();
        java.util.Collection collection50 = defaultedMap47.values();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate53, predicate58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str64 = defaultedMap63.toString();
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = defaultedMap63.get(obj65);
        java.util.Set set67 = defaultedMap63.entrySet();
        java.lang.Object obj68 = defaultedMap47.put((java.lang.Object) predicate53, (java.lang.Object) defaultedMap63);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate53);
        java.lang.Object obj70 = defaultedMap9.put((java.lang.Object) 100.0d, (java.lang.Object) map69);
        boolean b71 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.String str72 = defaultedMap9.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + true + "'", obj23.equals(true));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0 + "'", obj66.equals(0));
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{100.0={}}" + "'", str72.equals("{100.0={}}"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) predicate9);
        boolean b12 = defaultedMap1.isEmpty();
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate7);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str14 = defaultedMap13.toString();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = defaultedMap13.containsKey(obj16);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Collection collection11 = defaultedMap9.values();
        java.lang.Object obj12 = new java.lang.Object();
        boolean b13 = defaultedMap9.containsKey(obj12);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str21 = defaultedMap20.toString();
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) str21);
        defaultedMap16.clear();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true + "'", obj18.equals(true));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate18, predicate21);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap5.equals(obj6);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) (byte) -1);
        boolean b13 = defaultedMap6.equals((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        java.util.Collection collection20 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        boolean b26 = defaultedMap16.containsKey((java.lang.Object) predicate24);
        java.lang.Object obj28 = defaultedMap16.get((java.lang.Object) (byte) 100);
        boolean b29 = defaultedMap6.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.Object obj36 = defaultedMap31.remove((java.lang.Object) (byte) -1);
        boolean b38 = defaultedMap31.equals((java.lang.Object) (short) 100);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 100.0d);
        java.util.Set set45 = defaultedMap42.keySet();
        boolean b47 = defaultedMap42.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate56);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i62 = defaultedMap61.size();
        java.lang.String str63 = defaultedMap61.toString();
        java.util.Collection collection64 = defaultedMap61.values();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate72);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str78 = defaultedMap77.toString();
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = defaultedMap77.get(obj79);
        java.util.Set set81 = defaultedMap77.entrySet();
        java.lang.Object obj82 = defaultedMap61.put((java.lang.Object) predicate67, (java.lang.Object) defaultedMap77);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate56, predicate67);
        java.lang.Object obj84 = defaultedMap16.put(obj40, (java.lang.Object) predicate67);
        collections.Transformer transformer85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + true + "'", obj40.equals(true));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0 + "'", obj80.equals(0));
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) predicate9);
        defaultedMap1.clear();
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i11 = defaultedMap10.size();
        boolean b13 = defaultedMap10.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap15.clear();
        java.lang.Object obj18 = defaultedMap15.get((java.lang.Object) (short) 0);
        boolean b19 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i22 = defaultedMap21.size();
        java.lang.String str23 = defaultedMap21.toString();
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str38 = defaultedMap37.toString();
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap37.get(obj39);
        java.util.Set set41 = defaultedMap37.entrySet();
        java.lang.Object obj42 = defaultedMap21.put((java.lang.Object) predicate27, (java.lang.Object) defaultedMap37);
        java.lang.Object obj43 = defaultedMap10.get((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.util.Collection collection50 = defaultedMap46.values();
        boolean b51 = defaultedMap46.isEmpty();
        java.util.Set set52 = defaultedMap46.entrySet();
        java.lang.Object obj53 = defaultedMap10.put((java.lang.Object) 0L, (java.lang.Object) set52);
        boolean b54 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1L) + "'", obj18.equals((-1L)));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + true + "'", obj43.equals(true));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i9 = defaultedMap8.size();
        java.lang.String str10 = defaultedMap8.toString();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        boolean b13 = defaultedMap8.equals((java.lang.Object) defaultedMap12);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i17 = defaultedMap16.size();
        java.lang.String str18 = defaultedMap16.toString();
        java.util.Collection collection19 = defaultedMap16.values();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str33 = defaultedMap32.toString();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap32.get(obj34);
        java.util.Set set36 = defaultedMap32.entrySet();
        java.lang.Object obj37 = defaultedMap16.put((java.lang.Object) predicate22, (java.lang.Object) defaultedMap32);
        java.lang.String str38 = defaultedMap16.toString();
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) set14, (java.lang.Object) str38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i43 = defaultedMap42.size();
        java.lang.String str44 = defaultedMap42.toString();
        java.util.Collection collection45 = defaultedMap42.values();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str59 = defaultedMap58.toString();
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = defaultedMap58.get(obj60);
        java.util.Set set62 = defaultedMap58.entrySet();
        java.lang.Object obj63 = defaultedMap42.put((java.lang.Object) predicate48, (java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i66 = defaultedMap65.size();
        java.lang.String str67 = defaultedMap65.toString();
        java.util.Collection collection68 = defaultedMap65.values();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate76);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str82 = defaultedMap81.toString();
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap81.get(obj83);
        java.util.Set set85 = defaultedMap81.entrySet();
        java.lang.Object obj86 = defaultedMap65.put((java.lang.Object) predicate71, (java.lang.Object) defaultedMap81);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate48, predicate71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 0 + "'", obj84.equals(0));
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        boolean b3 = defaultedMap1.equals((java.lang.Object) predicate2);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i25 = defaultedMap24.size();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) 10);
        java.lang.String str28 = defaultedMap24.toString();
        int i29 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i32 = defaultedMap31.size();
        java.lang.String str33 = defaultedMap31.toString();
        java.util.Collection collection34 = defaultedMap31.values();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str48 = defaultedMap47.toString();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap47.get(obj49);
        java.util.Set set51 = defaultedMap47.entrySet();
        java.lang.Object obj52 = defaultedMap31.put((java.lang.Object) predicate37, (java.lang.Object) defaultedMap47);
        java.lang.Object obj53 = defaultedMap24.get((java.lang.Object) predicate37);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap24);
        collections.Transformer transformer55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + true + "'", obj53.equals(true));
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.util.Collection collection29 = defaultedMap25.values();
        defaultedMap25.clear();
        int i31 = defaultedMap25.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i35 = defaultedMap34.size();
        java.util.Set set36 = defaultedMap34.keySet();
        defaultedMap34.clear();
        boolean b38 = defaultedMap25.containsValue((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap8.containsKey(obj11);
        java.util.Set set13 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str16 = defaultedMap15.toString();
        java.util.Collection collection17 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b29 = defaultedMap19.containsKey((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) (-1L), (java.lang.Object) predicate32);
        java.lang.Object obj34 = defaultedMap8.put((java.lang.Object) collection17, obj33);
        java.util.Set set35 = defaultedMap8.keySet();
        java.util.Set set36 = defaultedMap8.keySet();
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 100.0d);
        java.util.Set set18 = defaultedMap15.keySet();
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i35 = defaultedMap34.size();
        java.lang.String str36 = defaultedMap34.toString();
        java.util.Collection collection37 = defaultedMap34.values();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str51 = defaultedMap50.toString();
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap50.get(obj52);
        java.util.Set set54 = defaultedMap50.entrySet();
        java.lang.Object obj55 = defaultedMap34.put((java.lang.Object) predicate40, (java.lang.Object) defaultedMap50);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate40);
        java.lang.Object obj57 = defaultedMap10.get((java.lang.Object) map56);
        java.util.Collection collection58 = defaultedMap10.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + true + "'", obj12.equals(true));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + true + "'", obj57.equals(true));
        org.junit.Assert.assertNotNull(collection58);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap7.containsKey(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap1.put(obj10, (java.lang.Object) defaultedMap13);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str7 = defaultedMap6.toString();
        java.util.Collection collection8 = defaultedMap6.values();
        java.lang.Object obj9 = new java.lang.Object();
        boolean b10 = defaultedMap6.containsKey(obj9);
        java.util.Set set11 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str14 = defaultedMap13.toString();
        java.util.Collection collection15 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        java.util.Collection collection21 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        boolean b27 = defaultedMap17.containsKey((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) (-1L), (java.lang.Object) predicate30);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) collection15, obj31);
        java.util.Set set33 = defaultedMap6.keySet();
        java.util.Set set34 = defaultedMap6.keySet();
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0 + "'", obj4.equals(0));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap12.clear();
        java.lang.Object obj15 = defaultedMap12.get((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) defaultedMap12);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.util.Collection collection24 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        boolean b30 = defaultedMap20.containsKey((java.lang.Object) predicate28);
        java.lang.Object obj32 = defaultedMap20.get((java.lang.Object) (byte) 100);
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1L) + "'", obj4.equals((-1L)));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1L) + "'", obj15.equals((-1L)));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + true + "'", obj32.equals(true));
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        defaultedMap29.clear();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj38 = new java.lang.Object();
        boolean b39 = defaultedMap35.containsKey(obj38);
        java.util.Set set40 = defaultedMap35.entrySet();
        java.util.Set set41 = defaultedMap35.entrySet();
        java.lang.Object obj42 = defaultedMap29.remove((java.lang.Object) defaultedMap35);
        defaultedMap29.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        defaultedMap29.clear();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str36 = defaultedMap35.toString();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj38 = new java.lang.Object();
        boolean b39 = defaultedMap35.containsKey(obj38);
        java.util.Set set40 = defaultedMap35.entrySet();
        java.util.Set set41 = defaultedMap35.entrySet();
        java.lang.Object obj42 = defaultedMap29.remove((java.lang.Object) defaultedMap35);
        boolean b43 = defaultedMap35.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj10 = defaultedMap7.remove((java.lang.Object) (byte) 100);
        java.util.Set set11 = defaultedMap7.keySet();
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap7.containsKey(obj12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i18 = defaultedMap17.size();
        boolean b20 = defaultedMap17.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap22.clear();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        java.util.Collection collection32 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        boolean b38 = defaultedMap28.containsKey((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap28.put((java.lang.Object) (-1L), (java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate41, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate43);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate53);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate60);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate60, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate43, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1L) + "'", obj25.equals((-1L)));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate3, predicate4);
        java.util.Collection collection6 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        boolean b12 = defaultedMap2.containsKey((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap2.put((java.lang.Object) (-1L), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i19 = defaultedMap18.size();
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) 10);
        java.lang.String str22 = defaultedMap18.toString();
        int i23 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i26 = defaultedMap25.size();
        java.lang.String str27 = defaultedMap25.toString();
        java.util.Collection collection28 = defaultedMap25.values();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str42 = defaultedMap41.toString();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap41.get(obj43);
        java.util.Set set45 = defaultedMap41.entrySet();
        java.lang.Object obj46 = defaultedMap25.put((java.lang.Object) predicate31, (java.lang.Object) defaultedMap41);
        java.lang.Object obj47 = defaultedMap18.get((java.lang.Object) predicate31);
        try {
            java.util.Map map48 = collections.map.PredicatedMap.decorate(map0, predicate15, predicate31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + true + "'", obj47.equals(true));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        java.util.Collection collection17 = defaultedMap13.values();
        defaultedMap13.clear();
        int i19 = defaultedMap13.size();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap13.containsValue(obj20);
        boolean b22 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap24);
        boolean b29 = defaultedMap5.containsKey((java.lang.Object) defaultedMap7);
        java.lang.String str30 = defaultedMap7.toString();
        java.lang.String str31 = defaultedMap7.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate5, predicate6);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) predicate6);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap7.containsKey(obj10);
        boolean b12 = defaultedMap1.equals((java.lang.Object) b11);
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Set set7 = defaultedMap1.keySet();
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap31.clear();
        defaultedMap31.clear();
        java.util.Collection collection34 = defaultedMap31.values();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str37 = defaultedMap36.toString();
        java.util.Collection collection38 = defaultedMap36.values();
        int i39 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) (-1.0d));
        java.util.Set set44 = defaultedMap41.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        java.lang.Object obj51 = defaultedMap46.remove((java.lang.Object) (byte) -1);
        boolean b53 = defaultedMap46.equals((java.lang.Object) (short) 100);
        defaultedMap41.putAll((java.util.Map) defaultedMap46);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate58);
        java.util.Collection collection60 = defaultedMap56.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate63, predicate64);
        boolean b66 = defaultedMap56.containsKey((java.lang.Object) predicate64);
        java.lang.Object obj68 = defaultedMap56.get((java.lang.Object) (byte) 100);
        boolean b69 = defaultedMap46.equals((java.lang.Object) defaultedMap56);
        java.lang.Object obj70 = defaultedMap31.put((java.lang.Object) defaultedMap36, (java.lang.Object) b69);
        boolean b71 = defaultedMap31.isEmpty();
        java.lang.String str72 = defaultedMap31.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.Transformer transformer74 = null;
        try {
            java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + true + "'", obj43.equals(true));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + true + "'", obj68.equals(true));
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{{}=true}" + "'", str72.equals("{{}=true}"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i4 = defaultedMap3.size();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) 10);
        java.lang.String str7 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Collection collection11 = defaultedMap9.values();
        java.lang.Object obj12 = new java.lang.Object();
        boolean b13 = defaultedMap9.containsKey(obj12);
        boolean b14 = defaultedMap3.equals((java.lang.Object) b13);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) b14);
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        boolean b8 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 100);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap17.clear();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap17.equals(obj23);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) map15, (java.lang.Object) b24);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + true + "'", obj23.equals(true));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + true + "'", obj6.equals(true));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str11 = defaultedMap10.toString();
        java.lang.Object obj13 = defaultedMap10.remove((java.lang.Object) (byte) 100);
        java.util.Set set14 = defaultedMap10.keySet();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (-1.0d));
        java.util.Set set20 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate24);
        java.lang.Object obj27 = defaultedMap22.remove((java.lang.Object) (byte) -1);
        boolean b29 = defaultedMap22.equals((java.lang.Object) (short) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        java.util.Collection collection36 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        boolean b42 = defaultedMap32.containsKey((java.lang.Object) predicate40);
        java.lang.Object obj44 = defaultedMap32.get((java.lang.Object) (byte) 100);
        boolean b45 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) b45);
        boolean b47 = defaultedMap1.equals((java.lang.Object) defaultedMap46);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true + "'", obj19.equals(true));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + true + "'", obj44.equals(true));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i14 = defaultedMap13.size();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) 10);
        java.lang.String str17 = defaultedMap13.toString();
        collections.Predicate predicate18 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) (byte) -1);
        boolean b27 = defaultedMap20.equals((java.lang.Object) (short) 100);
        defaultedMap20.clear();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.lang.Object obj31 = defaultedMap20.get((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate18, predicate29);
        java.lang.Object obj33 = defaultedMap1.remove((java.lang.Object) map32);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection18 = defaultedMap17.values();
        defaultedMap10.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate27);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate45, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate22, predicate45);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        defaultedMap1.clear();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) (-1.0d));
        boolean b8 = defaultedMap1.equals(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.util.Collection collection14 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        boolean b20 = defaultedMap10.containsKey((java.lang.Object) predicate18);
        defaultedMap10.clear();
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true + "'", obj7.equals(true));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (-1L) + "'", obj22.equals((-1L)));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i9 = defaultedMap8.size();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap13.clear();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap8.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        java.util.Collection collection23 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        boolean b29 = defaultedMap19.containsKey((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) (-1L), (java.lang.Object) predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate32, predicate34);
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) map35);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (-1L) + "'", obj16.equals((-1L)));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap7.containsValue(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) predicate17);
        java.util.Set set19 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.util.Collection collection14 = defaultedMap10.values();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.lang.String str16 = defaultedMap10.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i13 = defaultedMap12.size();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap17.clear();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (short) 0);
        boolean b21 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i24 = defaultedMap23.size();
        java.lang.String str25 = defaultedMap23.toString();
        java.util.Collection collection26 = defaultedMap23.values();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str40 = defaultedMap39.toString();
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap39.get(obj41);
        java.util.Set set43 = defaultedMap39.entrySet();
        java.lang.Object obj44 = defaultedMap23.put((java.lang.Object) predicate29, (java.lang.Object) defaultedMap39);
        java.lang.Object obj45 = defaultedMap12.get((java.lang.Object) defaultedMap39);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1L) + "'", obj20.equals((-1L)));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + true + "'", obj45.equals(true));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Set set7 = defaultedMap1.keySet();
        java.lang.String str8 = defaultedMap1.toString();
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b6 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj11 = new java.lang.Object();
        boolean b12 = defaultedMap8.containsKey(obj11);
        boolean b13 = defaultedMap5.equals(obj11);
        boolean b15 = defaultedMap5.containsKey((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap7.containsValue(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i25 = defaultedMap24.size();
        java.lang.String str26 = defaultedMap24.toString();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        boolean b29 = defaultedMap24.equals((java.lang.Object) defaultedMap28);
        boolean b30 = defaultedMap18.equals((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        java.lang.Object obj37 = defaultedMap32.remove((java.lang.Object) (byte) -1);
        boolean b39 = defaultedMap32.equals((java.lang.Object) (short) 100);
        boolean b41 = defaultedMap32.containsKey((java.lang.Object) 10.0d);
        defaultedMap24.putAll((java.util.Map) defaultedMap32);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap7.containsValue(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) predicate17);
        java.util.Set set19 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i22 = defaultedMap21.size();
        java.lang.String str23 = defaultedMap21.toString();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        boolean b26 = defaultedMap21.equals((java.lang.Object) defaultedMap25);
        java.util.Set set27 = defaultedMap21.keySet();
        java.lang.Object obj28 = defaultedMap7.remove((java.lang.Object) defaultedMap21);
        java.lang.String str29 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.Object obj36 = defaultedMap31.remove((java.lang.Object) (byte) -1);
        boolean b38 = defaultedMap31.equals((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str41 = defaultedMap40.toString();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) (byte) 100);
        java.util.Set set44 = defaultedMap40.keySet();
        java.lang.Object obj45 = defaultedMap31.remove((java.lang.Object) set44);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap31.equals(obj46);
        java.util.Collection collection48 = defaultedMap31.values();
        java.lang.Object obj49 = defaultedMap21.remove((java.lang.Object) collection48);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) (byte) -1);
        boolean b13 = defaultedMap6.equals((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        int i15 = defaultedMap6.size();
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap6.clear();
        defaultedMap6.clear();
        boolean b9 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (-1L) + "'", obj4.equals((-1L)));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap7.clear();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 0);
        java.lang.Object obj11 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = null;
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, obj12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap5.remove(obj14);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1L) + "'", obj10.equals((-1L)));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (-1.0d));
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) (byte) -1);
        boolean b13 = defaultedMap6.equals((java.lang.Object) (short) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) 1);
        boolean b17 = defaultedMap6.isEmpty();
        java.util.Set set18 = defaultedMap6.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + true + "'", obj3.equals(true));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i9 = defaultedMap8.size();
        java.lang.String str10 = defaultedMap8.toString();
        java.util.Collection collection11 = defaultedMap8.values();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap24.get(obj26);
        java.util.Set set28 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) defaultedMap24);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 100.0d);
        java.util.Set set35 = defaultedMap32.keySet();
        boolean b37 = defaultedMap32.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i52 = defaultedMap51.size();
        java.lang.String str53 = defaultedMap51.toString();
        java.util.Collection collection54 = defaultedMap51.values();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate62);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str68 = defaultedMap67.toString();
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap67.get(obj69);
        java.util.Set set71 = defaultedMap67.entrySet();
        java.lang.Object obj72 = defaultedMap51.put((java.lang.Object) predicate57, (java.lang.Object) defaultedMap67);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate46, predicate57);
        boolean b74 = defaultedMap1.containsValue((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        defaultedMap76.clear();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i83 = defaultedMap82.size();
        java.lang.String str84 = defaultedMap82.toString();
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) predicate85);
        boolean b87 = defaultedMap82.equals((java.lang.Object) defaultedMap86);
        java.util.Set set88 = defaultedMap82.entrySet();
        java.lang.Object obj89 = defaultedMap76.remove((java.lang.Object) set88);
        boolean b90 = defaultedMap1.containsValue((java.lang.Object) set88);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0 + "'", obj70.equals(0));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(b90 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection9 = defaultedMap8.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate36, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate13, predicate36);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i9 = defaultedMap8.size();
        java.lang.String str10 = defaultedMap8.toString();
        java.util.Collection collection11 = defaultedMap8.values();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap24.get(obj26);
        java.util.Set set28 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) defaultedMap24);
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 100.0d);
        java.util.Set set35 = defaultedMap32.keySet();
        boolean b37 = defaultedMap32.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0d));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate41, predicate46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i52 = defaultedMap51.size();
        java.lang.String str53 = defaultedMap51.toString();
        java.util.Collection collection54 = defaultedMap51.values();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate61, predicate62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate57, predicate62);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str68 = defaultedMap67.toString();
        java.lang.Object obj69 = null;
        java.lang.Object obj70 = defaultedMap67.get(obj69);
        java.util.Set set71 = defaultedMap67.entrySet();
        java.lang.Object obj72 = defaultedMap51.put((java.lang.Object) predicate57, (java.lang.Object) defaultedMap67);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate46, predicate57);
        boolean b74 = defaultedMap1.containsValue((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        java.lang.Object obj81 = defaultedMap76.remove((java.lang.Object) (byte) -1);
        boolean b83 = defaultedMap76.equals((java.lang.Object) (short) 100);
        java.lang.Object obj85 = defaultedMap76.get((java.lang.Object) "{}");
        boolean b86 = defaultedMap38.equals(obj85);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + true + "'", obj30.equals(true));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0 + "'", obj70.equals(0));
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + true + "'", obj85.equals(true));
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) str6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        boolean b11 = defaultedMap9.equals((java.lang.Object) predicate10);
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) set12);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap7.containsValue(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        java.lang.Object obj29 = defaultedMap24.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection32 = defaultedMap31.values();
        defaultedMap24.putAll((java.util.Map) defaultedMap31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate41);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate52);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate59, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate36, predicate59);
        java.lang.Object obj65 = defaultedMap1.get((java.lang.Object) predicate59);
        collections.Transformer transformer66 = null;
        try {
            java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + true + "'", obj65.equals(true));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap4.clear();
        defaultedMap4.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap4.get(obj7);
        java.lang.Object obj9 = defaultedMap1.get(obj7);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1L) + "'", obj8.equals((-1L)));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true + "'", obj9.equals(true));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Set set7 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        int i6 = defaultedMap1.size();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str8 = defaultedMap7.toString();
        java.util.Collection collection9 = defaultedMap7.values();
        java.lang.Object obj10 = new java.lang.Object();
        boolean b11 = defaultedMap7.containsKey(obj10);
        java.util.Set set12 = defaultedMap7.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str15 = defaultedMap14.toString();
        java.util.Collection collection16 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.util.Collection collection22 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate25, predicate26);
        boolean b28 = defaultedMap18.containsKey((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) (-1L), (java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap7.put((java.lang.Object) collection16, obj32);
        boolean b35 = defaultedMap7.containsValue((java.lang.Object) 1L);
        boolean b36 = defaultedMap1.equals((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.util.Collection collection13 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        boolean b19 = defaultedMap9.containsKey((java.lang.Object) predicate17);
        java.lang.Object obj21 = defaultedMap9.get((java.lang.Object) (byte) 100);
        java.lang.Object obj23 = defaultedMap9.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i26 = defaultedMap25.size();
        java.lang.String str27 = defaultedMap25.toString();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        boolean b30 = defaultedMap25.equals((java.lang.Object) defaultedMap29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100L);
        defaultedMap9.putAll(map32);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) map32);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + true + "'", obj21.equals(true));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        java.util.Collection collection12 = defaultedMap8.values();
        defaultedMap8.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap8, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i18 = defaultedMap17.size();
        java.lang.String str19 = defaultedMap17.toString();
        java.util.Collection collection20 = defaultedMap17.values();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate23, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str34 = defaultedMap33.toString();
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap33.get(obj35);
        java.util.Set set37 = defaultedMap33.entrySet();
        java.lang.Object obj38 = defaultedMap17.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap33);
        defaultedMap8.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection40 = defaultedMap8.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i11 = defaultedMap10.size();
        java.lang.String str12 = defaultedMap10.toString();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        boolean b15 = defaultedMap10.equals((java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap10.keySet();
        int i17 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj22 = defaultedMap19.remove((java.lang.Object) (byte) 100);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) set23);
        java.lang.Object obj25 = defaultedMap10.remove((java.lang.Object) defaultedMap24);
        boolean b26 = defaultedMap1.containsValue(obj25);
        boolean b27 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap7.equals(obj8);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) b9);
        int i11 = defaultedMap1.size();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i2 = defaultedMap1.size();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap17.get(obj19);
        java.util.Set set21 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) defaultedMap17);
        java.lang.String str23 = defaultedMap1.toString();
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (short) 100);
        boolean b10 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i13 = defaultedMap12.size();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap17.clear();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (short) 0);
        boolean b21 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        java.util.Collection collection27 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        boolean b33 = defaultedMap23.containsKey((java.lang.Object) predicate31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) (-1L), (java.lang.Object) predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate36, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        boolean b43 = defaultedMap41.equals((java.lang.Object) predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate38, predicate42);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (-1L) + "'", obj20.equals((-1L)));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.Predicate predicate0 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.containsKey(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Collection collection10 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) (-1L), (java.lang.Object) predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) collection10, obj26);
        java.util.Set set28 = defaultedMap1.keySet();
        java.util.Set set29 = defaultedMap1.keySet();
        java.lang.String str30 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{[]=null}" + "'", str30.equals("{[]=null}"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.util.Collection collection11 = defaultedMap7.values();
        defaultedMap7.clear();
        int i13 = defaultedMap7.size();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap7.containsValue(obj14);
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap26.clear();
        java.lang.Object obj29 = defaultedMap26.get((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) defaultedMap26);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i34 = defaultedMap33.size();
        java.lang.String str35 = defaultedMap33.toString();
        java.util.Collection collection36 = defaultedMap33.values();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate44);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str50 = defaultedMap49.toString();
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap49.get(obj51);
        java.util.Set set53 = defaultedMap49.entrySet();
        java.lang.Object obj54 = defaultedMap33.put((java.lang.Object) predicate39, (java.lang.Object) defaultedMap49);
        java.lang.String str55 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        defaultedMap63.clear();
        java.lang.Object obj66 = defaultedMap63.get((java.lang.Object) (short) 0);
        java.lang.Object obj67 = defaultedMap61.get((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) true);
        int i70 = defaultedMap69.size();
        java.lang.String str71 = defaultedMap69.toString();
        java.util.Collection collection72 = defaultedMap69.values();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) predicate75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate79, predicate80);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) predicate80);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate80);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.String str86 = defaultedMap85.toString();
        java.lang.Object obj87 = null;
        java.lang.Object obj88 = defaultedMap85.get(obj87);
        java.util.Set set89 = defaultedMap85.entrySet();
        java.lang.Object obj90 = defaultedMap69.put((java.lang.Object) predicate75, (java.lang.Object) defaultedMap85);
        java.lang.Object obj91 = defaultedMap63.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj92 = defaultedMap33.remove((java.lang.Object) defaultedMap63);
        java.lang.Object obj93 = defaultedMap24.get(obj92);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (-1L) + "'", obj29.equals((-1L)));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (-1L) + "'", obj66.equals((-1L)));
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0 + "'", obj88.equals(0));
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (-1L) + "'", obj91.equals((-1L)));
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(obj93);
    }
}

