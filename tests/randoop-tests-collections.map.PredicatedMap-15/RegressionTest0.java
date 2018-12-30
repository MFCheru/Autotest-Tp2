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
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        collections.PredicateUtils predicateUtils1 = new collections.PredicateUtils();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicateUtils1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap5.clear();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 'a');
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap13.clear();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 0.0f);
        boolean b17 = defaultedMap1.equals((java.lang.Object) map16);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set4 = defaultedMap3.entrySet();
        int i5 = defaultedMap3.size();
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set4 = defaultedMap3.entrySet();
        int i5 = defaultedMap3.size();
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap7.get((java.lang.Object) true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        int i9 = defaultedMap7.size();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0.0f);
        java.util.Collection collection12 = defaultedMap7.values();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) (byte) 100);
        boolean b20 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set10 = defaultedMap9.entrySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) set10);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set4 = defaultedMap3.entrySet();
        int i5 = defaultedMap3.size();
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap6.remove(obj7);
        java.util.Set set9 = defaultedMap6.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) predicateUtils13);
        boolean b15 = defaultedMap12.isEmpty();
        java.lang.String str16 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.entrySet();
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj24 = defaultedMap12.remove((java.lang.Object) collection23);
        java.lang.Object obj25 = defaultedMap6.get(obj24);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b17 = defaultedMap5.containsValue((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.entrySet();
        int i24 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 0.0f);
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Collection collection28 = defaultedMap22.values();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) collection28);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        int i10 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        java.util.Set set13 = defaultedMap8.keySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        java.util.Collection collection11 = defaultedMap1.values();
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap5.clear();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 'a');
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap14.remove(obj15);
        java.util.Collection collection17 = defaultedMap14.values();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicateUtils25);
        boolean b27 = defaultedMap24.isEmpty();
        java.lang.String str28 = defaultedMap24.toString();
        java.util.Collection collection29 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) 0);
        java.lang.String str32 = defaultedMap24.toString();
        java.lang.Object obj33 = defaultedMap5.get((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.entrySet();
        int i12 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 0.0f);
        java.lang.Object obj16 = defaultedMap10.remove((java.lang.Object) 10L);
        java.lang.Object obj17 = defaultedMap1.remove(obj16);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1.0d);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str10 = defaultedMap6.toString();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0f);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap26.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 0.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate23, predicate30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set36 = defaultedMap35.entrySet();
        int i37 = defaultedMap35.size();
        java.lang.Object obj38 = defaultedMap14.get((java.lang.Object) i37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set41 = defaultedMap40.entrySet();
        int i42 = defaultedMap40.size();
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.entrySet();
        defaultedMap46.clear();
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) 1L);
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = defaultedMap46.get(obj51);
        boolean b53 = defaultedMap40.equals(obj51);
        java.lang.Object obj54 = defaultedMap14.get((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + false + "'", obj38.equals(false));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + false + "'", obj52.equals(false));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + false + "'", obj54.equals(false));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) predicateUtils18);
        boolean b20 = defaultedMap17.isEmpty();
        java.lang.String str21 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.entrySet();
        defaultedMap23.clear();
        boolean b27 = defaultedMap23.containsKey((java.lang.Object) 1L);
        int i28 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.entrySet();
        int i32 = defaultedMap30.size();
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) 0.0f);
        java.util.Collection collection35 = defaultedMap30.values();
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap23, (java.lang.Object) defaultedMap30);
        java.lang.Object obj38 = defaultedMap30.get((java.lang.Object) 1.0f);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap42.clear();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 0.0f);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate39, predicate46);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set52 = defaultedMap51.entrySet();
        int i53 = defaultedMap51.size();
        java.lang.Object obj54 = defaultedMap30.get((java.lang.Object) i53);
        java.lang.Object obj55 = defaultedMap5.remove(obj54);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + false + "'", obj38.equals(false));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + false + "'", obj54.equals(false));
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.remove(obj12);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.remove(obj17);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.entrySet();
        int i24 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 0.0f);
        java.util.Collection collection27 = defaultedMap22.values();
        java.util.Collection collection28 = defaultedMap22.values();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) collection28);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        int i14 = defaultedMap12.size();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0.0f);
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap9.equals((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.entrySet();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) predicateUtils26);
        boolean b28 = defaultedMap25.isEmpty();
        java.lang.String str29 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.entrySet();
        defaultedMap31.clear();
        boolean b35 = defaultedMap31.containsKey((java.lang.Object) 1L);
        int i36 = defaultedMap31.size();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set39 = defaultedMap38.entrySet();
        int i40 = defaultedMap38.size();
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 0.0f);
        java.util.Collection collection43 = defaultedMap38.values();
        java.lang.Object obj44 = defaultedMap25.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap38);
        boolean b45 = defaultedMap21.containsKey((java.lang.Object) defaultedMap25);
        defaultedMap21.clear();
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + false + "'", obj42.equals(false));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + false + "'", obj47.equals(false));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap10.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 'a');
        boolean b16 = defaultedMap6.equals((java.lang.Object) defaultedMap10);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap19.remove(obj20);
        java.util.Collection collection22 = defaultedMap19.values();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate17, predicate23);
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + false + "'", obj7.equals(false));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.entrySet();
        int i19 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.util.Collection collection22 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicateUtils25);
        java.lang.Object obj27 = defaultedMap17.get(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap29.remove(obj30);
        java.util.Set set32 = defaultedMap29.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) set32);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) map33);
        boolean b36 = defaultedMap1.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.entrySet();
        int i19 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.util.Collection collection22 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicateUtils25);
        java.lang.Object obj27 = defaultedMap17.get(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap29.remove(obj30);
        java.util.Set set32 = defaultedMap29.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) set32);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) map33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set37 = defaultedMap36.entrySet();
        defaultedMap36.clear();
        boolean b40 = defaultedMap36.containsKey((java.lang.Object) 1L);
        int i41 = defaultedMap36.size();
        int i42 = defaultedMap36.size();
        java.util.Collection collection43 = defaultedMap36.values();
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        int i10 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        java.util.Set set13 = defaultedMap8.keySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        int i6 = defaultedMap1.size();
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0f);
        defaultedMap14.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.remove(obj12);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.remove(obj17);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.util.Set set23 = defaultedMap11.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.entrySet();
        int i19 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.util.Collection collection22 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicateUtils25);
        java.lang.Object obj27 = defaultedMap17.get(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap29.remove(obj30);
        java.util.Set set32 = defaultedMap29.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) set32);
        boolean b34 = defaultedMap1.containsValue((java.lang.Object) map33);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        boolean b9 = defaultedMap6.isEmpty();
        java.lang.String str10 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap12.clear();
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) 1L);
        int i17 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set20 = defaultedMap19.entrySet();
        int i21 = defaultedMap19.size();
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) 0.0f);
        java.util.Collection collection24 = defaultedMap19.values();
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap12, (java.lang.Object) defaultedMap19);
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) 1.0f);
        boolean b28 = defaultedMap1.equals(obj27);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.remove(obj12);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.remove(obj17);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i25 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.entrySet();
        int i29 = defaultedMap27.size();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 0.0f);
        java.util.Collection collection32 = defaultedMap27.values();
        boolean b33 = defaultedMap24.equals((java.lang.Object) collection32);
        java.util.Collection collection34 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) predicateUtils38);
        boolean b40 = defaultedMap37.isEmpty();
        java.lang.String str41 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set44 = defaultedMap43.entrySet();
        defaultedMap43.clear();
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) 1L);
        int i48 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set51 = defaultedMap50.entrySet();
        int i52 = defaultedMap50.size();
        java.lang.Object obj54 = defaultedMap50.get((java.lang.Object) 0.0f);
        java.util.Collection collection55 = defaultedMap50.values();
        java.lang.Object obj56 = defaultedMap37.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap50);
        java.lang.Object obj58 = defaultedMap50.get((java.lang.Object) 1.0f);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap62.clear();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) 0.0f);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate66, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate59, predicate66);
        defaultedMap50.clear();
        java.lang.Object obj71 = defaultedMap24.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj72 = defaultedMap1.remove((java.lang.Object) defaultedMap50);
        java.util.Collection collection73 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + false + "'", obj54.equals(false));
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + false + "'", obj58.equals(false));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection73);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils11 = new collections.PredicateUtils();
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) predicateUtils11);
        boolean b13 = defaultedMap10.isEmpty();
        java.lang.String str14 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.entrySet();
        defaultedMap16.clear();
        boolean b20 = defaultedMap16.containsKey((java.lang.Object) 1L);
        int i21 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.entrySet();
        int i25 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) 0.0f);
        java.util.Collection collection28 = defaultedMap23.values();
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap31.remove(obj32);
        java.util.Collection collection34 = defaultedMap31.values();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap40.clear();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 0.0f);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate37, predicate44);
        defaultedMap8.putAll((java.util.Map) defaultedMap23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap6.remove(obj7);
        java.util.Set set9 = defaultedMap6.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = defaultedMap12.remove(obj13);
        java.util.Collection collection15 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) predicateUtils18);
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.entrySet();
        int i24 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap26.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 0.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap17.put((java.lang.Object) defaultedMap22, (java.lang.Object) predicate30);
        java.lang.Object obj34 = defaultedMap6.remove((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false + "'", obj20.equals(false));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0f);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap26.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 0.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate23, predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.lang.String str35 = defaultedMap34.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap11.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.remove(obj17);
        java.util.Collection collection19 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) predicateUtils22);
        java.lang.Object obj24 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.entrySet();
        int i28 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap30.clear();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 0.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) defaultedMap26, (java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap39.remove(obj40);
        java.util.Collection collection42 = defaultedMap39.values();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate(map14, predicate34, predicate43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils50 = new collections.PredicateUtils();
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) predicateUtils50);
        boolean b52 = defaultedMap49.isEmpty();
        java.lang.String str53 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set56 = defaultedMap55.entrySet();
        defaultedMap55.clear();
        boolean b59 = defaultedMap55.containsKey((java.lang.Object) 1L);
        int i60 = defaultedMap55.size();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set63 = defaultedMap62.entrySet();
        int i64 = defaultedMap62.size();
        java.lang.Object obj66 = defaultedMap62.get((java.lang.Object) 0.0f);
        java.util.Collection collection67 = defaultedMap62.values();
        java.lang.Object obj68 = defaultedMap49.put((java.lang.Object) defaultedMap55, (java.lang.Object) defaultedMap62);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap70.remove(obj71);
        java.util.Collection collection73 = defaultedMap70.values();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate74, predicate76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap79.clear();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 0.0f);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate76, predicate83);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate34, predicate83);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + false + "'", obj66.equals(false));
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        int i9 = defaultedMap7.size();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) 1L);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap13.get(obj18);
        boolean b20 = defaultedMap7.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj18);
        boolean b22 = defaultedMap1.equals(obj18);
        java.util.Collection collection23 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map6, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap2.isEmpty();
        java.lang.String str6 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) 1L);
        int i13 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.entrySet();
        int i17 = defaultedMap15.size();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) 0.0f);
        java.util.Collection collection20 = defaultedMap15.values();
        java.lang.Object obj21 = defaultedMap2.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.entrySet();
        int i25 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        defaultedMap29.clear();
        boolean b33 = defaultedMap29.containsKey((java.lang.Object) 1L);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap29.get(obj34);
        boolean b36 = defaultedMap23.equals(obj34);
        java.util.Set set37 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap39.remove(obj40);
        java.util.Collection collection42 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap44.remove(obj45);
        java.util.Set set47 = defaultedMap44.entrySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap44);
        defaultedMap23.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap51.remove(obj52);
        java.util.Collection collection54 = defaultedMap51.values();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate57);
        boolean b59 = defaultedMap39.equals((java.lang.Object) predicate55);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate55);
        try {
            java.util.Map map61 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicate55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        int i10 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        java.util.Collection collection13 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicateUtils16);
        java.lang.Object obj18 = defaultedMap8.get(obj17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj18);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Collection collection16 = defaultedMap5.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        int i9 = defaultedMap7.size();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0.0f);
        java.util.Collection collection12 = defaultedMap7.values();
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) collection12);
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (byte) 100);
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set11 = defaultedMap10.entrySet();
        int i12 = defaultedMap10.size();
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) 0.0f);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection16 = defaultedMap10.values();
        java.util.Map map17 = collections.map.DefaultedMap.decorate(map6, (java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) '#', (java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i13 = defaultedMap1.size();
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        int i10 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        java.util.Set set13 = defaultedMap8.keySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.entrySet();
        int i18 = defaultedMap16.size();
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 0.0f);
        java.util.Set set21 = defaultedMap16.keySet();
        int i22 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i25 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.entrySet();
        int i29 = defaultedMap27.size();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 0.0f);
        java.util.Collection collection32 = defaultedMap27.values();
        boolean b33 = defaultedMap24.equals((java.lang.Object) collection32);
        java.lang.Object obj34 = defaultedMap16.remove((java.lang.Object) defaultedMap24);
        java.util.Set set35 = defaultedMap16.keySet();
        boolean b36 = defaultedMap8.equals((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false + "'", obj20.equals(false));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap22.clear();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 0.0f);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        int i31 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0.0f);
        java.util.Set set34 = defaultedMap29.keySet();
        java.lang.Object obj35 = defaultedMap22.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) defaultedMap22);
        boolean b38 = defaultedMap14.containsKey((java.lang.Object) false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap22.clear();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 0.0f);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        int i31 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0.0f);
        java.util.Set set34 = defaultedMap29.keySet();
        java.lang.Object obj35 = defaultedMap22.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set41 = defaultedMap40.entrySet();
        int i42 = defaultedMap40.size();
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) 0.0f);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        int i46 = defaultedMap40.size();
        boolean b47 = defaultedMap14.equals((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicateUtils6);
        boolean b8 = defaultedMap5.isEmpty();
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 1L);
        int i16 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.entrySet();
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj24 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap18);
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) 1.0f);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap30.clear();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 0.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate27, predicate34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set40 = defaultedMap39.entrySet();
        int i41 = defaultedMap39.size();
        java.lang.Object obj42 = defaultedMap18.get((java.lang.Object) i41);
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        boolean b44 = defaultedMap18.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + false + "'", obj42.equals(false));
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) predicateUtils9);
        boolean b11 = defaultedMap8.isEmpty();
        java.lang.String str12 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        defaultedMap14.clear();
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) 1L);
        int i19 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.entrySet();
        int i23 = defaultedMap21.size();
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 0.0f);
        java.util.Collection collection26 = defaultedMap21.values();
        java.lang.Object obj27 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        int i31 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0.0f);
        java.util.Collection collection34 = defaultedMap29.values();
        java.util.Collection collection35 = defaultedMap29.values();
        boolean b36 = defaultedMap8.containsKey((java.lang.Object) collection35);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.remove(obj12);
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.Object obj15 = defaultedMap6.remove((java.lang.Object) defaultedMap11);
        int i16 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) predicateUtils19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap6.get((java.lang.Object) map23);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + false + "'", obj24.equals(false));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap7.get(obj12);
        boolean b14 = defaultedMap1.equals(obj12);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap12.clear();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 0.0f);
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        int i14 = defaultedMap12.size();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0.0f);
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap9.equals((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) predicateUtils22);
        boolean b24 = defaultedMap21.isEmpty();
        java.lang.String str25 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.entrySet();
        int i29 = defaultedMap27.size();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 0.0f);
        java.util.Collection collection32 = defaultedMap27.values();
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) collection32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set36 = defaultedMap35.entrySet();
        defaultedMap35.clear();
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) (byte) 100);
        boolean b40 = defaultedMap21.equals((java.lang.Object) (byte) 100);
        defaultedMap21.clear();
        int i42 = defaultedMap21.size();
        java.util.Collection collection43 = defaultedMap21.values();
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + false + "'", obj39.equals(false));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) predicateUtils9);
        boolean b11 = defaultedMap8.isEmpty();
        java.lang.String str12 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        defaultedMap14.clear();
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) 1L);
        int i19 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.entrySet();
        int i23 = defaultedMap21.size();
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 0.0f);
        java.util.Collection collection26 = defaultedMap21.values();
        java.lang.Object obj27 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        int i31 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0.0f);
        java.util.Collection collection34 = defaultedMap29.values();
        java.util.Collection collection35 = defaultedMap29.values();
        boolean b36 = defaultedMap8.containsKey((java.lang.Object) collection35);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.String str38 = defaultedMap1.toString();
        java.util.Set set39 = defaultedMap1.entrySet();
        java.util.Set set40 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{{}={}}" + "'", str38.equals("{{}={}}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        int i14 = defaultedMap12.size();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0.0f);
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap9.equals((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        java.util.Set set20 = defaultedMap1.entrySet();
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap1.equals(obj21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) "{}");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicateUtils25);
        boolean b27 = defaultedMap24.isEmpty();
        java.lang.String str28 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.entrySet();
        defaultedMap30.clear();
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) 1L);
        int i35 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set38 = defaultedMap37.entrySet();
        int i39 = defaultedMap37.size();
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) 0.0f);
        java.util.Collection collection42 = defaultedMap37.values();
        java.lang.Object obj43 = defaultedMap24.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap37);
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 1.0f);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap49.clear();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 0.0f);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate46, predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils60 = new collections.PredicateUtils();
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) predicateUtils60);
        boolean b62 = defaultedMap59.isEmpty();
        java.lang.String str63 = defaultedMap59.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set66 = defaultedMap65.entrySet();
        defaultedMap65.clear();
        boolean b69 = defaultedMap65.containsKey((java.lang.Object) 1L);
        int i70 = defaultedMap65.size();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set73 = defaultedMap72.entrySet();
        int i74 = defaultedMap72.size();
        java.lang.Object obj76 = defaultedMap72.get((java.lang.Object) 0.0f);
        java.util.Collection collection77 = defaultedMap72.values();
        java.lang.Object obj78 = defaultedMap59.put((java.lang.Object) defaultedMap65, (java.lang.Object) defaultedMap72);
        java.lang.Object obj80 = defaultedMap72.get((java.lang.Object) 1.0f);
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) predicate81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap84.clear();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) 0.0f);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate88, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate81, predicate88);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) predicate81);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate46, predicate81);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + false + "'", obj41.equals(false));
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + false + "'", obj45.equals(false));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + false + "'", obj76.equals(false));
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + false + "'", obj80.equals(false));
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        int i9 = defaultedMap7.size();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) 1L);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap13.get(obj18);
        boolean b20 = defaultedMap7.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj18);
        boolean b22 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.entrySet();
        int i26 = defaultedMap24.size();
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) 0.0f);
        java.util.Collection collection29 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) predicateUtils32);
        java.lang.Object obj34 = defaultedMap24.get(obj33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) predicateUtils38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) predicateUtils45);
        boolean b47 = defaultedMap44.isEmpty();
        java.lang.String str48 = defaultedMap44.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set51 = defaultedMap50.entrySet();
        defaultedMap50.clear();
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) 1L);
        int i55 = defaultedMap50.size();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set58 = defaultedMap57.entrySet();
        int i59 = defaultedMap57.size();
        java.lang.Object obj61 = defaultedMap57.get((java.lang.Object) 0.0f);
        java.util.Collection collection62 = defaultedMap57.values();
        java.lang.Object obj63 = defaultedMap44.put((java.lang.Object) defaultedMap50, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set66 = defaultedMap65.entrySet();
        int i67 = defaultedMap65.size();
        java.lang.Object obj69 = defaultedMap65.get((java.lang.Object) 0.0f);
        java.util.Collection collection70 = defaultedMap65.values();
        java.util.Collection collection71 = defaultedMap65.values();
        boolean b72 = defaultedMap44.containsKey((java.lang.Object) collection71);
        defaultedMap37.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap44);
        boolean b75 = defaultedMap1.equals((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + false + "'", obj28.equals(false));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + false + "'", obj61.equals(false));
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + false + "'", obj69.equals(false));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        int i9 = defaultedMap7.size();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) 1L);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap13.get(obj18);
        boolean b20 = defaultedMap7.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj18);
        boolean b22 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        defaultedMap1.clear();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 1);
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        int i13 = defaultedMap11.size();
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 0.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set20 = defaultedMap19.entrySet();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) 1L);
        int i24 = defaultedMap19.size();
        int i25 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap27.remove(obj28);
        java.util.Set set30 = defaultedMap27.entrySet();
        java.util.Set set31 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap33.remove(obj34);
        java.util.Set set36 = defaultedMap33.entrySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) predicateUtils39);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set44 = defaultedMap43.entrySet();
        int i45 = defaultedMap43.size();
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) 0.0f);
        java.util.Set set48 = defaultedMap43.keySet();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) defaultedMap43);
        boolean b50 = defaultedMap27.containsValue((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.entrySet();
        int i54 = defaultedMap52.size();
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.lang.Object obj58 = defaultedMap52.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set63 = defaultedMap62.entrySet();
        int i64 = defaultedMap62.size();
        java.lang.Object obj66 = defaultedMap62.get((java.lang.Object) 0.0f);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        boolean b68 = defaultedMap52.containsKey((java.lang.Object) defaultedMap60);
        java.lang.Object obj69 = defaultedMap19.put((java.lang.Object) defaultedMap27, (java.lang.Object) b68);
        boolean b70 = defaultedMap9.equals(obj69);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + false + "'", obj41.equals(false));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + false + "'", obj47.equals(false));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + false + "'", obj56.equals(false));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + false + "'", obj66.equals(false));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap14.remove(obj15);
        java.util.Set set17 = defaultedMap14.entrySet();
        boolean b19 = defaultedMap14.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) predicateUtils22);
        boolean b24 = defaultedMap21.isEmpty();
        java.lang.String str25 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.entrySet();
        defaultedMap27.clear();
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) 1L);
        int i32 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set35 = defaultedMap34.entrySet();
        int i36 = defaultedMap34.size();
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) 0.0f);
        java.util.Collection collection39 = defaultedMap34.values();
        java.lang.Object obj40 = defaultedMap21.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap34);
        java.lang.Object obj42 = defaultedMap34.get((java.lang.Object) 1.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap46.clear();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 0.0f);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate43, predicate50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set56 = defaultedMap55.entrySet();
        int i57 = defaultedMap55.size();
        java.lang.Object obj58 = defaultedMap34.get((java.lang.Object) i57);
        defaultedMap14.putAll((java.util.Map) defaultedMap34);
        java.lang.String str60 = defaultedMap34.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap34);
        collections.Transformer transformer62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, transformer62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + false + "'", obj38.equals(false));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + false + "'", obj42.equals(false));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + false + "'", obj58.equals(false));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        int i11 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) predicateUtils9);
        boolean b11 = defaultedMap8.isEmpty();
        java.lang.String str12 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        defaultedMap14.clear();
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) 1L);
        int i19 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.entrySet();
        int i23 = defaultedMap21.size();
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 0.0f);
        java.util.Collection collection26 = defaultedMap21.values();
        java.lang.Object obj27 = defaultedMap8.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        int i31 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0.0f);
        java.util.Collection collection34 = defaultedMap29.values();
        java.util.Collection collection35 = defaultedMap29.values();
        boolean b36 = defaultedMap8.containsKey((java.lang.Object) collection35);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        boolean b38 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + false + "'", obj25.equals(false));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        int i10 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        java.util.Collection collection13 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) predicateUtils16);
        java.lang.Object obj18 = defaultedMap8.get(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.remove(obj21);
        java.util.Set set23 = defaultedMap20.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) set23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap27.remove(obj28);
        java.util.Set set30 = defaultedMap27.entrySet();
        java.util.Set set31 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set34 = defaultedMap33.entrySet();
        int i35 = defaultedMap33.size();
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set40 = defaultedMap39.entrySet();
        defaultedMap39.clear();
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) 1L);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap39.get(obj44);
        boolean b46 = defaultedMap33.equals(obj44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj44);
        boolean b48 = defaultedMap27.equals(obj44);
        boolean b49 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false + "'", obj37.equals(false));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + false + "'", obj45.equals(false));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.remove(obj12);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.remove(obj17);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicateUtils25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap28.clear();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 0.0f);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) 'a');
        boolean b34 = defaultedMap24.equals((java.lang.Object) defaultedMap28);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap37.remove(obj38);
        java.util.Collection collection40 = defaultedMap37.values();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate41);
        boolean b46 = defaultedMap1.containsValue((java.lang.Object) predicate35);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils3 = new collections.PredicateUtils();
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) predicateUtils3);
        boolean b5 = defaultedMap2.isEmpty();
        java.lang.String str6 = defaultedMap2.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) 1L);
        int i13 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set16 = defaultedMap15.entrySet();
        int i17 = defaultedMap15.size();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) 0.0f);
        java.util.Collection collection20 = defaultedMap15.values();
        java.lang.Object obj21 = defaultedMap2.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set24 = defaultedMap23.entrySet();
        int i25 = defaultedMap23.size();
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        defaultedMap29.clear();
        boolean b33 = defaultedMap29.containsKey((java.lang.Object) 1L);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap29.get(obj34);
        boolean b36 = defaultedMap23.equals(obj34);
        java.util.Set set37 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap39.remove(obj40);
        java.util.Collection collection42 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap44.remove(obj45);
        java.util.Set set47 = defaultedMap44.entrySet();
        defaultedMap39.putAll((java.util.Map) defaultedMap44);
        defaultedMap23.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap51.remove(obj52);
        java.util.Collection collection54 = defaultedMap51.values();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate57);
        boolean b59 = defaultedMap39.equals((java.lang.Object) predicate55);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj63 = null;
        java.lang.Object obj64 = defaultedMap62.remove(obj63);
        java.util.Collection collection65 = defaultedMap62.values();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate66, predicate68);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        try {
            java.util.Map map71 = collections.map.PredicatedMap.decorate(map0, predicate55, predicate66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100L);
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap7.get(obj12);
        boolean b14 = defaultedMap1.equals(obj12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj12);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0f);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        int i10 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        java.util.Set set13 = defaultedMap8.keySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap8.containsValue(obj15);
        java.util.Collection collection17 = defaultedMap8.values();
        int i18 = defaultedMap8.size();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false + "'", obj6.equals(false));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicateUtils6);
        boolean b8 = defaultedMap5.isEmpty();
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 1L);
        int i16 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.entrySet();
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj24 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap18);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        java.util.Set set26 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.remove(obj12);
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.Object obj15 = defaultedMap6.remove((java.lang.Object) defaultedMap11);
        defaultedMap6.clear();
        java.util.Collection collection17 = defaultedMap6.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap5.clear();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 'a');
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap14.remove(obj15);
        java.util.Collection collection17 = defaultedMap14.values();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate18, predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate18);
        java.lang.String str23 = defaultedMap5.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap8.remove(obj9);
        java.util.Collection collection11 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap13.remove(obj14);
        java.util.Set set16 = defaultedMap13.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap13);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap1.containsValue(obj19);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.String str9 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap5.clear();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 'a');
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i14 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set17 = defaultedMap16.entrySet();
        int i18 = defaultedMap16.size();
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 0.0f);
        java.util.Collection collection21 = defaultedMap16.values();
        boolean b22 = defaultedMap13.equals((java.lang.Object) collection21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) collection21);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + false + "'", obj20.equals(false));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        boolean b12 = defaultedMap8.containsKey((java.lang.Object) 1L);
        int i13 = defaultedMap8.size();
        java.util.Set set14 = defaultedMap8.keySet();
        boolean b15 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap6.remove(obj7);
        java.util.Set set9 = defaultedMap6.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap15.remove(obj16);
        java.util.Set set18 = defaultedMap15.entrySet();
        boolean b20 = defaultedMap15.equals((java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap6.put((java.lang.Object) set13, (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap10.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.entrySet();
        int i19 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.util.Set set22 = defaultedMap17.keySet();
        java.lang.Object obj23 = defaultedMap10.get((java.lang.Object) defaultedMap17);
        boolean b24 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        java.lang.String str25 = defaultedMap17.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + false + "'", obj23.equals(false));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap22.clear();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 0.0f);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        int i31 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0.0f);
        java.util.Set set34 = defaultedMap29.keySet();
        java.lang.Object obj35 = defaultedMap22.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj38 = defaultedMap14.get((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + false + "'", obj27.equals(false));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + false + "'", obj38.equals(false));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap6.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap11.remove(obj12);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils17 = new collections.PredicateUtils();
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) predicateUtils17);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set22 = defaultedMap21.entrySet();
        int i23 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap25.clear();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 0.0f);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap16.put((java.lang.Object) defaultedMap21, (java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap34.remove(obj35);
        java.util.Collection collection37 = defaultedMap34.values();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate(map9, predicate29, predicate38);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils45 = new collections.PredicateUtils();
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) predicateUtils45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate29, predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) predicateUtils53);
        boolean b55 = defaultedMap52.isEmpty();
        java.lang.String str56 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set59 = defaultedMap58.entrySet();
        defaultedMap58.clear();
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) 1L);
        int i63 = defaultedMap58.size();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set66 = defaultedMap65.entrySet();
        int i67 = defaultedMap65.size();
        java.lang.Object obj69 = defaultedMap65.get((java.lang.Object) 0.0f);
        java.util.Collection collection70 = defaultedMap65.values();
        java.lang.Object obj71 = defaultedMap52.put((java.lang.Object) defaultedMap58, (java.lang.Object) defaultedMap65);
        java.lang.Object obj73 = defaultedMap65.get((java.lang.Object) 1.0f);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap77.clear();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) 0.0f);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate74, predicate81);
        boolean b85 = defaultedMap1.equals((java.lang.Object) predicate81);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + false + "'", obj69.equals(false));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + false + "'", obj73.equals(false));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        int i14 = defaultedMap12.size();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0.0f);
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap9.equals((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        java.util.Set set20 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) false);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) 1L);
        defaultedMap17.clear();
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils26 = new collections.PredicateUtils();
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) predicateUtils26);
        java.util.Collection collection28 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.entrySet();
        int i32 = defaultedMap30.size();
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) 0.0f);
        java.util.Collection collection35 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) predicateUtils38);
        java.lang.Object obj40 = defaultedMap30.get(obj39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.entrySet();
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap46.remove(obj47);
        java.util.Collection collection49 = defaultedMap46.values();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap51.remove(obj52);
        java.util.Set set54 = defaultedMap51.entrySet();
        defaultedMap46.putAll((java.util.Map) defaultedMap51);
        java.lang.Object obj56 = defaultedMap42.get((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set59 = defaultedMap58.entrySet();
        int i60 = defaultedMap58.size();
        java.lang.Object obj62 = defaultedMap58.get((java.lang.Object) 0.0f);
        java.util.Collection collection63 = defaultedMap58.values();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils66 = new collections.PredicateUtils();
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) predicateUtils66);
        java.lang.Object obj68 = defaultedMap58.get(obj67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap70.remove(obj71);
        java.util.Set set73 = defaultedMap70.entrySet();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) set73);
        boolean b75 = defaultedMap42.containsValue((java.lang.Object) map74);
        java.lang.Object obj76 = defaultedMap30.get((java.lang.Object) map74);
        java.lang.Object obj77 = defaultedMap5.put((java.lang.Object) defaultedMap25, (java.lang.Object) defaultedMap30);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + false + "'", obj40.equals(false));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + false + "'", obj56.equals(false));
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + false + "'", obj62.equals(false));
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + false + "'", obj68.equals(false));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + false + "'", obj76.equals(false));
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicateUtils6);
        boolean b8 = defaultedMap5.isEmpty();
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 1L);
        int i16 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.entrySet();
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj24 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap18);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap28.remove(obj29);
        java.util.Collection collection31 = defaultedMap28.values();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap37.clear();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 0.0f);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set45 = defaultedMap44.entrySet();
        int i46 = defaultedMap44.size();
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) 0.0f);
        java.util.Set set49 = defaultedMap44.keySet();
        java.lang.Object obj50 = defaultedMap37.get((java.lang.Object) defaultedMap44);
        boolean b51 = defaultedMap28.equals((java.lang.Object) defaultedMap44);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + false + "'", obj42.equals(false));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + false + "'", obj48.equals(false));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + false + "'", obj50.equals(false));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.entrySet();
        defaultedMap24.clear();
        boolean b28 = defaultedMap24.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set31 = defaultedMap30.entrySet();
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap34.remove(obj35);
        java.util.Collection collection37 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap39.remove(obj40);
        java.util.Set set42 = defaultedMap39.entrySet();
        defaultedMap34.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj44 = defaultedMap30.get((java.lang.Object) defaultedMap34);
        defaultedMap24.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils48 = new collections.PredicateUtils();
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) predicateUtils48);
        java.lang.Object obj50 = defaultedMap14.put((java.lang.Object) defaultedMap34, obj49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap52.remove(obj53);
        java.util.Collection collection55 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) predicateUtils58);
        java.lang.Object obj60 = defaultedMap52.get((java.lang.Object) defaultedMap57);
        java.lang.Object obj61 = defaultedMap34.remove((java.lang.Object) defaultedMap57);
        java.util.Collection collection62 = defaultedMap34.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + false + "'", obj60.equals(false));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection62);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap7.get(obj12);
        boolean b14 = defaultedMap1.equals(obj12);
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap17.remove(obj18);
        java.util.Collection collection20 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap22.remove(obj23);
        java.util.Set set25 = defaultedMap22.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        defaultedMap29.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) predicateUtils35);
        boolean b37 = defaultedMap34.isEmpty();
        java.lang.String str38 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set41 = defaultedMap40.entrySet();
        defaultedMap40.clear();
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) 1L);
        int i45 = defaultedMap40.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set48 = defaultedMap47.entrySet();
        int i49 = defaultedMap47.size();
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) 0.0f);
        java.util.Collection collection52 = defaultedMap47.values();
        java.lang.Object obj53 = defaultedMap34.put((java.lang.Object) defaultedMap40, (java.lang.Object) defaultedMap47);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) 1.0f);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap59.clear();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 0.0f);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate56, predicate63);
        int i67 = defaultedMap47.size();
        java.lang.Object obj68 = defaultedMap29.remove((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + false + "'", obj51.equals(false));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + false + "'", obj55.equals(false));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        int i13 = defaultedMap11.size();
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 0.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        boolean b18 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        int i13 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap15.clear();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) defaultedMap11, (java.lang.Object) predicate19);
        java.util.Collection collection23 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set26 = defaultedMap25.entrySet();
        defaultedMap25.clear();
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.entrySet();
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap35.remove(obj36);
        java.util.Collection collection38 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap40.remove(obj41);
        java.util.Set set43 = defaultedMap40.entrySet();
        defaultedMap35.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap31.get((java.lang.Object) defaultedMap35);
        defaultedMap25.putAll((java.util.Map) defaultedMap35);
        defaultedMap6.putAll((java.util.Map) defaultedMap35);
        boolean b49 = defaultedMap6.containsKey((java.lang.Object) 10);
        collections.Factory factory50 = null;
        try {
            java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + false + "'", obj45.equals(false));
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate7);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        int i13 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap15.clear();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 0.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) defaultedMap11, (java.lang.Object) predicate19);
        java.util.Collection collection23 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set26 = defaultedMap25.entrySet();
        defaultedMap25.clear();
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set32 = defaultedMap31.entrySet();
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap35.remove(obj36);
        java.util.Collection collection38 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap40.remove(obj41);
        java.util.Set set43 = defaultedMap40.entrySet();
        defaultedMap35.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap31.get((java.lang.Object) defaultedMap35);
        defaultedMap25.putAll((java.util.Map) defaultedMap35);
        defaultedMap6.putAll((java.util.Map) defaultedMap35);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set50 = defaultedMap49.entrySet();
        int i51 = defaultedMap49.size();
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) 0.0f);
        java.util.Collection collection54 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils57 = new collections.PredicateUtils();
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) predicateUtils57);
        java.lang.Object obj59 = defaultedMap49.get(obj58);
        boolean b60 = defaultedMap6.containsValue((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils63 = new collections.PredicateUtils();
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) predicateUtils63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils70 = new collections.PredicateUtils();
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) predicateUtils70);
        boolean b72 = defaultedMap69.isEmpty();
        java.lang.String str73 = defaultedMap69.toString();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set76 = defaultedMap75.entrySet();
        defaultedMap75.clear();
        boolean b79 = defaultedMap75.containsKey((java.lang.Object) 1L);
        int i80 = defaultedMap75.size();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set83 = defaultedMap82.entrySet();
        int i84 = defaultedMap82.size();
        java.lang.Object obj86 = defaultedMap82.get((java.lang.Object) 0.0f);
        java.util.Collection collection87 = defaultedMap82.values();
        java.lang.Object obj88 = defaultedMap69.put((java.lang.Object) defaultedMap75, (java.lang.Object) defaultedMap82);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set91 = defaultedMap90.entrySet();
        int i92 = defaultedMap90.size();
        java.lang.Object obj94 = defaultedMap90.get((java.lang.Object) 0.0f);
        java.util.Collection collection95 = defaultedMap90.values();
        java.util.Collection collection96 = defaultedMap90.values();
        boolean b97 = defaultedMap69.containsKey((java.lang.Object) collection96);
        defaultedMap62.putAll((java.util.Map) defaultedMap69);
        defaultedMap6.putAll((java.util.Map) defaultedMap69);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + false + "'", obj45.equals(false));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false + "'", obj53.equals(false));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + false + "'", obj59.equals(false));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + false + "'", obj86.equals(false));
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue(i92 == 0);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + false + "'", obj94.equals(false));
        org.junit.Assert.assertNotNull(collection95);
        org.junit.Assert.assertNotNull(collection96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set9 = defaultedMap8.entrySet();
        int i10 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 0.0f);
        java.util.Collection collection13 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap15.remove(obj16);
        java.util.Collection collection18 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap20.remove(obj21);
        java.util.Set set23 = defaultedMap20.entrySet();
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        boolean b25 = defaultedMap8.containsValue((java.lang.Object) defaultedMap15);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) b25);
        java.util.Collection collection27 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + false + "'", obj12.equals(false));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.entrySet();
        defaultedMap6.clear();
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap16.remove(obj17);
        java.util.Collection collection19 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap21.remove(obj22);
        java.util.Set set24 = defaultedMap21.entrySet();
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap12.get((java.lang.Object) defaultedMap16);
        defaultedMap6.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i30 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set33 = defaultedMap32.entrySet();
        int i34 = defaultedMap32.size();
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) 0.0f);
        java.util.Collection collection37 = defaultedMap32.values();
        boolean b38 = defaultedMap29.equals((java.lang.Object) collection37);
        java.util.Collection collection39 = defaultedMap29.values();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils43 = new collections.PredicateUtils();
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) predicateUtils43);
        boolean b45 = defaultedMap42.isEmpty();
        java.lang.String str46 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set49 = defaultedMap48.entrySet();
        defaultedMap48.clear();
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) 1L);
        int i53 = defaultedMap48.size();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set56 = defaultedMap55.entrySet();
        int i57 = defaultedMap55.size();
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) 0.0f);
        java.util.Collection collection60 = defaultedMap55.values();
        java.lang.Object obj61 = defaultedMap42.put((java.lang.Object) defaultedMap48, (java.lang.Object) defaultedMap55);
        java.lang.Object obj63 = defaultedMap55.get((java.lang.Object) 1.0f);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap67.clear();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) 0.0f);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate64, predicate71);
        defaultedMap55.clear();
        java.lang.Object obj76 = defaultedMap29.remove((java.lang.Object) defaultedMap55);
        java.lang.Object obj77 = defaultedMap6.remove((java.lang.Object) defaultedMap55);
        java.lang.Object obj78 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.Factory factory79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + false + "'", obj36.equals(false));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + false + "'", obj59.equals(false));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + false + "'", obj63.equals(false));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + false + "'", obj78.equals(false));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils7 = new collections.PredicateUtils();
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) predicateUtils7);
        java.util.Collection collection9 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) predicateUtils9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        int i15 = defaultedMap14.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        int i21 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i24 = defaultedMap23.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.entrySet();
        int i28 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 0.0f);
        java.util.Collection collection31 = defaultedMap26.values();
        boolean b32 = defaultedMap23.equals((java.lang.Object) collection31);
        java.util.Collection collection33 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils37 = new collections.PredicateUtils();
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) predicateUtils37);
        boolean b39 = defaultedMap36.isEmpty();
        java.lang.String str40 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set43 = defaultedMap42.entrySet();
        int i44 = defaultedMap42.size();
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 0.0f);
        java.util.Collection collection47 = defaultedMap42.values();
        java.lang.Object obj48 = defaultedMap36.remove((java.lang.Object) collection47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set51 = defaultedMap50.entrySet();
        defaultedMap50.clear();
        java.lang.Object obj54 = defaultedMap50.get((java.lang.Object) (byte) 100);
        boolean b55 = defaultedMap36.equals((java.lang.Object) (byte) 100);
        defaultedMap36.clear();
        int i57 = defaultedMap36.size();
        java.util.Collection collection58 = defaultedMap36.values();
        boolean b59 = defaultedMap34.containsValue((java.lang.Object) collection58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set62 = defaultedMap61.entrySet();
        int i63 = defaultedMap61.size();
        java.lang.Object obj65 = defaultedMap61.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set68 = defaultedMap67.entrySet();
        defaultedMap67.clear();
        boolean b71 = defaultedMap67.containsKey((java.lang.Object) 1L);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = defaultedMap67.get(obj72);
        boolean b74 = defaultedMap61.equals(obj72);
        java.util.Set set75 = defaultedMap61.keySet();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj78 = null;
        java.lang.Object obj79 = defaultedMap77.remove(obj78);
        java.util.Collection collection80 = defaultedMap77.values();
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap82.remove(obj83);
        java.util.Set set85 = defaultedMap82.entrySet();
        defaultedMap77.putAll((java.util.Map) defaultedMap82);
        defaultedMap61.putAll((java.util.Map) defaultedMap77);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set90 = defaultedMap89.entrySet();
        defaultedMap89.clear();
        defaultedMap61.putAll((java.util.Map) defaultedMap89);
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) collection58, (java.lang.Object) defaultedMap61);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 1);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + false + "'", obj54.equals(false));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + false + "'", obj65.equals(false));
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + false + "'", obj73.equals(false));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i10 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        int i14 = defaultedMap12.size();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0.0f);
        java.util.Collection collection17 = defaultedMap12.values();
        boolean b18 = defaultedMap9.equals((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        java.util.Set set20 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) set20);
        defaultedMap21.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils8 = new collections.PredicateUtils();
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) predicateUtils8);
        boolean b10 = defaultedMap7.isEmpty();
        java.lang.String str11 = defaultedMap7.toString();
        java.util.Collection collection12 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap21.remove(obj22);
        java.util.Collection collection24 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap26.remove(obj27);
        java.util.Set set29 = defaultedMap26.entrySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        boolean b31 = defaultedMap14.containsValue((java.lang.Object) defaultedMap21);
        boolean b32 = defaultedMap7.containsValue((java.lang.Object) b31);
        java.util.Collection collection33 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set36 = defaultedMap35.entrySet();
        defaultedMap35.clear();
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) 1L);
        int i40 = defaultedMap35.size();
        boolean b41 = defaultedMap7.containsValue((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap43.remove(obj44);
        java.util.Collection collection46 = defaultedMap43.values();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate47, predicate49);
        java.lang.Object obj51 = defaultedMap7.get((java.lang.Object) predicate49);
        boolean b52 = defaultedMap1.equals(obj51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + false + "'", obj51.equals(false));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0f);
        int i23 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.entrySet();
        int i29 = defaultedMap27.size();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 0.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap14.putAll((java.util.Map) defaultedMap27);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap5.clear();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 'a');
        boolean b11 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils14 = new collections.PredicateUtils();
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) predicateUtils14);
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.String str17 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set20 = defaultedMap19.entrySet();
        defaultedMap19.clear();
        boolean b23 = defaultedMap19.containsKey((java.lang.Object) 1L);
        int i24 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set27 = defaultedMap26.entrySet();
        int i28 = defaultedMap26.size();
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) 0.0f);
        java.util.Collection collection31 = defaultedMap26.values();
        java.lang.Object obj32 = defaultedMap13.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap26);
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) 1.0f);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap38.clear();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 0.0f);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate35, predicate42);
        java.util.Set set46 = defaultedMap26.entrySet();
        boolean b47 = defaultedMap26.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + false + "'", obj10.equals(false));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + false + "'", obj30.equals(false));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = defaultedMap1.remove(obj2);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        int i9 = defaultedMap7.size();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set14 = defaultedMap13.entrySet();
        defaultedMap13.clear();
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) 1L);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap13.get(obj18);
        boolean b20 = defaultedMap7.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj18);
        boolean b22 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set25 = defaultedMap24.entrySet();
        int i26 = defaultedMap24.size();
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) 0.0f);
        java.util.Collection collection29 = defaultedMap24.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) predicateUtils32);
        java.lang.Object obj34 = defaultedMap24.get(obj33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils38 = new collections.PredicateUtils();
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) predicateUtils38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap41.clear();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) 'a');
        boolean b47 = defaultedMap37.equals((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set50 = defaultedMap49.entrySet();
        int i51 = defaultedMap49.size();
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) 0.0f);
        java.util.Set set54 = defaultedMap49.keySet();
        java.lang.Object obj55 = defaultedMap37.get((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils58 = new collections.PredicateUtils();
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) predicateUtils58);
        boolean b60 = defaultedMap57.isEmpty();
        java.lang.String str61 = defaultedMap57.toString();
        java.util.Collection collection62 = defaultedMap57.values();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set65 = defaultedMap64.entrySet();
        int i66 = defaultedMap64.size();
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) 0.0f);
        java.util.Collection collection69 = defaultedMap64.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = defaultedMap71.remove(obj72);
        java.util.Collection collection74 = defaultedMap71.values();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj77 = null;
        java.lang.Object obj78 = defaultedMap76.remove(obj77);
        java.util.Set set79 = defaultedMap76.entrySet();
        defaultedMap71.putAll((java.util.Map) defaultedMap76);
        boolean b81 = defaultedMap64.containsValue((java.lang.Object) defaultedMap71);
        boolean b82 = defaultedMap57.containsValue((java.lang.Object) b81);
        java.util.Collection collection83 = defaultedMap57.values();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) collection83);
        java.lang.Object obj85 = defaultedMap1.remove((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + false + "'", obj28.equals(false));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false + "'", obj46.equals(false));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false + "'", obj53.equals(false));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + false + "'", obj55.equals(false));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + false + "'", obj68.equals(false));
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap7.get(obj12);
        boolean b14 = defaultedMap1.equals(obj12);
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap17.remove(obj18);
        java.util.Collection collection20 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap22.remove(obj23);
        java.util.Set set25 = defaultedMap22.entrySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        defaultedMap29.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap34.remove(obj35);
        java.util.Collection collection37 = defaultedMap34.values();
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) collection37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + false + "'", obj5.equals(false));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + false + "'", obj38.equals(false));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set8 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap7.containsKey((java.lang.Object) 1L);
        int i12 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set15 = defaultedMap14.entrySet();
        int i16 = defaultedMap14.size();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap14);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils25 = new collections.PredicateUtils();
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) predicateUtils25);
        boolean b27 = defaultedMap24.isEmpty();
        java.lang.String str28 = defaultedMap24.toString();
        java.util.Collection collection29 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) 0);
        int i32 = defaultedMap24.size();
        java.util.Collection collection33 = defaultedMap24.values();
        java.lang.Object obj34 = defaultedMap14.get((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap36.remove(obj37);
        java.util.Collection collection39 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils42 = new collections.PredicateUtils();
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) predicateUtils42);
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set47 = defaultedMap46.entrySet();
        int i48 = defaultedMap46.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap50.clear();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) 0.0f);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap41.put((java.lang.Object) defaultedMap46, (java.lang.Object) predicate54);
        java.util.Collection collection58 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set61 = defaultedMap60.entrySet();
        defaultedMap60.clear();
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set67 = defaultedMap66.entrySet();
        defaultedMap66.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = defaultedMap70.remove(obj71);
        java.util.Collection collection73 = defaultedMap70.values();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj76 = null;
        java.lang.Object obj77 = defaultedMap75.remove(obj76);
        java.util.Set set78 = defaultedMap75.entrySet();
        defaultedMap70.putAll((java.util.Map) defaultedMap75);
        java.lang.Object obj80 = defaultedMap66.get((java.lang.Object) defaultedMap70);
        defaultedMap60.putAll((java.util.Map) defaultedMap70);
        defaultedMap41.putAll((java.util.Map) defaultedMap70);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set85 = defaultedMap84.entrySet();
        int i86 = defaultedMap84.size();
        java.lang.Object obj88 = defaultedMap84.get((java.lang.Object) 0.0f);
        java.util.Collection collection89 = defaultedMap84.values();
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils92 = new collections.PredicateUtils();
        java.lang.Object obj93 = defaultedMap91.remove((java.lang.Object) predicateUtils92);
        java.lang.Object obj94 = defaultedMap84.get(obj93);
        boolean b95 = defaultedMap41.containsValue((java.lang.Object) defaultedMap84);
        java.lang.Object obj96 = defaultedMap24.remove((java.lang.Object) b95);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + false + "'", obj34.equals(false));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + false + "'", obj80.equals(false));
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + false + "'", obj88.equals(false));
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + false + "'", obj94.equals(false));
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap3.remove(obj4);
        java.util.Collection collection6 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) predicateUtils9);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) defaultedMap8);
        java.lang.String str12 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = defaultedMap14.remove(obj15);
        java.util.Collection collection17 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap19.remove(obj20);
        java.util.Set set22 = defaultedMap19.entrySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        defaultedMap8.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i27 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set30 = defaultedMap29.entrySet();
        int i31 = defaultedMap29.size();
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 0.0f);
        java.util.Collection collection34 = defaultedMap29.values();
        boolean b35 = defaultedMap26.equals((java.lang.Object) collection34);
        java.util.Collection collection36 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) predicateUtils40);
        boolean b42 = defaultedMap39.isEmpty();
        java.lang.String str43 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set46 = defaultedMap45.entrySet();
        defaultedMap45.clear();
        boolean b49 = defaultedMap45.containsKey((java.lang.Object) 1L);
        int i50 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set53 = defaultedMap52.entrySet();
        int i54 = defaultedMap52.size();
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.util.Collection collection57 = defaultedMap52.values();
        java.lang.Object obj58 = defaultedMap39.put((java.lang.Object) defaultedMap45, (java.lang.Object) defaultedMap52);
        java.lang.Object obj60 = defaultedMap52.get((java.lang.Object) 1.0f);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap64.clear();
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) 0.0f);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate61, predicate68);
        defaultedMap52.clear();
        java.lang.Object obj73 = defaultedMap26.remove((java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set76 = defaultedMap75.entrySet();
        int i77 = defaultedMap75.size();
        java.lang.Object obj79 = defaultedMap75.get((java.lang.Object) 0.0f);
        java.util.Set set80 = defaultedMap75.keySet();
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap75);
        java.lang.Object obj82 = defaultedMap8.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj83 = defaultedMap1.remove(obj82);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + false + "'", obj11.equals(false));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + false + "'", obj33.equals(false));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + false + "'", obj56.equals(false));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + false + "'", obj60.equals(false));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + false + "'", obj79.equals(false));
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + false + "'", obj82.equals(false));
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils6 = new collections.PredicateUtils();
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) predicateUtils6);
        boolean b8 = defaultedMap5.isEmpty();
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set12 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) 1L);
        int i16 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set19 = defaultedMap18.entrySet();
        int i20 = defaultedMap18.size();
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 0.0f);
        java.util.Collection collection23 = defaultedMap18.values();
        java.lang.Object obj24 = defaultedMap5.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap18);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        java.util.Collection collection26 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false + "'", obj22.equals(false));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) set7, obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils12 = new collections.PredicateUtils();
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) predicateUtils12);
        boolean b14 = defaultedMap11.isEmpty();
        java.lang.String str15 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set18 = defaultedMap17.entrySet();
        int i19 = defaultedMap17.size();
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.util.Collection collection22 = defaultedMap17.values();
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) collection22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set26 = defaultedMap25.entrySet();
        defaultedMap25.clear();
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) (byte) 100);
        boolean b30 = defaultedMap11.equals((java.lang.Object) (byte) 100);
        defaultedMap11.clear();
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + false + "'", obj21.equals(false));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + false + "'", obj29.equals(false));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set2 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap5.remove(obj6);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap10.remove(obj11);
        java.util.Set set13 = defaultedMap10.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.util.Set set17 = defaultedMap5.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils2 = new collections.PredicateUtils();
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) predicateUtils2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) (-1L));
        int i10 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set13 = defaultedMap12.entrySet();
        int i14 = defaultedMap12.size();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0.0f);
        java.lang.Object obj18 = defaultedMap12.remove((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set23 = defaultedMap22.entrySet();
        int i24 = defaultedMap22.size();
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 0.0f);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b28 = defaultedMap12.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj29 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + false + "'", obj26.equals(false));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) false);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set5 = defaultedMap4.entrySet();
        int i6 = defaultedMap4.size();
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0.0f);
        java.util.Collection collection9 = defaultedMap4.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) false);
        collections.PredicateUtils predicateUtils15 = new collections.PredicateUtils();
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) predicateUtils15);
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.String str18 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set21 = defaultedMap20.entrySet();
        defaultedMap20.clear();
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) 1L);
        int i25 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set28 = defaultedMap27.entrySet();
        int i29 = defaultedMap27.size();
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 0.0f);
        java.util.Collection collection32 = defaultedMap27.values();
        java.lang.Object obj33 = defaultedMap14.put((java.lang.Object) defaultedMap20, (java.lang.Object) defaultedMap27);
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) 1.0f);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) false);
        defaultedMap39.clear();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) 0.0f);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate36, predicate43);
        defaultedMap27.clear();
        java.lang.Object obj48 = defaultedMap1.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap51.remove(obj52);
        java.util.Collection collection54 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap56.remove(obj57);
        java.util.Set set59 = defaultedMap56.entrySet();
        defaultedMap51.putAll((java.util.Map) defaultedMap56);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.util.Set set63 = defaultedMap62.entrySet();
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj67 = null;
        java.lang.Object obj68 = defaultedMap66.remove(obj67);
        java.util.Collection collection69 = defaultedMap66.values();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) false);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = defaultedMap71.remove(obj72);
        java.util.Set set74 = defaultedMap71.entrySet();
        defaultedMap66.putAll((java.util.Map) defaultedMap71);
        java.lang.Object obj76 = defaultedMap62.get((java.lang.Object) defaultedMap66);
        boolean b77 = defaultedMap51.containsValue((java.lang.Object) defaultedMap66);
        java.lang.Object obj78 = defaultedMap27.put(obj49, (java.lang.Object) defaultedMap51);
        java.lang.Object obj80 = defaultedMap27.get((java.lang.Object) "");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + false + "'", obj31.equals(false));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + false + "'", obj35.equals(false));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + false + "'", obj76.equals(false));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + false + "'", obj80.equals(false));
    }
}

