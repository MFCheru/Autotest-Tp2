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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 1);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.util.Set set7 = defaultedMap5.keySet();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) set18);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj22 = defaultedMap1.remove((java.lang.Object) false);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set8 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.Object obj9 = defaultedMap6.remove((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap25.clear();
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.entrySet();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) set6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        java.util.Collection collection6 = defaultedMap3.values();
        boolean b8 = defaultedMap3.equals((java.lang.Object) 1.0d);
        boolean b9 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj28 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        java.util.Set set35 = defaultedMap33.entrySet();
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 'a' + "'", obj28.equals('a'));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj28 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        java.util.Set set35 = defaultedMap33.entrySet();
        int i36 = defaultedMap33.size();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set39 = defaultedMap38.keySet();
        boolean b40 = defaultedMap33.equals((java.lang.Object) set39);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 'a' + "'", obj28.equals('a'));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) set10);
        java.util.Collection collection12 = defaultedMap11.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 0L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Set set20 = defaultedMap11.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj6 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) predicate8);
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) predicate5, (java.lang.Object) b9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Map map3 = null;
        try {
            defaultedMap1.putAll(map3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        boolean b11 = defaultedMap1.isEmpty();
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object obj13 = null;
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj13);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        java.util.Set set28 = defaultedMap25.keySet();
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) set28);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (short) 10);
        boolean b13 = defaultedMap10.isEmpty();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) defaultedMap15);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap19.keySet();
        java.lang.String str21 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj23 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) predicate25);
        java.lang.Object obj27 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate29);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate17, predicate29);
        boolean b33 = defaultedMap5.containsKey((java.lang.Object) predicate17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) 10);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap18);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap18.equals(obj27);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a' + "'", obj21.equals('a'));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        boolean b11 = defaultedMap1.isEmpty();
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) set18);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 10);
        java.util.Collection collection26 = defaultedMap23.values();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap23);
        java.util.Map map28 = null;
        try {
            defaultedMap13.putAll(map28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) set18);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Set set25 = defaultedMap23.entrySet();
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) (short) 1);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap40);
        java.util.Set set42 = defaultedMap40.keySet();
        java.util.Set set43 = defaultedMap40.entrySet();
        java.lang.Object obj44 = defaultedMap29.remove((java.lang.Object) defaultedMap40);
        java.lang.Object obj45 = defaultedMap23.remove((java.lang.Object) defaultedMap40);
        int i46 = defaultedMap23.size();
        java.lang.Object obj47 = defaultedMap1.remove((java.lang.Object) i46);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 'a' + "'", obj27.equals('a'));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 1);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap18);
        java.util.Set set20 = defaultedMap18.keySet();
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj22 = defaultedMap7.remove((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        int i24 = defaultedMap1.size();
        collections.Predicate predicate25 = null;
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate25, predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) 10.0d);
        java.lang.Object obj36 = defaultedMap29.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set42 = defaultedMap41.keySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set45 = defaultedMap44.keySet();
        java.util.Set set46 = defaultedMap44.entrySet();
        boolean b47 = defaultedMap41.containsKey((java.lang.Object) set46);
        java.lang.Object obj48 = defaultedMap38.remove((java.lang.Object) defaultedMap41);
        boolean b49 = defaultedMap29.containsValue((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (short) 10);
        java.util.Collection collection54 = defaultedMap51.values();
        boolean b55 = defaultedMap41.equals((java.lang.Object) defaultedMap51);
        boolean b56 = defaultedMap1.equals((java.lang.Object) b55);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap9.keySet();
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        java.util.Set set15 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set21 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Set set25 = defaultedMap23.entrySet();
        boolean b26 = defaultedMap20.containsKey((java.lang.Object) set25);
        java.lang.Object obj27 = defaultedMap17.remove((java.lang.Object) defaultedMap20);
        boolean b28 = defaultedMap9.containsValue((java.lang.Object) defaultedMap20);
        boolean b29 = defaultedMap7.equals((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        defaultedMap6.putAll((java.util.Map) defaultedMap9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        java.util.Set set11 = defaultedMap5.keySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.entrySet();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) set6);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str8 = defaultedMap1.toString();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils19 = new collections.PredicateUtils();
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) predicateUtils19);
        boolean b22 = defaultedMap11.containsKey((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set28 = defaultedMap27.keySet();
        java.lang.Object obj30 = defaultedMap27.get((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) 10.0d);
        java.util.Set set33 = defaultedMap27.keySet();
        boolean b34 = defaultedMap24.containsKey((java.lang.Object) set33);
        boolean b35 = defaultedMap11.containsValue((java.lang.Object) b34);
        boolean b36 = defaultedMap1.equals((java.lang.Object) b34);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 'a' + "'", obj20.equals('a'));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Collection collection21 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (short) 10);
        java.lang.String str8 = defaultedMap5.toString();
        java.util.Set set9 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap5.remove((java.lang.Object) (-1.0d));
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set21 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Set set26 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Set set30 = defaultedMap28.entrySet();
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection32 = defaultedMap28.values();
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        java.util.Set set35 = defaultedMap28.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 10);
        java.util.Collection collection10 = defaultedMap7.values();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) collection10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) predicateUtils13);
        boolean b15 = defaultedMap5.isEmpty();
        java.util.Collection collection16 = defaultedMap5.values();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) predicateUtils13);
        boolean b15 = defaultedMap5.isEmpty();
        java.util.Collection collection16 = defaultedMap5.values();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) defaultedMap9);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) predicate16);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 'a' + "'", obj17.equals('a'));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) set18);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        java.util.Collection collection28 = defaultedMap25.values();
        boolean b30 = defaultedMap25.equals((java.lang.Object) 1.0d);
        boolean b31 = defaultedMap25.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap35.isEmpty();
        java.lang.Object obj39 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj41 = defaultedMap35.get((java.lang.Object) defaultedMap40);
        java.lang.String str42 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set45 = defaultedMap44.keySet();
        java.lang.Object obj47 = defaultedMap44.get((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) 10.0d);
        java.util.Set set50 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap52.clear();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set56 = defaultedMap55.keySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set59 = defaultedMap58.keySet();
        java.util.Set set60 = defaultedMap58.entrySet();
        boolean b61 = defaultedMap55.containsKey((java.lang.Object) set60);
        java.lang.Object obj62 = defaultedMap52.remove((java.lang.Object) defaultedMap55);
        boolean b63 = defaultedMap44.containsValue((java.lang.Object) defaultedMap55);
        java.util.Set set64 = defaultedMap44.entrySet();
        java.lang.Object obj65 = defaultedMap35.get((java.lang.Object) defaultedMap44);
        java.lang.Object obj66 = defaultedMap25.remove((java.lang.Object) defaultedMap35);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 'a' + "'", obj41.equals('a'));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 'a' + "'", obj47.equals('a'));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 'a' + "'", obj49.equals('a'));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 'a' + "'", obj65.equals('a'));
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) 10.0f);
        int i16 = defaultedMap1.size();
        java.util.Collection collection17 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap9.keySet();
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        java.util.Set set15 = defaultedMap9.keySet();
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) set15);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap23);
        java.lang.Object obj25 = defaultedMap6.remove((java.lang.Object) map24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (short) 10);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 10L);
        java.util.Set set32 = defaultedMap27.keySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) set32);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 10.0d);
        java.lang.Object obj14 = defaultedMap7.remove((java.lang.Object) 1.0d);
        java.util.Collection collection15 = defaultedMap7.values();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) collection15);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) set18);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (short) 10);
        java.util.Collection collection26 = defaultedMap23.values();
        boolean b27 = defaultedMap13.equals((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) 10.0d);
        java.lang.Object obj36 = defaultedMap29.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set40 = defaultedMap39.keySet();
        java.lang.Object obj42 = defaultedMap39.get((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) 10.0d);
        java.util.Set set45 = defaultedMap39.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set51 = defaultedMap50.keySet();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set54 = defaultedMap53.keySet();
        java.util.Set set55 = defaultedMap53.entrySet();
        boolean b56 = defaultedMap50.containsKey((java.lang.Object) set55);
        java.lang.Object obj57 = defaultedMap47.remove((java.lang.Object) defaultedMap50);
        boolean b58 = defaultedMap39.containsValue((java.lang.Object) defaultedMap50);
        java.util.Set set59 = defaultedMap39.entrySet();
        java.lang.Object obj60 = defaultedMap37.get((java.lang.Object) set59);
        java.lang.Object obj61 = defaultedMap13.remove(obj60);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 'a' + "'", obj36.equals('a'));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 'a' + "'", obj42.equals('a'));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 'a' + "'", obj44.equals('a'));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 'a' + "'", obj60.equals('a'));
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set21 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Set set26 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Set set30 = defaultedMap28.entrySet();
        defaultedMap24.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection32 = defaultedMap28.values();
        java.util.Collection collection33 = defaultedMap28.values();
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap36.isEmpty();
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) defaultedMap41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set46 = defaultedMap45.keySet();
        java.lang.String str47 = defaultedMap45.toString();
        defaultedMap45.clear();
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) predicate51);
        java.lang.Object obj53 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate55);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate55);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj61 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) predicate63);
        java.util.Collection collection65 = defaultedMap62.values();
        boolean b67 = defaultedMap62.equals((java.lang.Object) 1.0d);
        boolean b68 = defaultedMap62.isEmpty();
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        boolean b71 = defaultedMap62.containsKey((java.lang.Object) predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate55, predicate70);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 'a' + "'", obj42.equals('a'));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set21 = defaultedMap1.entrySet();
        java.util.Collection collection22 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        java.util.Collection collection6 = defaultedMap3.values();
        boolean b8 = defaultedMap3.equals((java.lang.Object) 1.0d);
        boolean b9 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Set set14 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.entrySet();
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Collection collection21 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 10.0d);
        boolean b25 = defaultedMap18.containsKey((java.lang.Object) 10);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap18);
        boolean b28 = defaultedMap12.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a' + "'", obj21.equals('a'));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 10.0d);
        java.util.Set set12 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set18 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set21 = defaultedMap20.keySet();
        java.util.Set set22 = defaultedMap20.entrySet();
        boolean b23 = defaultedMap17.containsKey((java.lang.Object) set22);
        java.lang.Object obj24 = defaultedMap14.remove((java.lang.Object) defaultedMap17);
        boolean b25 = defaultedMap6.containsValue((java.lang.Object) defaultedMap17);
        java.util.Collection collection26 = defaultedMap6.values();
        java.util.Set set27 = defaultedMap6.entrySet();
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj28 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        java.lang.String str35 = defaultedMap33.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 'a' + "'", obj28.equals('a'));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.String str24 = defaultedMap22.toString();
        defaultedMap22.clear();
        java.lang.Object obj26 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) predicate28);
        java.lang.Object obj30 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate32);
        boolean b35 = defaultedMap13.equals((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap7.isEmpty();
        java.lang.Object obj11 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap12);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 'a' + "'", obj13.equals('a'));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object obj29 = defaultedMap22.get(obj28);
        defaultedMap22.clear();
        java.lang.Object obj33 = defaultedMap22.put((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        java.util.Collection collection39 = defaultedMap36.values();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        collections.Factory factory41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 'a' + "'", obj27.equals('a'));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) predicate15);
        defaultedMap14.clear();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        java.lang.Object obj4 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        boolean b7 = defaultedMap5.containsKey((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap5.values();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) collection8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        java.util.Collection collection6 = defaultedMap3.values();
        boolean b8 = defaultedMap3.equals((java.lang.Object) 1.0d);
        boolean b9 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set21 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap28);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap24.get(obj30);
        int i32 = defaultedMap24.size();
        java.util.Set set33 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) defaultedMap36);
        boolean b44 = defaultedMap22.equals((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 'a' + "'", obj31.equals('a'));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) 10.0d);
        java.util.Set set22 = defaultedMap16.keySet();
        boolean b23 = defaultedMap13.containsKey((java.lang.Object) set22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap25);
        java.lang.Object obj30 = defaultedMap13.get((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = defaultedMap6.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj34 = defaultedMap6.get((java.lang.Object) (-1));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 'a' + "'", obj19.equals('a'));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a' + "'", obj21.equals('a'));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.String str13 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap19.keySet();
        java.lang.Object obj22 = defaultedMap19.get((java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) 10.0d);
        java.util.Set set25 = defaultedMap19.keySet();
        boolean b26 = defaultedMap16.containsKey((java.lang.Object) set25);
        defaultedMap11.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap33);
        java.lang.Object obj35 = defaultedMap16.remove((java.lang.Object) map34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj39 = defaultedMap1.remove((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 'a' + "'", obj22.equals('a'));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) 10);
        java.lang.Object obj21 = defaultedMap9.remove((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Set set13 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        java.util.Collection collection10 = defaultedMap1.values();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Set set10 = defaultedMap8.entrySet();
        defaultedMap4.putAll((java.util.Map) defaultedMap8);
        java.util.Collection collection12 = defaultedMap8.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set15 = defaultedMap14.keySet();
        java.lang.Object obj17 = defaultedMap14.get((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap14.get((java.lang.Object) 10.0d);
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) 0L);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 'a' + "'", obj17.equals('a'));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 'a' + "'", obj19.equals('a'));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a' + "'", obj21.equals('a'));
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object obj29 = defaultedMap22.get(obj28);
        defaultedMap22.clear();
        java.lang.Object obj33 = defaultedMap22.put((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        java.util.Collection collection39 = defaultedMap36.values();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) predicate45);
        java.util.Collection collection47 = defaultedMap44.values();
        boolean b49 = defaultedMap44.equals((java.lang.Object) 1.0d);
        boolean b50 = defaultedMap44.isEmpty();
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap44.containsKey((java.lang.Object) predicate52);
        java.lang.Object obj54 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) predicate56);
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set61 = defaultedMap60.keySet();
        java.lang.String str62 = defaultedMap60.toString();
        defaultedMap60.clear();
        java.lang.Object obj64 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) predicate66);
        java.lang.Object obj68 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set75 = defaultedMap74.keySet();
        java.lang.String str76 = defaultedMap74.toString();
        defaultedMap74.clear();
        java.lang.Object obj78 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        boolean b81 = defaultedMap79.containsKey((java.lang.Object) predicate80);
        java.lang.Object obj82 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap(obj82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        boolean b85 = defaultedMap83.containsKey((java.lang.Object) predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate80, predicate84);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate66, predicate80);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate52, predicate80);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) predicate80);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 'a' + "'", obj27.equals('a'));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.entrySet();
        boolean b19 = defaultedMap13.containsKey((java.lang.Object) set18);
        java.lang.Object obj20 = defaultedMap10.remove((java.lang.Object) defaultedMap13);
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        java.util.Collection collection28 = defaultedMap25.values();
        boolean b30 = defaultedMap25.equals((java.lang.Object) 1.0d);
        boolean b31 = defaultedMap25.isEmpty();
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap25);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate(map33, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 0L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set22 = defaultedMap21.keySet();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap21.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set34 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set37 = defaultedMap36.keySet();
        java.util.Set set38 = defaultedMap36.entrySet();
        boolean b39 = defaultedMap33.containsKey((java.lang.Object) set38);
        java.lang.Object obj40 = defaultedMap30.remove((java.lang.Object) defaultedMap33);
        boolean b41 = defaultedMap21.containsValue((java.lang.Object) defaultedMap33);
        defaultedMap5.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 'a' + "'", obj26.equals('a'));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.util.Set set9 = defaultedMap7.entrySet();
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) set9);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 10);
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj17 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) defaultedMap18);
        java.lang.String str20 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 10.0d);
        java.util.Set set28 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set34 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set37 = defaultedMap36.keySet();
        java.util.Set set38 = defaultedMap36.entrySet();
        boolean b39 = defaultedMap33.containsKey((java.lang.Object) set38);
        java.lang.Object obj40 = defaultedMap30.remove((java.lang.Object) defaultedMap33);
        boolean b41 = defaultedMap22.containsValue((java.lang.Object) defaultedMap33);
        java.util.Set set42 = defaultedMap22.entrySet();
        java.lang.Object obj43 = defaultedMap13.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj44 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) predicate46);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj49 = defaultedMap22.get((java.lang.Object) defaultedMap45);
        boolean b50 = defaultedMap22.isEmpty();
        java.lang.Object obj51 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 'a' + "'", obj19.equals('a'));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 'a' + "'", obj27.equals('a'));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 'a' + "'", obj43.equals('a'));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 'a' + "'", obj49.equals('a'));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 'a' + "'", obj51.equals('a'));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 10.0d);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = defaultedMap7.get(obj13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.String str18 = defaultedMap16.toString();
        defaultedMap16.clear();
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) predicate22);
        java.lang.Object obj24 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate22, predicate26);
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) map28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap31.clear();
        boolean b33 = defaultedMap7.containsValue((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (short) 10);
        boolean b38 = defaultedMap35.isEmpty();
        java.lang.Object obj39 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj41 = defaultedMap35.get((java.lang.Object) defaultedMap40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set45 = defaultedMap44.keySet();
        java.lang.String str46 = defaultedMap44.toString();
        defaultedMap44.clear();
        java.lang.Object obj48 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) predicate50);
        java.lang.Object obj52 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate50, predicate54);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate54);
        boolean b58 = defaultedMap7.containsKey((java.lang.Object) predicate42);
        boolean b59 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 'a' + "'", obj41.equals('a'));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 1.0d);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str8 = defaultedMap1.toString();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b9 = defaultedMap5.isEmpty();
        java.util.Set set10 = defaultedMap5.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set27 = defaultedMap26.keySet();
        java.lang.Object obj29 = defaultedMap26.get((java.lang.Object) (short) 1);
        int i30 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate42);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate42, predicate45);
        java.util.Map map48 = collections.map.PredicatedMap.decorate(map22, predicate24, predicate45);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Set set21 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set21);
        defaultedMap22.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap5.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap13);
        java.util.Collection collection21 = defaultedMap11.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = defaultedMap11.get(obj17);
        defaultedMap11.clear();
        java.util.Collection collection20 = defaultedMap11.values();
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) collection20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap25.clear();
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap1.remove(obj28);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "{}");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap3.keySet();
        java.lang.Object obj6 = defaultedMap3.get((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) 10.0d);
        java.util.Set set9 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set15 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set18 = defaultedMap17.keySet();
        java.util.Set set19 = defaultedMap17.entrySet();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) set19);
        java.lang.Object obj21 = defaultedMap11.remove((java.lang.Object) defaultedMap14);
        boolean b22 = defaultedMap3.containsValue((java.lang.Object) defaultedMap14);
        java.util.Collection collection23 = defaultedMap3.values();
        java.util.Set set24 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap26.get(obj32);
        int i34 = defaultedMap26.size();
        java.util.Set set35 = defaultedMap26.keySet();
        java.util.Collection collection36 = defaultedMap26.values();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap26);
        boolean b38 = defaultedMap1.equals((java.lang.Object) map37);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 'a' + "'", obj33.equals('a'));
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        boolean b18 = defaultedMap12.containsKey((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap9.remove((java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        java.util.Collection collection21 = defaultedMap1.values();
        java.util.Set set22 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (short) 10);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 10L);
        boolean b29 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (short) 10);
        boolean b34 = defaultedMap31.isEmpty();
        java.lang.Object obj35 = defaultedMap24.get((java.lang.Object) b34);
        java.lang.Object obj36 = defaultedMap1.get(obj35);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 'a' + "'", obj35.equals('a'));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 'a' + "'", obj36.equals('a'));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) 10.0d);
        java.lang.Object obj13 = defaultedMap6.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set22 = defaultedMap21.keySet();
        java.util.Set set23 = defaultedMap21.entrySet();
        boolean b24 = defaultedMap18.containsKey((java.lang.Object) set23);
        java.lang.Object obj25 = defaultedMap15.remove((java.lang.Object) defaultedMap18);
        boolean b26 = defaultedMap6.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap30.values();
        boolean b35 = defaultedMap30.equals((java.lang.Object) 1.0d);
        boolean b36 = defaultedMap30.isEmpty();
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap30);
        boolean b39 = defaultedMap1.equals((java.lang.Object) defaultedMap18);
        defaultedMap18.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj28 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        boolean b39 = defaultedMap36.isEmpty();
        java.lang.Object obj40 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) defaultedMap41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set46 = defaultedMap45.keySet();
        java.lang.String str47 = defaultedMap45.toString();
        defaultedMap45.clear();
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        boolean b52 = defaultedMap50.containsKey((java.lang.Object) predicate51);
        java.lang.Object obj53 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate51, predicate55);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate55);
        java.util.Set set59 = defaultedMap41.entrySet();
        boolean b60 = defaultedMap33.equals((java.lang.Object) defaultedMap41);
        boolean b61 = defaultedMap33.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 'a' + "'", obj28.equals('a'));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 'a' + "'", obj42.equals('a'));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b8 = defaultedMap1.isEmpty();
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap12);
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.entrySet();
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 10.0d);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap18.get(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set28 = defaultedMap27.keySet();
        java.lang.String str29 = defaultedMap27.toString();
        defaultedMap27.clear();
        java.lang.Object obj31 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) predicate33);
        java.lang.Object obj35 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate37);
        java.lang.Object obj40 = defaultedMap18.get((java.lang.Object) map39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap42.clear();
        boolean b44 = defaultedMap18.containsValue((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (short) 10);
        boolean b49 = defaultedMap46.isEmpty();
        java.lang.Object obj50 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj52 = defaultedMap46.get((java.lang.Object) defaultedMap51);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set56 = defaultedMap55.keySet();
        java.lang.String str57 = defaultedMap55.toString();
        defaultedMap55.clear();
        java.lang.Object obj59 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) predicate61);
        java.lang.Object obj63 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate61, predicate65);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate53, predicate65);
        boolean b69 = defaultedMap18.containsKey((java.lang.Object) predicate53);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate53, predicate70);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a' + "'", obj21.equals('a'));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 'a' + "'", obj40.equals('a'));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 'a' + "'", obj52.equals('a'));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b13 = defaultedMap12.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object obj29 = defaultedMap22.get(obj28);
        defaultedMap22.clear();
        java.lang.Object obj33 = defaultedMap22.put((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        java.util.Collection collection39 = defaultedMap36.values();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        boolean b46 = defaultedMap44.containsKey((java.lang.Object) predicate45);
        java.util.Collection collection47 = defaultedMap44.values();
        boolean b49 = defaultedMap44.equals((java.lang.Object) 1.0d);
        boolean b50 = defaultedMap44.isEmpty();
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap44.containsKey((java.lang.Object) predicate52);
        java.lang.Object obj54 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) predicate56);
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set61 = defaultedMap60.keySet();
        java.lang.String str62 = defaultedMap60.toString();
        defaultedMap60.clear();
        java.lang.Object obj64 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) predicate66);
        java.lang.Object obj68 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set75 = defaultedMap74.keySet();
        java.lang.String str76 = defaultedMap74.toString();
        defaultedMap74.clear();
        java.lang.Object obj78 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        boolean b81 = defaultedMap79.containsKey((java.lang.Object) predicate80);
        java.lang.Object obj82 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap(obj82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        boolean b85 = defaultedMap83.containsKey((java.lang.Object) predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate80, predicate84);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate66, predicate80);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate52, predicate80);
        java.util.Set set89 = defaultedMap36.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 'a' + "'", obj27.equals('a'));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(set89);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap9.keySet();
        java.lang.String str11 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        java.util.Set set19 = defaultedMap13.keySet();
        java.lang.Object obj20 = defaultedMap9.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 1);
        int i26 = defaultedMap22.size();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set30 = defaultedMap29.keySet();
        java.lang.Object obj32 = defaultedMap29.get((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) 10.0d);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap29.get(obj35);
        defaultedMap29.clear();
        java.util.Set set38 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set41 = defaultedMap40.keySet();
        java.lang.Object obj43 = defaultedMap40.get((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap40.get((java.lang.Object) 10.0d);
        java.lang.Object obj46 = defaultedMap22.put((java.lang.Object) set38, obj45);
        boolean b47 = defaultedMap1.containsValue(obj46);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 'a' + "'", obj36.equals('a'));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 'a' + "'", obj43.equals('a'));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 'a' + "'", obj45.equals('a'));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.entrySet();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) set6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap15);
        java.lang.Object obj17 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate19, predicate21);
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) map23);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.String str20 = defaultedMap18.toString();
        defaultedMap18.clear();
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        boolean b34 = defaultedMap14.containsValue((java.lang.Object) (-1));
        boolean b35 = defaultedMap1.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (short) 10);
        java.lang.String str40 = defaultedMap37.toString();
        java.util.Set set41 = defaultedMap37.entrySet();
        java.lang.Object obj43 = defaultedMap37.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (short) 10);
        boolean b48 = defaultedMap45.isEmpty();
        java.lang.Object obj49 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj51 = defaultedMap45.get((java.lang.Object) defaultedMap50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set55 = defaultedMap54.keySet();
        java.lang.String str56 = defaultedMap54.toString();
        defaultedMap54.clear();
        java.lang.Object obj58 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) predicate60);
        java.lang.Object obj62 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate60, predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate52, predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap50);
        boolean b70 = defaultedMap50.containsValue((java.lang.Object) (-1));
        boolean b71 = defaultedMap37.equals((java.lang.Object) defaultedMap50);
        boolean b72 = defaultedMap1.containsValue((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 'a' + "'", obj15.equals('a'));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 'a' + "'", obj51.equals('a'));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap25.clear();
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        java.lang.String str28 = defaultedMap25.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        java.util.Set set14 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.Object obj8 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.lang.Object obj11 = defaultedMap6.get((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set14 = defaultedMap13.keySet();
        java.lang.Object obj16 = defaultedMap13.get((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap13.get((java.lang.Object) 10.0d);
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) 10);
        java.lang.String str21 = defaultedMap13.toString();
        boolean b22 = defaultedMap6.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (short) 10);
        boolean b27 = defaultedMap24.isEmpty();
        java.lang.Object obj28 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) defaultedMap29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.String str35 = defaultedMap33.toString();
        defaultedMap33.clear();
        java.lang.Object obj37 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) predicate39);
        java.lang.Object obj41 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate39, predicate43);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate31, predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set50 = defaultedMap49.keySet();
        java.lang.String str51 = defaultedMap49.toString();
        defaultedMap49.clear();
        java.lang.Object obj53 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        boolean b56 = defaultedMap54.containsKey((java.lang.Object) predicate55);
        java.lang.Object obj57 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate59);
        java.lang.Object obj62 = defaultedMap29.get((java.lang.Object) map61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set65 = defaultedMap64.keySet();
        java.lang.Object obj67 = defaultedMap64.get((java.lang.Object) (short) 1);
        boolean b68 = defaultedMap64.isEmpty();
        java.lang.Object obj69 = defaultedMap6.put((java.lang.Object) defaultedMap29, (java.lang.Object) defaultedMap64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 'a' + "'", obj67.equals('a'));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj2 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) predicate4);
        java.util.Collection collection6 = defaultedMap3.values();
        boolean b8 = defaultedMap3.equals((java.lang.Object) 1.0d);
        boolean b9 = defaultedMap3.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap3.containsKey((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) b12);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.entrySet();
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) set6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0L);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (short) 10);
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.String str20 = defaultedMap18.toString();
        defaultedMap18.clear();
        java.lang.Object obj22 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) predicate24);
        java.lang.Object obj26 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate24, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        java.lang.Object obj33 = defaultedMap1.remove((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 'a' + "'", obj15.equals('a'));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) predicate7);
        java.lang.Object obj9 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate11);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.Predicate predicate0 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) collection2);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        boolean b11 = defaultedMap1.isEmpty();
        java.util.Collection collection12 = defaultedMap1.values();
        java.util.Collection collection13 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.util.Set set17 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap25.keySet();
        java.util.Set set27 = defaultedMap25.entrySet();
        boolean b28 = defaultedMap22.containsKey((java.lang.Object) set27);
        java.lang.Object obj29 = defaultedMap19.remove((java.lang.Object) defaultedMap22);
        boolean b30 = defaultedMap11.containsValue((java.lang.Object) defaultedMap22);
        java.util.Set set31 = defaultedMap11.entrySet();
        java.lang.Object obj32 = defaultedMap9.get((java.lang.Object) set31);
        java.util.Set set33 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set36 = defaultedMap35.keySet();
        java.lang.Object obj38 = defaultedMap35.get((java.lang.Object) (short) 1);
        int i39 = defaultedMap35.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) defaultedMap45);
        java.lang.Object obj47 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate51, predicate54);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap35);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 'a' + "'", obj38.equals('a'));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        boolean b15 = defaultedMap8.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils16 = new collections.PredicateUtils();
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) predicateUtils16);
        boolean b18 = defaultedMap8.isEmpty();
        java.util.Collection collection19 = defaultedMap8.values();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (short) 10);
        boolean b25 = defaultedMap1.containsValue(obj24);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 'a' + "'", obj13.equals('a'));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 'a' + "'", obj17.equals('a'));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set27 = defaultedMap26.keySet();
        java.lang.String str28 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj30 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) predicate32);
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate36);
        java.lang.Object obj39 = defaultedMap6.get((java.lang.Object) map38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set42 = defaultedMap41.keySet();
        java.lang.Object obj44 = defaultedMap41.get((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) 10.0d);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = defaultedMap41.get(obj47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set51 = defaultedMap50.keySet();
        java.lang.String str52 = defaultedMap50.toString();
        defaultedMap50.clear();
        java.lang.Object obj54 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) predicate56);
        java.lang.Object obj58 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate56, predicate60);
        java.lang.Object obj63 = defaultedMap41.get((java.lang.Object) map62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set66 = defaultedMap65.keySet();
        java.lang.Object obj68 = defaultedMap65.get((java.lang.Object) (short) 1);
        java.lang.Object obj70 = defaultedMap65.get((java.lang.Object) 10.0d);
        java.lang.Object obj72 = defaultedMap65.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        boolean b74 = defaultedMap41.equals((java.lang.Object) defaultedMap73);
        boolean b75 = defaultedMap6.containsValue((java.lang.Object) defaultedMap73);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 'a' + "'", obj44.equals('a'));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 'a' + "'", obj46.equals('a'));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 'a' + "'", obj48.equals('a'));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 'a' + "'", obj63.equals('a'));
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 'a' + "'", obj68.equals('a'));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 'a' + "'", obj70.equals('a'));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 'a' + "'", obj72.equals('a'));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap5.get((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap5.get((java.lang.Object) 10.0d);
        java.util.Set set11 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set17 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap19.keySet();
        java.util.Set set21 = defaultedMap19.entrySet();
        boolean b22 = defaultedMap16.containsKey((java.lang.Object) set21);
        java.lang.Object obj23 = defaultedMap13.remove((java.lang.Object) defaultedMap16);
        boolean b24 = defaultedMap5.containsValue((java.lang.Object) defaultedMap16);
        java.util.Collection collection25 = defaultedMap5.values();
        java.util.Set set26 = defaultedMap5.entrySet();
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        defaultedMap1.clear();
        java.util.Collection collection29 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        java.lang.Object obj7 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        boolean b14 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj28 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 10.0d);
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set37 = defaultedMap36.keySet();
        java.lang.Object obj39 = defaultedMap36.get((java.lang.Object) (short) 1);
        boolean b41 = defaultedMap36.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) defaultedMap47);
        java.util.Set set49 = defaultedMap47.keySet();
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj51 = defaultedMap36.remove((java.lang.Object) defaultedMap47);
        java.util.Set set52 = defaultedMap36.entrySet();
        java.lang.Object obj53 = defaultedMap1.remove((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 'a' + "'", obj28.equals('a'));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 'a' + "'", obj32.equals('a'));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 'a' + "'", obj39.equals('a'));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        java.lang.Object obj7 = defaultedMap4.get((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap4.get((java.lang.Object) 10.0d);
        java.util.Set set10 = defaultedMap4.keySet();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) set10);
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) predicate14);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Set set19 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set22 = defaultedMap21.keySet();
        java.lang.String str23 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap25.keySet();
        java.lang.Object obj28 = defaultedMap25.get((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 10.0d);
        java.util.Set set31 = defaultedMap25.keySet();
        java.lang.Object obj32 = defaultedMap21.remove((java.lang.Object) defaultedMap25);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 'a' + "'", obj28.equals('a'));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 'a' + "'", obj30.equals('a'));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 'a' + "'", obj33.equals('a'));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str8 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 10.0d);
        java.util.Set set16 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set22 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Set set26 = defaultedMap24.entrySet();
        boolean b27 = defaultedMap21.containsKey((java.lang.Object) set26);
        java.lang.Object obj28 = defaultedMap18.remove((java.lang.Object) defaultedMap21);
        boolean b29 = defaultedMap10.containsValue((java.lang.Object) defaultedMap21);
        java.util.Set set30 = defaultedMap10.entrySet();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (short) 10);
        java.lang.String str36 = defaultedMap33.toString();
        java.util.Set set37 = defaultedMap33.keySet();
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) defaultedMap33, (java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (short) 10);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set48 = defaultedMap47.keySet();
        java.lang.Object obj50 = defaultedMap47.get((java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) 10.0d);
        java.lang.Object obj54 = defaultedMap47.remove((java.lang.Object) 1.0d);
        java.util.Collection collection55 = defaultedMap47.values();
        java.lang.Object obj56 = defaultedMap41.remove((java.lang.Object) collection55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set59 = defaultedMap58.keySet();
        java.lang.Object obj61 = defaultedMap58.get((java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap58.get((java.lang.Object) 10.0d);
        boolean b65 = defaultedMap58.containsKey((java.lang.Object) 10);
        java.lang.Object obj66 = defaultedMap33.put((java.lang.Object) defaultedMap41, (java.lang.Object) b65);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a' + "'", obj7.equals('a'));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 'a' + "'", obj13.equals('a'));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 'a' + "'", obj15.equals('a'));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 'a' + "'", obj31.equals('a'));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 'a' + "'", obj50.equals('a'));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 'a' + "'", obj52.equals('a'));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 'a' + "'", obj61.equals('a'));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 'a' + "'", obj63.equals('a'));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        java.lang.String str9 = defaultedMap1.toString();
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection9 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 0L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set22 = defaultedMap21.keySet();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap21.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap30.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set34 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set37 = defaultedMap36.keySet();
        java.util.Set set38 = defaultedMap36.entrySet();
        boolean b39 = defaultedMap33.containsKey((java.lang.Object) set38);
        java.lang.Object obj40 = defaultedMap30.remove((java.lang.Object) defaultedMap33);
        boolean b41 = defaultedMap21.containsValue((java.lang.Object) defaultedMap33);
        defaultedMap5.putAll((java.util.Map) defaultedMap33);
        int i43 = defaultedMap33.size();
        java.util.Set set44 = defaultedMap33.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 'a' + "'", obj26.equals('a'));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 1);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap18);
        java.util.Set set20 = defaultedMap18.keySet();
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj22 = defaultedMap7.remove((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 10);
        java.lang.String str28 = defaultedMap25.toString();
        java.util.Set set29 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set32 = defaultedMap31.keySet();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) 10.0d);
        boolean b38 = defaultedMap31.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils39 = new collections.PredicateUtils();
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) predicateUtils39);
        java.lang.Object obj41 = defaultedMap25.get((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set44 = defaultedMap43.keySet();
        java.lang.String str45 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set48 = defaultedMap47.keySet();
        java.lang.Object obj50 = defaultedMap47.get((java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) 10.0d);
        java.util.Set set53 = defaultedMap47.keySet();
        java.lang.Object obj54 = defaultedMap43.remove((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set57 = defaultedMap56.keySet();
        java.lang.Object obj59 = defaultedMap56.get((java.lang.Object) (short) 1);
        int i60 = defaultedMap56.size();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) defaultedMap56);
        boolean b62 = defaultedMap31.equals((java.lang.Object) map61);
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 'a' + "'", obj36.equals('a'));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 'a' + "'", obj40.equals('a'));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 'a' + "'", obj41.equals('a'));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 'a' + "'", obj50.equals('a'));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 'a' + "'", obj52.equals('a'));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 'a' + "'", obj59.equals('a'));
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.String str12 = defaultedMap10.toString();
        defaultedMap10.clear();
        java.lang.Object obj14 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) predicate16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (short) 10);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        java.lang.String str31 = defaultedMap1.toString();
        java.util.Set set32 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (short) 10);
        java.util.Collection collection37 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set40 = defaultedMap39.keySet();
        java.lang.Object obj42 = defaultedMap39.get((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) 10.0d);
        java.lang.Object obj46 = defaultedMap39.remove((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set52 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set55 = defaultedMap54.keySet();
        java.util.Set set56 = defaultedMap54.entrySet();
        boolean b57 = defaultedMap51.containsKey((java.lang.Object) set56);
        java.lang.Object obj58 = defaultedMap48.remove((java.lang.Object) defaultedMap51);
        boolean b59 = defaultedMap39.containsValue((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
        java.lang.Object obj62 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) predicate64);
        java.util.Collection collection66 = defaultedMap63.values();
        boolean b68 = defaultedMap63.equals((java.lang.Object) 1.0d);
        boolean b69 = defaultedMap63.isEmpty();
        defaultedMap61.putAll((java.util.Map) defaultedMap63);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) defaultedMap63);
        boolean b72 = defaultedMap34.equals((java.lang.Object) defaultedMap51);
        java.util.Map map73 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b72);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 'a' + "'", obj23.equals('a'));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 'a' + "'", obj42.equals('a'));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 'a' + "'", obj44.equals('a'));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicateUtils9);
        boolean b11 = defaultedMap1.isEmpty();
        java.util.Collection collection12 = defaultedMap1.values();
        boolean b13 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10);
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        boolean b18 = defaultedMap11.containsKey((java.lang.Object) 10);
        java.util.Collection collection19 = defaultedMap11.values();
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) collection19);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 10.0d);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = defaultedMap1.get(obj7);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap11.get((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 10.0d);
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        boolean b20 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object obj29 = defaultedMap22.get(obj28);
        defaultedMap22.clear();
        java.lang.Object obj33 = defaultedMap22.put((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (short) 10);
        java.util.Collection collection39 = defaultedMap36.values();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) defaultedMap36);
        java.util.Set set41 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 'a' + "'", obj4.equals('a'));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a' + "'", obj6.equals('a'));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 'a' + "'", obj8.equals('a'));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 'a' + "'", obj16.equals('a'));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 'a' + "'", obj18.equals('a'));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 'a' + "'", obj27.equals('a'));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Set set10 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Set set14 = defaultedMap12.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.util.Collection collection16 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.String str20 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj25 = defaultedMap22.get((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap22.get((java.lang.Object) 10.0d);
        java.util.Set set28 = defaultedMap22.keySet();
        java.lang.Object obj29 = defaultedMap18.remove((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set32 = defaultedMap31.keySet();
        java.lang.Object obj34 = defaultedMap31.get((java.lang.Object) (short) 1);
        int i35 = defaultedMap31.size();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set39 = defaultedMap38.keySet();
        java.lang.Object obj41 = defaultedMap38.get((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) 10.0d);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object obj45 = defaultedMap38.get(obj44);
        defaultedMap38.clear();
        java.util.Set set47 = defaultedMap38.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set50 = defaultedMap49.keySet();
        java.lang.Object obj52 = defaultedMap49.get((java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap49.get((java.lang.Object) 10.0d);
        java.lang.Object obj55 = defaultedMap31.put((java.lang.Object) set47, obj54);
        boolean b56 = defaultedMap12.containsValue((java.lang.Object) set47);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) defaultedMap62);
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap58.get(obj64);
        java.lang.Object obj66 = defaultedMap1.put((java.lang.Object) b56, obj64);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 'a' + "'", obj25.equals('a'));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 'a' + "'", obj27.equals('a'));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 'a' + "'", obj34.equals('a'));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 'a' + "'", obj41.equals('a'));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 'a' + "'", obj43.equals('a'));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 'a' + "'", obj45.equals('a'));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 'a' + "'", obj52.equals('a'));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 'a' + "'", obj54.equals('a'));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 'a' + "'", obj65.equals('a'));
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap9.keySet();
        java.lang.Object obj12 = defaultedMap9.get((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 10.0d);
        java.util.Set set15 = defaultedMap9.keySet();
        boolean b16 = defaultedMap6.containsKey((java.lang.Object) set15);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap23);
        java.lang.Object obj25 = defaultedMap6.remove((java.lang.Object) map24);
        java.util.Set set26 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) 10.0d);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Object obj35 = defaultedMap28.get(obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set38 = defaultedMap37.keySet();
        java.lang.String str39 = defaultedMap37.toString();
        defaultedMap37.clear();
        java.lang.Object obj41 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) predicate43);
        java.lang.Object obj45 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate47);
        java.lang.Object obj50 = defaultedMap28.get((java.lang.Object) map49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) (short) 10);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) 10L);
        defaultedMap28.putAll((java.util.Map) defaultedMap52);
        java.lang.String str58 = defaultedMap28.toString();
        boolean b59 = defaultedMap6.containsKey((java.lang.Object) str58);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 'a' + "'", obj31.equals('a'));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 'a' + "'", obj33.equals('a'));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 'a' + "'", obj35.equals('a'));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 'a' + "'", obj50.equals('a'));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 1);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap18);
        java.util.Set set20 = defaultedMap18.keySet();
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj22 = defaultedMap7.remove((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap24.equals(obj25);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 10.0d);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set20 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.entrySet();
        boolean b25 = defaultedMap19.containsKey((java.lang.Object) set24);
        java.lang.Object obj26 = defaultedMap16.remove((java.lang.Object) defaultedMap19);
        boolean b27 = defaultedMap8.containsValue((java.lang.Object) defaultedMap19);
        java.util.Collection collection28 = defaultedMap8.values();
        java.util.Set set29 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) defaultedMap35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap31.get(obj37);
        int i39 = defaultedMap31.size();
        java.util.Set set40 = defaultedMap31.keySet();
        java.util.Collection collection41 = defaultedMap31.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap31);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 'a' + "'", obj11.equals('a'));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 'a' + "'", obj13.equals('a'));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 'a' + "'", obj38.equals('a'));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) 10);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.String str10 = defaultedMap8.toString();
        defaultedMap8.clear();
        java.lang.Object obj12 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) predicate14);
        java.lang.Object obj16 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate18);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) map20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) map20);
        java.util.Set set23 = defaultedMap22.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 'a' + "'", obj21.equals('a'));
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set5 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.util.Set set9 = defaultedMap7.entrySet();
        boolean b10 = defaultedMap4.containsKey((java.lang.Object) set9);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap4);
        defaultedMap4.clear();
        boolean b13 = defaultedMap4.isEmpty();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.String str3 = defaultedMap1.toString();
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj10 = defaultedMap7.get((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 10.0d);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = defaultedMap7.get(obj13);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap17.get((java.lang.Object) 10.0d);
        java.lang.Object obj24 = defaultedMap17.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        boolean b26 = defaultedMap7.equals(obj24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj31 = defaultedMap28.get((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) 10.0d);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Object obj35 = defaultedMap28.get(obj34);
        defaultedMap28.clear();
        java.lang.Object obj39 = defaultedMap28.put((java.lang.Object) (byte) -1, (java.lang.Object) (-1.0f));
        java.lang.Object obj40 = defaultedMap7.get((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (short) 10);
        java.util.Collection collection45 = defaultedMap42.values();
        boolean b46 = defaultedMap7.containsValue((java.lang.Object) defaultedMap42);
        boolean b47 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.util.Collection collection48 = defaultedMap7.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a' + "'", obj10.equals('a'));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 'a' + "'", obj14.equals('a'));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 'a' + "'", obj20.equals('a'));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 'a' + "'", obj22.equals('a'));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 'a' + "'", obj31.equals('a'));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 'a' + "'", obj33.equals('a'));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 'a' + "'", obj35.equals('a'));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 'a' + "'", obj40.equals('a'));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Set set10 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Set set14 = defaultedMap12.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap12);
        java.util.Collection collection16 = defaultedMap12.values();
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) defaultedMap12);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj20 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) predicate22);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set27 = defaultedMap26.keySet();
        java.lang.String str28 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj30 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) predicate32);
        java.lang.Object obj34 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set41 = defaultedMap40.keySet();
        java.lang.String str42 = defaultedMap40.toString();
        defaultedMap40.clear();
        java.lang.Object obj44 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) predicate46);
        java.lang.Object obj48 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate46, predicate50);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate32, predicate46);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate32);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) predicate2);
        boolean b4 = defaultedMap1.isEmpty();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 10.0d);
        java.util.Set set16 = defaultedMap10.keySet();
        boolean b17 = defaultedMap7.containsKey((java.lang.Object) set16);
        java.lang.Object obj18 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) predicate20);
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.lang.Object obj24 = defaultedMap7.get((java.lang.Object) defaultedMap19);
        java.util.Set set25 = defaultedMap7.keySet();
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) set25);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 'a' + "'", obj13.equals('a'));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 'a' + "'", obj15.equals('a'));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 'a' + "'", obj24.equals('a'));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
    }
}

