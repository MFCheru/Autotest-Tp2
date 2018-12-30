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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 0 + "'", obj5.equals((short) 0));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.lang.String str21 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj38 = defaultedMap22.get((java.lang.Object) "");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 0 + "'", obj38.equals((short) 0));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap21.containsKey(obj25);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) b35);
        collections.Factory factory37 = null;
        try {
            java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.get(obj12);
        boolean b14 = defaultedMap1.containsKey(obj13);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1.0f));
        java.util.Set set50 = defaultedMap47.keySet();
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap47.containsKey(obj51);
        java.util.Collection collection53 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.get(obj58);
        boolean b60 = defaultedMap47.containsKey(obj59);
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        defaultedMap24.putAll((java.util.Map) defaultedMap47);
        collections.Transformer transformer63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, transformer63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 0 + "'", obj59.equals((short) 0));
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b21 = defaultedMap19.equals((java.lang.Object) (-1.0f));
        java.util.Set set22 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj26 = defaultedMap19.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap25);
        java.util.Set set27 = defaultedMap19.entrySet();
        boolean b28 = defaultedMap15.equals((java.lang.Object) defaultedMap19);
        java.lang.Object obj29 = null;
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj29);
        defaultedMap6.putAll(map30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        defaultedMap13.clear();
        boolean b38 = defaultedMap13.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap13.get((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap13.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.containsValue((java.lang.Object) '#');
        java.util.Set set12 = defaultedMap9.entrySet();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj21 = defaultedMap15.put((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) '#');
        java.util.Set set26 = defaultedMap23.entrySet();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) set26);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        java.util.Collection collection14 = defaultedMap6.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.equals(obj13);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap36.containsKey(obj40);
        java.util.Collection collection42 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.get(obj47);
        boolean b49 = defaultedMap36.containsKey(obj48);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj51 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj53 = defaultedMap27.get((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 0 + "'", obj25.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 0 + "'", obj53.equals((short) 0));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap15.containsKey(obj19);
        java.lang.Object obj21 = defaultedMap10.get((java.lang.Object) defaultedMap15);
        boolean b22 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap24.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b33 = defaultedMap31.equals((java.lang.Object) 0.0f);
        java.lang.Object obj34 = defaultedMap24.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap24.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (-1.0f));
        java.util.Set set48 = defaultedMap45.keySet();
        java.lang.Object obj49 = null;
        boolean b50 = defaultedMap45.containsKey(obj49);
        java.util.Collection collection51 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap53.get(obj56);
        boolean b58 = defaultedMap45.containsKey(obj57);
        defaultedMap36.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj60 = defaultedMap15.remove((java.lang.Object) defaultedMap36);
        boolean b61 = defaultedMap5.containsValue((java.lang.Object) defaultedMap15);
        boolean b62 = defaultedMap1.equals((java.lang.Object) b61);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 0 + "'", obj21.equals((short) 0));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) 0 + "'", obj43.equals((short) 0));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 0 + "'", obj57.equals((short) 0));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1.0f));
        java.util.Set set50 = defaultedMap47.keySet();
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap47.containsKey(obj51);
        java.util.Collection collection53 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.get(obj58);
        boolean b60 = defaultedMap47.containsKey(obj59);
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        defaultedMap24.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set65 = defaultedMap64.keySet();
        java.lang.Object obj66 = null;
        boolean b67 = defaultedMap64.equals(obj66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b71 = defaultedMap69.equals((java.lang.Object) (-1.0f));
        java.util.Set set72 = defaultedMap69.keySet();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj76 = defaultedMap69.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap75);
        boolean b77 = defaultedMap64.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b81 = defaultedMap79.equals((java.lang.Object) (-1.0f));
        java.util.Set set82 = defaultedMap79.keySet();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate83, predicate84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b89 = defaultedMap87.equals((java.lang.Object) (-1.0f));
        java.util.Set set90 = defaultedMap87.keySet();
        java.lang.Object obj91 = null;
        boolean b92 = defaultedMap87.containsKey(obj91);
        java.util.Collection collection93 = defaultedMap87.values();
        java.lang.Object obj94 = defaultedMap64.put((java.lang.Object) defaultedMap79, (java.lang.Object) defaultedMap87);
        boolean b95 = defaultedMap47.equals((java.lang.Object) defaultedMap87);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 0 + "'", obj59.equals((short) 0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue(b95 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b6 = defaultedMap4.equals((java.lang.Object) (-1.0f));
        java.util.Set set7 = defaultedMap4.keySet();
        java.lang.Object obj10 = defaultedMap4.put((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) '#');
        java.util.Set set15 = defaultedMap12.entrySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) set15);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) set15);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 0 + "'", obj17.equals((short) 0));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap15.containsKey(obj19);
        java.util.Collection collection21 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.get(obj26);
        boolean b28 = defaultedMap15.containsKey(obj27);
        defaultedMap6.putAll((java.util.Map) defaultedMap15);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Set set14 = defaultedMap11.keySet();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap11.containsKey(obj15);
        java.lang.Object obj17 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b18 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        java.util.Set set23 = defaultedMap20.keySet();
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1.0f));
        java.util.Set set35 = defaultedMap32.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap20.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap41.containsKey(obj45);
        java.util.Collection collection47 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.get(obj52);
        boolean b54 = defaultedMap41.containsKey(obj53);
        defaultedMap32.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj56 = defaultedMap11.remove((java.lang.Object) defaultedMap32);
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set60 = defaultedMap59.keySet();
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap59.equals(obj61);
        java.lang.Object obj64 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.Object obj66 = defaultedMap59.get((java.lang.Object) 10.0f);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap59);
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map67, predicate68, predicate70);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 0 + "'", obj9.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 0 + "'", obj17.equals((short) 0));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 0 + "'", obj30.equals((short) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 0 + "'", obj53.equals((short) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 0 + "'", obj64.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 0 + "'", obj66.equals((short) 0));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap21.containsKey(obj25);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) b35);
        java.util.Set set37 = defaultedMap21.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.get(obj12);
        boolean b14 = defaultedMap1.containsKey(obj13);
        java.util.Collection collection15 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap13.get((java.lang.Object) (short) 0);
        java.util.Set set40 = defaultedMap13.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        boolean b8 = defaultedMap1.equals((java.lang.Object) ' ');
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 0 + "'", obj6.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap21.containsKey(obj25);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) b35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        java.util.Set set45 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj49 = defaultedMap42.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap48);
        java.util.Set set50 = defaultedMap42.entrySet();
        boolean b51 = defaultedMap38.equals((java.lang.Object) defaultedMap42);
        boolean b52 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        java.lang.Object obj54 = defaultedMap38.get((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + (short) 0 + "'", obj54.equals((short) 0));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap36.containsKey(obj40);
        java.util.Collection collection42 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.get(obj47);
        boolean b49 = defaultedMap36.containsKey(obj48);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj51 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (-1.0f));
        java.util.Set set60 = defaultedMap57.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) set60);
        boolean b62 = defaultedMap27.containsKey((java.lang.Object) defaultedMap53);
        java.lang.String str63 = defaultedMap27.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 0 + "'", obj25.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set3 = defaultedMap2.keySet();
        java.lang.Object obj5 = defaultedMap2.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap7.equals((java.lang.Object) (-1.0f));
        java.util.Set set10 = defaultedMap7.keySet();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap7.containsKey(obj11);
        java.lang.Object obj13 = defaultedMap2.get((java.lang.Object) defaultedMap7);
        boolean b14 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.equals((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap16.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (-1.0f));
        java.util.Set set31 = defaultedMap28.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap16.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b39 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        java.util.Set set40 = defaultedMap37.keySet();
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap37.containsKey(obj41);
        java.util.Collection collection43 = defaultedMap37.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap45.get(obj48);
        boolean b50 = defaultedMap37.containsKey(obj49);
        defaultedMap28.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj52 = defaultedMap7.remove((java.lang.Object) defaultedMap28);
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate(map0, obj52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 0 + "'", obj5.equals((short) 0));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 0 + "'", obj26.equals((short) 0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 0 + "'", obj35.equals((short) 0));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 0 + "'", obj49.equals((short) 0));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.util.Set set12 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap9.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap15);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set20 = defaultedMap19.keySet();
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set25 = defaultedMap24.keySet();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (-1.0f));
        java.util.Set set32 = defaultedMap29.keySet();
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap29.containsKey(obj33);
        java.lang.Object obj35 = defaultedMap24.get((java.lang.Object) defaultedMap29);
        boolean b36 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj43 = defaultedMap38.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b47 = defaultedMap45.equals((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap38.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (-1.0f));
        java.util.Set set53 = defaultedMap50.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap38.get((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b61 = defaultedMap59.equals((java.lang.Object) (-1.0f));
        java.util.Set set62 = defaultedMap59.keySet();
        java.lang.Object obj63 = null;
        boolean b64 = defaultedMap59.containsKey(obj63);
        java.util.Collection collection65 = defaultedMap59.values();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b69 = defaultedMap67.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj70 = null;
        java.lang.Object obj71 = defaultedMap67.get(obj70);
        boolean b72 = defaultedMap59.containsKey(obj71);
        defaultedMap50.putAll((java.util.Map) defaultedMap59);
        java.lang.Object obj74 = defaultedMap29.remove((java.lang.Object) defaultedMap50);
        boolean b75 = defaultedMap19.containsValue((java.lang.Object) defaultedMap29);
        int i76 = defaultedMap19.size();
        java.lang.Object obj77 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 0 + "'", obj35.equals((short) 0));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 0 + "'", obj57.equals((short) 0));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 0 + "'", obj71.equals((short) 0));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) 0 + "'", obj77.equals((short) 0));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj39 = defaultedMap13.get((java.lang.Object) (short) 0);
        defaultedMap13.clear();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b45 = defaultedMap43.equals((java.lang.Object) (-1.0f));
        java.util.Set set46 = defaultedMap43.keySet();
        java.lang.Object obj49 = defaultedMap43.put((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b53 = defaultedMap51.containsValue((java.lang.Object) '#');
        java.util.Set set54 = defaultedMap51.entrySet();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) set54);
        defaultedMap13.putAll((java.util.Map) defaultedMap43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1.0f));
        java.util.Set set50 = defaultedMap47.keySet();
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap47.containsKey(obj51);
        java.util.Collection collection53 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.get(obj58);
        boolean b60 = defaultedMap47.containsKey(obj59);
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        defaultedMap24.putAll((java.util.Map) defaultedMap47);
        java.util.Set set63 = defaultedMap24.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 0 + "'", obj59.equals((short) 0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.get(obj12);
        boolean b14 = defaultedMap1.containsKey(obj13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) b19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set23 = defaultedMap22.keySet();
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap22.equals(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj34 = defaultedMap27.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap33);
        boolean b35 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set38 = defaultedMap37.keySet();
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        java.util.Set set45 = defaultedMap42.keySet();
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap42.containsKey(obj46);
        java.lang.Object obj48 = defaultedMap37.get((java.lang.Object) defaultedMap42);
        boolean b49 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (-1.0f));
        java.util.Set set54 = defaultedMap51.keySet();
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap51.containsKey(obj55);
        java.lang.Object obj57 = defaultedMap22.put((java.lang.Object) defaultedMap42, (java.lang.Object) b56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b61 = defaultedMap59.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b65 = defaultedMap63.equals((java.lang.Object) (-1.0f));
        java.util.Set set66 = defaultedMap63.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj70 = defaultedMap63.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap69);
        java.util.Set set71 = defaultedMap63.entrySet();
        boolean b72 = defaultedMap59.equals((java.lang.Object) defaultedMap63);
        boolean b73 = defaultedMap22.containsKey((java.lang.Object) defaultedMap59);
        java.lang.Object obj74 = defaultedMap1.get((java.lang.Object) b73);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 0 + "'", obj40.equals((short) 0));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + (short) 0 + "'", obj74.equals((short) 0));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.util.Collection collection35 = defaultedMap33.values();
        int i36 = defaultedMap33.size();
        java.util.Collection collection37 = defaultedMap33.values();
        java.lang.Object obj38 = defaultedMap24.get((java.lang.Object) defaultedMap33);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 0 + "'", obj38.equals((short) 0));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        boolean b37 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (-1.0f));
        java.util.Set set42 = defaultedMap39.keySet();
        java.lang.Object obj44 = defaultedMap39.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b48 = defaultedMap46.equals((java.lang.Object) 0.0f);
        java.lang.Object obj49 = defaultedMap39.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (-1.0f));
        java.util.Set set54 = defaultedMap51.keySet();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate56);
        java.lang.Object obj58 = defaultedMap39.get((java.lang.Object) defaultedMap51);
        boolean b59 = defaultedMap22.containsKey((java.lang.Object) defaultedMap39);
        boolean b61 = defaultedMap39.containsKey((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 0 + "'", obj49.equals((short) 0));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 0 + "'", obj58.equals((short) 0));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap13.containsKey(obj17);
        java.lang.Object obj19 = defaultedMap8.get((java.lang.Object) defaultedMap13);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 0 + "'", obj6.equals((short) 0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1.0f));
        java.util.Set set50 = defaultedMap47.keySet();
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap47.containsKey(obj51);
        java.util.Collection collection53 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.get(obj58);
        boolean b60 = defaultedMap47.containsKey(obj59);
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        defaultedMap24.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection63 = defaultedMap47.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 0 + "'", obj59.equals((short) 0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.util.Set set12 = defaultedMap9.keySet();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap9.containsKey(obj13);
        java.lang.Object obj15 = defaultedMap5.remove((java.lang.Object) b14);
        defaultedMap5.clear();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        boolean b8 = defaultedMap1.equals((java.lang.Object) ' ');
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 0 + "'", obj6.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        java.util.Set set32 = defaultedMap1.keySet();
        java.util.Collection collection33 = defaultedMap1.values();
        java.util.Collection collection34 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Set set14 = defaultedMap11.keySet();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap11.containsKey(obj15);
        java.lang.Object obj17 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b18 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        java.util.Set set23 = defaultedMap20.keySet();
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1.0f));
        java.util.Set set35 = defaultedMap32.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap20.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap41.containsKey(obj45);
        java.util.Collection collection47 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.get(obj52);
        boolean b54 = defaultedMap41.containsKey(obj53);
        defaultedMap32.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj56 = defaultedMap11.remove((java.lang.Object) defaultedMap32);
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set60 = defaultedMap59.keySet();
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap59.equals(obj61);
        java.lang.Object obj64 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.Object obj66 = defaultedMap59.get((java.lang.Object) 10.0f);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b71 = defaultedMap69.equals((java.lang.Object) (-1.0f));
        java.util.Set set72 = defaultedMap69.keySet();
        java.lang.Object obj73 = defaultedMap1.remove((java.lang.Object) set72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b77 = defaultedMap75.containsValue((java.lang.Object) '#');
        java.util.Set set78 = defaultedMap75.entrySet();
        java.lang.String str79 = defaultedMap75.toString();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b83 = defaultedMap81.containsValue((java.lang.Object) '#');
        java.util.Set set84 = defaultedMap81.entrySet();
        java.util.Set set85 = defaultedMap81.keySet();
        boolean b86 = defaultedMap75.containsKey((java.lang.Object) defaultedMap81);
        boolean b87 = defaultedMap1.containsValue((java.lang.Object) defaultedMap75);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 0 + "'", obj9.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 0 + "'", obj17.equals((short) 0));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 0 + "'", obj30.equals((short) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 0 + "'", obj53.equals((short) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 0 + "'", obj64.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 0 + "'", obj66.equals((short) 0));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        boolean b37 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b41 = defaultedMap39.equals((java.lang.Object) (-1.0f));
        java.util.Set set42 = defaultedMap39.keySet();
        java.lang.Object obj44 = defaultedMap39.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b48 = defaultedMap46.equals((java.lang.Object) 0.0f);
        java.lang.Object obj49 = defaultedMap39.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b53 = defaultedMap51.equals((java.lang.Object) (-1.0f));
        java.util.Set set54 = defaultedMap51.keySet();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate55, predicate56);
        java.lang.Object obj58 = defaultedMap39.get((java.lang.Object) defaultedMap51);
        boolean b59 = defaultedMap22.containsKey((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b63 = defaultedMap61.equals((java.lang.Object) (-1.0f));
        java.util.Set set64 = defaultedMap61.keySet();
        java.lang.Object obj67 = defaultedMap61.put((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b71 = defaultedMap69.equals((java.lang.Object) (-1.0f));
        java.util.Set set72 = defaultedMap69.keySet();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj76 = defaultedMap69.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap75);
        boolean b77 = defaultedMap61.containsKey((java.lang.Object) defaultedMap75);
        java.lang.Object obj78 = defaultedMap22.get((java.lang.Object) b77);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + (short) 0 + "'", obj49.equals((short) 0));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 0 + "'", obj58.equals((short) 0));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (short) 0 + "'", obj78.equals((short) 0));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Set set11 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set14 = defaultedMap13.keySet();
        boolean b16 = defaultedMap13.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj21 = defaultedMap18.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1.0f));
        java.util.Set set26 = defaultedMap23.keySet();
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap23.containsKey(obj27);
        java.lang.Object obj29 = defaultedMap18.get((java.lang.Object) defaultedMap23);
        boolean b30 = defaultedMap23.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1.0f));
        java.util.Set set35 = defaultedMap32.keySet();
        java.lang.Object obj37 = defaultedMap32.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b41 = defaultedMap39.equals((java.lang.Object) 0.0f);
        java.lang.Object obj42 = defaultedMap32.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.util.Set set47 = defaultedMap44.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap32.get((java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        java.util.Set set56 = defaultedMap53.keySet();
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap53.containsKey(obj57);
        java.util.Collection collection59 = defaultedMap53.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b63 = defaultedMap61.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = defaultedMap61.get(obj64);
        boolean b66 = defaultedMap53.containsKey(obj65);
        defaultedMap44.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj68 = defaultedMap23.remove((java.lang.Object) defaultedMap44);
        boolean b69 = defaultedMap13.containsValue((java.lang.Object) defaultedMap23);
        java.lang.String str70 = defaultedMap23.toString();
        boolean b71 = defaultedMap1.containsKey((java.lang.Object) defaultedMap23);
        java.lang.Object obj73 = defaultedMap23.get((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 0 + "'", obj21.equals((short) 0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 0 + "'", obj29.equals((short) 0));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + (short) 0 + "'", obj42.equals((short) 0));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + (short) 0 + "'", obj51.equals((short) 0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + (short) 0 + "'", obj65.equals((short) 0));
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + (short) 0 + "'", obj73.equals((short) 0));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        boolean b37 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b41 = defaultedMap39.containsValue((java.lang.Object) '#');
        java.util.Set set42 = defaultedMap39.entrySet();
        java.util.Set set43 = defaultedMap39.entrySet();
        boolean b44 = defaultedMap22.containsKey((java.lang.Object) set43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap7);
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) '#');
        java.util.Set set14 = defaultedMap11.entrySet();
        java.lang.String str15 = defaultedMap11.toString();
        boolean b16 = defaultedMap1.equals((java.lang.Object) str15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.equals(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1.0f));
        java.util.Set set26 = defaultedMap23.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap29);
        boolean b31 = defaultedMap18.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b35 = defaultedMap33.equals((java.lang.Object) (-1.0f));
        java.util.Set set36 = defaultedMap33.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap41.containsKey(obj45);
        java.util.Collection collection47 = defaultedMap41.values();
        java.lang.Object obj48 = defaultedMap18.put((java.lang.Object) defaultedMap33, (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set51 = defaultedMap50.keySet();
        java.lang.Object obj53 = defaultedMap50.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.util.Set set58 = defaultedMap55.keySet();
        java.lang.Object obj59 = null;
        boolean b60 = defaultedMap55.containsKey(obj59);
        java.lang.Object obj61 = defaultedMap50.get((java.lang.Object) defaultedMap55);
        boolean b62 = defaultedMap55.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b66 = defaultedMap64.equals((java.lang.Object) (-1.0f));
        java.util.Set set67 = defaultedMap64.keySet();
        java.lang.Object obj68 = null;
        boolean b69 = defaultedMap64.containsKey(obj68);
        java.util.Collection collection70 = defaultedMap64.values();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b74 = defaultedMap72.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj75 = null;
        java.lang.Object obj76 = defaultedMap72.get(obj75);
        boolean b77 = defaultedMap64.containsKey(obj76);
        defaultedMap55.putAll((java.util.Map) defaultedMap64);
        defaultedMap41.putAll((java.util.Map) defaultedMap64);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b83 = defaultedMap81.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b87 = defaultedMap85.equals((java.lang.Object) (-1.0f));
        java.util.Set set88 = defaultedMap85.keySet();
        java.util.Map map89 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) set88);
        java.util.Collection collection90 = defaultedMap81.values();
        java.util.Set set91 = defaultedMap81.keySet();
        java.lang.Object obj92 = defaultedMap64.get((java.lang.Object) defaultedMap81);
        java.lang.Object obj93 = defaultedMap1.get((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 0 + "'", obj53.equals((short) 0));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) 0 + "'", obj61.equals((short) 0));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) 0 + "'", obj76.equals((short) 0));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + (short) 0 + "'", obj92.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + (short) 0 + "'", obj93.equals((short) 0));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.util.Set set12 = defaultedMap9.keySet();
        java.lang.Object obj14 = defaultedMap9.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) 0.0f);
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        java.lang.Object obj28 = defaultedMap9.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.util.Collection collection36 = defaultedMap30.values();
        boolean b37 = defaultedMap30.isEmpty();
        java.util.Set set38 = defaultedMap30.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set41 = defaultedMap40.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap40.equals(obj42);
        java.lang.Object obj45 = defaultedMap40.get((java.lang.Object) 'a');
        java.lang.Object obj47 = defaultedMap40.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1.0f));
        java.util.Set set52 = defaultedMap49.keySet();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (-1.0f));
        java.util.Set set60 = defaultedMap57.keySet();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate53, predicate62);
        java.lang.Object obj65 = defaultedMap30.remove((java.lang.Object) predicate62);
        boolean b66 = defaultedMap9.containsKey((java.lang.Object) defaultedMap30);
        boolean b67 = defaultedMap1.containsKey((java.lang.Object) defaultedMap30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 0 + "'", obj28.equals((short) 0));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) 0 + "'", obj45.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 0 + "'", obj47.equals((short) 0));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        java.util.Set set14 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap36.containsKey(obj40);
        java.util.Collection collection42 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.get(obj47);
        boolean b49 = defaultedMap36.containsKey(obj48);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj51 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (-1.0f));
        java.util.Set set60 = defaultedMap57.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) set60);
        boolean b62 = defaultedMap27.containsKey((java.lang.Object) defaultedMap53);
        java.util.Set set63 = defaultedMap27.entrySet();
        java.util.Set set64 = defaultedMap27.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 0 + "'", obj25.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.equals(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap17);
        boolean b19 = defaultedMap6.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set22 = defaultedMap21.keySet();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (-1.0f));
        java.util.Set set29 = defaultedMap26.keySet();
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap26.containsKey(obj30);
        java.lang.Object obj32 = defaultedMap21.get((java.lang.Object) defaultedMap26);
        boolean b33 = defaultedMap26.isEmpty();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (-1.0f));
        java.util.Set set38 = defaultedMap35.keySet();
        java.lang.Object obj39 = null;
        boolean b40 = defaultedMap35.containsKey(obj39);
        java.lang.Object obj41 = defaultedMap6.put((java.lang.Object) defaultedMap26, (java.lang.Object) b40);
        boolean b42 = defaultedMap1.containsKey(obj41);
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 0 + "'", obj24.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 0 + "'", obj32.equals((short) 0));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Set set11 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap10.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap16);
        java.util.Set set18 = defaultedMap10.entrySet();
        boolean b19 = defaultedMap6.equals((java.lang.Object) defaultedMap10);
        java.lang.Object obj20 = null;
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1.0f));
        boolean b26 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.String str26 = defaultedMap22.toString();
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) str26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        defaultedMap6.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap10.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (-1.0f));
        java.util.Set set21 = defaultedMap18.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set28 = defaultedMap27.keySet();
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap27.equals(obj29);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) 'a');
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.util.Set set47 = defaultedMap44.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate40, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set54 = defaultedMap53.keySet();
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap53.equals(obj55);
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) 'a');
        java.lang.Object obj60 = defaultedMap53.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b64 = defaultedMap62.equals((java.lang.Object) (-1.0f));
        java.util.Set set65 = defaultedMap62.keySet();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b72 = defaultedMap70.equals((java.lang.Object) (-1.0f));
        java.util.Set set73 = defaultedMap70.keySet();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate66, predicate75);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate75);
        int i79 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b83 = defaultedMap81.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b87 = defaultedMap85.equals((java.lang.Object) (-1.0f));
        java.util.Set set88 = defaultedMap85.keySet();
        java.lang.Object obj89 = null;
        boolean b90 = defaultedMap85.containsKey(obj89);
        java.lang.Object obj91 = defaultedMap81.remove((java.lang.Object) b90);
        collections.map.DefaultedMap defaultedMap93 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set94 = defaultedMap93.keySet();
        java.util.Set set95 = defaultedMap93.keySet();
        boolean b96 = defaultedMap81.containsValue((java.lang.Object) defaultedMap93);
        java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap81);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 0 + "'", obj6.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 0 + "'", obj8.equals((short) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 0 + "'", obj32.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 0 + "'", obj58.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) 0 + "'", obj60.equals((short) 0));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap10.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (-1.0f));
        java.util.Set set21 = defaultedMap18.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set28 = defaultedMap27.keySet();
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap27.equals(obj29);
        java.lang.Object obj32 = defaultedMap27.get((java.lang.Object) 'a');
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.util.Set set47 = defaultedMap44.keySet();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate40, predicate49);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set54 = defaultedMap53.keySet();
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap53.equals(obj55);
        java.lang.Object obj58 = defaultedMap53.get((java.lang.Object) 'a');
        java.lang.Object obj60 = defaultedMap53.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b64 = defaultedMap62.equals((java.lang.Object) (-1.0f));
        java.util.Set set65 = defaultedMap62.keySet();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b72 = defaultedMap70.equals((java.lang.Object) (-1.0f));
        java.util.Set set73 = defaultedMap70.keySet();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate66, predicate75);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate75);
        int i79 = defaultedMap1.size();
        int i80 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 0 + "'", obj6.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 0 + "'", obj8.equals((short) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) 0 + "'", obj32.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 0 + "'", obj58.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) 0 + "'", obj60.equals((short) 0));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertTrue(i80 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.util.Collection collection22 = defaultedMap15.values();
        java.lang.Object obj23 = defaultedMap7.remove((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1.0f));
        java.util.Set set28 = defaultedMap25.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b35 = defaultedMap33.equals((java.lang.Object) (-1.0f));
        java.util.Set set36 = defaultedMap33.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate29, predicate37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b14 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap5.containsKey(obj9);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) b10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Set set15 = defaultedMap13.keySet();
        boolean b16 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set19 = defaultedMap18.keySet();
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap18.equals(obj20);
        java.lang.Object obj23 = defaultedMap18.get((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (-1.0f));
        java.util.Set set38 = defaultedMap35.keySet();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate40);
        boolean b43 = defaultedMap13.equals((java.lang.Object) predicate31);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) 0 + "'", obj23.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 0 + "'", obj25.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap7);
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        java.util.Set set32 = defaultedMap1.keySet();
        java.util.Collection collection33 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (-1.0f));
        java.util.Set set38 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b42 = defaultedMap40.equals((java.lang.Object) (-1.0f));
        java.util.Set set43 = defaultedMap40.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate44, predicate45);
        boolean b47 = defaultedMap35.containsKey((java.lang.Object) defaultedMap40);
        boolean b49 = defaultedMap35.containsKey((java.lang.Object) 10.0d);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b49);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str13 = defaultedMap1.toString();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        java.lang.String str32 = defaultedMap24.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1.0f));
        java.util.Set set15 = defaultedMap12.keySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) set15);
        java.util.Collection collection17 = defaultedMap8.values();
        java.util.Set set18 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) "");
        boolean b25 = defaultedMap8.containsKey((java.lang.Object) "");
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) b25);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (short) 0 + "'", obj24.equals((short) 0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + (short) 0 + "'", obj26.equals((short) 0));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Set set14 = defaultedMap11.keySet();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap11.containsKey(obj15);
        java.lang.Object obj17 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b18 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        java.util.Set set23 = defaultedMap20.keySet();
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1.0f));
        java.util.Set set35 = defaultedMap32.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap20.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap41.containsKey(obj45);
        java.util.Collection collection47 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.get(obj52);
        boolean b54 = defaultedMap41.containsKey(obj53);
        defaultedMap32.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj56 = defaultedMap11.remove((java.lang.Object) defaultedMap32);
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        int i58 = defaultedMap11.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 0 + "'", obj9.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 0 + "'", obj17.equals((short) 0));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 0 + "'", obj30.equals((short) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 0 + "'", obj53.equals((short) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        defaultedMap1.clear();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.util.Collection collection22 = defaultedMap15.values();
        java.lang.Object obj23 = defaultedMap7.remove((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        java.util.Collection collection10 = defaultedMap1.values();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) (short) 10);
        java.lang.String str13 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1.0f));
        java.util.Set set50 = defaultedMap47.keySet();
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap47.containsKey(obj51);
        java.util.Collection collection53 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.get(obj58);
        boolean b60 = defaultedMap47.containsKey(obj59);
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        defaultedMap24.putAll((java.util.Map) defaultedMap47);
        int i63 = defaultedMap24.size();
        java.util.Set set64 = defaultedMap24.entrySet();
        int i65 = defaultedMap24.size();
        int i66 = defaultedMap24.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 0 + "'", obj59.equals((short) 0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(i66 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj12 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap11);
        java.util.Set set13 = defaultedMap5.entrySet();
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj12 = defaultedMap5.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap11);
        java.util.Set set13 = defaultedMap5.entrySet();
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate26);
        boolean b28 = defaultedMap16.containsKey((java.lang.Object) defaultedMap21);
        boolean b30 = defaultedMap16.containsKey((java.lang.Object) 10.0d);
        boolean b31 = defaultedMap1.equals((java.lang.Object) b30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap10.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj17 = defaultedMap10.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap16);
        java.util.Set set18 = defaultedMap10.entrySet();
        boolean b19 = defaultedMap6.equals((java.lang.Object) defaultedMap10);
        java.lang.Object obj20 = null;
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1.0f));
        boolean b26 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        boolean b27 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (-1.0f));
        java.util.Set set32 = defaultedMap29.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b36 = defaultedMap34.equals((java.lang.Object) (-1.0f));
        java.util.Set set37 = defaultedMap34.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate39);
        boolean b41 = defaultedMap29.containsKey((java.lang.Object) defaultedMap34);
        java.lang.String str42 = defaultedMap34.toString();
        java.util.Set set43 = defaultedMap34.entrySet();
        java.lang.Object obj44 = defaultedMap10.get((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap8.equals(obj10);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set16 = defaultedMap15.keySet();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap15.equals(obj17);
        java.lang.Object obj20 = defaultedMap15.get((java.lang.Object) 'a');
        boolean b22 = defaultedMap15.equals((java.lang.Object) ' ');
        defaultedMap8.putAll((java.util.Map) defaultedMap15);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) (short) -1);
        boolean b26 = defaultedMap1.isEmpty();
        java.util.Set set27 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap36.containsKey(obj40);
        java.util.Collection collection42 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.get(obj47);
        boolean b49 = defaultedMap36.containsKey(obj48);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj51 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (-1.0f));
        java.util.Set set60 = defaultedMap57.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) set60);
        boolean b62 = defaultedMap27.containsKey((java.lang.Object) defaultedMap53);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) (short) -1);
        int i65 = defaultedMap27.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 0 + "'", obj25.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(i65 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        boolean b29 = defaultedMap22.isEmpty();
        java.util.Set set30 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set33 = defaultedMap32.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap32.equals(obj34);
        java.lang.Object obj37 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1.0f));
        java.util.Set set52 = defaultedMap49.keySet();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate45, predicate54);
        java.lang.Object obj57 = defaultedMap22.remove((java.lang.Object) predicate54);
        boolean b58 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b62 = defaultedMap60.equals((java.lang.Object) (-1.0f));
        java.util.Set set63 = defaultedMap60.keySet();
        java.lang.Object obj65 = defaultedMap60.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b69 = defaultedMap67.equals((java.lang.Object) 0.0f);
        java.lang.Object obj70 = defaultedMap60.get((java.lang.Object) 0.0f);
        boolean b71 = defaultedMap22.containsKey((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (short) 0 + "'", obj37.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (short) 0 + "'", obj70.equals((short) 0));
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        int i13 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        java.lang.Object obj33 = defaultedMap16.remove((java.lang.Object) predicateUtils32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set36 = defaultedMap35.keySet();
        java.util.Collection collection37 = defaultedMap35.values();
        int i38 = defaultedMap35.size();
        java.util.Collection collection39 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set42 = defaultedMap41.keySet();
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap41.equals(obj43);
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) 'a');
        java.lang.Object obj48 = defaultedMap41.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (-1.0f));
        java.util.Set set53 = defaultedMap50.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b60 = defaultedMap58.equals((java.lang.Object) (-1.0f));
        java.util.Set set61 = defaultedMap58.keySet();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate54, predicate63);
        java.util.Collection collection66 = defaultedMap41.values();
        java.lang.Object obj67 = defaultedMap16.put((java.lang.Object) defaultedMap35, (java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + (short) 0 + "'", obj46.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) "");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap21.containsKey(obj25);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) b35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        java.util.Set set45 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj49 = defaultedMap42.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap48);
        java.util.Set set50 = defaultedMap42.entrySet();
        boolean b51 = defaultedMap38.equals((java.lang.Object) defaultedMap42);
        boolean b52 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        java.util.Collection collection53 = defaultedMap1.values();
        java.util.Set set54 = defaultedMap1.entrySet();
        java.lang.String str55 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{{}=false}" + "'", str55.equals("{{}=false}"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set7 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b13 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Set set14 = defaultedMap11.keySet();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap11.containsKey(obj15);
        java.lang.Object obj17 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        boolean b18 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        java.util.Set set23 = defaultedMap20.keySet();
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1.0f));
        java.util.Set set35 = defaultedMap32.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap20.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap41.containsKey(obj45);
        java.util.Collection collection47 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.get(obj52);
        boolean b54 = defaultedMap41.containsKey(obj53);
        defaultedMap32.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj56 = defaultedMap11.remove((java.lang.Object) defaultedMap32);
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        java.lang.String str58 = defaultedMap11.toString();
        java.lang.String str59 = defaultedMap11.toString();
        boolean b60 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b64 = defaultedMap62.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b68 = defaultedMap66.equals((java.lang.Object) (-1.0f));
        java.util.Set set69 = defaultedMap66.keySet();
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) set69);
        java.util.Collection collection71 = defaultedMap62.values();
        java.lang.Object obj72 = defaultedMap11.remove((java.lang.Object) collection71);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short) 0 + "'", obj9.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) 0 + "'", obj17.equals((short) 0));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 0 + "'", obj30.equals((short) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 0 + "'", obj53.equals((short) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 100.0d);
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (short) 1);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Collection collection8 = defaultedMap1.values();
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.util.Set set12 = defaultedMap9.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj16 = defaultedMap9.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap15);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap15);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap10.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (-1.0f));
        java.util.Set set21 = defaultedMap18.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (-1.0f));
        java.util.Set set34 = defaultedMap31.keySet();
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap31.containsKey(obj35);
        java.lang.Object obj37 = defaultedMap27.remove((java.lang.Object) b36);
        defaultedMap27.clear();
        boolean b39 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 0 + "'", obj6.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short) 0 + "'", obj8.equals((short) 0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap7);
        java.util.Set set9 = defaultedMap1.entrySet();
        boolean b10 = defaultedMap1.isEmpty();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        java.util.Set set37 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set40 = defaultedMap39.keySet();
        java.util.Collection collection41 = defaultedMap39.values();
        int i42 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set45 = defaultedMap44.keySet();
        java.util.Collection collection46 = defaultedMap44.values();
        int i47 = defaultedMap44.size();
        java.util.Collection collection48 = defaultedMap44.values();
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) collection48);
        collections.Predicate predicate50 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b54 = defaultedMap52.equals((java.lang.Object) (-1.0f));
        java.util.Set set55 = defaultedMap52.keySet();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate50, predicate56);
        boolean b60 = defaultedMap13.containsValue((java.lang.Object) map59);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap21.containsKey(obj25);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) b35);
        java.lang.String str37 = defaultedMap21.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set13 = defaultedMap12.keySet();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap12.equals(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (-1.0f));
        java.util.Set set20 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap17.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap23);
        boolean b25 = defaultedMap12.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set28 = defaultedMap27.keySet();
        java.lang.Object obj30 = defaultedMap27.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1.0f));
        java.util.Set set35 = defaultedMap32.keySet();
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap32.containsKey(obj36);
        java.lang.Object obj38 = defaultedMap27.get((java.lang.Object) defaultedMap32);
        boolean b39 = defaultedMap32.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap41.containsKey(obj45);
        java.lang.Object obj47 = defaultedMap12.put((java.lang.Object) defaultedMap32, (java.lang.Object) b46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        java.util.Set set56 = defaultedMap53.keySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj60 = defaultedMap53.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap59);
        java.util.Set set61 = defaultedMap53.entrySet();
        boolean b62 = defaultedMap49.equals((java.lang.Object) defaultedMap53);
        boolean b63 = defaultedMap12.containsKey((java.lang.Object) defaultedMap49);
        java.util.Collection collection64 = defaultedMap12.values();
        boolean b65 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 0 + "'", obj30.equals((short) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 0 + "'", obj38.equals((short) 0));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b65 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap15.containsKey(obj19);
        java.util.Collection collection21 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap23.get(obj26);
        boolean b28 = defaultedMap15.containsKey(obj27);
        java.util.Set set29 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b33 = defaultedMap31.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b37 = defaultedMap35.equals((java.lang.Object) (-1.0f));
        java.util.Set set38 = defaultedMap35.keySet();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) set38);
        boolean b40 = defaultedMap15.containsValue((java.lang.Object) map39);
        java.lang.Object obj41 = defaultedMap1.remove((java.lang.Object) b40);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        boolean b9 = defaultedMap1.equals((java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0f));
        java.util.Set set8 = defaultedMap5.keySet();
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap5.containsKey(obj9);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) b10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b19 = defaultedMap17.equals((java.lang.Object) (-1.0f));
        java.util.Set set20 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj24 = defaultedMap17.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap23);
        java.util.Set set25 = defaultedMap17.entrySet();
        boolean b26 = defaultedMap13.equals((java.lang.Object) defaultedMap17);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj29 = defaultedMap13.get((java.lang.Object) (-1));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (short) 0 + "'", obj29.equals((short) 0));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap36.containsKey(obj40);
        java.util.Collection collection42 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.get(obj47);
        boolean b49 = defaultedMap36.containsKey(obj48);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj51 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (-1.0f));
        java.util.Set set60 = defaultedMap57.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) set60);
        boolean b62 = defaultedMap27.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set65 = defaultedMap64.keySet();
        java.util.Collection collection66 = defaultedMap64.values();
        int i67 = defaultedMap64.size();
        defaultedMap64.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set71 = defaultedMap70.keySet();
        java.util.Collection collection72 = defaultedMap70.values();
        int i73 = defaultedMap70.size();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set76 = defaultedMap75.keySet();
        java.util.Collection collection77 = defaultedMap75.values();
        int i78 = defaultedMap75.size();
        java.util.Collection collection79 = defaultedMap75.values();
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) collection79);
        java.lang.Object obj81 = defaultedMap27.put((java.lang.Object) defaultedMap64, (java.lang.Object) defaultedMap70);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 0 + "'", obj25.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set6 = defaultedMap5.keySet();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set11 = defaultedMap10.keySet();
        java.lang.Object obj13 = defaultedMap10.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap15.containsKey(obj19);
        java.lang.Object obj21 = defaultedMap10.get((java.lang.Object) defaultedMap15);
        boolean b22 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj29 = defaultedMap24.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b33 = defaultedMap31.equals((java.lang.Object) 0.0f);
        java.lang.Object obj34 = defaultedMap24.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap24.get((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b47 = defaultedMap45.equals((java.lang.Object) (-1.0f));
        java.util.Set set48 = defaultedMap45.keySet();
        java.lang.Object obj49 = null;
        boolean b50 = defaultedMap45.containsKey(obj49);
        java.util.Collection collection51 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap53.get(obj56);
        boolean b58 = defaultedMap45.containsKey(obj57);
        defaultedMap36.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj60 = defaultedMap15.remove((java.lang.Object) defaultedMap36);
        boolean b61 = defaultedMap5.containsValue((java.lang.Object) defaultedMap15);
        int i62 = defaultedMap5.size();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set65 = defaultedMap64.keySet();
        java.lang.Object obj66 = null;
        boolean b67 = defaultedMap64.equals(obj66);
        java.lang.Object obj69 = defaultedMap64.get((java.lang.Object) 'a');
        java.lang.Object obj71 = defaultedMap64.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b75 = defaultedMap73.equals((java.lang.Object) (-1.0f));
        java.util.Set set76 = defaultedMap73.keySet();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate77, predicate78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b83 = defaultedMap81.equals((java.lang.Object) (-1.0f));
        java.util.Set set84 = defaultedMap81.keySet();
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate77, predicate86);
        boolean b89 = defaultedMap5.containsValue((java.lang.Object) map88);
        java.util.Set set90 = defaultedMap5.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.util.Set set92 = defaultedMap5.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 0 + "'", obj21.equals((short) 0));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) 0 + "'", obj43.equals((short) 0));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + (short) 0 + "'", obj57.equals((short) 0));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + (short) 0 + "'", obj69.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (short) 0 + "'", obj71.equals((short) 0));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNotNull(set92);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap30.get(obj33);
        boolean b35 = defaultedMap22.containsKey(obj34);
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        boolean b37 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b17 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap15.keySet();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        java.util.Set set30 = defaultedMap27.keySet();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate31, predicate32);
        java.lang.Object obj34 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Set set39 = defaultedMap36.keySet();
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap36.containsKey(obj40);
        java.util.Collection collection42 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap44.get(obj47);
        boolean b49 = defaultedMap36.containsKey(obj48);
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj51 = defaultedMap6.remove((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b55 = defaultedMap53.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b59 = defaultedMap57.equals((java.lang.Object) (-1.0f));
        java.util.Set set60 = defaultedMap57.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) set60);
        boolean b62 = defaultedMap27.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b66 = defaultedMap64.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (-1.0f));
        java.util.Set set71 = defaultedMap68.keySet();
        java.lang.Object obj72 = null;
        boolean b73 = defaultedMap68.containsKey(obj72);
        java.lang.Object obj74 = defaultedMap64.remove((java.lang.Object) b73);
        boolean b75 = defaultedMap53.containsKey((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 0 + "'", obj25.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) 0 + "'", obj34.equals((short) 0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) 0 + "'", obj48.equals((short) 0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap21.containsKey(obj25);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) b35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        java.util.Set set45 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj49 = defaultedMap42.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap48);
        java.util.Set set50 = defaultedMap42.entrySet();
        boolean b51 = defaultedMap38.equals((java.lang.Object) defaultedMap42);
        boolean b52 = defaultedMap1.containsKey((java.lang.Object) defaultedMap38);
        java.util.Collection collection53 = defaultedMap1.values();
        java.util.Set set54 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b58 = defaultedMap56.equals((java.lang.Object) (-1.0f));
        java.util.Set set59 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj63 = defaultedMap56.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap62);
        boolean b64 = defaultedMap1.containsValue((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) '#');
        java.util.Set set10 = defaultedMap7.entrySet();
        java.util.Set set11 = defaultedMap7.keySet();
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        java.util.Set set13 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1.0f));
        java.util.Set set11 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj15 = defaultedMap8.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap14);
        java.util.Set set16 = defaultedMap8.entrySet();
        boolean b17 = defaultedMap8.isEmpty();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        java.util.Set set23 = defaultedMap20.keySet();
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b29 = defaultedMap27.equals((java.lang.Object) 0.0f);
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1.0f));
        java.util.Set set35 = defaultedMap32.keySet();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap20.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        java.util.Set set44 = defaultedMap41.keySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap41.containsKey(obj45);
        java.util.Collection collection47 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap49.get(obj52);
        boolean b54 = defaultedMap41.containsKey(obj53);
        defaultedMap32.putAll((java.util.Map) defaultedMap41);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj58 = defaultedMap32.get((java.lang.Object) (short) 0);
        defaultedMap32.clear();
        defaultedMap32.clear();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) 0 + "'", obj30.equals((short) 0));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) 0 + "'", obj39.equals((short) 0));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (short) 0 + "'", obj53.equals((short) 0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + (short) 0 + "'", obj58.equals((short) 0));
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap9.get(obj12);
        boolean b14 = defaultedMap1.containsKey(obj13);
        java.util.Set set15 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set18 = defaultedMap17.keySet();
        java.util.Collection collection19 = defaultedMap17.values();
        int i20 = defaultedMap17.size();
        java.util.Collection collection21 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) collection21);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 0 + "'", obj13.equals((short) 0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) 0 + "'", obj22.equals((short) 0));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap24.containsKey(obj28);
        java.util.Collection collection30 = defaultedMap24.values();
        java.lang.Object obj31 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj36 = defaultedMap33.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap33.get((java.lang.Object) defaultedMap38);
        boolean b45 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1.0f));
        java.util.Set set50 = defaultedMap47.keySet();
        java.lang.Object obj51 = null;
        boolean b52 = defaultedMap47.containsKey(obj51);
        java.util.Collection collection53 = defaultedMap47.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap55.get(obj58);
        boolean b60 = defaultedMap47.containsKey(obj59);
        defaultedMap38.putAll((java.util.Map) defaultedMap47);
        defaultedMap24.putAll((java.util.Map) defaultedMap47);
        int i63 = defaultedMap24.size();
        java.util.Set set64 = defaultedMap24.entrySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b68 = defaultedMap66.equals((java.lang.Object) (-1.0f));
        java.util.Set set69 = defaultedMap66.keySet();
        java.lang.Object obj70 = null;
        boolean b71 = defaultedMap66.containsKey(obj70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b75 = defaultedMap73.equals((java.lang.Object) (-1.0f));
        java.util.Set set76 = defaultedMap73.keySet();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj80 = defaultedMap73.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap79);
        java.util.Set set81 = defaultedMap73.entrySet();
        boolean b82 = defaultedMap73.isEmpty();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) defaultedMap73);
        boolean b84 = defaultedMap24.containsKey((java.lang.Object) defaultedMap66);
        collections.Factory factory85 = null;
        try {
            java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, factory85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) 0 + "'", obj36.equals((short) 0));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + (short) 0 + "'", obj59.equals((short) 0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b84 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap6.containsKey(obj10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        boolean b13 = defaultedMap6.isEmpty();
        int i14 = defaultedMap6.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short) 0 + "'", obj4.equals((short) 0));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsKey(obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set12 = defaultedMap11.keySet();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.equals(obj13);
        java.lang.Object obj16 = defaultedMap11.get((java.lang.Object) 'a');
        java.lang.Object obj18 = defaultedMap11.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        java.util.Set set23 = defaultedMap20.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b30 = defaultedMap28.equals((java.lang.Object) (-1.0f));
        java.util.Set set31 = defaultedMap28.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate24, predicate33);
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) predicate33);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap1.get(obj42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b48 = defaultedMap46.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (-1.0f));
        java.util.Set set53 = defaultedMap50.keySet();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) set53);
        java.util.Collection collection55 = defaultedMap46.values();
        boolean b57 = defaultedMap46.containsKey((java.lang.Object) (short) 10);
        boolean b58 = defaultedMap1.equals((java.lang.Object) b57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short) 0 + "'", obj16.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (short) 0 + "'", obj18.equals((short) 0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + (short) 0 + "'", obj44.equals((short) 0));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set18 = defaultedMap17.keySet();
        java.lang.Object obj20 = defaultedMap17.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1.0f));
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap22.containsKey(obj26);
        java.lang.Object obj28 = defaultedMap17.get((java.lang.Object) defaultedMap22);
        boolean b29 = defaultedMap1.containsKey(obj28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + (short) 0 + "'", obj28.equals((short) 0));
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set9 = defaultedMap8.keySet();
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap13.keySet();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap13.containsKey(obj17);
        java.lang.Object obj19 = defaultedMap8.get((java.lang.Object) defaultedMap13);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b24 = defaultedMap22.equals((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b28 = defaultedMap26.equals((java.lang.Object) (-1.0f));
        java.util.Set set29 = defaultedMap26.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap32);
        java.util.Set set34 = defaultedMap26.entrySet();
        boolean b35 = defaultedMap22.equals((java.lang.Object) defaultedMap26);
        java.lang.Object obj36 = defaultedMap1.remove((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 0 + "'", obj6.equals((short) 0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) 0 + "'", obj11.equals((short) 0));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) 0 + "'", obj20.equals((short) 0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 0 + "'", obj5.equals((short) 0));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set17 = defaultedMap16.keySet();
        java.lang.Object obj19 = defaultedMap16.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        java.util.Set set24 = defaultedMap21.keySet();
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap21.containsKey(obj25);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) defaultedMap21);
        boolean b28 = defaultedMap21.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1.0f));
        java.util.Set set33 = defaultedMap30.keySet();
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap30.containsKey(obj34);
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap21, (java.lang.Object) b35);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap1.containsKey(obj37);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) 0 + "'", obj19.equals((short) 0));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set8 = defaultedMap7.keySet();
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap7.equals(obj9);
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj14 = defaultedMap7.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Set set19 = defaultedMap16.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        java.util.Set set27 = defaultedMap24.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate20, predicate29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set34 = defaultedMap33.keySet();
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap33.equals(obj35);
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) 'a');
        java.lang.Object obj40 = defaultedMap33.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        java.util.Set set45 = defaultedMap42.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b52 = defaultedMap50.equals((java.lang.Object) (-1.0f));
        java.util.Set set53 = defaultedMap50.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate46, predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set60 = defaultedMap59.keySet();
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap59.equals(obj61);
        java.lang.Object obj64 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.Object obj66 = defaultedMap59.get((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b70 = defaultedMap68.equals((java.lang.Object) (-1.0f));
        java.util.Set set71 = defaultedMap68.keySet();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b78 = defaultedMap76.equals((java.lang.Object) (-1.0f));
        java.util.Set set79 = defaultedMap76.keySet();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate80, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate72, predicate81);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate55, predicate81);
        java.lang.Object obj85 = defaultedMap1.get((java.lang.Object) predicate81);
        java.util.Set set86 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short) 0 + "'", obj12.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) 0 + "'", obj14.equals((short) 0));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) 0 + "'", obj38.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (short) 0 + "'", obj40.equals((short) 0));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) 0 + "'", obj64.equals((short) 0));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + (short) 0 + "'", obj66.equals((short) 0));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + (short) 0 + "'", obj85.equals((short) 0));
        org.junit.Assert.assertNotNull(set86);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set10 = defaultedMap9.keySet();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap9.equals(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1.0f));
        java.util.Set set17 = defaultedMap14.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.lang.Object obj21 = defaultedMap14.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap20);
        boolean b22 = defaultedMap9.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        java.util.Set set25 = defaultedMap24.keySet();
        java.lang.Object obj27 = defaultedMap24.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b31 = defaultedMap29.equals((java.lang.Object) (-1.0f));
        java.util.Set set32 = defaultedMap29.keySet();
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap29.containsKey(obj33);
        java.lang.Object obj35 = defaultedMap24.get((java.lang.Object) defaultedMap29);
        boolean b36 = defaultedMap29.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1.0f));
        java.util.Set set41 = defaultedMap38.keySet();
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap38.containsKey(obj42);
        java.lang.Object obj44 = defaultedMap9.put((java.lang.Object) defaultedMap29, (java.lang.Object) b43);
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap9.containsKey(obj45);
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) b46);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (short) 0 + "'", obj27.equals((short) 0));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (short) 0 + "'", obj35.equals((short) 0));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) 0 + "'", obj47.equals((short) 0));
    }
}

