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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100.0f);
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
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 10);
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.String str4 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) predicate4);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.entrySet();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        java.lang.String str7 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap1.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b6 = defaultedMap5.isEmpty();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1L + "'", obj7.equals(1L));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        int i11 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj17 = defaultedMap6.remove((java.lang.Object) b16);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection19 = defaultedMap18.values();
        boolean b20 = defaultedMap18.isEmpty();
        java.util.Collection collection21 = defaultedMap18.values();
        boolean b22 = defaultedMap1.equals((java.lang.Object) collection21);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.lang.String str10 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) (-1));
        java.util.Collection collection19 = defaultedMap14.values();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1L + "'", obj20.equals(1L));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.entrySet();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i14 = defaultedMap13.size();
        int i15 = defaultedMap13.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) defaultedMap24);
        boolean b27 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection3 = defaultedMap2.values();
        boolean b4 = defaultedMap2.isEmpty();
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i9 = defaultedMap8.size();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Set set11 = defaultedMap8.keySet();
        boolean b12 = defaultedMap8.isEmpty();
        java.lang.Object obj13 = defaultedMap2.remove((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i16 = defaultedMap15.size();
        boolean b18 = defaultedMap15.equals((java.lang.Object) "hi!");
        defaultedMap8.putAll((java.util.Map) defaultedMap15);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i23 = defaultedMap22.size();
        int i24 = defaultedMap22.size();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate20, predicate25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i31 = defaultedMap30.size();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        try {
            java.util.Map map35 = collections.map.PredicatedMap.decorate(map0, predicate25, predicate32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate17);
        java.lang.Object obj21 = null;
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map20, obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set25 = defaultedMap24.entrySet();
        boolean b26 = defaultedMap24.isEmpty();
        java.util.Set set27 = defaultedMap24.keySet();
        java.util.Map map28 = collections.map.DefaultedMap.decorate(map20, (java.lang.Object) set27);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i21 = defaultedMap20.size();
        int i22 = defaultedMap20.size();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b33 = defaultedMap32.isEmpty();
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        java.util.Set set35 = defaultedMap32.keySet();
        defaultedMap32.clear();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap32);
        java.lang.String str38 = defaultedMap32.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1L + "'", obj30.equals(1L));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1L + "'", obj34.equals(1L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) (-1));
        java.util.Collection collection19 = defaultedMap14.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i23 = defaultedMap22.size();
        int i24 = defaultedMap22.size();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate25);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap14);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i12 = defaultedMap11.size();
        java.util.Set set13 = defaultedMap11.keySet();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Collection collection15 = defaultedMap11.values();
        java.util.Set set16 = defaultedMap11.keySet();
        java.lang.Object obj17 = defaultedMap5.get((java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        int i21 = defaultedMap19.size();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap5.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1L + "'", obj17.equals(1L));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1L + "'", obj25.equals(1L));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i11 = defaultedMap10.size();
        java.util.Set set12 = defaultedMap10.keySet();
        java.util.Set set13 = defaultedMap10.keySet();
        boolean b14 = defaultedMap10.isEmpty();
        boolean b15 = defaultedMap6.containsValue((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1L));
        defaultedMap17.clear();
        java.util.Set set23 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection26 = defaultedMap25.values();
        boolean b27 = defaultedMap25.isEmpty();
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0f));
        java.lang.String str35 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection38 = defaultedMap37.values();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap37);
        java.util.Set set40 = defaultedMap32.entrySet();
        java.lang.Object obj41 = defaultedMap17.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) (-1.0f));
        java.lang.String str46 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection49 = defaultedMap48.values();
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) defaultedMap48);
        boolean b52 = defaultedMap43.containsValue((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection55 = defaultedMap54.values();
        boolean b56 = defaultedMap54.isEmpty();
        java.lang.Object obj58 = defaultedMap54.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i61 = defaultedMap60.size();
        java.util.Set set62 = defaultedMap60.keySet();
        java.util.Set set63 = defaultedMap60.keySet();
        boolean b64 = defaultedMap60.isEmpty();
        java.lang.Object obj65 = defaultedMap54.remove((java.lang.Object) defaultedMap60);
        java.lang.Object obj66 = defaultedMap32.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection69 = defaultedMap68.values();
        boolean b70 = defaultedMap68.isEmpty();
        java.lang.Object obj72 = defaultedMap68.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i75 = defaultedMap74.size();
        java.util.Set set76 = defaultedMap74.keySet();
        java.util.Set set77 = defaultedMap74.keySet();
        boolean b78 = defaultedMap74.isEmpty();
        java.lang.Object obj79 = defaultedMap68.remove((java.lang.Object) defaultedMap74);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i82 = defaultedMap81.size();
        boolean b84 = defaultedMap81.equals((java.lang.Object) "hi!");
        defaultedMap74.putAll((java.util.Map) defaultedMap81);
        java.lang.Object obj86 = defaultedMap6.put((java.lang.Object) defaultedMap43, (java.lang.Object) defaultedMap81);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1L + "'", obj58.equals(1L));
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 1L + "'", obj72.equals(1L));
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) predicate12);
        java.util.Collection collection14 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) (-1L));
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i36 = defaultedMap35.size();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i42 = defaultedMap41.size();
        int i43 = defaultedMap41.size();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate37, predicate44);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b54 = defaultedMap53.isEmpty();
        java.lang.Object obj55 = defaultedMap49.get((java.lang.Object) defaultedMap53);
        java.util.Set set56 = defaultedMap53.keySet();
        defaultedMap53.clear();
        java.lang.Object obj58 = defaultedMap22.put((java.lang.Object) predicate44, (java.lang.Object) defaultedMap53);
        boolean b59 = defaultedMap53.isEmpty();
        boolean b60 = defaultedMap1.containsKey((java.lang.Object) b59);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 1L + "'", obj51.equals(1L));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1L + "'", obj55.equals(1L));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1.0f));
        java.lang.String str15 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection18 = defaultedMap17.values();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        boolean b21 = defaultedMap17.containsKey((java.lang.Object) (-1));
        java.util.Collection collection22 = defaultedMap17.values();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i26 = defaultedMap25.size();
        int i27 = defaultedMap25.size();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate28);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate23);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b6 = defaultedMap5.isEmpty();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i12 = defaultedMap11.size();
        int i13 = defaultedMap11.size();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b23 = defaultedMap22.isEmpty();
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) defaultedMap22);
        boolean b25 = defaultedMap11.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i28 = defaultedMap27.size();
        int i29 = defaultedMap27.size();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        defaultedMap18.putAll(map32);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.DefaultedMap.decorate(map32, (java.lang.Object) predicate34);
        java.lang.Object obj36 = defaultedMap5.get((java.lang.Object) predicate34);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1L + "'", obj7.equals(1L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1L + "'", obj20.equals(1L));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1L + "'", obj24.equals(1L));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1L + "'", obj36.equals(1L));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b9 = defaultedMap8.isEmpty();
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) defaultedMap8);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj10);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) predicate12);
        java.util.Collection collection14 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap1.equals(obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.keySet();
        java.util.Set set31 = defaultedMap28.keySet();
        java.lang.Object obj32 = defaultedMap24.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i35 = defaultedMap34.size();
        java.util.Set set36 = defaultedMap34.keySet();
        java.util.Set set37 = defaultedMap34.keySet();
        java.util.Collection collection38 = defaultedMap34.values();
        java.util.Set set39 = defaultedMap34.keySet();
        java.lang.Object obj40 = defaultedMap28.get((java.lang.Object) set39);
        boolean b41 = defaultedMap1.equals(obj40);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1L + "'", obj32.equals(1L));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1L + "'", obj40.equals(1L));
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap22.toString();
        boolean b26 = defaultedMap6.equals((java.lang.Object) defaultedMap22);
        boolean b27 = defaultedMap22.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) (-1L));
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i19 = defaultedMap18.size();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i25 = defaultedMap24.size();
        int i26 = defaultedMap24.size();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate20, predicate27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b37 = defaultedMap36.isEmpty();
        java.lang.Object obj38 = defaultedMap32.get((java.lang.Object) defaultedMap36);
        java.util.Set set39 = defaultedMap36.keySet();
        defaultedMap36.clear();
        java.lang.Object obj41 = defaultedMap5.put((java.lang.Object) predicate27, (java.lang.Object) defaultedMap36);
        boolean b43 = defaultedMap5.containsValue((java.lang.Object) (-1.0d));
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1L + "'", obj34.equals(1L));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1L + "'", obj38.equals(1L));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i13 = defaultedMap12.size();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        java.util.Set set16 = defaultedMap12.keySet();
        java.lang.Object obj17 = defaultedMap6.remove((java.lang.Object) set16);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set16 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b23 = defaultedMap22.isEmpty();
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = defaultedMap15.put((java.lang.Object) defaultedMap22, (java.lang.Object) 0.0d);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1L + "'", obj20.equals(1L));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1L + "'", obj24.equals(1L));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.remove(obj14);
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        int i7 = defaultedMap5.size();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection13 = defaultedMap12.values();
        boolean b14 = defaultedMap12.isEmpty();
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.keySet();
        java.util.Set set21 = defaultedMap18.keySet();
        boolean b22 = defaultedMap18.isEmpty();
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i26 = defaultedMap25.size();
        boolean b28 = defaultedMap25.equals((java.lang.Object) "hi!");
        defaultedMap18.putAll((java.util.Map) defaultedMap25);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i33 = defaultedMap32.size();
        int i34 = defaultedMap32.size();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate30, predicate35);
        java.lang.Object obj39 = defaultedMap1.put((java.lang.Object) map10, (java.lang.Object) map38);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i21 = defaultedMap20.size();
        int i22 = defaultedMap20.size();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b33 = defaultedMap32.isEmpty();
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        java.util.Set set35 = defaultedMap32.keySet();
        defaultedMap32.clear();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap32);
        collections.Factory factory38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, factory38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1L + "'", obj30.equals(1L));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1L + "'", obj34.equals(1L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i18 = defaultedMap17.size();
        int i19 = defaultedMap17.size();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        defaultedMap8.putAll(map22);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate(map22, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        int i10 = defaultedMap1.size();
        java.util.Set set11 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        boolean b16 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap6.remove((java.lang.Object) defaultedMap12);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) (-1.0f));
        java.lang.String str23 = defaultedMap20.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection26 = defaultedMap25.values();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap25);
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) (-1));
        java.lang.Object obj30 = defaultedMap12.remove((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 10);
        java.util.Collection collection35 = defaultedMap32.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i42 = defaultedMap41.size();
        java.util.Set set43 = defaultedMap41.keySet();
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        boolean b47 = defaultedMap32.containsValue((java.lang.Object) defaultedMap37);
        boolean b48 = defaultedMap25.containsValue((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b52 = defaultedMap50.containsValue((java.lang.Object) 1.0f);
        defaultedMap37.putAll((java.util.Map) defaultedMap50);
        boolean b54 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1L + "'", obj34.equals(1L));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 0.0d);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj6 = defaultedMap1.get(obj4);
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1L + "'", obj6.equals(1L));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        int i13 = defaultedMap7.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b12 = defaultedMap9.equals((java.lang.Object) 10L);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) 10L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Set set8 = defaultedMap6.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i11 = defaultedMap10.size();
        boolean b12 = defaultedMap10.isEmpty();
        java.lang.Object obj13 = defaultedMap6.get((java.lang.Object) b12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Collection collection19 = defaultedMap15.values();
        java.util.Set set20 = defaultedMap15.keySet();
        boolean b21 = defaultedMap6.equals((java.lang.Object) defaultedMap15);
        int i22 = defaultedMap6.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (-1L));
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i18 = defaultedMap17.size();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i24 = defaultedMap23.size();
        int i25 = defaultedMap23.size();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate26, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i33 = defaultedMap32.size();
        int i34 = defaultedMap32.size();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate19, predicate35);
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate39);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set5 = defaultedMap4.entrySet();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) '4');
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        boolean b14 = defaultedMap1.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i9 = defaultedMap8.size();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate17);
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i14 = defaultedMap13.size();
        int i15 = defaultedMap13.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) defaultedMap24);
        boolean b27 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        java.util.Collection collection29 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        java.util.Set set34 = defaultedMap31.keySet();
        java.util.Collection collection35 = defaultedMap31.values();
        java.util.Set set36 = defaultedMap31.keySet();
        java.lang.Object obj37 = defaultedMap13.get((java.lang.Object) defaultedMap31);
        boolean b38 = defaultedMap31.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1L + "'", obj37.equals(1L));
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (-1.0f));
        java.lang.String str19 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        java.util.Set set24 = defaultedMap16.entrySet();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap27.containsValue((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap38.isEmpty();
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.util.Set set47 = defaultedMap44.keySet();
        boolean b48 = defaultedMap44.isEmpty();
        java.lang.Object obj49 = defaultedMap38.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj50 = defaultedMap16.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1.0f));
        java.lang.String str55 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection58 = defaultedMap57.values();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i62 = defaultedMap61.size();
        boolean b63 = defaultedMap61.isEmpty();
        java.lang.Object obj64 = defaultedMap57.get((java.lang.Object) b63);
        boolean b66 = defaultedMap57.containsKey((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i69 = defaultedMap68.size();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b76 = defaultedMap74.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj78 = defaultedMap74.remove((java.lang.Object) (-1L));
        defaultedMap74.clear();
        java.util.Set set80 = defaultedMap74.entrySet();
        java.lang.Object obj81 = defaultedMap68.get((java.lang.Object) defaultedMap74);
        java.lang.Object obj82 = defaultedMap16.put((java.lang.Object) b66, obj81);
        collections.Transformer transformer83 = null;
        try {
            java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1L + "'", obj64.equals(1L));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 1L + "'", obj81.equals(1L));
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i3 = defaultedMap2.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map8 = collections.map.PredicatedMap.decorate(map0, predicate4, predicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.remove(obj14);
        java.util.Collection collection16 = defaultedMap1.values();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i7 = defaultedMap6.size();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) predicate8);
        java.util.Collection collection12 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) predicate12);
        java.util.Collection collection14 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.Object obj25 = defaultedMap1.remove((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i18 = defaultedMap17.size();
        int i19 = defaultedMap17.size();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        defaultedMap8.putAll(map22);
        defaultedMap8.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1L));
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) predicate11);
        java.util.Collection collection13 = defaultedMap6.values();
        int i14 = defaultedMap6.size();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Collection collection16 = defaultedMap6.values();
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1L + "'", obj15.equals(1L));
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (-1.0f));
        java.lang.String str19 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        java.util.Set set24 = defaultedMap16.entrySet();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap27.containsValue((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap38.isEmpty();
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.util.Set set47 = defaultedMap44.keySet();
        boolean b48 = defaultedMap44.isEmpty();
        java.lang.Object obj49 = defaultedMap38.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj50 = defaultedMap16.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) (-1.0f));
        java.lang.String str55 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection58 = defaultedMap57.values();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i62 = defaultedMap61.size();
        boolean b63 = defaultedMap61.isEmpty();
        java.lang.Object obj64 = defaultedMap57.get((java.lang.Object) b63);
        boolean b66 = defaultedMap57.containsKey((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i69 = defaultedMap68.size();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b76 = defaultedMap74.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj78 = defaultedMap74.remove((java.lang.Object) (-1L));
        defaultedMap74.clear();
        java.util.Set set80 = defaultedMap74.entrySet();
        java.lang.Object obj81 = defaultedMap68.get((java.lang.Object) defaultedMap74);
        java.lang.Object obj82 = defaultedMap16.put((java.lang.Object) b66, obj81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b86 = defaultedMap84.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj88 = defaultedMap84.remove((java.lang.Object) (-1L));
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj90 = defaultedMap84.remove((java.lang.Object) predicate89);
        boolean b91 = defaultedMap16.containsValue((java.lang.Object) defaultedMap84);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1L + "'", obj64.equals(1L));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 1L + "'", obj81.equals(1L));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b91 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b5 = defaultedMap3.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj7 = defaultedMap3.remove((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) predicate8);
        java.util.Collection collection10 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set13 = defaultedMap12.entrySet();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap3.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.keySet();
        java.util.Set set20 = defaultedMap17.keySet();
        boolean b21 = defaultedMap17.isEmpty();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 0.0d);
        boolean b24 = defaultedMap3.containsValue((java.lang.Object) defaultedMap17);
        collections.Predicate predicate25 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection28 = defaultedMap27.values();
        boolean b29 = defaultedMap27.isEmpty();
        java.util.Collection collection30 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b34 = defaultedMap32.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) (-1L));
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i40 = defaultedMap39.size();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i46 = defaultedMap45.size();
        int i47 = defaultedMap45.size();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate41, predicate48);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i55 = defaultedMap54.size();
        int i56 = defaultedMap54.size();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate41, predicate57);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate25, predicate41);
        try {
            java.util.Map map62 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap11.isEmpty();
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b17 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        java.util.Set set21 = defaultedMap19.keySet();
        java.util.Set set22 = defaultedMap19.keySet();
        boolean b23 = defaultedMap19.isEmpty();
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap19.equals(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) (-1));
        java.util.Collection collection37 = defaultedMap32.values();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i41 = defaultedMap40.size();
        int i42 = defaultedMap40.size();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate38, predicate43);
        boolean b47 = defaultedMap19.containsValue((java.lang.Object) defaultedMap32);
        boolean b48 = defaultedMap1.equals((java.lang.Object) defaultedMap32);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1L + "'", obj15.equals(1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1.0f));
        java.lang.String str11 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1));
        java.util.Collection collection18 = defaultedMap13.values();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i22 = defaultedMap21.size();
        int i23 = defaultedMap21.size();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate24);
        java.util.Map map28 = collections.map.DefaultedMap.decorate(map6, (java.lang.Object) map27);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap22.toString();
        boolean b26 = defaultedMap6.equals((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (-1.0f));
        java.lang.String str19 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        java.util.Set set24 = defaultedMap16.entrySet();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap27.containsValue((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap38.isEmpty();
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.util.Set set47 = defaultedMap44.keySet();
        boolean b48 = defaultedMap44.isEmpty();
        java.lang.Object obj49 = defaultedMap38.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj50 = defaultedMap16.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap38);
        java.lang.String str51 = defaultedMap38.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 10);
        java.util.Collection collection30 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.keySet();
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        boolean b42 = defaultedMap27.containsValue((java.lang.Object) defaultedMap32);
        boolean b43 = defaultedMap20.containsValue((java.lang.Object) defaultedMap32);
        java.util.Collection collection44 = defaultedMap32.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1L + "'", obj40.equals(1L));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        boolean b17 = defaultedMap14.equals((java.lang.Object) "hi!");
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b34 = defaultedMap33.isEmpty();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj44 = defaultedMap29.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = defaultedMap25.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj46 = defaultedMap14.get((java.lang.Object) defaultedMap41);
        java.lang.String str47 = defaultedMap14.toString();
        defaultedMap14.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1L + "'", obj31.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) (-1.0f));
        java.lang.String str15 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection18 = defaultedMap17.values();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i22 = defaultedMap21.size();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i37 = defaultedMap36.size();
        boolean b38 = defaultedMap36.isEmpty();
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) b38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i42 = defaultedMap41.size();
        java.util.Set set43 = defaultedMap41.keySet();
        java.util.Set set44 = defaultedMap41.keySet();
        java.util.Collection collection45 = defaultedMap41.values();
        java.util.Set set46 = defaultedMap41.keySet();
        boolean b47 = defaultedMap32.equals((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i50 = defaultedMap49.size();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b57 = defaultedMap55.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj59 = defaultedMap55.remove((java.lang.Object) (-1L));
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i63 = defaultedMap62.size();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate64, predicate65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i69 = defaultedMap68.size();
        int i70 = defaultedMap68.size();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate64, predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) predicate64);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate51, predicate64);
        java.util.Map map77 = collections.map.PredicatedMap.decorate(map19, predicate23, predicate64);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map77);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        boolean b26 = defaultedMap7.isEmpty();
        java.util.Collection collection27 = defaultedMap7.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1L + "'", obj8.equals(1L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.util.Set set13 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection16 = defaultedMap15.values();
        boolean b17 = defaultedMap15.isEmpty();
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Set set24 = defaultedMap21.keySet();
        boolean b25 = defaultedMap21.isEmpty();
        java.lang.Object obj26 = defaultedMap15.remove((java.lang.Object) defaultedMap21);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1.0f));
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection35 = defaultedMap34.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (-1));
        java.lang.Object obj39 = defaultedMap21.remove((java.lang.Object) defaultedMap34);
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection43 = defaultedMap42.values();
        boolean b44 = defaultedMap42.isEmpty();
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i49 = defaultedMap48.size();
        java.util.Set set50 = defaultedMap48.keySet();
        java.util.Set set51 = defaultedMap48.keySet();
        boolean b52 = defaultedMap48.isEmpty();
        java.lang.Object obj53 = defaultedMap42.remove((java.lang.Object) defaultedMap48);
        java.util.Set set54 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap56.isEmpty();
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i63 = defaultedMap62.size();
        java.util.Set set64 = defaultedMap62.keySet();
        java.util.Set set65 = defaultedMap62.keySet();
        boolean b66 = defaultedMap62.isEmpty();
        java.lang.Object obj67 = defaultedMap56.remove((java.lang.Object) defaultedMap62);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) (-1.0f));
        java.lang.String str73 = defaultedMap70.toString();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection76 = defaultedMap75.values();
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) defaultedMap75);
        boolean b79 = defaultedMap75.containsKey((java.lang.Object) (-1));
        java.lang.Object obj80 = defaultedMap62.remove((java.lang.Object) defaultedMap75);
        java.lang.Object obj81 = defaultedMap42.remove((java.lang.Object) defaultedMap62);
        boolean b82 = defaultedMap21.equals((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1L + "'", obj19.equals(1L));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1L + "'", obj60.equals(1L));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b82 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) false);
        java.util.Set set19 = defaultedMap15.keySet();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap15.containsValue(obj20);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 10);
        java.util.Collection collection30 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.keySet();
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        boolean b42 = defaultedMap27.containsValue((java.lang.Object) defaultedMap32);
        boolean b43 = defaultedMap20.containsValue((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 1.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b55 = defaultedMap54.isEmpty();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj62 = defaultedMap58.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b66 = defaultedMap64.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj68 = defaultedMap64.remove((java.lang.Object) (-1L));
        defaultedMap64.clear();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i72 = defaultedMap71.size();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i78 = defaultedMap77.size();
        int i79 = defaultedMap77.size();
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate80, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate73, predicate80);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj87 = defaultedMap85.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b90 = defaultedMap89.isEmpty();
        java.lang.Object obj91 = defaultedMap85.get((java.lang.Object) defaultedMap89);
        java.util.Set set92 = defaultedMap89.keySet();
        defaultedMap89.clear();
        java.lang.Object obj94 = defaultedMap58.put((java.lang.Object) predicate80, (java.lang.Object) defaultedMap89);
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap(obj94);
        java.util.Map map96 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, obj94);
        java.lang.Object obj97 = defaultedMap32.remove((java.lang.Object) map96);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1L + "'", obj40.equals(1L));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 1L + "'", obj52.equals(1L));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1L + "'", obj56.equals(1L));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 1L + "'", obj87.equals(1L));
        org.junit.Assert.assertTrue(b90 == true);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 1L + "'", obj91.equals(1L));
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i21 = defaultedMap20.size();
        int i22 = defaultedMap20.size();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b33 = defaultedMap32.isEmpty();
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        java.util.Set set35 = defaultedMap32.keySet();
        defaultedMap32.clear();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) predicate23, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i40 = defaultedMap39.size();
        java.util.Set set41 = defaultedMap39.keySet();
        java.util.Set set42 = defaultedMap39.keySet();
        java.util.Collection collection43 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj49 = defaultedMap45.remove((java.lang.Object) (-1L));
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj51 = defaultedMap45.remove((java.lang.Object) predicate50);
        java.util.Collection collection52 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set55 = defaultedMap54.entrySet();
        boolean b56 = defaultedMap54.isEmpty();
        defaultedMap45.putAll((java.util.Map) defaultedMap54);
        boolean b58 = defaultedMap39.containsValue((java.lang.Object) defaultedMap45);
        java.lang.Object obj59 = defaultedMap1.get((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1L + "'", obj30.equals(1L));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1L + "'", obj34.equals(1L));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1.0f + "'", obj59.equals(1.0f));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) (-1L));
        defaultedMap14.clear();
        java.util.Set set20 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap22.isEmpty();
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1.0f));
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection35 = defaultedMap34.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) defaultedMap34);
        java.util.Set set37 = defaultedMap29.entrySet();
        java.lang.Object obj38 = defaultedMap14.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (-1.0f));
        java.lang.String str43 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection46 = defaultedMap45.values();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) defaultedMap45);
        boolean b49 = defaultedMap40.containsValue((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection52 = defaultedMap51.values();
        boolean b53 = defaultedMap51.isEmpty();
        java.lang.Object obj55 = defaultedMap51.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i58 = defaultedMap57.size();
        java.util.Set set59 = defaultedMap57.keySet();
        java.util.Set set60 = defaultedMap57.keySet();
        boolean b61 = defaultedMap57.isEmpty();
        java.lang.Object obj62 = defaultedMap51.remove((java.lang.Object) defaultedMap57);
        java.lang.Object obj63 = defaultedMap29.put((java.lang.Object) defaultedMap40, (java.lang.Object) defaultedMap51);
        java.util.Set set64 = defaultedMap40.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap40);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1L + "'", obj55.equals(1L));
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) (-1L));
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i26 = defaultedMap25.size();
        int i27 = defaultedMap25.size();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) defaultedMap37);
        java.util.Set set40 = defaultedMap37.keySet();
        defaultedMap37.clear();
        java.lang.Object obj42 = defaultedMap6.put((java.lang.Object) predicate28, (java.lang.Object) defaultedMap37);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap37);
        java.lang.String str44 = defaultedMap37.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) false);
        java.util.Set set19 = defaultedMap15.keySet();
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.util.Collection collection22 = defaultedMap15.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 10);
        java.util.Collection collection30 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.keySet();
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        boolean b42 = defaultedMap27.containsValue((java.lang.Object) defaultedMap32);
        boolean b43 = defaultedMap20.containsValue((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 1.0f);
        defaultedMap32.putAll((java.util.Map) defaultedMap45);
        defaultedMap32.clear();
        defaultedMap32.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1L + "'", obj40.equals(1L));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1L));
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) (-1L));
        defaultedMap12.clear();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap12);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1.0f));
        java.lang.String str11 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1));
        java.util.Collection collection18 = defaultedMap13.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap21.entrySet();
        boolean b23 = defaultedMap21.isEmpty();
        java.util.Collection collection24 = defaultedMap21.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        defaultedMap7.clear();
        java.util.Set set13 = defaultedMap7.entrySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Collection collection15 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b12 = defaultedMap11.isEmpty();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) (-1L));
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i29 = defaultedMap28.size();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i35 = defaultedMap34.size();
        int i36 = defaultedMap34.size();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b47 = defaultedMap46.isEmpty();
        java.lang.Object obj48 = defaultedMap42.get((java.lang.Object) defaultedMap46);
        java.util.Set set49 = defaultedMap46.keySet();
        defaultedMap46.clear();
        java.lang.Object obj51 = defaultedMap15.put((java.lang.Object) predicate37, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, obj51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) (-1.0f));
        java.lang.String str58 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection61 = defaultedMap60.values();
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) defaultedMap60);
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) (-1));
        java.util.Collection collection65 = defaultedMap60.values();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i69 = defaultedMap68.size();
        int i70 = defaultedMap68.size();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate66, predicate71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i77 = defaultedMap76.size();
        java.util.Set set78 = defaultedMap76.keySet();
        java.util.Set set79 = defaultedMap76.keySet();
        boolean b80 = defaultedMap76.isEmpty();
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) 0.0d);
        java.lang.Object obj83 = defaultedMap60.get((java.lang.Object) defaultedMap76);
        java.lang.Object obj84 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) defaultedMap76);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1L + "'", obj48.equals(1L));
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 1L + "'", obj83.equals(1L));
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1L));
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj12 = defaultedMap6.remove((java.lang.Object) predicate11);
        java.util.Collection collection13 = defaultedMap6.values();
        int i14 = defaultedMap6.size();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) (-1L));
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i31 = defaultedMap30.size();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i37 = defaultedMap36.size();
        int i38 = defaultedMap36.size();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate32, predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b49 = defaultedMap48.isEmpty();
        java.lang.Object obj50 = defaultedMap44.get((java.lang.Object) defaultedMap48);
        java.util.Set set51 = defaultedMap48.keySet();
        defaultedMap48.clear();
        java.lang.Object obj53 = defaultedMap17.put((java.lang.Object) predicate39, (java.lang.Object) defaultedMap48);
        boolean b54 = defaultedMap6.containsValue((java.lang.Object) defaultedMap17);
        collections.Factory factory55 = null;
        try {
            java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1L + "'", obj15.equals(1L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1L + "'", obj50.equals(1L));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        boolean b4 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) predicate12);
        java.util.Collection collection14 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap7.putAll((java.util.Map) defaultedMap21);
        boolean b23 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i30 = defaultedMap29.size();
        java.util.Set set31 = defaultedMap29.keySet();
        java.util.Set set32 = defaultedMap29.keySet();
        java.lang.Object obj33 = defaultedMap25.remove((java.lang.Object) defaultedMap29);
        defaultedMap7.putAll((java.util.Map) defaultedMap25);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection38 = defaultedMap37.values();
        boolean b39 = defaultedMap37.isEmpty();
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i44 = defaultedMap43.size();
        java.util.Set set45 = defaultedMap43.keySet();
        java.util.Set set46 = defaultedMap43.keySet();
        boolean b47 = defaultedMap43.isEmpty();
        java.lang.Object obj48 = defaultedMap37.remove((java.lang.Object) defaultedMap43);
        defaultedMap43.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) (-1.0f));
        java.lang.String str54 = defaultedMap51.toString();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection57 = defaultedMap56.values();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) defaultedMap56);
        boolean b60 = defaultedMap56.containsKey((java.lang.Object) (-1));
        java.lang.Object obj61 = defaultedMap43.remove((java.lang.Object) defaultedMap56);
        boolean b62 = defaultedMap43.isEmpty();
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) b62);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1L + "'", obj41.equals(1L));
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap14.containsKey((java.lang.Object) (-1));
        java.util.Collection collection19 = defaultedMap14.values();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i23 = defaultedMap22.size();
        int i24 = defaultedMap22.size();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate25);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set32 = defaultedMap31.entrySet();
        boolean b33 = defaultedMap31.isEmpty();
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) b33);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1L + "'", obj34.equals(1L));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        boolean b26 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) (-1L));
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) (-1L));
        defaultedMap12.clear();
        java.util.Set set18 = defaultedMap12.entrySet();
        java.util.Set set19 = defaultedMap12.entrySet();
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1L));
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj28 = defaultedMap22.remove((java.lang.Object) predicate27);
        java.util.Collection collection29 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set32 = defaultedMap31.entrySet();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap22.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap22.putAll((java.util.Map) defaultedMap36);
        boolean b39 = defaultedMap36.containsKey((java.lang.Object) false);
        java.util.Set set40 = defaultedMap36.keySet();
        boolean b41 = defaultedMap5.containsKey((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj13 = defaultedMap7.remove((java.lang.Object) predicate12);
        java.util.Collection collection14 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set17 = defaultedMap16.entrySet();
        boolean b18 = defaultedMap16.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection23 = defaultedMap22.values();
        boolean b24 = defaultedMap22.isEmpty();
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.keySet();
        java.util.Set set31 = defaultedMap28.keySet();
        boolean b32 = defaultedMap28.isEmpty();
        java.lang.Object obj33 = defaultedMap22.remove((java.lang.Object) defaultedMap28);
        boolean b34 = defaultedMap7.containsKey(obj33);
        defaultedMap7.clear();
        java.lang.Object obj37 = defaultedMap7.get((java.lang.Object) 10L);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1.0f + "'", obj37.equals(1.0f));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap14.isEmpty();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) (-1L));
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i29 = defaultedMap28.size();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i35 = defaultedMap34.size();
        int i36 = defaultedMap34.size();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate37);
        java.lang.Object obj41 = defaultedMap19.get((java.lang.Object) predicate30);
        java.lang.Object obj43 = defaultedMap10.put((java.lang.Object) predicate30, (java.lang.Object) 1);
        java.lang.Object obj44 = defaultedMap1.remove(obj43);
        java.util.Set set45 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1L + "'", obj7.equals(1L));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100.0f + "'", obj41.equals(100.0f));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap7.isEmpty();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.util.Set set16 = defaultedMap13.keySet();
        boolean b17 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) defaultedMap13);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection27 = defaultedMap26.values();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap26);
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) (-1));
        java.lang.Object obj31 = defaultedMap13.remove((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 10);
        java.util.Collection collection36 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i43 = defaultedMap42.size();
        java.util.Set set44 = defaultedMap42.keySet();
        java.util.Set set45 = defaultedMap42.keySet();
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap38);
        boolean b48 = defaultedMap33.containsValue((java.lang.Object) defaultedMap38);
        boolean b49 = defaultedMap26.containsValue((java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 1.0f);
        defaultedMap38.putAll((java.util.Map) defaultedMap51);
        defaultedMap38.clear();
        java.util.Set set56 = defaultedMap38.keySet();
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1L + "'", obj57.equals(1L));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.keySet();
        java.util.Set set12 = defaultedMap9.keySet();
        boolean b13 = defaultedMap9.isEmpty();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) (-1L));
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj23 = defaultedMap17.remove((java.lang.Object) predicate22);
        java.util.Collection collection24 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set27 = defaultedMap26.entrySet();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap17.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap17.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj33 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) (-1.0f));
        java.lang.String str38 = defaultedMap35.toString();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection41 = defaultedMap40.values();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i45 = defaultedMap44.size();
        boolean b46 = defaultedMap44.isEmpty();
        java.lang.Object obj47 = defaultedMap40.get((java.lang.Object) b46);
        java.lang.String str48 = defaultedMap40.toString();
        java.lang.Object obj49 = defaultedMap17.remove((java.lang.Object) str48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection52 = defaultedMap51.values();
        boolean b53 = defaultedMap51.isEmpty();
        java.util.Collection collection54 = defaultedMap51.values();
        int i55 = defaultedMap51.size();
        java.lang.Object obj56 = defaultedMap17.get((java.lang.Object) i55);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1L + "'", obj47.equals(1L));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0f + "'", obj56.equals(1.0f));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i14 = defaultedMap13.size();
        int i15 = defaultedMap13.size();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) defaultedMap24);
        boolean b27 = defaultedMap13.containsKey((java.lang.Object) defaultedMap20);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) (-1.0f));
        java.lang.String str33 = defaultedMap30.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection36 = defaultedMap35.values();
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i40 = defaultedMap39.size();
        boolean b41 = defaultedMap39.isEmpty();
        java.lang.Object obj42 = defaultedMap35.get((java.lang.Object) b41);
        java.lang.String str43 = defaultedMap35.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b6 = defaultedMap5.isEmpty();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.isEmpty();
        java.util.Collection collection9 = defaultedMap5.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1L + "'", obj7.equals(1L));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i9 = defaultedMap8.size();
        java.util.Set set10 = defaultedMap8.keySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap4.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        java.lang.String str14 = defaultedMap4.toString();
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1L + "'", obj12.equals(1L));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (-1.0f));
        java.lang.String str11 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection14 = defaultedMap13.values();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap13.containsKey((java.lang.Object) (-1));
        java.util.Collection collection18 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap13);
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 10);
        java.util.Collection collection25 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        java.util.Set set34 = defaultedMap31.keySet();
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap27);
        boolean b37 = defaultedMap22.containsValue((java.lang.Object) defaultedMap27);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b37);
        boolean b39 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1L + "'", obj24.equals(1L));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 10);
        java.util.Collection collection30 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.keySet();
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = defaultedMap32.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        boolean b42 = defaultedMap27.containsValue((java.lang.Object) defaultedMap32);
        boolean b43 = defaultedMap20.containsValue((java.lang.Object) defaultedMap32);
        java.lang.Object obj45 = defaultedMap20.get((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1L + "'", obj40.equals(1L));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection10 = defaultedMap9.values();
        boolean b11 = defaultedMap9.isEmpty();
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) (-1.0f));
        java.lang.String str19 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection22 = defaultedMap21.values();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap21);
        java.util.Set set24 = defaultedMap16.entrySet();
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (-1.0f));
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection33 = defaultedMap32.values();
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap27.containsValue((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection39 = defaultedMap38.values();
        boolean b40 = defaultedMap38.isEmpty();
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.util.Set set47 = defaultedMap44.keySet();
        boolean b48 = defaultedMap44.isEmpty();
        java.lang.Object obj49 = defaultedMap38.remove((java.lang.Object) defaultedMap44);
        java.lang.Object obj50 = defaultedMap16.put((java.lang.Object) defaultedMap27, (java.lang.Object) defaultedMap38);
        java.util.Set set51 = defaultedMap27.entrySet();
        boolean b53 = defaultedMap27.containsKey((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1L + "'", obj13.equals(1L));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1L + "'", obj42.equals(1L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1L));
        defaultedMap6.clear();
        java.util.Set set12 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap14.isEmpty();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection27 = defaultedMap26.values();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap26);
        java.util.Set set29 = defaultedMap21.entrySet();
        java.lang.Object obj30 = defaultedMap6.put((java.lang.Object) defaultedMap19, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) (-1.0f));
        java.lang.String str35 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection38 = defaultedMap37.values();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap37);
        boolean b41 = defaultedMap32.containsValue((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection44 = defaultedMap43.values();
        boolean b45 = defaultedMap43.isEmpty();
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i50 = defaultedMap49.size();
        java.util.Set set51 = defaultedMap49.keySet();
        java.util.Set set52 = defaultedMap49.keySet();
        boolean b53 = defaultedMap49.isEmpty();
        java.lang.Object obj54 = defaultedMap43.remove((java.lang.Object) defaultedMap49);
        java.lang.Object obj55 = defaultedMap21.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap43);
        boolean b56 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        java.lang.String str57 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1L + "'", obj47.equals(1L));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.util.Set set10 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap12.isEmpty();
        boolean b16 = defaultedMap5.containsKey((java.lang.Object) b15);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        int i11 = defaultedMap6.size();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        defaultedMap7.clear();
        java.util.Set set13 = defaultedMap7.entrySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection8 = defaultedMap7.values();
        boolean b9 = defaultedMap7.isEmpty();
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.util.Set set16 = defaultedMap13.keySet();
        boolean b17 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i21 = defaultedMap20.size();
        boolean b23 = defaultedMap20.equals((java.lang.Object) "hi!");
        defaultedMap13.putAll((java.util.Map) defaultedMap20);
        boolean b26 = defaultedMap20.equals((java.lang.Object) 1.0d);
        java.util.Set set27 = defaultedMap20.entrySet();
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) set27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1L + "'", obj11.equals(1L));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap8.remove(obj16);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 10);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.containsKey(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (-1.0f));
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection15 = defaultedMap14.values();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i19 = defaultedMap18.size();
        boolean b20 = defaultedMap18.isEmpty();
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) b20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i24 = defaultedMap23.size();
        java.util.Set set25 = defaultedMap23.keySet();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Collection collection27 = defaultedMap23.values();
        java.util.Set set28 = defaultedMap23.keySet();
        boolean b29 = defaultedMap14.equals((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i32 = defaultedMap31.size();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b39 = defaultedMap37.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) (-1L));
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i45 = defaultedMap44.size();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i51 = defaultedMap50.size();
        int i52 = defaultedMap50.size();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate46, predicate53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate33, predicate46);
        java.lang.Object obj59 = defaultedMap1.get((java.lang.Object) predicate33);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1L + "'", obj3.equals(1L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1L + "'", obj21.equals(1L));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1L + "'", obj59.equals(1L));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b6 = defaultedMap4.containsValue((java.lang.Object) 1.0f);
        boolean b7 = defaultedMap4.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap4.get(obj9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        boolean b17 = defaultedMap14.equals((java.lang.Object) "hi!");
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b34 = defaultedMap33.isEmpty();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj44 = defaultedMap29.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = defaultedMap25.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj46 = defaultedMap14.get((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i49 = defaultedMap48.size();
        int i50 = defaultedMap48.size();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate51, predicate52);
        boolean b54 = defaultedMap14.containsKey((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1L + "'", obj31.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) (-1.0f));
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection13 = defaultedMap12.values();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap12);
        boolean b16 = defaultedMap12.containsKey((java.lang.Object) (-1));
        int i17 = defaultedMap12.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) (-1L));
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i26 = defaultedMap25.size();
        int i27 = defaultedMap25.size();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) defaultedMap37);
        java.util.Set set40 = defaultedMap37.keySet();
        defaultedMap37.clear();
        java.lang.Object obj42 = defaultedMap6.put((java.lang.Object) predicate28, (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection45 = defaultedMap44.values();
        boolean b46 = defaultedMap44.isEmpty();
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) (-1L));
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i59 = defaultedMap58.size();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate60, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i65 = defaultedMap64.size();
        int i66 = defaultedMap64.size();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate60, predicate67);
        java.lang.Object obj71 = defaultedMap49.get((java.lang.Object) predicate60);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate60);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1L + "'", obj48.equals(1L));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100.0f + "'", obj71.equals(100.0f));
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        java.util.Collection collection11 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1L));
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj19 = defaultedMap13.remove((java.lang.Object) predicate18);
        java.util.Collection collection20 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.entrySet();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        boolean b26 = defaultedMap7.containsValue((java.lang.Object) defaultedMap13);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1L));
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i14 = defaultedMap13.size();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        int i21 = defaultedMap19.size();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate15, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i29 = defaultedMap28.size();
        int i30 = defaultedMap28.size();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate31);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate(map34, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i18 = defaultedMap17.size();
        int i19 = defaultedMap17.size();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        defaultedMap8.putAll(map22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate(map22, (java.lang.Object) predicate24);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate(map22, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        boolean b8 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b12 = defaultedMap10.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection15 = defaultedMap14.values();
        boolean b16 = defaultedMap14.isEmpty();
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) (-1L));
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i29 = defaultedMap28.size();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i35 = defaultedMap34.size();
        int i36 = defaultedMap34.size();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate37);
        java.lang.Object obj41 = defaultedMap19.get((java.lang.Object) predicate30);
        java.lang.Object obj43 = defaultedMap10.put((java.lang.Object) predicate30, (java.lang.Object) 1);
        java.lang.String str44 = defaultedMap10.toString();
        boolean b45 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b46 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) (-1L));
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i56 = defaultedMap55.size();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i62 = defaultedMap61.size();
        int i63 = defaultedMap61.size();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate57, predicate64);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) (-1.0f));
        java.lang.String str72 = defaultedMap69.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection75 = defaultedMap74.values();
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) defaultedMap74);
        boolean b78 = defaultedMap74.containsKey((java.lang.Object) (-1));
        java.lang.Object obj79 = defaultedMap48.remove((java.lang.Object) defaultedMap74);
        boolean b80 = defaultedMap1.containsValue((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1L + "'", obj18.equals(1L));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100.0f + "'", obj41.equals(100.0f));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b80 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        boolean b17 = defaultedMap14.equals((java.lang.Object) "hi!");
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b34 = defaultedMap33.isEmpty();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj44 = defaultedMap29.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = defaultedMap25.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj46 = defaultedMap14.get((java.lang.Object) defaultedMap41);
        java.lang.String str47 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set50 = defaultedMap49.entrySet();
        boolean b51 = defaultedMap49.isEmpty();
        java.util.Collection collection52 = defaultedMap49.values();
        java.util.Set set53 = defaultedMap49.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection57 = defaultedMap56.values();
        boolean b58 = defaultedMap56.isEmpty();
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i63 = defaultedMap62.size();
        java.util.Set set64 = defaultedMap62.keySet();
        java.util.Set set65 = defaultedMap62.keySet();
        boolean b66 = defaultedMap62.isEmpty();
        java.lang.Object obj67 = defaultedMap56.remove((java.lang.Object) defaultedMap62);
        java.util.Set set68 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection71 = defaultedMap70.values();
        boolean b72 = defaultedMap70.isEmpty();
        java.lang.Object obj74 = defaultedMap70.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i77 = defaultedMap76.size();
        java.util.Set set78 = defaultedMap76.keySet();
        java.util.Set set79 = defaultedMap76.keySet();
        boolean b80 = defaultedMap76.isEmpty();
        java.lang.Object obj81 = defaultedMap70.remove((java.lang.Object) defaultedMap76);
        defaultedMap76.clear();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) (-1.0f));
        java.lang.String str87 = defaultedMap84.toString();
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection90 = defaultedMap89.values();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) defaultedMap89);
        boolean b93 = defaultedMap89.containsKey((java.lang.Object) (-1));
        java.lang.Object obj94 = defaultedMap76.remove((java.lang.Object) defaultedMap89);
        java.lang.Object obj95 = defaultedMap56.remove((java.lang.Object) defaultedMap76);
        boolean b96 = defaultedMap49.containsValue(obj95);
        java.util.Collection collection97 = defaultedMap49.values();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1L + "'", obj31.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1L + "'", obj60.equals(1L));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 1L + "'", obj74.equals(1L));
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "{}" + "'", str87.equals("{}"));
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNotNull(collection97);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate17);
        boolean b21 = defaultedMap6.isEmpty();
        java.lang.Object obj23 = defaultedMap6.get((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1L + "'", obj23.equals(1L));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap15.containsKey((java.lang.Object) false);
        java.util.Set set19 = defaultedMap15.keySet();
        boolean b21 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        boolean b22 = defaultedMap15.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        boolean b17 = defaultedMap14.equals((java.lang.Object) "hi!");
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        int i19 = defaultedMap14.size();
        defaultedMap14.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.keySet();
        java.util.Set set16 = defaultedMap13.keySet();
        boolean b17 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap13.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) (-1.0f));
        java.lang.String str24 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection27 = defaultedMap26.values();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap26);
        boolean b30 = defaultedMap26.containsKey((java.lang.Object) (-1));
        java.util.Collection collection31 = defaultedMap26.values();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i35 = defaultedMap34.size();
        int i36 = defaultedMap34.size();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate32, predicate37);
        boolean b41 = defaultedMap13.containsValue((java.lang.Object) defaultedMap26);
        java.lang.Object obj42 = defaultedMap6.remove((java.lang.Object) b41);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        int i17 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) defaultedMap24);
        int i27 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Set set36 = defaultedMap33.keySet();
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.lang.String str39 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i42 = defaultedMap41.size();
        int i43 = defaultedMap41.size();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b53 = defaultedMap52.isEmpty();
        java.lang.Object obj54 = defaultedMap48.get((java.lang.Object) defaultedMap52);
        boolean b55 = defaultedMap41.containsKey((java.lang.Object) defaultedMap48);
        java.lang.Object obj56 = defaultedMap29.remove((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i59 = defaultedMap58.size();
        int i60 = defaultedMap58.size();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate61, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b70 = defaultedMap69.isEmpty();
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) defaultedMap69);
        boolean b72 = defaultedMap58.containsKey((java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i75 = defaultedMap74.size();
        int i76 = defaultedMap74.size();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate77, predicate78);
        defaultedMap65.putAll(map79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.DefaultedMap.decorate(map79, (java.lang.Object) predicate81);
        java.lang.Object obj83 = defaultedMap29.get((java.lang.Object) predicate81);
        boolean b84 = defaultedMap20.containsKey((java.lang.Object) predicate81);
        java.lang.Object obj85 = defaultedMap10.remove((java.lang.Object) defaultedMap20);
        collections.Factory factory86 = null;
        try {
            java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, factory86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1L + "'", obj7.equals(1L));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1L + "'", obj12.equals(1L));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1L + "'", obj37.equals(1L));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1L + "'", obj50.equals(1L));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1L + "'", obj54.equals(1L));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1L + "'", obj67.equals(1L));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1L + "'", obj71.equals(1L));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 1L + "'", obj83.equals(1L));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        int i17 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b25 = defaultedMap24.isEmpty();
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) defaultedMap24);
        int i27 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Set set36 = defaultedMap33.keySet();
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap29);
        java.lang.String str39 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i42 = defaultedMap41.size();
        int i43 = defaultedMap41.size();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b53 = defaultedMap52.isEmpty();
        java.lang.Object obj54 = defaultedMap48.get((java.lang.Object) defaultedMap52);
        boolean b55 = defaultedMap41.containsKey((java.lang.Object) defaultedMap48);
        java.lang.Object obj56 = defaultedMap29.remove((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i59 = defaultedMap58.size();
        int i60 = defaultedMap58.size();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate61, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b70 = defaultedMap69.isEmpty();
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) defaultedMap69);
        boolean b72 = defaultedMap58.containsKey((java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i75 = defaultedMap74.size();
        int i76 = defaultedMap74.size();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate77, predicate78);
        defaultedMap65.putAll(map79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.DefaultedMap.decorate(map79, (java.lang.Object) predicate81);
        java.lang.Object obj83 = defaultedMap29.get((java.lang.Object) predicate81);
        boolean b84 = defaultedMap20.containsKey((java.lang.Object) predicate81);
        java.lang.Object obj85 = defaultedMap10.remove((java.lang.Object) defaultedMap20);
        java.util.Set set86 = defaultedMap10.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1L + "'", obj7.equals(1L));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1L + "'", obj12.equals(1L));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1L + "'", obj22.equals(1L));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1L + "'", obj37.equals(1L));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1L + "'", obj50.equals(1L));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1L + "'", obj54.equals(1L));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1L + "'", obj67.equals(1L));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1L + "'", obj71.equals(1L));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 1L + "'", obj83.equals(1L));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        boolean b17 = defaultedMap14.equals((java.lang.Object) "hi!");
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b34 = defaultedMap33.isEmpty();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj44 = defaultedMap29.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = defaultedMap25.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj46 = defaultedMap14.get((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) (-1L));
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1L + "'", obj31.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i23 = defaultedMap22.size();
        java.util.Set set24 = defaultedMap22.keySet();
        java.util.Set set25 = defaultedMap22.keySet();
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) defaultedMap22);
        java.util.Set set30 = defaultedMap22.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b13 = defaultedMap12.isEmpty();
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i18 = defaultedMap17.size();
        int i19 = defaultedMap17.size();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        defaultedMap8.putAll(map22);
        java.util.Set set24 = defaultedMap8.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1L + "'", obj10.equals(1L));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1L + "'", obj14.equals(1L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) (-1L));
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i26 = defaultedMap25.size();
        int i27 = defaultedMap25.size();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b38 = defaultedMap37.isEmpty();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) defaultedMap37);
        java.util.Set set40 = defaultedMap37.keySet();
        defaultedMap37.clear();
        java.lang.Object obj42 = defaultedMap6.put((java.lang.Object) predicate28, (java.lang.Object) defaultedMap37);
        java.lang.Object obj43 = defaultedMap1.get(obj42);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i3 = defaultedMap2.size();
        boolean b4 = defaultedMap2.isEmpty();
        defaultedMap2.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1L));
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i21 = defaultedMap20.size();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i27 = defaultedMap26.size();
        int i28 = defaultedMap26.size();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate22, predicate29);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b39 = defaultedMap38.isEmpty();
        java.lang.Object obj40 = defaultedMap34.get((java.lang.Object) defaultedMap38);
        java.util.Set set41 = defaultedMap38.keySet();
        defaultedMap38.clear();
        java.lang.Object obj43 = defaultedMap7.put((java.lang.Object) predicate29, (java.lang.Object) defaultedMap38);
        collections.Predicate predicate44 = null;
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate29, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b49 = defaultedMap47.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection52 = defaultedMap51.values();
        boolean b53 = defaultedMap51.isEmpty();
        java.lang.Object obj55 = defaultedMap51.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b60 = defaultedMap58.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj62 = defaultedMap58.remove((java.lang.Object) (-1L));
        defaultedMap58.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i66 = defaultedMap65.size();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate67, predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i72 = defaultedMap71.size();
        int i73 = defaultedMap71.size();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate67, predicate74);
        java.lang.Object obj78 = defaultedMap56.get((java.lang.Object) predicate67);
        java.lang.Object obj80 = defaultedMap47.put((java.lang.Object) predicate67, (java.lang.Object) 1);
        try {
            java.util.Map map81 = collections.map.PredicatedMap.decorate(map0, predicate29, predicate67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1L + "'", obj36.equals(1L));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1L + "'", obj40.equals(1L));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1L + "'", obj55.equals(1L));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 100.0f + "'", obj78.equals(100.0f));
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection7 = defaultedMap6.values();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.containsKey((java.lang.Object) (-1));
        java.util.Collection collection11 = defaultedMap6.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i23 = defaultedMap22.size();
        java.util.Set set24 = defaultedMap22.keySet();
        java.util.Set set25 = defaultedMap22.keySet();
        boolean b26 = defaultedMap22.isEmpty();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 0.0d);
        java.lang.Object obj29 = defaultedMap6.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b32 = defaultedMap22.containsKey((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1L + "'", obj29.equals(1L));
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection6 = defaultedMap5.values();
        boolean b7 = defaultedMap5.isEmpty();
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj16 = defaultedMap12.remove((java.lang.Object) (-1L));
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i26 = defaultedMap25.size();
        int i27 = defaultedMap25.size();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate28);
        java.lang.Object obj32 = defaultedMap10.get((java.lang.Object) predicate21);
        java.lang.Object obj34 = defaultedMap1.put((java.lang.Object) predicate21, (java.lang.Object) 1);
        java.lang.String str35 = defaultedMap1.toString();
        java.util.Collection collection36 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) (-1L));
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i52 = defaultedMap51.size();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i58 = defaultedMap57.size();
        int i59 = defaultedMap57.size();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate60, predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate53, predicate60);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b70 = defaultedMap69.isEmpty();
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) defaultedMap69);
        java.util.Set set72 = defaultedMap69.keySet();
        defaultedMap69.clear();
        java.lang.Object obj74 = defaultedMap38.put((java.lang.Object) predicate60, (java.lang.Object) defaultedMap69);
        java.util.Collection collection75 = defaultedMap38.values();
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100.0f + "'", obj32.equals(100.0f));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 1L + "'", obj67.equals(1L));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1L + "'", obj71.equals(1L));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 1.0f + "'", obj76.equals(1.0f));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        boolean b19 = defaultedMap15.isEmpty();
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 0.0d);
        boolean b22 = defaultedMap1.containsValue((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap15);
        java.util.Set set24 = defaultedMap15.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) (-1.0f));
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection21 = defaultedMap20.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap20.containsKey((java.lang.Object) (-1));
        java.lang.Object obj25 = defaultedMap7.remove((java.lang.Object) defaultedMap20);
        java.util.Set set26 = defaultedMap20.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 10);
        java.util.Collection collection16 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i23 = defaultedMap22.size();
        java.util.Set set24 = defaultedMap22.keySet();
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = defaultedMap18.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        boolean b28 = defaultedMap13.containsValue((java.lang.Object) defaultedMap18);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1L + "'", obj9.equals(1L));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1L + "'", obj15.equals(1L));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1L + "'", obj26.equals(1L));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i4 = defaultedMap3.size();
        int i5 = defaultedMap3.size();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b15 = defaultedMap14.isEmpty();
        java.lang.Object obj16 = defaultedMap10.get((java.lang.Object) defaultedMap14);
        boolean b17 = defaultedMap3.containsKey((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i20 = defaultedMap19.size();
        int i21 = defaultedMap19.size();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        defaultedMap10.putAll(map24);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.DefaultedMap.decorate(map24, (java.lang.Object) predicate26);
        boolean b28 = defaultedMap1.containsKey((java.lang.Object) map24);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1L + "'", obj12.equals(1L));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1L + "'", obj16.equals(1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i9 = defaultedMap8.size();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        int i16 = defaultedMap14.size();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) (-1.0f));
        java.lang.String str25 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection28 = defaultedMap27.values();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap27);
        boolean b31 = defaultedMap27.containsKey((java.lang.Object) (-1));
        java.lang.Object obj32 = defaultedMap1.remove((java.lang.Object) defaultedMap27);
        int i33 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        boolean b3 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i15 = defaultedMap14.size();
        boolean b17 = defaultedMap14.equals((java.lang.Object) "hi!");
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set23 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set26 = defaultedMap25.entrySet();
        boolean b27 = defaultedMap22.containsKey((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b34 = defaultedMap33.isEmpty();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        boolean b42 = defaultedMap41.isEmpty();
        java.lang.Object obj43 = defaultedMap37.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj44 = defaultedMap29.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = defaultedMap25.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj46 = defaultedMap14.get((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) (-1.0f));
        java.lang.String str51 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection54 = defaultedMap53.values();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap53);
        defaultedMap14.putAll(map55);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1L + "'", obj5.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1L + "'", obj31.equals(1L));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1L + "'", obj35.equals(1L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1L + "'", obj39.equals(1L));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1L + "'", obj43.equals(1L));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1L + "'", obj44.equals(1L));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1L + "'", obj45.equals(1L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1L + "'", obj46.equals(1L));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Set set11 = defaultedMap10.entrySet();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) (-1.0f));
        java.lang.String str22 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection25 = defaultedMap24.values();
        boolean b26 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection33 = defaultedMap32.values();
        boolean b34 = defaultedMap32.isEmpty();
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) (-1L));
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i47 = defaultedMap46.size();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i53 = defaultedMap52.size();
        int i54 = defaultedMap52.size();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate55, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate48, predicate55);
        java.lang.Object obj59 = defaultedMap37.get((java.lang.Object) predicate48);
        java.lang.Object obj61 = defaultedMap28.put((java.lang.Object) predicate48, (java.lang.Object) 1);
        java.lang.String str62 = defaultedMap28.toString();
        boolean b63 = defaultedMap24.containsValue((java.lang.Object) defaultedMap28);
        defaultedMap19.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj65 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1L + "'", obj36.equals(1L));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100.0f + "'", obj59.equals(100.0f));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1L + "'", obj65.equals(1L));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 1.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection12 = defaultedMap11.values();
        boolean b13 = defaultedMap11.isEmpty();
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.keySet();
        java.util.Set set20 = defaultedMap17.keySet();
        boolean b21 = defaultedMap17.isEmpty();
        java.lang.Object obj22 = defaultedMap11.remove((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection25 = defaultedMap24.values();
        boolean b26 = defaultedMap24.isEmpty();
        defaultedMap11.putAll((java.util.Map) defaultedMap24);
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1L + "'", obj15.equals(1L));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
    }
}

