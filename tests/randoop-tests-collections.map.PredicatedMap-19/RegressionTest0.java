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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        java.util.Set set8 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate20);
        boolean b22 = defaultedMap5.equals((java.lang.Object) map21);
        java.lang.Object obj23 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) b22);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        java.util.Map map20 = null;
        try {
            defaultedMap1.putAll(map20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put(obj18, (java.lang.Object) predicate19);
        boolean b21 = defaultedMap13.equals(obj18);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Set set27 = defaultedMap1.keySet();
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Collection collection27 = defaultedMap1.values();
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate33, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str39 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate51, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate53);
        java.lang.String str56 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) "");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj40 = defaultedMap35.put(obj38, (java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate39, predicate41);
        boolean b43 = defaultedMap28.containsKey((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str53 = defaultedMap52.toString();
        java.util.Set set54 = defaultedMap52.keySet();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap52);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) true);
        java.lang.Object obj61 = defaultedMap52.put((java.lang.Object) predicate56, obj60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate41, predicate56);
        java.util.Collection collection63 = defaultedMap21.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.lang.String str16 = defaultedMap7.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap18.containsKey(obj26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj12 = defaultedMap7.put(obj10, (java.lang.Object) predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        boolean b15 = defaultedMap1.equals((java.lang.Object) map14);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) 0L);
        collections.PredicateUtils predicateUtils18 = new collections.PredicateUtils();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) predicateUtils18);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str21 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate33, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str39 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate51, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate53);
        collections.Factory factory56 = null;
        try {
            java.util.Map map57 = collections.map.DefaultedMap.decorate(map55, factory56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map17, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) map21);
        boolean b23 = defaultedMap5.equals((java.lang.Object) map21);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        defaultedMap3.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection31 = defaultedMap3.values();
        collections.Transformer transformer32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj36 = defaultedMap31.put(obj34, (java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        boolean b39 = defaultedMap25.equals((java.lang.Object) map38);
        boolean b40 = defaultedMap22.equals((java.lang.Object) map38);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b42 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str49 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap51.put(obj54, (java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate55, predicate57);
        boolean b59 = defaultedMap44.containsKey((java.lang.Object) predicate57);
        boolean b60 = defaultedMap1.containsKey((java.lang.Object) b59);
        java.lang.String str61 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) true);
        java.util.Set set39 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate51);
        boolean b53 = defaultedMap36.equals((java.lang.Object) map52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str56 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj65 = null;
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj67 = defaultedMap62.put(obj65, (java.lang.Object) predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate66, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate68, predicate70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str74 = defaultedMap73.toString();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj83 = null;
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj85 = defaultedMap80.put(obj83, (java.lang.Object) predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate84, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate86, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate70, predicate88);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str93 = defaultedMap92.toString();
        int i94 = defaultedMap92.size();
        collections.Predicate predicate95 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj96 = defaultedMap92.get((java.lang.Object) predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate88, predicate95);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
        org.junit.Assert.assertTrue(i94 == 0);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + (short) 1 + "'", obj96.equals((short) 1));
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj36 = defaultedMap31.put(obj34, (java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        boolean b39 = defaultedMap25.equals((java.lang.Object) map38);
        boolean b40 = defaultedMap22.equals((java.lang.Object) map38);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b42 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        boolean b43 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj43 = defaultedMap38.put(obj41, (java.lang.Object) predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        boolean b46 = defaultedMap32.equals((java.lang.Object) map45);
        boolean b47 = defaultedMap29.equals((java.lang.Object) map45);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj12 = defaultedMap7.put(obj10, (java.lang.Object) predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        boolean b15 = defaultedMap1.equals((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        boolean b20 = defaultedMap1.isEmpty();
        java.util.Set set21 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str24 = defaultedMap23.toString();
        java.util.Set set25 = defaultedMap23.keySet();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) "");
        defaultedMap23.clear();
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) true);
        java.util.Set set35 = defaultedMap32.entrySet();
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap32.equals((java.lang.Object) 100L);
        boolean b41 = defaultedMap32.containsValue((java.lang.Object) 'a');
        boolean b42 = defaultedMap23.equals((java.lang.Object) b41);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        java.util.Set set44 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 1 + "'", obj37.equals((short) 1));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set44);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap1.get(obj27);
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap1.containsValue(obj29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 1 + "'", obj28.equals((short) 1));
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = null;
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj22 = defaultedMap17.put(obj20, (java.lang.Object) predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate21, predicate23);
        boolean b25 = defaultedMap11.equals((java.lang.Object) map24);
        boolean b26 = defaultedMap8.equals((java.lang.Object) map24);
        boolean b27 = defaultedMap8.isEmpty();
        java.util.Set set28 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Set set32 = defaultedMap30.keySet();
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) "");
        defaultedMap30.clear();
        boolean b37 = defaultedMap30.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) true);
        java.util.Set set42 = defaultedMap39.entrySet();
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) 100.0d);
        boolean b46 = defaultedMap39.equals((java.lang.Object) 100L);
        boolean b48 = defaultedMap39.containsValue((java.lang.Object) 'a');
        boolean b49 = defaultedMap30.equals((java.lang.Object) b48);
        defaultedMap8.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str53 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj62 = null;
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj64 = defaultedMap59.put(obj62, (java.lang.Object) predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate63, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate65, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str71 = defaultedMap70.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj76 = null;
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj78 = defaultedMap73.put(obj76, (java.lang.Object) predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate77, predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate67, predicate77);
        defaultedMap6.putAll(map81);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 1 + "'", obj44.equals((short) 1));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate(map30, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap3.put(obj6, (java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.util.Set set12 = defaultedMap10.keySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        int i19 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) true);
        java.util.Set set24 = defaultedMap21.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj35 = defaultedMap30.put(obj33, (java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate36);
        boolean b38 = defaultedMap21.equals((java.lang.Object) map37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str41 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj52 = defaultedMap47.put(obj50, (java.lang.Object) predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate51, predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate53, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str59 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj70 = defaultedMap65.put(obj68, (java.lang.Object) predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate69, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate71, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate55, predicate73);
        boolean b76 = defaultedMap1.containsKey((java.lang.Object) predicate73);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap34.put(obj37, (java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate40);
        boolean b42 = defaultedMap27.containsKey((java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) true);
        java.util.Set set47 = defaultedMap44.entrySet();
        java.lang.Object obj49 = defaultedMap44.get((java.lang.Object) 100.0d);
        defaultedMap44.clear();
        java.lang.Object obj51 = defaultedMap27.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj52 = defaultedMap18.get((java.lang.Object) defaultedMap44);
        collections.Transformer transformer53 = null;
        try {
            java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, transformer53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 1 + "'", obj49.equals((short) 1));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 1 + "'", obj52.equals((short) 1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 10);
        java.util.Collection collection30 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.entrySet();
        java.lang.Object obj25 = defaultedMap20.get((java.lang.Object) 100.0d);
        boolean b27 = defaultedMap20.equals((java.lang.Object) 100L);
        boolean b29 = defaultedMap20.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj38 = defaultedMap33.put(obj36, (java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str41 = defaultedMap40.toString();
        java.util.Set set42 = defaultedMap40.keySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap40);
        defaultedMap31.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj45 = defaultedMap20.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str52 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = defaultedMap54.put(obj57, (java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate58, predicate60);
        boolean b62 = defaultedMap47.containsKey((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj69 = defaultedMap64.put(obj67, (java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str72 = defaultedMap71.toString();
        java.util.Set set73 = defaultedMap71.keySet();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) defaultedMap71);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj79 = defaultedMap77.remove((java.lang.Object) true);
        java.lang.Object obj80 = defaultedMap71.put((java.lang.Object) predicate75, obj79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate60, predicate75);
        java.lang.Object obj82 = defaultedMap15.get((java.lang.Object) predicate60);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate60);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 1 + "'", obj25.equals((short) 1));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 1 + "'", obj45.equals((short) 1));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + (short) 1 + "'", obj82.equals((short) 1));
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str37 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str44 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj51 = defaultedMap46.put(obj49, (java.lang.Object) predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate50, predicate52);
        boolean b54 = defaultedMap39.containsKey((java.lang.Object) predicate52);
        java.lang.Object obj55 = defaultedMap36.get((java.lang.Object) predicate52);
        java.lang.Object obj56 = defaultedMap18.get(obj55);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) 1 + "'", obj55.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 1 + "'", obj56.equals((short) 1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str17 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put(obj28, (java.lang.Object) predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate31);
        boolean b33 = defaultedMap19.equals((java.lang.Object) map32);
        boolean b34 = defaultedMap16.equals((java.lang.Object) map32);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        int i36 = defaultedMap14.size();
        java.util.Map map37 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) i36);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj36 = defaultedMap31.put(obj34, (java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        boolean b39 = defaultedMap25.equals((java.lang.Object) map38);
        boolean b40 = defaultedMap22.equals((java.lang.Object) map38);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b42 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.util.Set set43 = defaultedMap20.keySet();
        defaultedMap20.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap1.equals(obj28);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap21.put(obj24, (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        boolean b29 = defaultedMap15.equals((java.lang.Object) map28);
        boolean b30 = defaultedMap12.equals((java.lang.Object) map28);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap33);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection38 = defaultedMap10.values();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) 10);
        int i41 = defaultedMap10.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj29 = defaultedMap24.put(obj27, (java.lang.Object) predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate28, predicate30);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) predicate30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) map32);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap21.put(obj24, (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        boolean b29 = defaultedMap15.equals((java.lang.Object) map28);
        boolean b30 = defaultedMap12.equals((java.lang.Object) map28);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        int i32 = defaultedMap10.size();
        java.util.Set set33 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) true);
        java.util.Set set38 = defaultedMap35.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap44.put(obj47, (java.lang.Object) predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate48, predicate50);
        boolean b52 = defaultedMap35.equals((java.lang.Object) map51);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str57 = defaultedMap56.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj68 = null;
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj70 = defaultedMap65.put(obj68, (java.lang.Object) predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate69, predicate71);
        boolean b73 = defaultedMap59.equals((java.lang.Object) map72);
        boolean b74 = defaultedMap56.equals((java.lang.Object) map72);
        defaultedMap54.putAll((java.util.Map) defaultedMap56);
        boolean b76 = defaultedMap35.equals((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str83 = defaultedMap82.toString();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj87 = defaultedMap85.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj88 = null;
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj90 = defaultedMap85.put(obj88, (java.lang.Object) predicate89);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate89, predicate91);
        boolean b93 = defaultedMap78.containsKey((java.lang.Object) predicate91);
        boolean b94 = defaultedMap35.containsKey((java.lang.Object) b93);
        boolean b95 = defaultedMap10.containsKey((java.lang.Object) b93);
        boolean b96 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        java.util.Set set97 = defaultedMap10.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "{}" + "'", str83.equals("{}"));
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNotNull(set97);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj24 = defaultedMap19.put(obj22, (java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        boolean b27 = defaultedMap13.equals((java.lang.Object) map26);
        boolean b28 = defaultedMap10.equals((java.lang.Object) map26);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        int i30 = defaultedMap8.size();
        java.util.Set set31 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj36 = null;
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj38 = defaultedMap33.put(obj36, (java.lang.Object) predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str41 = defaultedMap40.toString();
        java.util.Set set42 = defaultedMap40.keySet();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) defaultedMap40);
        java.lang.String str44 = defaultedMap40.toString();
        boolean b45 = defaultedMap8.containsValue((java.lang.Object) defaultedMap40);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) b45);
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 1 + "'", obj46.equals((short) 1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj29 = defaultedMap24.put(obj27, (java.lang.Object) predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate28, predicate30);
        boolean b32 = defaultedMap18.equals((java.lang.Object) map31);
        boolean b33 = defaultedMap15.equals((java.lang.Object) map31);
        java.lang.String str34 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str37 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate51);
        boolean b53 = defaultedMap39.equals((java.lang.Object) map52);
        boolean b54 = defaultedMap36.equals((java.lang.Object) map52);
        defaultedMap15.putAll(map52);
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) map52);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) true);
        java.util.Set set8 = defaultedMap5.entrySet();
        int i9 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        boolean b19 = defaultedMap5.containsKey((java.lang.Object) defaultedMap11);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        java.util.Set set21 = defaultedMap11.entrySet();
        java.util.Collection collection22 = defaultedMap11.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) ' ');
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 1 + "'", obj5.equals((short) 1));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap21.put(obj24, (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        boolean b29 = defaultedMap15.equals((java.lang.Object) map28);
        boolean b30 = defaultedMap12.equals((java.lang.Object) map28);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap33);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection38 = defaultedMap10.values();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) true);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) 0);
        java.util.Set set47 = defaultedMap42.entrySet();
        java.lang.Object obj48 = null;
        java.lang.Object obj50 = defaultedMap42.put(obj48, (java.lang.Object) 'a');
        java.lang.Object obj51 = defaultedMap10.get(obj48);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 1 + "'", obj51.equals((short) 1));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Collection collection27 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) true);
        java.util.Set set32 = defaultedMap29.entrySet();
        java.lang.Object obj34 = defaultedMap29.get((java.lang.Object) 100.0d);
        boolean b36 = defaultedMap29.equals((java.lang.Object) 100L);
        boolean b38 = defaultedMap29.containsValue((java.lang.Object) 'a');
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        boolean b20 = defaultedMap1.isEmpty();
        boolean b21 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Set set27 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj43 = defaultedMap38.put(obj41, (java.lang.Object) predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        boolean b46 = defaultedMap32.equals((java.lang.Object) map45);
        boolean b47 = defaultedMap29.equals((java.lang.Object) map45);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str52 = defaultedMap51.toString();
        java.util.Set set53 = defaultedMap51.keySet();
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) "");
        defaultedMap51.clear();
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) true);
        java.util.Set set63 = defaultedMap60.entrySet();
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 100.0d);
        boolean b67 = defaultedMap60.equals((java.lang.Object) 100L);
        boolean b69 = defaultedMap60.containsValue((java.lang.Object) 'a');
        boolean b70 = defaultedMap51.equals((java.lang.Object) b69);
        defaultedMap29.putAll((java.util.Map) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.lang.Object obj75 = defaultedMap51.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 1 + "'", obj65.equals((short) 1));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (short) 1 + "'", obj75.equals((short) 1));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str18 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj31 = defaultedMap26.put(obj29, (java.lang.Object) predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate32);
        boolean b34 = defaultedMap20.equals((java.lang.Object) map33);
        boolean b35 = defaultedMap17.equals((java.lang.Object) map33);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        int i37 = defaultedMap15.size();
        java.util.Set set38 = defaultedMap15.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) set38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate(map39, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Collection collection27 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) true);
        java.util.Set set32 = defaultedMap29.entrySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj43 = defaultedMap38.put(obj41, (java.lang.Object) predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        boolean b46 = defaultedMap29.equals((java.lang.Object) map45);
        int i47 = defaultedMap29.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        java.lang.String str20 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj36 = defaultedMap31.put(obj34, (java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        boolean b39 = defaultedMap25.equals((java.lang.Object) map38);
        boolean b40 = defaultedMap22.equals((java.lang.Object) map38);
        defaultedMap1.putAll(map38);
        java.util.Collection collection42 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str35 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap37.put(obj40, (java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate41, predicate43);
        boolean b45 = defaultedMap1.containsValue((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap51.put(obj54, (java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate55, predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj69 = defaultedMap64.put(obj67, (java.lang.Object) predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate68, predicate70);
        java.util.Map map72 = collections.map.DefaultedMap.decorate(map58, (java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj81 = null;
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj83 = defaultedMap78.put(obj81, (java.lang.Object) predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate82, predicate84);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) predicate82);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate68, predicate82);
        collections.Transformer transformer88 = null;
        try {
            java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Set set27 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj43 = defaultedMap38.put(obj41, (java.lang.Object) predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        boolean b46 = defaultedMap32.equals((java.lang.Object) map45);
        boolean b47 = defaultedMap29.equals((java.lang.Object) map45);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str52 = defaultedMap51.toString();
        java.util.Set set53 = defaultedMap51.keySet();
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) "");
        defaultedMap51.clear();
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) true);
        java.util.Set set63 = defaultedMap60.entrySet();
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 100.0d);
        boolean b67 = defaultedMap60.equals((java.lang.Object) 100L);
        boolean b69 = defaultedMap60.containsValue((java.lang.Object) 'a');
        boolean b70 = defaultedMap51.equals((java.lang.Object) b69);
        defaultedMap29.putAll((java.util.Map) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        boolean b74 = defaultedMap1.containsKey((java.lang.Object) 10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 1 + "'", obj65.equals((short) 1));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 1 + "'", obj5.equals((short) 1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap1.keySet();
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap21.put(obj24, (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        boolean b29 = defaultedMap15.equals((java.lang.Object) map28);
        java.lang.Object obj31 = defaultedMap15.remove((java.lang.Object) 0L);
        java.lang.String str32 = defaultedMap15.toString();
        java.util.Set set33 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        defaultedMap13.putAll((java.util.Map) defaultedMap34);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate12, obj16);
        boolean b19 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) ' ');
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj16 = defaultedMap11.put(obj14, (java.lang.Object) predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate17);
        int i20 = defaultedMap1.size();
        boolean b21 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        int i9 = defaultedMap5.size();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate12, obj16);
        boolean b19 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj35 = defaultedMap30.put(obj33, (java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate36);
        boolean b38 = defaultedMap24.equals((java.lang.Object) map37);
        boolean b39 = defaultedMap21.equals((java.lang.Object) map37);
        java.lang.String str40 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str43 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap51.put(obj54, (java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate55, predicate57);
        boolean b59 = defaultedMap45.equals((java.lang.Object) map58);
        boolean b60 = defaultedMap42.equals((java.lang.Object) map58);
        defaultedMap21.putAll(map58);
        defaultedMap8.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj67 = null;
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj69 = defaultedMap64.put(obj67, (java.lang.Object) predicate68);
        java.lang.Object obj70 = defaultedMap21.get(obj69);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) 1 + "'", obj70.equals((short) 1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str23 = defaultedMap3.toString();
        boolean b24 = defaultedMap3.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) true);
        java.util.Set set33 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj44 = defaultedMap39.put(obj42, (java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate45);
        boolean b47 = defaultedMap30.equals((java.lang.Object) map46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str52 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj65 = defaultedMap60.put(obj63, (java.lang.Object) predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate64, predicate66);
        boolean b68 = defaultedMap54.equals((java.lang.Object) map67);
        boolean b69 = defaultedMap51.equals((java.lang.Object) map67);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        boolean b71 = defaultedMap30.equals((java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str74 = defaultedMap73.toString();
        java.util.Set set75 = defaultedMap73.keySet();
        java.lang.Object obj77 = defaultedMap73.remove((java.lang.Object) "");
        defaultedMap73.clear();
        boolean b80 = defaultedMap73.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj84 = defaultedMap82.remove((java.lang.Object) true);
        java.util.Set set85 = defaultedMap82.entrySet();
        java.lang.Object obj87 = defaultedMap82.get((java.lang.Object) 100.0d);
        boolean b89 = defaultedMap82.equals((java.lang.Object) 100L);
        boolean b91 = defaultedMap82.containsValue((java.lang.Object) 'a');
        boolean b92 = defaultedMap73.equals((java.lang.Object) b91);
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) defaultedMap30, (java.lang.Object) b91);
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + (short) 1 + "'", obj87.equals((short) 1));
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        boolean b25 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap36.put(obj39, (java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate42);
        boolean b44 = defaultedMap30.equals((java.lang.Object) map43);
        boolean b45 = defaultedMap27.equals((java.lang.Object) map43);
        java.lang.String str46 = defaultedMap27.toString();
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str50 = defaultedMap49.toString();
        java.util.Set set51 = defaultedMap49.keySet();
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.remove(obj52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str58 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj69 = null;
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj71 = defaultedMap66.put(obj69, (java.lang.Object) predicate70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate70, predicate72);
        boolean b74 = defaultedMap60.equals((java.lang.Object) map73);
        boolean b75 = defaultedMap57.equals((java.lang.Object) map73);
        defaultedMap55.putAll((java.util.Map) defaultedMap57);
        java.lang.String str77 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) str77);
        boolean b79 = defaultedMap78.isEmpty();
        defaultedMap49.putAll((java.util.Map) defaultedMap78);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj84 = defaultedMap82.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj85 = null;
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj87 = defaultedMap82.put(obj85, (java.lang.Object) predicate86);
        java.lang.Object obj88 = defaultedMap49.get(obj85);
        java.lang.Object obj89 = defaultedMap27.get((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + (short) 1 + "'", obj88.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (short) 1 + "'", obj89.equals((short) 1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str27 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap29.put(obj32, (java.lang.Object) predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate33, predicate35);
        java.lang.Object obj38 = defaultedMap26.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str41 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj48 = defaultedMap43.put(obj46, (java.lang.Object) predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate49);
        java.lang.Object obj52 = defaultedMap26.put((java.lang.Object) defaultedMap40, (java.lang.Object) (-1.0f));
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        java.lang.Object obj54 = defaultedMap40.get((java.lang.Object) predicateUtils53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap40);
        defaultedMap1.clear();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str60 = defaultedMap59.toString();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) true);
        java.util.Set set66 = defaultedMap63.entrySet();
        int i67 = defaultedMap63.size();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 0);
        defaultedMap69.putAll((java.util.Map) defaultedMap73);
        boolean b77 = defaultedMap63.containsKey((java.lang.Object) defaultedMap69);
        boolean b78 = defaultedMap59.containsKey((java.lang.Object) defaultedMap69);
        java.lang.Object obj79 = defaultedMap1.put((java.lang.Object) predicate57, (java.lang.Object) defaultedMap69);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 1 + "'", obj38.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) 1 + "'", obj54.equals((short) 1));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        boolean b20 = defaultedMap1.isEmpty();
        java.util.Set set21 = defaultedMap1.keySet();
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj40 = defaultedMap35.put(obj38, (java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate39, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap48.put(obj51, (java.lang.Object) predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate52, predicate54);
        java.util.Map map56 = collections.map.DefaultedMap.decorate(map42, (java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj61 = null;
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj63 = defaultedMap58.put(obj61, (java.lang.Object) predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate52, predicate62);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) true);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap7.equals((java.lang.Object) 100L);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj25 = defaultedMap20.put(obj23, (java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str28 = defaultedMap27.toString();
        java.util.Set set29 = defaultedMap27.keySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap27);
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj32 = defaultedMap7.get((java.lang.Object) defaultedMap27);
        boolean b33 = defaultedMap1.containsKey(obj32);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 1 + "'", obj12.equals((short) 1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 1 + "'", obj32.equals((short) 1));
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str23 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        boolean b25 = defaultedMap24.isEmpty();
        boolean b27 = defaultedMap24.containsKey((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Set set27 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj43 = defaultedMap38.put(obj41, (java.lang.Object) predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        boolean b46 = defaultedMap32.equals((java.lang.Object) map45);
        boolean b47 = defaultedMap29.equals((java.lang.Object) map45);
        boolean b48 = defaultedMap29.isEmpty();
        java.util.Set set49 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str52 = defaultedMap51.toString();
        java.util.Set set53 = defaultedMap51.keySet();
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) "");
        defaultedMap51.clear();
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) true);
        java.util.Set set63 = defaultedMap60.entrySet();
        java.lang.Object obj65 = defaultedMap60.get((java.lang.Object) 100.0d);
        boolean b67 = defaultedMap60.equals((java.lang.Object) 100L);
        boolean b69 = defaultedMap60.containsValue((java.lang.Object) 'a');
        boolean b70 = defaultedMap51.equals((java.lang.Object) b69);
        defaultedMap29.putAll((java.util.Map) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        collections.Factory factory74 = null;
        try {
            java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, factory74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 1 + "'", obj65.equals((short) 1));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj10 = null;
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj12 = defaultedMap7.put(obj10, (java.lang.Object) predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        boolean b15 = defaultedMap1.equals((java.lang.Object) map14);
        int i16 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str23 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        int i25 = defaultedMap24.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(i25 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj16 = defaultedMap11.put(obj14, (java.lang.Object) predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate15, predicate17);
        boolean b19 = defaultedMap4.containsKey((java.lang.Object) predicate17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) predicate17);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap1.containsKey(obj21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 1 + "'", obj20.equals((short) 1));
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate12, obj16);
        boolean b19 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj33 = null;
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj35 = defaultedMap30.put(obj33, (java.lang.Object) predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate36);
        boolean b38 = defaultedMap24.equals((java.lang.Object) map37);
        boolean b39 = defaultedMap21.equals((java.lang.Object) map37);
        java.lang.String str40 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str43 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap51.put(obj54, (java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate55, predicate57);
        boolean b59 = defaultedMap45.equals((java.lang.Object) map58);
        boolean b60 = defaultedMap42.equals((java.lang.Object) map58);
        defaultedMap21.putAll(map58);
        defaultedMap8.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (byte) 0);
        java.util.Set set67 = defaultedMap64.entrySet();
        boolean b68 = defaultedMap21.equals((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b68 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = null;
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj36 = defaultedMap31.put(obj34, (java.lang.Object) predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate35, predicate37);
        boolean b39 = defaultedMap25.equals((java.lang.Object) map38);
        boolean b40 = defaultedMap22.equals((java.lang.Object) map38);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        boolean b42 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str49 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj54 = null;
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj56 = defaultedMap51.put(obj54, (java.lang.Object) predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate55, predicate57);
        boolean b59 = defaultedMap44.containsKey((java.lang.Object) predicate57);
        boolean b60 = defaultedMap1.containsKey((java.lang.Object) b59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) true);
        boolean b66 = defaultedMap62.containsKey((java.lang.Object) 0);
        java.lang.String str67 = defaultedMap62.toString();
        boolean b68 = defaultedMap62.isEmpty();
        java.util.Set set69 = defaultedMap62.entrySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj79 = defaultedMap77.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj80 = null;
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj82 = defaultedMap77.put(obj80, (java.lang.Object) predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate81, predicate83);
        boolean b85 = defaultedMap71.equals((java.lang.Object) map84);
        java.lang.Object obj87 = defaultedMap71.remove((java.lang.Object) 0L);
        java.lang.String str88 = defaultedMap71.toString();
        java.lang.Object obj89 = defaultedMap1.put((java.lang.Object) defaultedMap62, (java.lang.Object) str88);
        java.util.Collection collection90 = defaultedMap62.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "{}" + "'", str88.equals("{}"));
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(collection90);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        int i35 = defaultedMap18.size();
        defaultedMap18.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(i35 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.util.Set set12 = defaultedMap10.keySet();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) "");
        defaultedMap10.clear();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap10);
        java.util.Set set17 = defaultedMap5.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) map30);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set9 = defaultedMap1.keySet();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj45 = defaultedMap40.put(obj43, (java.lang.Object) predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate44, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str53 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj64 = null;
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj66 = defaultedMap61.put(obj64, (java.lang.Object) predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate65, predicate67);
        boolean b69 = defaultedMap55.equals((java.lang.Object) map68);
        boolean b70 = defaultedMap52.equals((java.lang.Object) map68);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        int i72 = defaultedMap50.size();
        java.util.Set set73 = defaultedMap50.keySet();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) set73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str77 = defaultedMap76.toString();
        java.util.Set set78 = defaultedMap76.keySet();
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = defaultedMap76.remove(obj79);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap76);
        java.util.Map map82 = collections.map.DefaultedMap.decorate(map74, (java.lang.Object) defaultedMap76);
        java.lang.Object obj83 = defaultedMap1.get((java.lang.Object) map82);
        java.util.Set set84 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) 1 + "'", obj83.equals((short) 1));
        org.junit.Assert.assertNotNull(set84);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str23 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj45 = defaultedMap40.put(obj43, (java.lang.Object) predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate44, predicate46);
        boolean b48 = defaultedMap34.equals((java.lang.Object) map47);
        boolean b49 = defaultedMap31.equals((java.lang.Object) map47);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) (byte) 0);
        defaultedMap29.putAll((java.util.Map) defaultedMap52);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        boolean b57 = defaultedMap27.isEmpty();
        boolean b58 = defaultedMap27.isEmpty();
        java.lang.Object obj59 = defaultedMap24.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj70 = null;
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj72 = defaultedMap67.put(obj70, (java.lang.Object) predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate71, predicate73);
        boolean b75 = defaultedMap61.equals((java.lang.Object) map74);
        defaultedMap24.putAll((java.util.Map) defaultedMap61);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "{}" + "'", obj59.equals("{}"));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap3.put(obj6, (java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.util.Set set12 = defaultedMap10.keySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap10);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) true);
        java.lang.Object obj19 = defaultedMap10.put((java.lang.Object) predicate14, obj18);
        try {
            java.util.Map map20 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str33 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj38 = null;
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj40 = defaultedMap35.put(obj38, (java.lang.Object) predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate39, predicate41);
        boolean b43 = defaultedMap28.containsKey((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = null;
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str53 = defaultedMap52.toString();
        java.util.Set set54 = defaultedMap52.keySet();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap52);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) true);
        java.lang.Object obj61 = defaultedMap52.put((java.lang.Object) predicate56, obj60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate41, predicate56);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) true);
        java.util.Set set67 = defaultedMap64.entrySet();
        java.lang.Object obj69 = defaultedMap64.get((java.lang.Object) 100.0d);
        boolean b71 = defaultedMap64.equals((java.lang.Object) 100L);
        boolean b73 = defaultedMap64.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj79 = defaultedMap77.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj80 = null;
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj82 = defaultedMap77.put(obj80, (java.lang.Object) predicate81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str85 = defaultedMap84.toString();
        java.util.Set set86 = defaultedMap84.keySet();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap77, (java.lang.Object) defaultedMap84);
        defaultedMap75.putAll((java.util.Map) defaultedMap84);
        java.lang.Object obj89 = defaultedMap64.get((java.lang.Object) defaultedMap84);
        java.util.Set set90 = defaultedMap64.keySet();
        int i91 = defaultedMap64.size();
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) i91);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (short) 1 + "'", obj69.equals((short) 1));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (short) 1 + "'", obj89.equals((short) 1));
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue(i91 == 0);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str37 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj44 = defaultedMap39.put(obj42, (java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate43, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj51 = null;
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj53 = defaultedMap48.put(obj51, (java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str56 = defaultedMap55.toString();
        java.util.Set set57 = defaultedMap55.keySet();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap55);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) true);
        java.lang.Object obj64 = defaultedMap55.put((java.lang.Object) predicate59, obj63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate43, predicate59);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) true);
        java.util.Set set70 = defaultedMap67.entrySet();
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) 100.0d);
        int i73 = defaultedMap67.size();
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = defaultedMap67.get(obj74);
        java.lang.String str76 = defaultedMap67.toString();
        boolean b77 = defaultedMap1.containsValue((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (short) 1 + "'", obj72.equals((short) 1));
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + (short) 1 + "'", obj75.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj31 = defaultedMap26.put(obj29, (java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str34 = defaultedMap33.toString();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap33);
        java.lang.String str37 = defaultedMap33.toString();
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap33);
        java.util.Set set39 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) true);
        java.util.Set set44 = defaultedMap41.entrySet();
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) 100.0d);
        boolean b48 = defaultedMap41.equals((java.lang.Object) 100L);
        boolean b50 = defaultedMap41.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = defaultedMap54.put(obj57, (java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str62 = defaultedMap61.toString();
        java.util.Set set63 = defaultedMap61.keySet();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) defaultedMap61);
        defaultedMap52.putAll((java.util.Map) defaultedMap61);
        java.lang.Object obj66 = defaultedMap41.get((java.lang.Object) defaultedMap61);
        java.util.Collection collection67 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) true);
        java.util.Set set72 = defaultedMap69.entrySet();
        java.lang.Object obj74 = defaultedMap69.get((java.lang.Object) 100.0d);
        boolean b76 = defaultedMap69.equals((java.lang.Object) 100L);
        boolean b78 = defaultedMap69.containsValue((java.lang.Object) 'a');
        defaultedMap41.putAll((java.util.Map) defaultedMap69);
        java.lang.Object obj80 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 1 + "'", obj46.equals((short) 1));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 1 + "'", obj66.equals((short) 1));
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 1 + "'", obj74.equals((short) 1));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + (short) 1 + "'", obj80.equals((short) 1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put(obj18, (java.lang.Object) predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate21);
        boolean b23 = defaultedMap8.containsKey((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) true);
        java.util.Set set28 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.get((java.lang.Object) 100.0d);
        defaultedMap25.clear();
        java.lang.Object obj32 = defaultedMap8.remove((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str39 = defaultedMap38.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap41.put(obj44, (java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate45, predicate47);
        boolean b49 = defaultedMap34.containsKey((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) true);
        java.util.Set set54 = defaultedMap51.entrySet();
        java.lang.Object obj56 = defaultedMap51.get((java.lang.Object) 100.0d);
        defaultedMap51.clear();
        java.lang.Object obj58 = defaultedMap34.remove((java.lang.Object) defaultedMap51);
        java.lang.Object obj59 = defaultedMap25.get((java.lang.Object) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 0);
        java.util.Set set65 = defaultedMap62.entrySet();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj73 = defaultedMap71.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj74 = null;
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj76 = defaultedMap71.put(obj74, (java.lang.Object) predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate75, predicate77);
        defaultedMap67.clear();
        java.lang.Object obj80 = defaultedMap25.put((java.lang.Object) defaultedMap62, (java.lang.Object) defaultedMap67);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 1 + "'", obj30.equals((short) 1));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + (short) 1 + "'", obj56.equals((short) 1));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 1 + "'", obj59.equals((short) 1));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate20);
        boolean b22 = defaultedMap8.equals((java.lang.Object) map21);
        boolean b23 = defaultedMap5.equals((java.lang.Object) map21);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        defaultedMap3.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b31 = defaultedMap1.isEmpty();
        boolean b32 = defaultedMap1.isEmpty();
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        boolean b25 = defaultedMap1.isEmpty();
        java.util.Set set26 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj43 = null;
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj45 = defaultedMap40.put(obj43, (java.lang.Object) predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate44, predicate46);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str53 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj64 = null;
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj66 = defaultedMap61.put(obj64, (java.lang.Object) predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate65, predicate67);
        boolean b69 = defaultedMap55.equals((java.lang.Object) map68);
        boolean b70 = defaultedMap52.equals((java.lang.Object) map68);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        int i72 = defaultedMap50.size();
        java.util.Set set73 = defaultedMap50.keySet();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) set73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str77 = defaultedMap76.toString();
        java.util.Set set78 = defaultedMap76.keySet();
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = defaultedMap76.remove(obj79);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap76);
        java.util.Map map82 = collections.map.DefaultedMap.decorate(map74, (java.lang.Object) defaultedMap76);
        java.lang.Object obj83 = defaultedMap1.get((java.lang.Object) map82);
        java.util.Collection collection84 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + (short) 1 + "'", obj83.equals((short) 1));
        org.junit.Assert.assertNotNull(collection84);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str37 = defaultedMap36.toString();
        int i38 = defaultedMap36.size();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap36.get((java.lang.Object) predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj54 = defaultedMap49.put(obj52, (java.lang.Object) predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate53, predicate55);
        boolean b57 = defaultedMap43.equals((java.lang.Object) map56);
        java.lang.Object obj59 = defaultedMap43.remove((java.lang.Object) 0L);
        defaultedMap18.putAll((java.util.Map) defaultedMap43);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 1 + "'", obj40.equals((short) 1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str23 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put(obj28, (java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str33 = defaultedMap32.toString();
        java.util.Set set34 = defaultedMap32.keySet();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap32);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) true);
        java.lang.Object obj41 = defaultedMap32.put((java.lang.Object) predicate36, obj40);
        boolean b42 = defaultedMap3.containsValue(obj41);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        java.util.Set set25 = defaultedMap1.keySet();
        java.util.Set set26 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        boolean b20 = defaultedMap1.isEmpty();
        java.util.Set set21 = defaultedMap1.keySet();
        java.util.Set set22 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str25 = defaultedMap24.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate31, predicate33);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) map34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj44 = null;
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap41.put(obj44, (java.lang.Object) predicate45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate45, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = defaultedMap54.put(obj57, (java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate60);
        java.util.Map map62 = collections.map.DefaultedMap.decorate(map48, (java.lang.Object) predicate58);
        boolean b63 = defaultedMap1.containsKey((java.lang.Object) predicate58);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 1 + "'", obj35.equals((short) 1));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) map17);
        int i19 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap29.put(obj32, (java.lang.Object) predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate33, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) true);
        java.util.Set set41 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj50 = null;
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj52 = defaultedMap47.put(obj50, (java.lang.Object) predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate51, predicate53);
        boolean b55 = defaultedMap38.equals((java.lang.Object) map54);
        defaultedMap25.putAll(map54);
        boolean b57 = defaultedMap21.containsValue((java.lang.Object) defaultedMap25);
        boolean b58 = defaultedMap1.equals((java.lang.Object) defaultedMap21);
        collections.Transformer transformer59 = null;
        try {
            java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str23 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) str23);
        boolean b25 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap34.put(obj37, (java.lang.Object) predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate38, predicate40);
        boolean b42 = defaultedMap27.containsKey((java.lang.Object) predicate40);
        java.lang.Object obj43 = defaultedMap24.remove((java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str46 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = defaultedMap54.put(obj57, (java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate60);
        boolean b62 = defaultedMap48.equals((java.lang.Object) map61);
        boolean b63 = defaultedMap45.equals((java.lang.Object) map61);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) b63);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(map64);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj8 = defaultedMap3.put(obj6, (java.lang.Object) predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.util.Set set12 = defaultedMap10.keySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.entrySet();
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) 100.0d);
        boolean b23 = defaultedMap16.equals((java.lang.Object) 100L);
        boolean b25 = defaultedMap16.containsValue((java.lang.Object) 'a');
        java.util.Collection collection26 = defaultedMap16.values();
        java.lang.Object obj27 = defaultedMap10.remove((java.lang.Object) collection26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 0);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 1 + "'", obj21.equals((short) 1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj16 = defaultedMap11.put(obj14, (java.lang.Object) predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate17);
        int i20 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str23 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put(obj28, (java.lang.Object) predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate29, predicate31);
        java.lang.Object obj34 = defaultedMap22.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str37 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj44 = defaultedMap39.put(obj42, (java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate43, predicate45);
        java.lang.Object obj48 = defaultedMap22.put((java.lang.Object) defaultedMap36, (java.lang.Object) (-1.0f));
        boolean b49 = defaultedMap1.containsKey(obj48);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 1 + "'", obj34.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) true);
        java.util.Set set10 = defaultedMap7.entrySet();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 100.0d);
        boolean b14 = defaultedMap7.equals((java.lang.Object) 100L);
        boolean b16 = defaultedMap7.containsValue((java.lang.Object) 'a');
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 1 + "'", obj12.equals((short) 1));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 1 + "'", obj17.equals((short) 1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        defaultedMap1.clear();
        java.util.Set set29 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (byte) 0);
        defaultedMap9.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str19 = defaultedMap18.toString();
        java.util.Set set20 = defaultedMap18.keySet();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) "");
        defaultedMap18.clear();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap18);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 1 + "'", obj25.equals((short) 1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        boolean b31 = defaultedMap14.equals((java.lang.Object) map30);
        defaultedMap1.putAll(map30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str35 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap37.put(obj40, (java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate41, predicate43);
        boolean b45 = defaultedMap1.containsValue((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str50 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj61 = null;
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj63 = defaultedMap58.put(obj61, (java.lang.Object) predicate62);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate62, predicate64);
        boolean b66 = defaultedMap52.equals((java.lang.Object) map65);
        boolean b67 = defaultedMap49.equals((java.lang.Object) map65);
        defaultedMap47.putAll((java.util.Map) defaultedMap49);
        int i69 = defaultedMap47.size();
        java.util.Set set70 = defaultedMap47.entrySet();
        boolean b71 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str74 = defaultedMap73.toString();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj84 = defaultedMap82.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj85 = null;
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj87 = defaultedMap82.put(obj85, (java.lang.Object) predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate86, predicate88);
        boolean b90 = defaultedMap76.equals((java.lang.Object) map89);
        boolean b91 = defaultedMap73.equals((java.lang.Object) map89);
        java.lang.String str92 = defaultedMap73.toString();
        boolean b93 = defaultedMap47.containsValue((java.lang.Object) defaultedMap73);
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap73);
        java.util.Set set95 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "{}" + "'", str92.equals("{}"));
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        boolean b16 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Set set27 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap29.put(obj32, (java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str37 = defaultedMap36.toString();
        java.util.Set set38 = defaultedMap36.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) true);
        java.lang.Object obj45 = defaultedMap36.put((java.lang.Object) predicate40, obj44);
        boolean b47 = defaultedMap36.equals((java.lang.Object) "");
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str55 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj60 = null;
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj62 = defaultedMap57.put(obj60, (java.lang.Object) predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate61, predicate63);
        boolean b65 = defaultedMap50.containsKey((java.lang.Object) predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) true);
        java.util.Set set70 = defaultedMap67.entrySet();
        java.lang.Object obj72 = defaultedMap67.get((java.lang.Object) 100.0d);
        defaultedMap67.clear();
        java.lang.Object obj74 = defaultedMap50.remove((java.lang.Object) defaultedMap67);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj79 = null;
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj81 = defaultedMap76.put(obj79, (java.lang.Object) predicate80);
        java.util.Collection collection82 = defaultedMap76.values();
        defaultedMap67.putAll((java.util.Map) defaultedMap76);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str86 = defaultedMap85.toString();
        int i87 = defaultedMap85.size();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj89 = defaultedMap85.get((java.lang.Object) predicate88);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) defaultedMap85);
        java.lang.Object obj91 = defaultedMap1.get((java.lang.Object) defaultedMap85);
        java.util.Set set92 = defaultedMap85.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (short) 1 + "'", obj72.equals((short) 1));
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + (short) 1 + "'", obj89.equals((short) 1));
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + (short) 1 + "'", obj91.equals((short) 1));
        org.junit.Assert.assertNotNull(set92);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str14 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = null;
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj27 = defaultedMap22.put(obj25, (java.lang.Object) predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate26, predicate28);
        boolean b30 = defaultedMap16.equals((java.lang.Object) map29);
        boolean b31 = defaultedMap13.equals((java.lang.Object) map29);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        defaultedMap11.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) true);
        java.util.Set set42 = defaultedMap39.entrySet();
        java.lang.Object obj44 = defaultedMap39.get((java.lang.Object) 100.0d);
        java.lang.Object obj47 = defaultedMap39.put((java.lang.Object) (-1L), (java.lang.Object) ' ');
        defaultedMap11.putAll((java.util.Map) defaultedMap39);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap39);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 1 + "'", obj44.equals((short) 1));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str7 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = null;
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj20 = defaultedMap15.put(obj18, (java.lang.Object) predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate19, predicate21);
        boolean b23 = defaultedMap9.equals((java.lang.Object) map22);
        boolean b24 = defaultedMap6.equals((java.lang.Object) map22);
        java.lang.String str25 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap36.put(obj39, (java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate42);
        boolean b44 = defaultedMap30.equals((java.lang.Object) map43);
        boolean b45 = defaultedMap27.equals((java.lang.Object) map43);
        defaultedMap6.putAll(map43);
        java.util.Collection collection47 = defaultedMap6.values();
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set49 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 1 + "'", obj48.equals((short) 1));
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj24 = defaultedMap19.put(obj22, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str27 = defaultedMap26.toString();
        java.util.Set set28 = defaultedMap26.keySet();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap26);
        defaultedMap17.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) true);
        java.util.Set set35 = defaultedMap32.entrySet();
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) 100.0d);
        boolean b39 = defaultedMap32.equals((java.lang.Object) 100L);
        boolean b41 = defaultedMap32.containsValue((java.lang.Object) 'a');
        java.util.Collection collection42 = defaultedMap32.values();
        java.lang.Object obj43 = defaultedMap26.remove((java.lang.Object) collection42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 1 + "'", obj37.equals((short) 1));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap21);
        defaultedMap12.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        java.util.Set set27 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap29.put(obj32, (java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str37 = defaultedMap36.toString();
        java.util.Set set38 = defaultedMap36.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap36);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) true);
        java.lang.Object obj45 = defaultedMap36.put((java.lang.Object) predicate40, obj44);
        boolean b47 = defaultedMap36.equals((java.lang.Object) "");
        defaultedMap1.putAll((java.util.Map) defaultedMap36);
        java.lang.String str49 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 1 + "'", obj26.equals((short) 1));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate12, obj16);
        boolean b19 = defaultedMap8.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = null;
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj30 = defaultedMap25.put(obj28, (java.lang.Object) predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) true);
        java.util.Set set37 = defaultedMap34.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj48 = defaultedMap43.put(obj46, (java.lang.Object) predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate47, predicate49);
        boolean b51 = defaultedMap34.equals((java.lang.Object) map50);
        defaultedMap21.putAll(map50);
        java.lang.Object obj54 = defaultedMap21.get((java.lang.Object) 10L);
        java.util.Set set55 = defaultedMap21.entrySet();
        int i56 = defaultedMap21.size();
        boolean b57 = defaultedMap8.equals((java.lang.Object) i56);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) 1 + "'", obj54.equals((short) 1));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap8.put((java.lang.Object) predicate12, obj16);
        boolean b19 = defaultedMap8.equals((java.lang.Object) "");
        java.lang.String str20 = defaultedMap8.toString();
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = null;
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj16 = defaultedMap11.put(obj14, (java.lang.Object) predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate17);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate17);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map19, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str9 = defaultedMap8.toString();
        java.util.Set set10 = defaultedMap8.keySet();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap8.remove(obj11);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj24 = defaultedMap19.put(obj22, (java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) predicate23);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) true);
        java.util.Set set33 = defaultedMap30.entrySet();
        java.lang.Object obj35 = defaultedMap30.get((java.lang.Object) 100.0d);
        boolean b37 = defaultedMap30.equals((java.lang.Object) 100L);
        boolean b39 = defaultedMap30.containsValue((java.lang.Object) 'a');
        java.util.Collection collection40 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj45 = null;
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj47 = defaultedMap42.put(obj45, (java.lang.Object) predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str50 = defaultedMap49.toString();
        java.util.Set set51 = defaultedMap49.keySet();
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) defaultedMap49);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) true);
        java.lang.Object obj58 = defaultedMap49.put((java.lang.Object) predicate53, obj57);
        boolean b60 = defaultedMap49.equals((java.lang.Object) "");
        java.lang.Object obj61 = defaultedMap30.get((java.lang.Object) "");
        java.lang.Object obj62 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj71 = null;
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj73 = defaultedMap68.put(obj71, (java.lang.Object) predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate72, predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate72, predicate76);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 1 + "'", obj35.equals((short) 1));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) 1 + "'", obj61.equals((short) 1));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        java.util.Set set13 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj24 = defaultedMap19.put(obj22, (java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        boolean b27 = defaultedMap10.equals((java.lang.Object) map26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap36.put(obj39, (java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate42, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = defaultedMap54.put(obj57, (java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate60, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate44, predicate62);
        java.lang.Object obj65 = defaultedMap1.remove((java.lang.Object) map64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str72 = defaultedMap71.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj77 = null;
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj79 = defaultedMap74.put(obj77, (java.lang.Object) predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate78, predicate80);
        boolean b82 = defaultedMap67.containsKey((java.lang.Object) predicate80);
        java.lang.Object obj83 = null;
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, obj83);
        defaultedMap67.clear();
        java.lang.Object obj86 = defaultedMap1.get((java.lang.Object) defaultedMap67);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + (short) 1 + "'", obj86.equals((short) 1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj31 = defaultedMap26.put(obj29, (java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str34 = defaultedMap33.toString();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap33);
        java.lang.String str37 = defaultedMap33.toString();
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) true);
        java.util.Set set43 = defaultedMap40.entrySet();
        java.lang.Object obj45 = defaultedMap40.get((java.lang.Object) 100.0d);
        boolean b47 = defaultedMap40.equals((java.lang.Object) 100L);
        boolean b49 = defaultedMap40.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj56 = null;
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj58 = defaultedMap53.put(obj56, (java.lang.Object) predicate57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str61 = defaultedMap60.toString();
        java.util.Set set62 = defaultedMap60.keySet();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap60);
        defaultedMap51.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj65 = defaultedMap40.get((java.lang.Object) defaultedMap60);
        java.util.Collection collection66 = defaultedMap40.values();
        boolean b67 = defaultedMap1.equals((java.lang.Object) defaultedMap40);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 1 + "'", obj45.equals((short) 1));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 1 + "'", obj65.equals((short) 1));
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(b67 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str22 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj29 = defaultedMap24.put(obj27, (java.lang.Object) predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate28, predicate30);
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str36 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj41 = null;
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj43 = defaultedMap38.put(obj41, (java.lang.Object) predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate42, predicate44);
        java.lang.Object obj47 = defaultedMap21.put((java.lang.Object) defaultedMap35, (java.lang.Object) (-1.0f));
        defaultedMap21.clear();
        boolean b49 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str52 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj63 = null;
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj65 = defaultedMap60.put(obj63, (java.lang.Object) predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate64, predicate66);
        boolean b68 = defaultedMap54.equals((java.lang.Object) map67);
        boolean b69 = defaultedMap51.equals((java.lang.Object) map67);
        java.lang.Object obj70 = defaultedMap21.get((java.lang.Object) map67);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj70);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 1 + "'", obj33.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) 1 + "'", obj70.equals((short) 1));
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        java.util.Set set13 = defaultedMap10.entrySet();
        java.lang.Object obj15 = defaultedMap10.get((java.lang.Object) 100.0d);
        boolean b17 = defaultedMap10.equals((java.lang.Object) 100L);
        boolean b19 = defaultedMap10.containsValue((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Set set32 = defaultedMap30.keySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap30);
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        java.lang.Object obj35 = defaultedMap10.get((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str42 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap44.put(obj47, (java.lang.Object) predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate48, predicate50);
        boolean b52 = defaultedMap37.containsKey((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = defaultedMap54.put(obj57, (java.lang.Object) predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str62 = defaultedMap61.toString();
        java.util.Set set63 = defaultedMap61.keySet();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) defaultedMap61);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) true);
        java.lang.Object obj70 = defaultedMap61.put((java.lang.Object) predicate65, obj69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate50, predicate65);
        java.lang.Object obj72 = defaultedMap5.get((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj77 = null;
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj79 = defaultedMap74.put(obj77, (java.lang.Object) predicate78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str82 = defaultedMap81.toString();
        java.util.Set set83 = defaultedMap81.keySet();
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) defaultedMap81);
        java.lang.Object obj85 = defaultedMap5.get((java.lang.Object) map84);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) 1 + "'", obj15.equals((short) 1));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 1 + "'", obj35.equals((short) 1));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + (short) 1 + "'", obj72.equals((short) 1));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (short) 1 + "'", obj85.equals((short) 1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.lang.String str16 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        boolean b25 = defaultedMap1.isEmpty();
        java.lang.String str26 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        defaultedMap1.clear();
        boolean b29 = defaultedMap1.isEmpty();
        boolean b30 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = null;
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj26 = defaultedMap21.put(obj24, (java.lang.Object) predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        boolean b29 = defaultedMap15.equals((java.lang.Object) map28);
        boolean b30 = defaultedMap12.equals((java.lang.Object) map28);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap33);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        java.util.Collection collection38 = defaultedMap10.values();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap10, (java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str43 = defaultedMap42.toString();
        java.util.Set set44 = defaultedMap42.keySet();
        java.lang.String str45 = defaultedMap42.toString();
        boolean b47 = defaultedMap42.containsValue((java.lang.Object) 10);
        defaultedMap10.putAll((java.util.Map) defaultedMap42);
        java.lang.String str49 = defaultedMap10.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = null;
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj31 = defaultedMap26.put(obj29, (java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str34 = defaultedMap33.toString();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap33);
        java.lang.String str37 = defaultedMap33.toString();
        boolean b38 = defaultedMap1.containsValue((java.lang.Object) defaultedMap33);
        int i39 = defaultedMap33.size();
        collections.Transformer transformer40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, transformer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = null;
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap14.put(obj17, (java.lang.Object) predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate(map21, (java.lang.Object) predicate31);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str38 = defaultedMap37.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj49 = null;
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj51 = defaultedMap46.put(obj49, (java.lang.Object) predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate50, predicate52);
        boolean b54 = defaultedMap40.equals((java.lang.Object) map53);
        boolean b55 = defaultedMap37.equals((java.lang.Object) map53);
        java.lang.String str56 = defaultedMap37.toString();
        java.util.Map map57 = collections.map.DefaultedMap.decorate(map35, (java.lang.Object) str56);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) map57);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        boolean b25 = defaultedMap1.isEmpty();
        java.util.Collection collection26 = defaultedMap1.values();
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap1.containsKey(obj27);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = null;
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj32 = defaultedMap27.put(obj30, (java.lang.Object) predicate31);
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj25 = defaultedMap20.put(obj23, (java.lang.Object) predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        boolean b28 = defaultedMap14.equals((java.lang.Object) map27);
        boolean b29 = defaultedMap11.equals((java.lang.Object) map27);
        boolean b30 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str34 = defaultedMap33.toString();
        java.util.Set set35 = defaultedMap33.keySet();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap33.remove(obj36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        java.lang.Object obj39 = defaultedMap11.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str47 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj54 = defaultedMap49.put(obj52, (java.lang.Object) predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate53, predicate55);
        boolean b57 = defaultedMap42.containsKey((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) true);
        java.util.Set set62 = defaultedMap59.entrySet();
        java.lang.Object obj64 = defaultedMap59.get((java.lang.Object) 100.0d);
        defaultedMap59.clear();
        java.lang.Object obj66 = defaultedMap42.remove((java.lang.Object) defaultedMap59);
        java.lang.Object obj68 = defaultedMap59.remove((java.lang.Object) "");
        boolean b70 = defaultedMap59.containsValue((java.lang.Object) true);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap59);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 1 + "'", obj39.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 1 + "'", obj40.equals((short) 1));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 1 + "'", obj64.equals((short) 1));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        java.lang.String str20 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj27 = null;
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj29 = defaultedMap24.put(obj27, (java.lang.Object) predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str32 = defaultedMap31.toString();
        java.util.Set set33 = defaultedMap31.keySet();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap31);
        defaultedMap22.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) true);
        java.util.Set set40 = defaultedMap37.entrySet();
        java.lang.Object obj42 = defaultedMap37.get((java.lang.Object) 100.0d);
        boolean b44 = defaultedMap37.equals((java.lang.Object) 100L);
        boolean b46 = defaultedMap37.containsValue((java.lang.Object) 'a');
        java.util.Collection collection47 = defaultedMap37.values();
        java.lang.Object obj48 = defaultedMap31.remove((java.lang.Object) collection47);
        java.lang.Object obj49 = defaultedMap1.get(obj48);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 1 + "'", obj42.equals((short) 1));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 1 + "'", obj49.equals((short) 1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set4 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        boolean b20 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = null;
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap23.put(obj26, (java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str31 = defaultedMap30.toString();
        java.util.Set set32 = defaultedMap30.keySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap30);
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        boolean b25 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap36.put(obj39, (java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate42);
        boolean b44 = defaultedMap30.equals((java.lang.Object) map43);
        boolean b45 = defaultedMap27.equals((java.lang.Object) map43);
        java.lang.String str46 = defaultedMap27.toString();
        boolean b47 = defaultedMap1.containsValue((java.lang.Object) defaultedMap27);
        defaultedMap27.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        int i23 = defaultedMap1.size();
        java.util.Set set24 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str27 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = null;
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap29.put(obj32, (java.lang.Object) predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate33, predicate35);
        java.lang.Object obj38 = defaultedMap26.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str41 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj46 = null;
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj48 = defaultedMap43.put(obj46, (java.lang.Object) predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate49);
        java.lang.Object obj52 = defaultedMap26.put((java.lang.Object) defaultedMap40, (java.lang.Object) (-1.0f));
        collections.PredicateUtils predicateUtils53 = new collections.PredicateUtils();
        java.lang.Object obj54 = defaultedMap40.get((java.lang.Object) predicateUtils53);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap40);
        java.util.Set set56 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 1 + "'", obj38.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) 1 + "'", obj54.equals((short) 1));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(set56);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        boolean b26 = defaultedMap11.containsKey((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) true);
        java.util.Set set31 = defaultedMap28.entrySet();
        java.lang.Object obj33 = defaultedMap28.get((java.lang.Object) 100.0d);
        defaultedMap28.clear();
        java.lang.Object obj35 = defaultedMap11.remove((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str42 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj47 = null;
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj49 = defaultedMap44.put(obj47, (java.lang.Object) predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate48, predicate50);
        boolean b52 = defaultedMap37.containsKey((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) true);
        java.util.Set set57 = defaultedMap54.entrySet();
        java.lang.Object obj59 = defaultedMap54.get((java.lang.Object) 100.0d);
        defaultedMap54.clear();
        java.lang.Object obj61 = defaultedMap37.remove((java.lang.Object) defaultedMap54);
        java.lang.Object obj62 = defaultedMap28.get((java.lang.Object) defaultedMap54);
        boolean b63 = defaultedMap1.equals((java.lang.Object) defaultedMap54);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) 1 + "'", obj33.equals((short) 1));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 1 + "'", obj59.equals((short) 1));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + (short) 1 + "'", obj62.equals((short) 1));
        org.junit.Assert.assertTrue(b63 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate16);
        boolean b18 = defaultedMap4.equals((java.lang.Object) map17);
        boolean b19 = defaultedMap1.equals((java.lang.Object) map17);
        int i20 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate12, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) true);
        java.util.Set set22 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj31 = null;
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj33 = defaultedMap28.put(obj31, (java.lang.Object) predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate32, predicate34);
        boolean b36 = defaultedMap19.equals((java.lang.Object) map35);
        int i37 = defaultedMap19.size();
        java.lang.Object obj38 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        java.lang.Object obj17 = null;
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj17);
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.util.Set set12 = defaultedMap10.keySet();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) "");
        defaultedMap10.clear();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 100L);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) 'a');
        java.util.Collection collection28 = defaultedMap18.values();
        boolean b29 = defaultedMap10.equals((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str32 = defaultedMap31.toString();
        java.util.Set set33 = defaultedMap31.keySet();
        java.lang.String str34 = defaultedMap31.toString();
        defaultedMap18.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap31.equals(obj36);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str6 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj11 = null;
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) predicate12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate12, predicate14);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        defaultedMap18.clear();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        java.util.Collection collection26 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str8 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = null;
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj15 = defaultedMap10.put(obj13, (java.lang.Object) predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate16);
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) 100.0d);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str23 = defaultedMap22.toString();
        java.util.Set set24 = defaultedMap22.keySet();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap22.remove(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str31 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = null;
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj44 = defaultedMap39.put(obj42, (java.lang.Object) predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate45);
        boolean b47 = defaultedMap33.equals((java.lang.Object) map46);
        boolean b48 = defaultedMap30.equals((java.lang.Object) map46);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str50 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) str50);
        boolean b52 = defaultedMap51.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) true);
        java.util.Set set59 = defaultedMap56.entrySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate(map54, (java.lang.Object) set59);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 1 + "'", obj19.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 1 + "'", obj20.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str8 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = null;
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj21 = defaultedMap16.put(obj19, (java.lang.Object) predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate20, predicate22);
        boolean b24 = defaultedMap10.equals((java.lang.Object) map23);
        boolean b25 = defaultedMap7.equals((java.lang.Object) map23);
        boolean b26 = defaultedMap7.isEmpty();
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte) 0 + "'", obj3.equals((byte) 0));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj8 = null;
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj10 = defaultedMap5.put(obj8, (java.lang.Object) predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate22, predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) predicate22);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate(map12, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        boolean b28 = defaultedMap24.isEmpty();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap11);
        java.util.Set set15 = defaultedMap7.keySet();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) set15);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = null;
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        boolean b20 = defaultedMap6.equals((java.lang.Object) map19);
        boolean b21 = defaultedMap3.equals((java.lang.Object) map19);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap24);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str34 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap36.put(obj39, (java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate40, predicate42);
        boolean b44 = defaultedMap29.containsKey((java.lang.Object) predicate42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) true);
        java.util.Set set49 = defaultedMap46.entrySet();
        java.lang.Object obj51 = defaultedMap46.get((java.lang.Object) 100.0d);
        defaultedMap46.clear();
        java.lang.Object obj53 = defaultedMap29.remove((java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = null;
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj60 = defaultedMap55.put(obj58, (java.lang.Object) predicate59);
        java.util.Collection collection61 = defaultedMap55.values();
        defaultedMap46.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str65 = defaultedMap64.toString();
        int i66 = defaultedMap64.size();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) predicate67);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) defaultedMap64);
        boolean b70 = defaultedMap24.containsKey((java.lang.Object) map69);
        collections.Transformer transformer71 = null;
        try {
            java.util.Map map72 = collections.map.DefaultedMap.decorate(map69, transformer71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 1 + "'", obj51.equals((short) 1));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + (short) 1 + "'", obj68.equals((short) 1));
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        boolean b8 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) 'a');
        java.util.Collection collection11 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = null;
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj18 = defaultedMap13.put(obj16, (java.lang.Object) predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str21 = defaultedMap20.toString();
        java.util.Set set22 = defaultedMap20.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap20);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) true);
        java.lang.Object obj29 = defaultedMap20.put((java.lang.Object) predicate24, obj28);
        boolean b31 = defaultedMap20.equals((java.lang.Object) "");
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = null;
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap34.put(obj37, (java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str42 = defaultedMap41.toString();
        java.util.Set set43 = defaultedMap41.keySet();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap41);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) true);
        java.lang.Object obj50 = defaultedMap41.put((java.lang.Object) predicate45, obj49);
        boolean b52 = defaultedMap41.equals((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str55 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj66 = null;
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj68 = defaultedMap63.put(obj66, (java.lang.Object) predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate67, predicate69);
        boolean b71 = defaultedMap57.equals((java.lang.Object) map70);
        boolean b72 = defaultedMap54.equals((java.lang.Object) map70);
        java.lang.String str73 = defaultedMap54.toString();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str76 = defaultedMap75.toString();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj86 = defaultedMap84.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj87 = null;
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj89 = defaultedMap84.put(obj87, (java.lang.Object) predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate88, predicate90);
        boolean b92 = defaultedMap78.equals((java.lang.Object) map91);
        boolean b93 = defaultedMap75.equals((java.lang.Object) map91);
        defaultedMap54.putAll(map91);
        defaultedMap41.putAll((java.util.Map) defaultedMap54);
        boolean b96 = defaultedMap1.equals((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 1 + "'", obj32.equals((short) 1));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue(b93 == true);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str11 = defaultedMap10.toString();
        java.util.Set set12 = defaultedMap10.keySet();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) "");
        defaultedMap10.clear();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Set set21 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 100.0d);
        boolean b25 = defaultedMap18.equals((java.lang.Object) 100L);
        boolean b27 = defaultedMap18.containsValue((java.lang.Object) 'a');
        java.util.Collection collection28 = defaultedMap18.values();
        boolean b29 = defaultedMap10.equals((java.lang.Object) defaultedMap18);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 1 + "'", obj23.equals((short) 1));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str35 = defaultedMap34.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj40 = null;
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj42 = defaultedMap37.put(obj40, (java.lang.Object) predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate41, predicate43);
        boolean b45 = defaultedMap30.containsKey((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) true);
        java.util.Set set50 = defaultedMap47.entrySet();
        java.lang.Object obj52 = defaultedMap47.get((java.lang.Object) 100.0d);
        defaultedMap47.clear();
        java.lang.Object obj54 = defaultedMap30.remove((java.lang.Object) defaultedMap47);
        java.lang.Object obj56 = defaultedMap47.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 0);
        defaultedMap58.putAll((java.util.Map) defaultedMap62);
        java.util.Set set66 = defaultedMap58.entrySet();
        java.lang.Object obj67 = defaultedMap1.put((java.lang.Object) defaultedMap47, (java.lang.Object) set66);
        java.util.Collection collection68 = defaultedMap47.values();
        java.util.Set set69 = defaultedMap47.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) 1 + "'", obj52.equals((short) 1));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(set69);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = null;
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap4.put(obj7, (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate10);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str16 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = null;
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap18.put(obj21, (java.lang.Object) predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate22, predicate24);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap1.clear();
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 1 + "'", obj13.equals((short) 1));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) true);
        java.util.Set set13 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj22 = null;
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj24 = defaultedMap19.put(obj22, (java.lang.Object) predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate23, predicate25);
        boolean b27 = defaultedMap10.equals((java.lang.Object) map26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str30 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj39 = null;
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap36.put(obj39, (java.lang.Object) predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate42, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str48 = defaultedMap47.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj57 = null;
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj59 = defaultedMap54.put(obj57, (java.lang.Object) predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate60, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate44, predicate62);
        java.lang.Object obj65 = defaultedMap1.remove((java.lang.Object) map64);
        java.util.Set set66 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 100.0d);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (-1L), (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj23 = null;
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj25 = defaultedMap20.put(obj23, (java.lang.Object) predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        boolean b28 = defaultedMap14.equals((java.lang.Object) map27);
        boolean b29 = defaultedMap11.equals((java.lang.Object) map27);
        boolean b30 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str34 = defaultedMap33.toString();
        java.util.Set set35 = defaultedMap33.keySet();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap33.remove(obj36);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        java.lang.Object obj39 = defaultedMap11.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.String str47 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 0);
        java.lang.Object obj52 = null;
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj54 = defaultedMap49.put(obj52, (java.lang.Object) predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate53, predicate55);
        boolean b57 = defaultedMap42.containsKey((java.lang.Object) predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 1);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) true);
        java.util.Set set62 = defaultedMap59.entrySet();
        java.lang.Object obj64 = defaultedMap59.get((java.lang.Object) 100.0d);
        defaultedMap59.clear();
        java.lang.Object obj66 = defaultedMap42.remove((java.lang.Object) defaultedMap59);
        java.lang.Object obj68 = defaultedMap59.remove((java.lang.Object) "");
        boolean b70 = defaultedMap59.containsValue((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap59);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 1 + "'", obj6.equals((short) 1));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 1 + "'", obj39.equals((short) 1));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 1 + "'", obj40.equals((short) 1));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 1 + "'", obj64.equals((short) 1));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == false);
    }
}

