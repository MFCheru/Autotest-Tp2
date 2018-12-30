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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.equals((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 100, obj5);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) predicate4);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) "{}");
        boolean b9 = defaultedMap1.containsKey(obj8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        boolean b15 = defaultedMap1.isEmpty();
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.util.Set set4 = defaultedMap3.keySet();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) map9);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map9, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap1.toString();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "hi!");
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj16 = defaultedMap8.remove((java.lang.Object) 100L);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap1.equals(obj15);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.util.Set set4 = defaultedMap3.keySet();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) map9);
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b2 = defaultedMap1.isEmpty();
        int i3 = defaultedMap1.size();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        java.util.Collection collection11 = defaultedMap9.values();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) collection11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b15 = defaultedMap1.equals((java.lang.Object) 10.0d);
        java.util.Set set16 = defaultedMap1.entrySet();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.util.Set set20 = defaultedMap19.keySet();
        java.util.Collection collection21 = defaultedMap19.values();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj24 = defaultedMap19.get((java.lang.Object) predicate22);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate25, predicate26);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) map28);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Collection collection8 = defaultedMap5.values();
        boolean b10 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object obj21 = defaultedMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) '#');
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        boolean b28 = defaultedMap26.equals((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap26.entrySet();
        boolean b30 = defaultedMap5.containsValue((java.lang.Object) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        boolean b32 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b7 = defaultedMap5.equals((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) b7, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) b7);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap1.containsValue(obj15);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) "{}");
        boolean b9 = defaultedMap1.containsKey(obj8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        boolean b13 = defaultedMap11.equals((java.lang.Object) 'a');
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        boolean b17 = defaultedMap15.equals((java.lang.Object) 'a');
        java.lang.Object obj19 = defaultedMap11.put((java.lang.Object) b17, (java.lang.Object) 100.0f);
        java.util.Set set20 = defaultedMap11.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Collection collection24 = defaultedMap22.values();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 100, obj26);
        java.lang.Object obj28 = defaultedMap11.get((java.lang.Object) defaultedMap22);
        boolean b29 = defaultedMap1.equals(obj28);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        java.util.Collection collection4 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b7 = defaultedMap5.equals((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) b7, (java.lang.Object) 100.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) (-1));
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.util.Set set8 = defaultedMap7.keySet();
        boolean b9 = defaultedMap7.isEmpty();
        java.util.Collection collection10 = defaultedMap7.values();
        boolean b12 = defaultedMap7.equals((java.lang.Object) 100.0d);
        java.util.Set set13 = defaultedMap7.entrySet();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.util.Set set16 = defaultedMap15.keySet();
        boolean b17 = defaultedMap15.isEmpty();
        java.util.Collection collection18 = defaultedMap15.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap15);
        boolean b21 = defaultedMap7.equals((java.lang.Object) 10.0d);
        java.util.Set set22 = defaultedMap7.entrySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) '#');
        defaultedMap1.putAll(map24);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 0);
        java.util.Collection collection19 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Set set15 = defaultedMap8.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.util.Set set18 = defaultedMap17.keySet();
        boolean b19 = defaultedMap17.isEmpty();
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b22 = defaultedMap17.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b26 = defaultedMap24.isEmpty();
        java.util.Collection collection27 = defaultedMap24.values();
        boolean b29 = defaultedMap24.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) defaultedMap24);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 'a');
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        boolean b38 = defaultedMap36.equals((java.lang.Object) 'a');
        java.lang.Object obj40 = defaultedMap32.put((java.lang.Object) b38, (java.lang.Object) 100.0f);
        java.util.Set set41 = defaultedMap32.keySet();
        boolean b42 = defaultedMap24.equals((java.lang.Object) set41);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Set set45 = defaultedMap44.keySet();
        boolean b46 = defaultedMap44.isEmpty();
        java.util.Collection collection47 = defaultedMap44.values();
        boolean b49 = defaultedMap44.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        java.util.Set set52 = defaultedMap51.keySet();
        boolean b53 = defaultedMap51.isEmpty();
        java.util.Collection collection54 = defaultedMap51.values();
        boolean b56 = defaultedMap51.equals((java.lang.Object) 10L);
        java.lang.Object obj57 = defaultedMap44.get((java.lang.Object) defaultedMap51);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        java.util.Set set60 = defaultedMap59.keySet();
        boolean b61 = defaultedMap59.isEmpty();
        java.util.Collection collection62 = defaultedMap59.values();
        boolean b64 = defaultedMap59.equals((java.lang.Object) 100.0d);
        java.util.Set set65 = defaultedMap59.entrySet();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        java.util.Set set68 = defaultedMap67.keySet();
        boolean b69 = defaultedMap67.isEmpty();
        java.util.Collection collection70 = defaultedMap67.values();
        defaultedMap59.putAll((java.util.Map) defaultedMap67);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) defaultedMap59);
        java.lang.Object obj73 = defaultedMap8.put((java.lang.Object) set41, (java.lang.Object) defaultedMap59);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) predicate26);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b30 = defaultedMap16.isEmpty();
        java.util.Collection collection31 = defaultedMap16.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b14 = defaultedMap12.isEmpty();
        java.util.Collection collection15 = defaultedMap12.values();
        boolean b17 = defaultedMap12.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b21 = defaultedMap19.isEmpty();
        java.util.Collection collection22 = defaultedMap19.values();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 10L);
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) defaultedMap19);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        java.util.Set set28 = defaultedMap27.keySet();
        boolean b29 = defaultedMap27.isEmpty();
        java.util.Collection collection30 = defaultedMap27.values();
        boolean b32 = defaultedMap27.equals((java.lang.Object) 100.0d);
        java.util.Set set33 = defaultedMap27.entrySet();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.util.Set set36 = defaultedMap35.keySet();
        boolean b37 = defaultedMap35.isEmpty();
        java.util.Collection collection38 = defaultedMap35.values();
        defaultedMap27.putAll((java.util.Map) defaultedMap35);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap27);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.util.Set set43 = defaultedMap42.keySet();
        java.util.Collection collection44 = defaultedMap42.values();
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) 'a');
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 'a');
        java.util.Set set51 = defaultedMap48.entrySet();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) "{}");
        java.lang.Object obj56 = defaultedMap42.put((java.lang.Object) set51, obj55);
        java.lang.Object obj57 = defaultedMap1.put((java.lang.Object) defaultedMap19, obj55);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap1.containsValue(obj8);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        boolean b43 = defaultedMap6.containsKey((java.lang.Object) defaultedMap37);
        boolean b44 = defaultedMap37.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) predicate45);
        java.util.Set set47 = defaultedMap37.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        boolean b43 = defaultedMap6.containsKey((java.lang.Object) defaultedMap37);
        boolean b44 = defaultedMap37.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) predicate45);
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.util.Set set4 = defaultedMap3.keySet();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) map9);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = null;
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate14);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) predicate13, obj16);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) "{}");
        boolean b9 = defaultedMap1.containsKey(obj8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Collection collection14 = defaultedMap12.values();
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 'a');
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        boolean b20 = defaultedMap18.equals((java.lang.Object) 'a');
        java.util.Set set21 = defaultedMap18.entrySet();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "{}");
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) set21, obj25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Set set29 = defaultedMap28.keySet();
        boolean b30 = defaultedMap28.isEmpty();
        java.util.Collection collection31 = defaultedMap28.values();
        boolean b33 = defaultedMap28.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.util.Set set36 = defaultedMap35.keySet();
        java.util.Collection collection37 = defaultedMap35.values();
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) 'a');
        java.lang.String str40 = defaultedMap35.toString();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap35);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Set set45 = defaultedMap44.keySet();
        java.util.Collection collection46 = defaultedMap44.values();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) predicate47);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate50, predicate51);
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map41, predicate42, predicate51);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) "{}");
        int i59 = defaultedMap56.size();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate60);
        java.util.Set set62 = defaultedMap61.keySet();
        java.util.Collection collection63 = defaultedMap61.values();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        java.lang.Object obj66 = defaultedMap61.get((java.lang.Object) predicate64);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate67, predicate68);
        boolean b71 = defaultedMap56.containsValue((java.lang.Object) predicate68);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate51, predicate68);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate51);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Collection collection25 = defaultedMap23.values();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap23.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap32.keySet();
        java.util.Collection collection34 = defaultedMap32.values();
        java.lang.Object obj35 = defaultedMap1.remove((java.lang.Object) collection34);
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) predicate26);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        int i30 = defaultedMap16.size();
        java.util.Collection collection31 = defaultedMap16.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b15 = defaultedMap1.equals((java.lang.Object) 10.0d);
        java.util.Set set16 = defaultedMap1.entrySet();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) 1.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Set set21 = defaultedMap20.keySet();
        boolean b22 = defaultedMap20.isEmpty();
        java.util.Collection collection23 = defaultedMap20.values();
        boolean b25 = defaultedMap20.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        java.util.Set set28 = defaultedMap27.keySet();
        boolean b29 = defaultedMap27.isEmpty();
        java.util.Collection collection30 = defaultedMap27.values();
        boolean b32 = defaultedMap27.equals((java.lang.Object) 10L);
        java.lang.Object obj33 = defaultedMap20.get((java.lang.Object) defaultedMap27);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.util.Set set36 = defaultedMap35.keySet();
        boolean b37 = defaultedMap35.isEmpty();
        java.util.Collection collection38 = defaultedMap35.values();
        boolean b40 = defaultedMap35.equals((java.lang.Object) 100.0d);
        java.util.Set set41 = defaultedMap35.entrySet();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.util.Set set44 = defaultedMap43.keySet();
        boolean b45 = defaultedMap43.isEmpty();
        java.util.Collection collection46 = defaultedMap43.values();
        defaultedMap35.putAll((java.util.Map) defaultedMap43);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap35);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map48);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) "{}");
        boolean b9 = defaultedMap1.containsKey(obj8);
        java.util.Set set10 = defaultedMap1.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        boolean b14 = defaultedMap12.equals((java.lang.Object) 'a');
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 'a');
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) b18, (java.lang.Object) 100.0f);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) 100.0f);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap23.entrySet();
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) set26);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap9.clear();
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Collection collection25 = defaultedMap23.values();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap23.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        defaultedMap16.clear();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b4 = defaultedMap1.isEmpty();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.util.Set set18 = defaultedMap17.keySet();
        boolean b19 = defaultedMap17.isEmpty();
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b22 = defaultedMap17.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b26 = defaultedMap24.isEmpty();
        java.util.Collection collection27 = defaultedMap24.values();
        boolean b29 = defaultedMap24.equals((java.lang.Object) 10L);
        java.lang.Object obj30 = defaultedMap17.get((java.lang.Object) defaultedMap24);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 'a');
        java.util.Set set35 = defaultedMap32.entrySet();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        boolean b42 = defaultedMap37.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Set set45 = defaultedMap44.keySet();
        java.util.Collection collection46 = defaultedMap44.values();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) 'a');
        java.lang.String str49 = defaultedMap44.toString();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap44);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Set set53 = defaultedMap52.keySet();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        java.util.Set set58 = defaultedMap57.keySet();
        boolean b60 = defaultedMap57.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = null;
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.lang.Object obj64 = defaultedMap52.remove((java.lang.Object) predicate62);
        defaultedMap37.putAll((java.util.Map) defaultedMap52);
        defaultedMap32.putAll((java.util.Map) defaultedMap37);
        boolean b67 = defaultedMap17.containsKey((java.lang.Object) defaultedMap37);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        boolean b71 = defaultedMap69.equals((java.lang.Object) 'a');
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate72);
        boolean b75 = defaultedMap73.equals((java.lang.Object) 'a');
        java.lang.Object obj77 = defaultedMap69.put((java.lang.Object) b75, (java.lang.Object) 100.0f);
        java.util.Set set78 = defaultedMap69.keySet();
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) predicate79);
        java.util.Set set81 = defaultedMap80.keySet();
        java.util.Collection collection82 = defaultedMap80.values();
        java.lang.Object obj84 = null;
        java.lang.Object obj85 = defaultedMap80.put((java.lang.Object) (byte) 100, obj84);
        java.lang.Object obj86 = defaultedMap69.get((java.lang.Object) defaultedMap80);
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) predicate87);
        boolean b89 = defaultedMap88.isEmpty();
        int i90 = defaultedMap88.size();
        boolean b92 = defaultedMap88.containsValue((java.lang.Object) (short) -1);
        java.lang.Object obj93 = defaultedMap37.put((java.lang.Object) defaultedMap80, (java.lang.Object) b92);
        boolean b94 = defaultedMap15.containsValue(obj93);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Collection collection25 = defaultedMap23.values();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap23.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap32.keySet();
        boolean b34 = defaultedMap32.isEmpty();
        java.util.Collection collection35 = defaultedMap32.values();
        boolean b37 = defaultedMap32.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Set set40 = defaultedMap39.keySet();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) 'a');
        java.lang.String str44 = defaultedMap39.toString();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap39);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Set set48 = defaultedMap47.keySet();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Set set53 = defaultedMap52.keySet();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = null;
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        java.lang.Object obj59 = defaultedMap47.remove((java.lang.Object) predicate57);
        defaultedMap32.putAll((java.util.Map) defaultedMap47);
        boolean b62 = defaultedMap32.containsValue((java.lang.Object) 0.0d);
        boolean b63 = defaultedMap16.containsValue((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b7 = defaultedMap5.equals((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) b7, (java.lang.Object) 100.0f);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.util.Set set12 = defaultedMap11.keySet();
        boolean b13 = defaultedMap11.isEmpty();
        java.util.Collection collection14 = defaultedMap11.values();
        boolean b16 = defaultedMap11.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.util.Set set19 = defaultedMap18.keySet();
        boolean b20 = defaultedMap18.isEmpty();
        java.util.Collection collection21 = defaultedMap18.values();
        boolean b23 = defaultedMap18.equals((java.lang.Object) 10L);
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) defaultedMap18);
        java.util.Set set25 = defaultedMap18.keySet();
        defaultedMap18.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap18);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap1.toString();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap8.entrySet();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        defaultedMap8.putAll((java.util.Map) defaultedMap16);
        boolean b22 = defaultedMap8.equals((java.lang.Object) 10.0d);
        java.util.Set set23 = defaultedMap8.entrySet();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.util.Set set26 = defaultedMap25.keySet();
        java.util.Collection collection27 = defaultedMap25.values();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) predicate28);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate32);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.util.Set set37 = defaultedMap36.keySet();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        boolean b43 = defaultedMap25.containsValue((java.lang.Object) predicate40);
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) set23, (java.lang.Object) predicate40);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        java.util.Collection collection16 = defaultedMap9.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        boolean b43 = defaultedMap6.containsKey((java.lang.Object) defaultedMap37);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) predicate4);
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) predicate26);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b30 = defaultedMap16.isEmpty();
        java.util.Set set31 = defaultedMap16.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        int i36 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Set set21 = defaultedMap20.keySet();
        defaultedMap20.clear();
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap16.entrySet();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b23 = defaultedMap21.isEmpty();
        java.util.Collection collection24 = defaultedMap21.values();
        boolean b26 = defaultedMap21.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Collection collection30 = defaultedMap28.values();
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) 'a');
        java.lang.String str33 = defaultedMap28.toString();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap28);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.util.Set set37 = defaultedMap36.keySet();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        java.lang.Object obj48 = defaultedMap36.remove((java.lang.Object) predicate46);
        defaultedMap21.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Collection collection8 = defaultedMap5.values();
        boolean b10 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object obj21 = defaultedMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) '#');
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        boolean b28 = defaultedMap26.equals((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap26.entrySet();
        boolean b30 = defaultedMap5.containsValue((java.lang.Object) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.util.Set set35 = defaultedMap34.keySet();
        java.util.Collection collection36 = defaultedMap34.values();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) predicate37);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate40, predicate41);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        java.util.Set set46 = defaultedMap45.keySet();
        java.util.Collection collection47 = defaultedMap45.values();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap45.get((java.lang.Object) predicate48);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Set set53 = defaultedMap52.keySet();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = null;
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate(map43, predicate48, predicate56);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate32, predicate48);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj7 = null;
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj7);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        boolean b43 = defaultedMap6.containsKey((java.lang.Object) defaultedMap37);
        boolean b44 = defaultedMap37.isEmpty();
        java.util.Set set45 = defaultedMap37.keySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Collection collection8 = defaultedMap5.values();
        boolean b10 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object obj21 = defaultedMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) '#');
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        boolean b28 = defaultedMap26.equals((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap26.entrySet();
        boolean b30 = defaultedMap5.containsValue((java.lang.Object) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.util.Set set34 = defaultedMap33.keySet();
        boolean b35 = defaultedMap33.isEmpty();
        java.util.Collection collection36 = defaultedMap33.values();
        boolean b38 = defaultedMap33.equals((java.lang.Object) 100.0d);
        java.util.Set set39 = defaultedMap33.entrySet();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b43 = defaultedMap41.isEmpty();
        java.util.Collection collection44 = defaultedMap41.values();
        defaultedMap33.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj46 = defaultedMap5.remove((java.lang.Object) defaultedMap41);
        java.lang.String str47 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj11 = defaultedMap1.put(obj9, (java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) '#');
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 'a');
        java.util.Set set25 = defaultedMap22.entrySet();
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) defaultedMap22);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Collection collection30 = defaultedMap28.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) predicate31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj33);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) predicate26);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) (-1.0f));
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap31, (java.lang.Object) (-1.0f));
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        java.util.Set set39 = defaultedMap38.keySet();
        java.util.Collection collection40 = defaultedMap38.values();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj43 = defaultedMap38.get((java.lang.Object) predicate41);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate45);
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        java.util.Set set50 = defaultedMap49.keySet();
        boolean b52 = defaultedMap49.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = null;
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate53, predicate54);
        boolean b56 = defaultedMap38.containsValue((java.lang.Object) predicate53);
        boolean b57 = defaultedMap1.equals((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) set11);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap12, obj14);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) predicate26);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b30 = defaultedMap16.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        boolean b34 = defaultedMap32.equals((java.lang.Object) 'a');
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        boolean b38 = defaultedMap36.equals((java.lang.Object) 'a');
        java.lang.Object obj40 = defaultedMap32.put((java.lang.Object) b38, (java.lang.Object) 100.0f);
        java.util.Set set41 = defaultedMap32.keySet();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        java.util.Set set44 = defaultedMap43.keySet();
        java.util.Collection collection45 = defaultedMap43.values();
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap43.put((java.lang.Object) (byte) 100, obj47);
        java.lang.Object obj49 = defaultedMap32.get((java.lang.Object) defaultedMap43);
        defaultedMap16.putAll((java.util.Map) defaultedMap32);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        boolean b43 = defaultedMap6.containsKey((java.lang.Object) defaultedMap37);
        boolean b44 = defaultedMap37.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) predicate45);
        java.util.Set set47 = defaultedMap46.keySet();
        boolean b48 = defaultedMap46.isEmpty();
        java.util.Collection collection49 = defaultedMap46.values();
        boolean b51 = defaultedMap46.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.util.Set set54 = defaultedMap53.keySet();
        java.util.Collection collection55 = defaultedMap53.values();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) 'a');
        java.lang.String str58 = defaultedMap53.toString();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap53);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate60);
        java.util.Set set62 = defaultedMap61.keySet();
        boolean b64 = defaultedMap61.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate65);
        java.util.Set set67 = defaultedMap66.keySet();
        boolean b69 = defaultedMap66.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate70, predicate71);
        java.lang.Object obj73 = defaultedMap61.remove((java.lang.Object) predicate71);
        defaultedMap46.putAll((java.util.Map) defaultedMap61);
        boolean b76 = defaultedMap46.containsValue((java.lang.Object) 0.0d);
        boolean b77 = defaultedMap37.equals((java.lang.Object) defaultedMap46);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b77 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Collection collection8 = defaultedMap5.values();
        boolean b10 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.lang.Object obj21 = defaultedMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = defaultedMap5.get((java.lang.Object) '#');
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        boolean b28 = defaultedMap26.equals((java.lang.Object) 'a');
        java.util.Set set29 = defaultedMap26.entrySet();
        boolean b30 = defaultedMap5.containsValue((java.lang.Object) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.util.Set set34 = defaultedMap33.keySet();
        boolean b35 = defaultedMap33.isEmpty();
        java.util.Collection collection36 = defaultedMap33.values();
        boolean b38 = defaultedMap33.equals((java.lang.Object) 100.0d);
        java.util.Set set39 = defaultedMap33.entrySet();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b43 = defaultedMap41.isEmpty();
        java.util.Collection collection44 = defaultedMap41.values();
        defaultedMap33.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj46 = defaultedMap5.remove((java.lang.Object) defaultedMap41);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        boolean b49 = defaultedMap48.isEmpty();
        int i50 = defaultedMap48.size();
        defaultedMap41.putAll((java.util.Map) defaultedMap48);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(i50 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap15.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.util.Set set19 = defaultedMap18.keySet();
        boolean b20 = defaultedMap18.isEmpty();
        java.util.Collection collection21 = defaultedMap18.values();
        boolean b23 = defaultedMap18.equals((java.lang.Object) 100.0d);
        java.util.Set set24 = defaultedMap18.entrySet();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b28 = defaultedMap26.isEmpty();
        java.util.Collection collection29 = defaultedMap26.values();
        defaultedMap18.putAll((java.util.Map) defaultedMap26);
        boolean b32 = defaultedMap18.equals((java.lang.Object) 10.0d);
        java.util.Set set33 = defaultedMap18.entrySet();
        java.lang.Object obj35 = defaultedMap18.remove((java.lang.Object) 1.0d);
        boolean b36 = defaultedMap15.containsKey(obj35);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Collection collection25 = defaultedMap23.values();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap23.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap32.keySet();
        boolean b35 = defaultedMap32.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.util.Collection collection39 = defaultedMap32.values();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap41.keySet();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) (byte) 100, obj45);
        boolean b47 = defaultedMap32.equals(obj45);
        java.util.Collection collection48 = defaultedMap32.values();
        java.lang.Object obj49 = defaultedMap16.get((java.lang.Object) defaultedMap32);
        boolean b50 = defaultedMap16.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b8 = defaultedMap6.isEmpty();
        java.util.Collection collection9 = defaultedMap6.values();
        boolean b11 = defaultedMap6.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Collection collection15 = defaultedMap13.values();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap13.toString();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate25);
        java.util.Set set27 = defaultedMap26.keySet();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap21.remove((java.lang.Object) predicate31);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        boolean b43 = defaultedMap6.containsKey((java.lang.Object) defaultedMap37);
        boolean b44 = defaultedMap37.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        boolean b50 = defaultedMap48.equals((java.lang.Object) 'a');
        java.util.Set set51 = defaultedMap48.entrySet();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) "{}");
        boolean b56 = defaultedMap48.containsKey(obj55);
        java.util.Set set57 = defaultedMap48.keySet();
        java.lang.Object obj58 = defaultedMap37.get((java.lang.Object) set57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        java.util.Set set61 = defaultedMap60.keySet();
        java.util.Collection collection62 = defaultedMap60.values();
        java.lang.Object obj64 = defaultedMap60.remove((java.lang.Object) 'a');
        java.lang.String str65 = defaultedMap60.toString();
        boolean b66 = defaultedMap60.isEmpty();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) predicate67);
        java.util.Set set69 = defaultedMap68.keySet();
        boolean b71 = defaultedMap68.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = null;
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate72, predicate73);
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap60.put((java.lang.Object) predicate72, obj75);
        boolean b77 = defaultedMap37.containsKey(obj76);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.util.Collection collection11 = defaultedMap1.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate12);
        java.util.Set set14 = defaultedMap13.keySet();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) predicate17);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        java.lang.Object obj21 = defaultedMap13.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Collection collection14 = defaultedMap12.values();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.lang.Object obj17 = defaultedMap12.get((java.lang.Object) predicate15);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate18, predicate19);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) "{}");
        int i26 = defaultedMap23.size();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Collection collection30 = defaultedMap28.values();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate34, predicate35);
        boolean b38 = defaultedMap23.containsValue((java.lang.Object) predicate35);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate35);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        boolean b43 = defaultedMap41.equals((java.lang.Object) 'a');
        java.util.Set set44 = defaultedMap41.entrySet();
        defaultedMap41.clear();
        defaultedMap41.clear();
        java.lang.Object obj47 = defaultedMap1.put((java.lang.Object) predicate35, (java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b15 = defaultedMap1.equals((java.lang.Object) 10.0d);
        java.util.Set set16 = defaultedMap1.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate(map18, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate(map14, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        java.util.Set set22 = defaultedMap16.entrySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b26 = defaultedMap24.isEmpty();
        java.util.Collection collection27 = defaultedMap24.values();
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap16);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        java.util.Set set32 = defaultedMap31.keySet();
        java.util.Collection collection33 = defaultedMap31.values();
        java.lang.String str34 = defaultedMap31.toString();
        java.lang.Object obj35 = defaultedMap8.remove((java.lang.Object) defaultedMap31);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        java.util.Collection collection39 = defaultedMap37.values();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) predicate40);
        defaultedMap37.clear();
        boolean b44 = defaultedMap8.containsValue((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate13);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        boolean b22 = defaultedMap20.equals((java.lang.Object) "hi!");
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) b22);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.String str5 = defaultedMap1.toString();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        java.util.Set set8 = defaultedMap7.keySet();
        java.util.Collection collection9 = defaultedMap7.values();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) predicate10);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate13, predicate14);
        java.util.Collection collection17 = defaultedMap7.values();
        int i18 = defaultedMap7.size();
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) i18);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        defaultedMap8.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        java.util.Set set24 = defaultedMap23.keySet();
        java.util.Collection collection25 = defaultedMap23.values();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap23.toString();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap16.equals(obj30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        boolean b35 = defaultedMap33.equals((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap37.keySet();
        boolean b39 = defaultedMap37.isEmpty();
        java.util.Collection collection40 = defaultedMap37.values();
        boolean b42 = defaultedMap37.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Set set45 = defaultedMap44.keySet();
        boolean b47 = defaultedMap44.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        java.lang.Object obj53 = defaultedMap44.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj54 = defaultedMap37.get((java.lang.Object) (byte) 0);
        java.lang.Object obj56 = defaultedMap37.get((java.lang.Object) '#');
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) predicate57);
        boolean b60 = defaultedMap58.equals((java.lang.Object) 'a');
        java.util.Set set61 = defaultedMap58.entrySet();
        boolean b62 = defaultedMap37.containsValue((java.lang.Object) defaultedMap58);
        defaultedMap33.putAll((java.util.Map) defaultedMap37);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap37);
        boolean b65 = defaultedMap8.containsValue((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        defaultedMap8.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Collection collection18 = defaultedMap16.values();
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 'a');
        java.util.Map map21 = collections.map.DefaultedMap.decorate(map14, (java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) map14);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        java.util.Set set22 = defaultedMap16.entrySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b26 = defaultedMap24.isEmpty();
        java.util.Collection collection27 = defaultedMap24.values();
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        boolean b30 = defaultedMap16.equals((java.lang.Object) 10.0d);
        java.util.Set set31 = defaultedMap16.entrySet();
        java.lang.Object obj33 = defaultedMap16.remove((java.lang.Object) 1.0d);
        java.lang.Object obj34 = defaultedMap8.get((java.lang.Object) defaultedMap16);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.util.Set set37 = defaultedMap36.keySet();
        java.util.Collection collection38 = defaultedMap36.values();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        java.lang.Object obj41 = defaultedMap36.get((java.lang.Object) predicate39);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate43);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Set set48 = defaultedMap47.keySet();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = null;
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate51, predicate52);
        boolean b54 = defaultedMap36.containsValue((java.lang.Object) predicate51);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        java.util.Set set57 = defaultedMap56.keySet();
        java.util.Collection collection58 = defaultedMap56.values();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        java.lang.Object obj61 = defaultedMap56.get((java.lang.Object) predicate59);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate62, predicate63);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) predicate66);
        java.util.Set set68 = defaultedMap67.keySet();
        java.util.Collection collection69 = defaultedMap67.values();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) predicate70);
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) predicate70);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) predicate73);
        java.util.Set set75 = defaultedMap74.keySet();
        boolean b77 = defaultedMap74.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate79 = null;
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate78, predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map65, predicate70, predicate78);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate51, predicate70);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        boolean b7 = defaultedMap5.equals((java.lang.Object) 'a');
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) b7, (java.lang.Object) 100.0f);
        java.util.Set set10 = defaultedMap1.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Collection collection14 = defaultedMap12.values();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) (byte) 100, obj16);
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.util.Set set19 = defaultedMap1.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b24 = defaultedMap21.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = null;
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = new java.lang.Object();
        boolean b29 = defaultedMap21.containsValue(obj28);
        boolean b30 = defaultedMap1.equals((java.lang.Object) b29);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 100L);
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        defaultedMap8.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate(map14, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Collection collection10 = defaultedMap8.values();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap8.toString();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Collection collection8 = defaultedMap5.values();
        boolean b10 = defaultedMap5.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        java.util.Collection collection14 = defaultedMap12.values();
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) 'a');
        java.lang.String str17 = defaultedMap12.toString();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap12);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Set set21 = defaultedMap20.keySet();
        boolean b23 = defaultedMap20.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        java.util.Set set26 = defaultedMap25.keySet();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = null;
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap20.remove((java.lang.Object) predicate30);
        defaultedMap5.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b15 = defaultedMap1.equals((java.lang.Object) 10.0d);
        java.util.Set set16 = defaultedMap1.entrySet();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) '#');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.util.Set set21 = defaultedMap20.keySet();
        boolean b23 = defaultedMap20.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate25);
        java.util.Collection collection27 = defaultedMap20.values();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) predicate28);
        java.util.Set set30 = defaultedMap29.keySet();
        java.util.Collection collection31 = defaultedMap29.values();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap29.put((java.lang.Object) (byte) 100, obj33);
        boolean b35 = defaultedMap20.equals(obj33);
        java.util.Collection collection36 = defaultedMap20.values();
        boolean b37 = defaultedMap1.equals((java.lang.Object) collection36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        boolean b48 = defaultedMap39.containsValue((java.lang.Object) map47);
        java.util.Collection collection49 = defaultedMap39.values();
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) collection49);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) set2);
        boolean b4 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        java.util.Set set17 = defaultedMap16.keySet();
        boolean b18 = defaultedMap16.isEmpty();
        java.util.Collection collection19 = defaultedMap16.values();
        boolean b21 = defaultedMap16.equals((java.lang.Object) 100.0d);
        java.util.Set set22 = defaultedMap16.entrySet();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b26 = defaultedMap24.isEmpty();
        java.util.Collection collection27 = defaultedMap24.values();
        defaultedMap16.putAll((java.util.Map) defaultedMap24);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap16);
        java.lang.Object obj31 = defaultedMap16.remove((java.lang.Object) (short) 10);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.util.Set set34 = defaultedMap33.keySet();
        boolean b35 = defaultedMap33.isEmpty();
        java.util.Collection collection36 = defaultedMap33.values();
        boolean b38 = defaultedMap33.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        java.util.Set set41 = defaultedMap40.keySet();
        java.util.Collection collection42 = defaultedMap40.values();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) 'a');
        java.lang.String str45 = defaultedMap40.toString();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        defaultedMap16.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate49);
        boolean b52 = defaultedMap50.equals((java.lang.Object) 'a');
        java.util.Set set53 = defaultedMap50.entrySet();
        defaultedMap50.clear();
        java.lang.Object obj55 = defaultedMap33.get((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b9 = defaultedMap7.equals((java.lang.Object) 'a');
        java.util.Set set10 = defaultedMap7.entrySet();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) "{}");
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) set10, obj14);
        java.lang.String str16 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 'a');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) predicate4);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b14 = defaultedMap12.isEmpty();
        java.util.Collection collection15 = defaultedMap12.values();
        boolean b17 = defaultedMap12.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b21 = defaultedMap19.isEmpty();
        java.util.Collection collection22 = defaultedMap19.values();
        boolean b24 = defaultedMap19.equals((java.lang.Object) 10L);
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) defaultedMap19);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 'a');
        java.util.Set set30 = defaultedMap27.entrySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap32.keySet();
        boolean b34 = defaultedMap32.isEmpty();
        java.util.Collection collection35 = defaultedMap32.values();
        boolean b37 = defaultedMap32.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Set set40 = defaultedMap39.keySet();
        java.util.Collection collection41 = defaultedMap39.values();
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) 'a');
        java.lang.String str44 = defaultedMap39.toString();
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap39);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Set set48 = defaultedMap47.keySet();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Set set53 = defaultedMap52.keySet();
        boolean b55 = defaultedMap52.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = null;
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        java.lang.Object obj59 = defaultedMap47.remove((java.lang.Object) predicate57);
        defaultedMap32.putAll((java.util.Map) defaultedMap47);
        defaultedMap27.putAll((java.util.Map) defaultedMap32);
        boolean b62 = defaultedMap12.containsKey((java.lang.Object) defaultedMap32);
        boolean b64 = defaultedMap12.equals((java.lang.Object) (short) 0);
        boolean b65 = defaultedMap1.equals((java.lang.Object) (short) 0);
        collections.Transformer transformer66 = null;
        try {
            java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 10L);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 'a');
        java.util.Set set19 = defaultedMap16.entrySet();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        java.util.Set set22 = defaultedMap21.keySet();
        boolean b23 = defaultedMap21.isEmpty();
        java.util.Collection collection24 = defaultedMap21.values();
        boolean b26 = defaultedMap21.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate27);
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Collection collection30 = defaultedMap28.values();
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) 'a');
        java.lang.String str33 = defaultedMap28.toString();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap28);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.util.Set set37 = defaultedMap36.keySet();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        java.lang.Object obj48 = defaultedMap36.remove((java.lang.Object) predicate46);
        defaultedMap21.putAll((java.util.Map) defaultedMap36);
        defaultedMap16.putAll((java.util.Map) defaultedMap21);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        boolean b55 = defaultedMap53.equals((java.lang.Object) 'a');
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate56);
        boolean b59 = defaultedMap57.equals((java.lang.Object) 'a');
        java.lang.Object obj61 = defaultedMap53.put((java.lang.Object) b59, (java.lang.Object) 100.0f);
        java.util.Set set62 = defaultedMap53.keySet();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate63);
        java.util.Set set65 = defaultedMap64.keySet();
        java.util.Collection collection66 = defaultedMap64.values();
        java.lang.Object obj68 = null;
        java.lang.Object obj69 = defaultedMap64.put((java.lang.Object) (byte) 100, obj68);
        java.lang.Object obj70 = defaultedMap53.get((java.lang.Object) defaultedMap64);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) predicate71);
        boolean b73 = defaultedMap72.isEmpty();
        int i74 = defaultedMap72.size();
        boolean b76 = defaultedMap72.containsValue((java.lang.Object) (short) -1);
        java.lang.Object obj77 = defaultedMap21.put((java.lang.Object) defaultedMap64, (java.lang.Object) b76);
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) predicate78);
        java.util.Set set80 = defaultedMap79.keySet();
        boolean b81 = defaultedMap79.isEmpty();
        java.util.Collection collection82 = defaultedMap79.values();
        boolean b84 = defaultedMap79.equals((java.lang.Object) 100.0d);
        java.util.Set set85 = defaultedMap79.keySet();
        java.lang.Object obj86 = defaultedMap64.remove((java.lang.Object) set85);
        boolean b87 = defaultedMap64.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i6 = defaultedMap5.size();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        java.util.Set set9 = defaultedMap8.keySet();
        boolean b10 = defaultedMap8.isEmpty();
        java.util.Collection collection11 = defaultedMap8.values();
        boolean b13 = defaultedMap8.equals((java.lang.Object) 100.0d);
        java.util.Set set14 = defaultedMap8.keySet();
        java.lang.Object obj15 = defaultedMap5.get((java.lang.Object) defaultedMap8);
        boolean b16 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        java.util.Collection collection11 = defaultedMap9.values();
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.String str13 = defaultedMap9.toString();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) str13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 'a');
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        boolean b22 = defaultedMap20.equals((java.lang.Object) 'a');
        java.lang.Object obj24 = defaultedMap16.put((java.lang.Object) b22, (java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap16.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate26);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) set28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        java.util.Set set32 = defaultedMap31.keySet();
        java.util.Collection collection33 = defaultedMap31.values();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        java.lang.Object obj36 = defaultedMap31.get((java.lang.Object) predicate34);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate37, predicate38);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) "{}");
        int i45 = defaultedMap42.size();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Set set48 = defaultedMap47.keySet();
        java.util.Collection collection49 = defaultedMap47.values();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) predicate50);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        boolean b57 = defaultedMap42.containsValue((java.lang.Object) predicate54);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate38, predicate54);
        defaultedMap16.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        java.util.Set set63 = defaultedMap62.keySet();
        java.util.Collection collection64 = defaultedMap62.values();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate65);
        java.lang.Object obj67 = defaultedMap62.get((java.lang.Object) predicate65);
        defaultedMap62.clear();
        boolean b69 = defaultedMap16.equals((java.lang.Object) defaultedMap62);
        java.util.Set set70 = defaultedMap62.entrySet();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = null;
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.lang.Object obj8 = new java.lang.Object();
        boolean b9 = defaultedMap1.containsValue(obj8);
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0d);
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap9.keySet();
        boolean b11 = defaultedMap9.isEmpty();
        java.util.Collection collection12 = defaultedMap9.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b15 = defaultedMap1.equals((java.lang.Object) 10.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.util.Set set18 = defaultedMap17.keySet();
        boolean b19 = defaultedMap17.isEmpty();
        java.util.Collection collection20 = defaultedMap17.values();
        boolean b22 = defaultedMap17.equals((java.lang.Object) 100.0d);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b27 = defaultedMap24.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = null;
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate28, predicate29);
        java.lang.Object obj33 = defaultedMap24.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        java.lang.Object obj34 = defaultedMap17.get((java.lang.Object) (byte) 0);
        java.lang.Object obj36 = defaultedMap17.get((java.lang.Object) '#');
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) predicate37);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 'a');
        java.util.Set set41 = defaultedMap38.entrySet();
        boolean b42 = defaultedMap17.containsValue((java.lang.Object) defaultedMap38);
        java.util.Set set43 = defaultedMap38.entrySet();
        boolean b44 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicate0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) "{}");
        int i4 = defaultedMap1.size();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) predicate5);
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (-1));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate13);
        java.util.Set set15 = defaultedMap14.keySet();
        java.util.Collection collection16 = defaultedMap14.values();
        boolean b17 = defaultedMap14.isEmpty();
        java.lang.String str18 = defaultedMap14.toString();
        boolean b19 = defaultedMap6.containsKey((java.lang.Object) str18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        boolean b23 = defaultedMap21.equals((java.lang.Object) 'a');
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        boolean b27 = defaultedMap25.equals((java.lang.Object) 'a');
        java.lang.Object obj29 = defaultedMap21.put((java.lang.Object) b27, (java.lang.Object) 100.0f);
        java.util.Set set30 = defaultedMap21.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate35);
        java.util.Set set37 = defaultedMap36.keySet();
        java.util.Collection collection38 = defaultedMap36.values();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        java.lang.Object obj41 = defaultedMap36.get((java.lang.Object) predicate39);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate42, predicate43);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) "{}");
        int i50 = defaultedMap47.size();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        java.util.Set set53 = defaultedMap52.keySet();
        java.util.Collection collection54 = defaultedMap52.values();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        java.lang.Object obj57 = defaultedMap52.get((java.lang.Object) predicate55);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate58, predicate59);
        boolean b62 = defaultedMap47.containsValue((java.lang.Object) predicate59);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate43, predicate59);
        defaultedMap21.putAll((java.util.Map) defaultedMap34);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj66 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(predicate0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj66);
    }
}

