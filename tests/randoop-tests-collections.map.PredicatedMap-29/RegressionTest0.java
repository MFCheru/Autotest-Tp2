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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate12);
        defaultedMap1.putAll(map13);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate(map13, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.String str10 = defaultedMap1.toString();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) predicate14);
        java.util.Collection collection18 = defaultedMap1.values();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) predicate14);
        java.util.Collection collection18 = defaultedMap1.values();
        java.util.Set set19 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set14 = defaultedMap13.keySet();
        int i15 = defaultedMap13.size();
        java.util.Set set16 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap18.keySet();
        int i20 = defaultedMap18.size();
        java.lang.String str21 = defaultedMap18.toString();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        boolean b23 = defaultedMap18.containsValue((java.lang.Object) predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str26 = defaultedMap25.toString();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 10L);
        java.lang.Object obj29 = defaultedMap13.put((java.lang.Object) b23, (java.lang.Object) 10L);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) "{}", (java.lang.Object) predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        int i9 = defaultedMap7.size();
        java.util.Set set10 = defaultedMap7.keySet();
        java.util.Collection collection11 = defaultedMap7.values();
        boolean b13 = defaultedMap7.equals((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap7.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap7.put((java.lang.Object) "{}", (java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Set set30 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) map36);
        java.lang.Object obj38 = defaultedMap25.put((java.lang.Object) 1L, obj37);
        java.lang.Object obj40 = defaultedMap25.remove((java.lang.Object) 10.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set45 = defaultedMap44.keySet();
        int i46 = defaultedMap44.size();
        java.lang.String str47 = defaultedMap44.toString();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        boolean b49 = defaultedMap44.containsValue((java.lang.Object) predicate48);
        java.lang.Object obj50 = defaultedMap25.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap44);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set53 = defaultedMap52.keySet();
        java.util.Set set54 = defaultedMap52.keySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap52);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str60 = defaultedMap59.toString();
        boolean b61 = defaultedMap55.equals((java.lang.Object) defaultedMap59);
        java.lang.Object obj62 = defaultedMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap59);
        java.lang.String str63 = defaultedMap59.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100L + "'", obj15.equals(100L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100L + "'", obj37.equals(100L));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        defaultedMap5.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) set10);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        int i12 = defaultedMap10.size();
        java.util.Set set13 = defaultedMap10.keySet();
        java.util.Collection collection14 = defaultedMap10.values();
        boolean b16 = defaultedMap10.equals((java.lang.Object) (short) 1);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap10.get(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        int i22 = defaultedMap20.size();
        java.lang.Object obj23 = defaultedMap1.put(obj18, (java.lang.Object) defaultedMap20);
        java.util.Set set24 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        int i9 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.util.Set set13 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        int i17 = defaultedMap15.size();
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Collection collection19 = defaultedMap15.values();
        boolean b21 = defaultedMap15.equals((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap15.put((java.lang.Object) "{}", (java.lang.Object) predicate28);
        java.util.Collection collection32 = defaultedMap15.values();
        java.util.Set set33 = defaultedMap15.keySet();
        boolean b34 = defaultedMap5.containsKey((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100L + "'", obj23.equals(100L));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) predicate14);
        java.util.Collection collection18 = defaultedMap1.values();
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) predicate14);
        java.util.Collection collection18 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) collection18);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.util.Collection collection9 = defaultedMap5.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap5);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set5 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str13 = defaultedMap12.toString();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate23, predicate28);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate23);
        int i33 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set37 = defaultedMap36.keySet();
        int i38 = defaultedMap36.size();
        java.util.Set set39 = defaultedMap36.keySet();
        java.util.Collection collection40 = defaultedMap36.values();
        boolean b42 = defaultedMap36.equals((java.lang.Object) (short) 1);
        java.lang.Object obj44 = defaultedMap36.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set47 = defaultedMap46.keySet();
        int i48 = defaultedMap46.size();
        java.util.Set set49 = defaultedMap46.keySet();
        java.util.Collection collection50 = defaultedMap46.values();
        boolean b52 = defaultedMap46.equals((java.lang.Object) (short) 1);
        java.lang.Object obj54 = defaultedMap46.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set58 = defaultedMap57.keySet();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate59, predicate60);
        java.lang.Object obj62 = defaultedMap46.put((java.lang.Object) "{}", (java.lang.Object) predicate59);
        java.util.Collection collection63 = defaultedMap46.values();
        boolean b64 = defaultedMap36.containsKey((java.lang.Object) defaultedMap46);
        java.lang.Object obj65 = defaultedMap4.put((java.lang.Object) 1.0f, (java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100L + "'", obj44.equals(100L));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100L + "'", obj54.equals(100L));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        boolean b6 = defaultedMap1.isEmpty();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        int i11 = defaultedMap9.size();
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Collection collection13 = defaultedMap9.values();
        boolean b15 = defaultedMap9.equals((java.lang.Object) (short) 1);
        boolean b17 = defaultedMap9.equals((java.lang.Object) 100);
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        java.util.Set set22 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        defaultedMap9.putAll((java.util.Map) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        java.util.Set set27 = defaultedMap23.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        int i6 = defaultedMap4.size();
        java.util.Set set7 = defaultedMap4.keySet();
        java.util.Collection collection8 = defaultedMap4.values();
        boolean b10 = defaultedMap4.equals((java.lang.Object) (short) 1);
        boolean b12 = defaultedMap4.equals((java.lang.Object) 100);
        boolean b13 = defaultedMap1.containsValue((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        java.util.Set set17 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap19.keySet();
        java.util.Set set21 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        java.util.Collection collection23 = defaultedMap19.values();
        defaultedMap15.putAll((java.util.Map) defaultedMap19);
        defaultedMap4.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) predicate10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100L + "'", obj11.equals(100L));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        int i11 = defaultedMap9.size();
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap14.keySet();
        int i16 = defaultedMap14.size();
        java.util.Set set17 = defaultedMap14.keySet();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) (short) 1);
        java.lang.Object obj22 = defaultedMap14.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap14.put((java.lang.Object) "{}", (java.lang.Object) predicate27);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate27, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set35 = defaultedMap34.keySet();
        int i36 = defaultedMap34.size();
        java.util.Set set37 = defaultedMap34.keySet();
        boolean b38 = defaultedMap9.containsValue((java.lang.Object) defaultedMap34);
        defaultedMap7.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str42 = defaultedMap41.toString();
        boolean b44 = defaultedMap41.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj47 = defaultedMap41.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set50 = defaultedMap49.keySet();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set56 = defaultedMap55.keySet();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate52, predicate57);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set5 = defaultedMap4.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        java.util.Set set8 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap6.get((java.lang.Object) map14);
        java.lang.Object obj16 = defaultedMap3.put((java.lang.Object) 1L, obj15);
        java.lang.Object obj18 = defaultedMap3.remove((java.lang.Object) 10.0f);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) map21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        java.util.Set set26 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap24);
        java.util.Collection collection28 = defaultedMap24.values();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) defaultedMap24);
        boolean b30 = defaultedMap1.containsKey((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100L + "'", obj15.equals(100L));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Collection collection15 = defaultedMap11.values();
        boolean b17 = defaultedMap11.equals((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap11.put((java.lang.Object) "{}", (java.lang.Object) predicate24);
        java.util.Collection collection28 = defaultedMap11.values();
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str32 = defaultedMap31.toString();
        boolean b34 = defaultedMap31.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set40 = defaultedMap39.keySet();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate42, predicate47);
        java.util.Set set51 = defaultedMap31.entrySet();
        java.lang.Object obj52 = defaultedMap1.remove((java.lang.Object) set51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100L + "'", obj19.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100L + "'", obj37.equals(100L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        defaultedMap3.putAll(map15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) 10L);
        boolean b23 = defaultedMap18.equals((java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap18.entrySet();
        boolean b26 = defaultedMap18.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        int i30 = defaultedMap28.size();
        java.lang.String str31 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        int i35 = defaultedMap33.size();
        java.util.Set set36 = defaultedMap33.keySet();
        java.util.Collection collection37 = defaultedMap33.values();
        boolean b39 = defaultedMap33.equals((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set45 = defaultedMap44.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) "{}", (java.lang.Object) predicate46);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate46, predicate50);
        boolean b52 = defaultedMap18.containsValue((java.lang.Object) map51);
        boolean b53 = defaultedMap3.equals((java.lang.Object) b52);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        int i55 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100L + "'", obj41.equals(100L));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) map30);
        java.lang.Object obj32 = defaultedMap19.put((java.lang.Object) 1L, obj31);
        java.lang.Object obj34 = defaultedMap19.remove((java.lang.Object) 10.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        int i40 = defaultedMap38.size();
        java.lang.String str41 = defaultedMap38.toString();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        boolean b43 = defaultedMap38.containsValue((java.lang.Object) predicate42);
        java.lang.Object obj44 = defaultedMap19.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap38);
        collections.Factory factory45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, factory45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) "{}", (java.lang.Object) predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.String str26 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        java.util.Set set30 = defaultedMap28.keySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        java.util.Collection collection35 = defaultedMap31.values();
        java.util.Set set36 = defaultedMap31.keySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map5 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate3, predicate4);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str9 = defaultedMap8.toString();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        defaultedMap8.putAll(map20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str24 = defaultedMap23.toString();
        boolean b26 = defaultedMap23.containsValue((java.lang.Object) 10L);
        boolean b28 = defaultedMap23.equals((java.lang.Object) "hi!");
        java.util.Set set29 = defaultedMap23.entrySet();
        boolean b31 = defaultedMap23.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        int i35 = defaultedMap33.size();
        java.lang.String str36 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        int i40 = defaultedMap38.size();
        java.util.Set set41 = defaultedMap38.keySet();
        java.util.Collection collection42 = defaultedMap38.values();
        boolean b44 = defaultedMap38.equals((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set50 = defaultedMap49.keySet();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap38.put((java.lang.Object) "{}", (java.lang.Object) predicate51);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate51, predicate55);
        boolean b57 = defaultedMap23.containsValue((java.lang.Object) map56);
        boolean b58 = defaultedMap8.equals((java.lang.Object) b57);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Map map60 = null;
        try {
            defaultedMap8.putAll(map60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        int i11 = defaultedMap9.size();
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Collection collection13 = defaultedMap9.values();
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str17 = defaultedMap16.toString();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 10L);
        boolean b20 = defaultedMap9.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        int i22 = defaultedMap9.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100L + "'", obj21.equals(100L));
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Set set11 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set14 = defaultedMap13.keySet();
        java.util.Set set15 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        java.util.Set set19 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        java.util.Collection collection21 = defaultedMap17.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap17);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set26 = defaultedMap25.keySet();
        int i27 = defaultedMap25.size();
        java.util.Set set28 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        int i32 = defaultedMap30.size();
        java.lang.String str33 = defaultedMap30.toString();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        boolean b35 = defaultedMap30.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str38 = defaultedMap37.toString();
        boolean b40 = defaultedMap37.containsValue((java.lang.Object) 10L);
        java.lang.Object obj41 = defaultedMap25.put((java.lang.Object) b35, (java.lang.Object) 10L);
        java.lang.Object obj42 = defaultedMap13.get(obj41);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100L + "'", obj42.equals(100L));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set11 = defaultedMap10.keySet();
        int i12 = defaultedMap10.size();
        java.util.Set set13 = defaultedMap10.keySet();
        java.util.Collection collection14 = defaultedMap10.values();
        boolean b16 = defaultedMap10.equals((java.lang.Object) (short) 1);
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = defaultedMap10.get(obj17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        int i22 = defaultedMap20.size();
        java.lang.Object obj23 = defaultedMap1.put(obj18, (java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, obj24);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Collection collection15 = defaultedMap11.values();
        boolean b17 = defaultedMap11.equals((java.lang.Object) (short) 1);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        int i22 = defaultedMap20.size();
        java.util.Set set23 = defaultedMap20.keySet();
        java.util.Collection collection24 = defaultedMap20.values();
        java.util.Collection collection25 = defaultedMap20.values();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) collection25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        java.util.Set set33 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set36 = defaultedMap35.keySet();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate38);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) map39);
        java.lang.Object obj41 = defaultedMap28.put((java.lang.Object) 1L, obj40);
        java.lang.Object obj43 = defaultedMap28.remove((java.lang.Object) 10.0f);
        java.util.Collection collection44 = defaultedMap28.values();
        boolean b45 = defaultedMap1.containsKey((java.lang.Object) collection44);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100L + "'", obj40.equals(100L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        int i9 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj14 = defaultedMap7.get((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate18);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map19, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 100L);
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap19.keySet();
        int i21 = defaultedMap19.size();
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Collection collection23 = defaultedMap19.values();
        boolean b25 = defaultedMap19.equals((java.lang.Object) (short) 1);
        boolean b27 = defaultedMap19.equals((java.lang.Object) 100);
        boolean b28 = defaultedMap16.containsValue((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        java.util.Set set32 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        defaultedMap19.putAll((java.util.Map) defaultedMap33);
        defaultedMap11.putAll((java.util.Map) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap33);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        int i5 = defaultedMap1.size();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap6.entrySet();
        java.lang.Object obj14 = defaultedMap4.get((java.lang.Object) set13);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) "{}", (java.lang.Object) predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        java.util.Set set29 = defaultedMap27.keySet();
        defaultedMap27.clear();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) defaultedMap27, obj31);
        int i33 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(i33 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap3.keySet();
        int i5 = defaultedMap3.size();
        java.util.Set set6 = defaultedMap3.keySet();
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Collection collection15 = defaultedMap11.values();
        boolean b17 = defaultedMap11.equals((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 0);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap11.containsKey(obj20);
        java.util.Set set22 = defaultedMap11.entrySet();
        boolean b23 = defaultedMap3.containsValue((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str26 = defaultedMap25.toString();
        boolean b28 = defaultedMap25.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj31 = defaultedMap25.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set40 = defaultedMap39.keySet();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate36, predicate41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set47 = defaultedMap46.keySet();
        int i48 = defaultedMap46.size();
        java.lang.String str49 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set52 = defaultedMap51.keySet();
        int i53 = defaultedMap51.size();
        java.util.Set set54 = defaultedMap51.keySet();
        java.util.Collection collection55 = defaultedMap51.values();
        boolean b57 = defaultedMap51.equals((java.lang.Object) (short) 1);
        java.lang.Object obj59 = defaultedMap51.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set63 = defaultedMap62.keySet();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate64, predicate65);
        java.lang.Object obj67 = defaultedMap51.put((java.lang.Object) "{}", (java.lang.Object) predicate64);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate64, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate36, predicate64);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) predicate64);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100L + "'", obj19.equals(100L));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100L + "'", obj59.equals(100L));
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str9 = defaultedMap8.toString();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 10L);
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap14.keySet();
        int i16 = defaultedMap14.size();
        java.util.Set set17 = defaultedMap14.keySet();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        java.lang.String str14 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        int i18 = defaultedMap16.size();
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Collection collection20 = defaultedMap16.values();
        boolean b22 = defaultedMap16.equals((java.lang.Object) (short) 1);
        java.lang.Object obj24 = defaultedMap16.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap16.put((java.lang.Object) "{}", (java.lang.Object) predicate29);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate29, predicate33);
        boolean b35 = defaultedMap1.equals((java.lang.Object) predicate29);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) predicate5);
        java.lang.Object obj7 = null;
        boolean b8 = defaultedMap1.containsKey(obj7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap3.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        boolean b14 = defaultedMap6.equals((java.lang.Object) 100);
        boolean b15 = defaultedMap3.containsValue((java.lang.Object) defaultedMap6);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        boolean b10 = defaultedMap9.isEmpty();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) b10);
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str5 = defaultedMap4.toString();
        boolean b7 = defaultedMap4.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap4.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        defaultedMap4.putAll(map16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) map30);
        java.lang.Object obj32 = defaultedMap19.put((java.lang.Object) 1L, obj31);
        java.lang.Object obj34 = defaultedMap19.remove((java.lang.Object) 10.0f);
        java.util.Collection collection35 = defaultedMap19.values();
        java.lang.Object obj36 = defaultedMap4.get((java.lang.Object) collection35);
        boolean b37 = defaultedMap1.containsKey((java.lang.Object) collection35);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100L + "'", obj36.equals(100L));
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        int i11 = defaultedMap9.size();
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Collection collection13 = defaultedMap9.values();
        defaultedMap9.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str17 = defaultedMap16.toString();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 10L);
        boolean b20 = defaultedMap9.equals((java.lang.Object) defaultedMap16);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        int i22 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100L + "'", obj21.equals(100L));
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap5.keySet();
        int i7 = defaultedMap5.size();
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Collection collection9 = defaultedMap5.values();
        boolean b11 = defaultedMap5.equals((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap5.put((java.lang.Object) "{}", (java.lang.Object) predicate18);
        java.util.Collection collection22 = defaultedMap5.values();
        defaultedMap5.clear();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.util.Set set25 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        defaultedMap3.putAll(map15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) 10L);
        boolean b23 = defaultedMap18.equals((java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap18.entrySet();
        boolean b26 = defaultedMap18.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        int i30 = defaultedMap28.size();
        java.lang.String str31 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        int i35 = defaultedMap33.size();
        java.util.Set set36 = defaultedMap33.keySet();
        java.util.Collection collection37 = defaultedMap33.values();
        boolean b39 = defaultedMap33.equals((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set45 = defaultedMap44.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) "{}", (java.lang.Object) predicate46);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate46, predicate50);
        boolean b52 = defaultedMap18.containsValue((java.lang.Object) map51);
        boolean b53 = defaultedMap3.equals((java.lang.Object) b52);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set57 = defaultedMap56.keySet();
        int i58 = defaultedMap56.size();
        java.util.Set set59 = defaultedMap56.keySet();
        java.util.Collection collection60 = defaultedMap56.values();
        java.util.Collection collection61 = defaultedMap56.values();
        java.util.Collection collection62 = defaultedMap56.values();
        java.util.Set set63 = defaultedMap56.entrySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set66 = defaultedMap65.keySet();
        int i67 = defaultedMap65.size();
        java.util.Set set68 = defaultedMap65.keySet();
        java.util.Collection collection69 = defaultedMap65.values();
        boolean b71 = defaultedMap65.equals((java.lang.Object) (short) 1);
        boolean b73 = defaultedMap65.equals((java.lang.Object) 100);
        java.lang.Object obj74 = defaultedMap1.put((java.lang.Object) defaultedMap56, (java.lang.Object) 100);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, obj75);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100L + "'", obj41.equals(100L));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        int i11 = defaultedMap9.size();
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Collection collection13 = defaultedMap9.values();
        boolean b15 = defaultedMap9.equals((java.lang.Object) (short) 1);
        java.lang.Object obj17 = defaultedMap9.get((java.lang.Object) 0);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap9.containsKey(obj18);
        java.util.Set set20 = defaultedMap9.entrySet();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set24 = defaultedMap23.keySet();
        int i25 = defaultedMap23.size();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Collection collection27 = defaultedMap23.values();
        java.util.Collection collection28 = defaultedMap23.values();
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) 100L);
        int i31 = defaultedMap23.size();
        java.util.Set set32 = defaultedMap23.entrySet();
        java.lang.Object obj33 = defaultedMap9.get((java.lang.Object) set32);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100L + "'", obj17.equals(100L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100L + "'", obj33.equals(100L));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate18);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) "{}", (java.lang.Object) predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        int i28 = defaultedMap26.size();
        java.util.Set set29 = defaultedMap26.keySet();
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        int i34 = defaultedMap32.size();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        int i42 = defaultedMap40.size();
        java.util.Set set43 = defaultedMap40.keySet();
        java.util.Collection collection44 = defaultedMap40.values();
        boolean b46 = defaultedMap40.equals((java.lang.Object) (short) 1);
        boolean b48 = defaultedMap40.equals((java.lang.Object) 100);
        boolean b49 = defaultedMap37.containsValue((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set52 = defaultedMap51.keySet();
        java.util.Set set53 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap54);
        defaultedMap40.putAll((java.util.Map) defaultedMap54);
        defaultedMap32.putAll((java.util.Map) defaultedMap54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set60 = defaultedMap59.keySet();
        int i61 = defaultedMap59.size();
        java.util.Set set62 = defaultedMap59.keySet();
        java.util.Collection collection63 = defaultedMap59.values();
        java.util.Collection collection64 = defaultedMap59.values();
        boolean b66 = defaultedMap59.containsKey((java.lang.Object) 100L);
        java.lang.Object obj67 = defaultedMap26.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set70 = defaultedMap69.keySet();
        java.util.Set set71 = defaultedMap69.keySet();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap69);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set77 = defaultedMap76.keySet();
        int i78 = defaultedMap76.size();
        java.lang.String str79 = defaultedMap76.toString();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set82 = defaultedMap81.keySet();
        int i83 = defaultedMap81.size();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap81);
        java.util.Set set85 = defaultedMap81.keySet();
        boolean b86 = defaultedMap76.containsValue((java.lang.Object) set85);
        defaultedMap72.putAll((java.util.Map) defaultedMap76);
        boolean b88 = defaultedMap26.containsValue((java.lang.Object) defaultedMap76);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue(i83 == 0);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b88 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate18);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        int i11 = defaultedMap9.size();
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Collection collection13 = defaultedMap9.values();
        boolean b15 = defaultedMap9.equals((java.lang.Object) (short) 1);
        boolean b17 = defaultedMap9.equals((java.lang.Object) 100);
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        java.util.Set set22 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        defaultedMap9.putAll((java.util.Map) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        java.util.Collection collection26 = defaultedMap22.values();
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) defaultedMap22);
        int i28 = defaultedMap22.size();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) map30);
        java.lang.Object obj32 = defaultedMap19.put((java.lang.Object) 1L, obj31);
        java.lang.Object obj34 = defaultedMap19.remove((java.lang.Object) 10.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        int i40 = defaultedMap38.size();
        java.lang.String str41 = defaultedMap38.toString();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        boolean b43 = defaultedMap38.containsValue((java.lang.Object) predicate42);
        java.lang.Object obj44 = defaultedMap19.put((java.lang.Object) (-1.0d), (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set47 = defaultedMap46.keySet();
        int i48 = defaultedMap46.size();
        java.lang.String str49 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set52 = defaultedMap51.keySet();
        java.util.Set set53 = defaultedMap51.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set60 = defaultedMap59.keySet();
        int i61 = defaultedMap59.size();
        java.lang.String str62 = defaultedMap59.toString();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set65 = defaultedMap64.keySet();
        int i66 = defaultedMap64.size();
        java.util.Set set67 = defaultedMap64.keySet();
        java.util.Collection collection68 = defaultedMap64.values();
        boolean b70 = defaultedMap64.equals((java.lang.Object) (short) 1);
        java.lang.Object obj72 = defaultedMap64.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set76 = defaultedMap75.keySet();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate77, predicate78);
        java.lang.Object obj80 = defaultedMap64.put((java.lang.Object) "{}", (java.lang.Object) predicate77);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate77, predicate81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set85 = defaultedMap84.keySet();
        int i86 = defaultedMap84.size();
        java.util.Set set87 = defaultedMap84.keySet();
        boolean b88 = defaultedMap59.containsValue((java.lang.Object) defaultedMap84);
        defaultedMap57.putAll((java.util.Map) defaultedMap84);
        defaultedMap46.putAll((java.util.Map) defaultedMap57);
        defaultedMap57.clear();
        defaultedMap19.putAll((java.util.Map) defaultedMap57);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100L + "'", obj72.equals(100L));
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap5.keySet();
        int i7 = defaultedMap5.size();
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Collection collection9 = defaultedMap5.values();
        boolean b11 = defaultedMap5.equals((java.lang.Object) (short) 1);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate18, predicate19);
        java.lang.Object obj21 = defaultedMap5.put((java.lang.Object) "{}", (java.lang.Object) predicate18);
        java.util.Collection collection22 = defaultedMap5.values();
        defaultedMap5.clear();
        java.lang.Object obj24 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b27 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set30 = defaultedMap29.keySet();
        int i31 = defaultedMap29.size();
        java.util.Set set32 = defaultedMap29.keySet();
        java.util.Collection collection33 = defaultedMap29.values();
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str37 = defaultedMap36.toString();
        boolean b39 = defaultedMap36.containsValue((java.lang.Object) 10L);
        boolean b40 = defaultedMap29.equals((java.lang.Object) defaultedMap36);
        int i41 = defaultedMap29.size();
        java.lang.Object obj42 = defaultedMap1.remove((java.lang.Object) defaultedMap29);
        java.util.Collection collection43 = defaultedMap29.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Collection collection6 = defaultedMap1.values();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 100L);
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        int i14 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        java.util.Set set16 = defaultedMap12.keySet();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100L + "'", obj17.equals(100L));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Map map5 = null;
        try {
            defaultedMap1.putAll(map5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.util.Set set10 = defaultedMap6.keySet();
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        java.util.Set set18 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) map24);
        java.lang.Object obj26 = defaultedMap13.put((java.lang.Object) 1L, obj25);
        java.lang.Object obj28 = defaultedMap13.remove((java.lang.Object) 10.0f);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate29, predicate30);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection5 = defaultedMap1.values();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        java.util.Set set10 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        int i18 = defaultedMap16.size();
        java.lang.String str19 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap21.keySet();
        int i23 = defaultedMap21.size();
        java.util.Set set24 = defaultedMap21.keySet();
        java.util.Collection collection25 = defaultedMap21.values();
        boolean b27 = defaultedMap21.equals((java.lang.Object) (short) 1);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate34, predicate35);
        java.lang.Object obj37 = defaultedMap21.put((java.lang.Object) "{}", (java.lang.Object) predicate34);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate34, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap41.keySet();
        int i43 = defaultedMap41.size();
        java.util.Set set44 = defaultedMap41.keySet();
        boolean b45 = defaultedMap16.containsValue((java.lang.Object) defaultedMap41);
        defaultedMap14.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) defaultedMap14);
        collections.Transformer transformer48 = null;
        try {
            java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100L + "'", obj29.equals(100L));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set10 = defaultedMap9.keySet();
        int i11 = defaultedMap9.size();
        java.util.Set set12 = defaultedMap9.keySet();
        java.util.Collection collection13 = defaultedMap9.values();
        boolean b15 = defaultedMap9.equals((java.lang.Object) (short) 1);
        boolean b17 = defaultedMap9.equals((java.lang.Object) 100);
        boolean b18 = defaultedMap6.containsValue((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        java.util.Set set22 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap23);
        defaultedMap9.putAll((java.util.Map) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str29 = defaultedMap28.toString();
        boolean b31 = defaultedMap28.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set37 = defaultedMap36.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate39, predicate44);
        boolean b48 = defaultedMap23.containsValue((java.lang.Object) predicate44);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100L + "'", obj34.equals(100L));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        int i6 = defaultedMap4.size();
        java.util.Set set7 = defaultedMap4.keySet();
        java.util.Collection collection8 = defaultedMap4.values();
        boolean b10 = defaultedMap4.equals((java.lang.Object) (short) 1);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap4.get(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap14.keySet();
        int i16 = defaultedMap14.size();
        java.util.Set set17 = defaultedMap14.keySet();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) (short) 1);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap14.get(obj21);
        java.util.Set set23 = defaultedMap14.entrySet();
        java.lang.Object obj24 = defaultedMap4.get((java.lang.Object) set23);
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "hi!" + "'", obj25.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b6 = defaultedMap3.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate13, predicate14);
        defaultedMap3.putAll(map15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str19 = defaultedMap18.toString();
        boolean b21 = defaultedMap18.containsValue((java.lang.Object) 10L);
        boolean b23 = defaultedMap18.equals((java.lang.Object) "hi!");
        java.util.Set set24 = defaultedMap18.entrySet();
        boolean b26 = defaultedMap18.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        int i30 = defaultedMap28.size();
        java.lang.String str31 = defaultedMap28.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        int i35 = defaultedMap33.size();
        java.util.Set set36 = defaultedMap33.keySet();
        java.util.Collection collection37 = defaultedMap33.values();
        boolean b39 = defaultedMap33.equals((java.lang.Object) (short) 1);
        java.lang.Object obj41 = defaultedMap33.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set45 = defaultedMap44.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate46, predicate47);
        java.lang.Object obj49 = defaultedMap33.put((java.lang.Object) "{}", (java.lang.Object) predicate46);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate46, predicate50);
        boolean b52 = defaultedMap18.containsValue((java.lang.Object) map51);
        boolean b53 = defaultedMap3.equals((java.lang.Object) b52);
        java.lang.Object obj54 = defaultedMap1.get((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set57 = defaultedMap56.keySet();
        int i58 = defaultedMap56.size();
        java.util.Set set59 = defaultedMap56.keySet();
        java.util.Collection collection60 = defaultedMap56.values();
        java.util.Collection collection61 = defaultedMap56.values();
        java.util.Collection collection62 = defaultedMap56.values();
        java.util.Set set63 = defaultedMap56.entrySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set66 = defaultedMap65.keySet();
        int i67 = defaultedMap65.size();
        java.util.Set set68 = defaultedMap65.keySet();
        java.util.Collection collection69 = defaultedMap65.values();
        boolean b71 = defaultedMap65.equals((java.lang.Object) (short) 1);
        boolean b73 = defaultedMap65.equals((java.lang.Object) 100);
        java.lang.Object obj74 = defaultedMap1.put((java.lang.Object) defaultedMap56, (java.lang.Object) 100);
        int i75 = defaultedMap1.size();
        java.util.Set set76 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100L + "'", obj41.equals(100L));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(i75 == 1);
        org.junit.Assert.assertNotNull(set76);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.lang.String str9 = defaultedMap6.toString();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        boolean b11 = defaultedMap6.containsValue((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str14 = defaultedMap13.toString();
        boolean b16 = defaultedMap13.containsValue((java.lang.Object) 10L);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) b11, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap19.keySet();
        int i21 = defaultedMap19.size();
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Collection collection23 = defaultedMap19.values();
        java.util.Collection collection24 = defaultedMap19.values();
        boolean b26 = defaultedMap19.containsKey((java.lang.Object) 100L);
        int i27 = defaultedMap19.size();
        java.util.Set set28 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set37 = defaultedMap36.keySet();
        java.util.Set set38 = defaultedMap36.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap41.keySet();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str48 = defaultedMap47.toString();
        boolean b50 = defaultedMap47.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap47.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set56 = defaultedMap55.keySet();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set62 = defaultedMap61.keySet();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate63, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate58, predicate63);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate43, predicate58);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate33, predicate43);
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate33, predicate69);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100L + "'", obj53.equals(100L));
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        int i9 = defaultedMap7.size();
        java.util.Set set10 = defaultedMap7.keySet();
        java.util.Collection collection11 = defaultedMap7.values();
        boolean b13 = defaultedMap7.equals((java.lang.Object) (short) 1);
        java.lang.Object obj15 = defaultedMap7.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set19 = defaultedMap18.keySet();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap7.put((java.lang.Object) "{}", (java.lang.Object) predicate20);
        java.util.Collection collection24 = defaultedMap7.values();
        java.util.Set set25 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        int i29 = defaultedMap27.size();
        java.lang.String str30 = defaultedMap27.toString();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        boolean b32 = defaultedMap27.containsValue((java.lang.Object) predicate31);
        defaultedMap7.putAll((java.util.Map) defaultedMap27);
        boolean b34 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        boolean b35 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap37.keySet();
        int i39 = defaultedMap37.size();
        java.util.Set set40 = defaultedMap37.keySet();
        java.util.Collection collection41 = defaultedMap37.values();
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str45 = defaultedMap44.toString();
        boolean b47 = defaultedMap44.containsValue((java.lang.Object) 10L);
        boolean b48 = defaultedMap37.equals((java.lang.Object) defaultedMap44);
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100L + "'", obj15.equals(100L));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate14, predicate15);
        java.lang.Object obj17 = defaultedMap1.put((java.lang.Object) "{}", (java.lang.Object) predicate14);
        java.util.Collection collection18 = defaultedMap1.values();
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.entrySet();
        boolean b3 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.lang.String str17 = defaultedMap1.toString();
        java.util.Set set18 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{1=100}" + "'", str17.equals("{1=100}"));
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set4 = defaultedMap3.keySet();
        int i5 = defaultedMap3.size();
        java.util.Set set6 = defaultedMap3.keySet();
        java.util.Collection collection7 = defaultedMap3.values();
        boolean b9 = defaultedMap3.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Collection collection15 = defaultedMap11.values();
        boolean b17 = defaultedMap11.equals((java.lang.Object) (short) 1);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 0);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap11.containsKey(obj20);
        java.util.Set set22 = defaultedMap11.entrySet();
        boolean b23 = defaultedMap3.containsValue((java.lang.Object) defaultedMap11);
        java.lang.Object obj25 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100L + "'", obj19.equals(100L));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        int i10 = defaultedMap8.size();
        java.util.Set set11 = defaultedMap8.keySet();
        java.util.Collection collection12 = defaultedMap8.values();
        boolean b14 = defaultedMap8.equals((java.lang.Object) (short) 1);
        java.lang.Object obj16 = defaultedMap8.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap8.put((java.lang.Object) "{}", (java.lang.Object) predicate21);
        java.util.Collection collection25 = defaultedMap8.values();
        java.util.Set set26 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set29 = defaultedMap28.keySet();
        int i30 = defaultedMap28.size();
        java.lang.String str31 = defaultedMap28.toString();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        boolean b33 = defaultedMap28.containsValue((java.lang.Object) predicate32);
        defaultedMap8.putAll((java.util.Map) defaultedMap28);
        boolean b35 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100L + "'", obj16.equals(100L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set8 = defaultedMap7.keySet();
        int i9 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap7);
        java.util.Set set11 = defaultedMap7.keySet();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) defaultedMap7);
        java.util.Set set13 = defaultedMap5.keySet();
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set17 = defaultedMap16.keySet();
        int i18 = defaultedMap16.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.util.Set set20 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        int i24 = defaultedMap22.size();
        java.util.Set set25 = defaultedMap22.keySet();
        java.util.Collection collection26 = defaultedMap22.values();
        boolean b28 = defaultedMap22.equals((java.lang.Object) (short) 1);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate35, predicate36);
        java.lang.Object obj38 = defaultedMap22.put((java.lang.Object) "{}", (java.lang.Object) predicate35);
        java.util.Collection collection39 = defaultedMap22.values();
        java.util.Set set40 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        int i44 = defaultedMap42.size();
        java.lang.String str45 = defaultedMap42.toString();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        boolean b47 = defaultedMap42.containsValue((java.lang.Object) predicate46);
        defaultedMap22.putAll((java.util.Map) defaultedMap42);
        boolean b49 = defaultedMap16.equals((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str52 = defaultedMap51.toString();
        boolean b54 = defaultedMap51.containsValue((java.lang.Object) 10L);
        boolean b56 = defaultedMap51.equals((java.lang.Object) "hi!");
        java.util.Set set57 = defaultedMap51.entrySet();
        boolean b59 = defaultedMap51.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set62 = defaultedMap61.keySet();
        int i63 = defaultedMap61.size();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set66 = defaultedMap65.keySet();
        int i67 = defaultedMap65.size();
        java.util.Set set68 = defaultedMap65.keySet();
        java.util.Collection collection69 = defaultedMap65.values();
        boolean b71 = defaultedMap65.equals((java.lang.Object) (short) 1);
        java.lang.Object obj73 = defaultedMap65.get((java.lang.Object) 1);
        java.lang.Object obj74 = defaultedMap61.get((java.lang.Object) 1);
        java.lang.Object obj75 = defaultedMap51.get((java.lang.Object) defaultedMap61);
        java.lang.Object obj76 = defaultedMap5.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap61);
        int i77 = defaultedMap61.size();
        java.util.Set set78 = defaultedMap61.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100L + "'", obj30.equals(100L));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(i67 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100L + "'", obj73.equals(100L));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 100L + "'", obj74.equals(100L));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 100L + "'", obj75.equals(100L));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertNotNull(set78);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        boolean b9 = defaultedMap1.equals((java.lang.Object) 100);
        java.util.Collection collection10 = defaultedMap1.values();
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) map19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        java.util.Set set24 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        java.util.Collection collection26 = defaultedMap22.values();
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) defaultedMap22);
        java.util.Collection collection28 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        int i32 = defaultedMap30.size();
        java.util.Set set33 = defaultedMap30.keySet();
        java.util.Collection collection34 = defaultedMap30.values();
        boolean b36 = defaultedMap30.equals((java.lang.Object) (short) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        int i40 = defaultedMap38.size();
        java.util.Set set41 = defaultedMap38.keySet();
        java.util.Collection collection42 = defaultedMap38.values();
        boolean b44 = defaultedMap38.equals((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) 0);
        java.lang.Object obj47 = null;
        boolean b48 = defaultedMap38.containsKey(obj47);
        java.util.Set set49 = defaultedMap38.entrySet();
        boolean b50 = defaultedMap30.containsValue((java.lang.Object) defaultedMap38);
        boolean b51 = defaultedMap22.equals((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set3 = defaultedMap2.keySet();
        int i4 = defaultedMap2.size();
        java.util.Set set5 = defaultedMap2.keySet();
        java.util.Collection collection6 = defaultedMap2.values();
        boolean b8 = defaultedMap2.equals((java.lang.Object) (short) 1);
        java.lang.Object obj10 = defaultedMap2.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set14 = defaultedMap13.keySet();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate15, predicate16);
        java.lang.Object obj18 = defaultedMap2.put((java.lang.Object) "{}", (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        java.util.Set set22 = defaultedMap20.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set26 = defaultedMap25.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str32 = defaultedMap31.toString();
        boolean b34 = defaultedMap31.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap31.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set40 = defaultedMap39.keySet();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set46 = defaultedMap45.keySet();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate42, predicate47);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate42);
        try {
            java.util.Map map52 = collections.map.PredicatedMap.decorate(map0, predicate15, predicate27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100L + "'", obj37.equals(100L));
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        java.util.Collection collection8 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) 10L);
        boolean b16 = defaultedMap11.equals((java.lang.Object) "hi!");
        java.util.Set set17 = defaultedMap11.entrySet();
        boolean b19 = defaultedMap11.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set22 = defaultedMap21.keySet();
        int i23 = defaultedMap21.size();
        java.lang.String str24 = defaultedMap21.toString();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        int i28 = defaultedMap26.size();
        java.util.Set set29 = defaultedMap26.keySet();
        java.util.Collection collection30 = defaultedMap26.values();
        boolean b32 = defaultedMap26.equals((java.lang.Object) (short) 1);
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap37.keySet();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate40);
        java.lang.Object obj42 = defaultedMap26.put((java.lang.Object) "{}", (java.lang.Object) predicate39);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate39, predicate43);
        boolean b45 = defaultedMap11.containsValue((java.lang.Object) map44);
        java.lang.Object obj46 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100L + "'", obj34.equals(100L));
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        int i17 = defaultedMap15.size();
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Collection collection19 = defaultedMap15.values();
        boolean b21 = defaultedMap15.equals((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1);
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) 1);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        int i26 = defaultedMap11.size();
        java.util.Collection collection27 = defaultedMap11.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100L + "'", obj23.equals(100L));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.containsKey(obj10);
        java.util.Set set12 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set15 = defaultedMap14.keySet();
        int i16 = defaultedMap14.size();
        java.util.Set set17 = defaultedMap14.keySet();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) (short) 1);
        java.util.Set set21 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set24 = defaultedMap23.keySet();
        int i25 = defaultedMap23.size();
        java.util.Set set26 = defaultedMap23.keySet();
        java.util.Collection collection27 = defaultedMap23.values();
        boolean b29 = defaultedMap23.equals((java.lang.Object) (short) 1);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap23.get(obj30);
        java.util.Set set32 = defaultedMap23.entrySet();
        java.util.Set set33 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set36 = defaultedMap35.keySet();
        java.util.Set set37 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set40 = defaultedMap39.keySet();
        java.util.Set set41 = defaultedMap39.keySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        java.util.Collection collection43 = defaultedMap39.values();
        defaultedMap35.putAll((java.util.Map) defaultedMap39);
        boolean b45 = defaultedMap23.containsValue((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap47.keySet();
        java.util.Set set49 = defaultedMap47.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap50);
        boolean b52 = defaultedMap51.isEmpty();
        java.lang.Object obj53 = defaultedMap23.get((java.lang.Object) defaultedMap51);
        boolean b54 = defaultedMap14.containsValue((java.lang.Object) defaultedMap23);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) b54);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100L + "'", obj53.equals(100L));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100L + "'", obj55.equals(100L));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.lang.String str17 = defaultedMap1.toString();
        java.util.Set set18 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        int i22 = defaultedMap20.size();
        java.util.Set set23 = defaultedMap20.keySet();
        java.util.Collection collection24 = defaultedMap20.values();
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        int i29 = defaultedMap27.size();
        java.util.Set set30 = defaultedMap27.keySet();
        java.util.Collection collection31 = defaultedMap27.values();
        boolean b33 = defaultedMap27.equals((java.lang.Object) (short) 1);
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate40, predicate41);
        java.lang.Object obj43 = defaultedMap27.put((java.lang.Object) "{}", (java.lang.Object) predicate40);
        java.util.Collection collection44 = defaultedMap27.values();
        java.util.Set set45 = defaultedMap27.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set48 = defaultedMap47.keySet();
        int i49 = defaultedMap47.size();
        java.lang.String str50 = defaultedMap47.toString();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        boolean b52 = defaultedMap47.containsValue((java.lang.Object) predicate51);
        defaultedMap27.putAll((java.util.Map) defaultedMap47);
        boolean b54 = defaultedMap20.equals((java.lang.Object) defaultedMap27);
        java.lang.String str55 = defaultedMap27.toString();
        java.lang.Object obj56 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{1=100}" + "'", str17.equals("{1=100}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 100L + "'", obj56.equals(100L));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        int i17 = defaultedMap15.size();
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Collection collection19 = defaultedMap15.values();
        boolean b21 = defaultedMap15.equals((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1);
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) 1);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        java.util.Collection collection26 = defaultedMap11.values();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set30 = defaultedMap29.keySet();
        int i31 = defaultedMap29.size();
        java.util.Set set32 = defaultedMap29.keySet();
        java.util.Collection collection33 = defaultedMap29.values();
        boolean b35 = defaultedMap29.equals((java.lang.Object) (short) 1);
        java.lang.Object obj37 = defaultedMap29.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate42, predicate43);
        java.lang.Object obj45 = defaultedMap29.put((java.lang.Object) "{}", (java.lang.Object) predicate42);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate27, predicate42);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100L + "'", obj23.equals(100L));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100L + "'", obj37.equals(100L));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str9 = defaultedMap8.toString();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 10L);
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        java.util.Map map13 = null;
        try {
            defaultedMap8.putAll(map13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.containsKey(obj10);
        java.util.Set set12 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        int i17 = defaultedMap15.size();
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        int i22 = defaultedMap20.size();
        java.util.Set set23 = defaultedMap20.keySet();
        java.util.Collection collection24 = defaultedMap20.values();
        boolean b26 = defaultedMap20.equals((java.lang.Object) (short) 1);
        java.lang.Object obj28 = defaultedMap20.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set32 = defaultedMap31.keySet();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate33, predicate34);
        java.lang.Object obj36 = defaultedMap20.put((java.lang.Object) "{}", (java.lang.Object) predicate33);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate33, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set41 = defaultedMap40.keySet();
        int i42 = defaultedMap40.size();
        java.util.Set set43 = defaultedMap40.keySet();
        java.util.Collection collection44 = defaultedMap40.values();
        boolean b46 = defaultedMap40.equals((java.lang.Object) (short) 1);
        java.lang.Object obj48 = defaultedMap40.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set52 = defaultedMap51.keySet();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate53, predicate54);
        java.lang.Object obj56 = defaultedMap40.put((java.lang.Object) "{}", (java.lang.Object) predicate53);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate37, predicate53);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100L + "'", obj28.equals(100L));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100L + "'", obj48.equals(100L));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set5 = defaultedMap4.keySet();
        java.util.Set set6 = defaultedMap4.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set9 = defaultedMap8.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap4.get((java.lang.Object) map12);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) 1L, obj13);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) 10.0f);
        java.lang.String str17 = defaultedMap1.toString();
        java.util.Set set18 = defaultedMap1.entrySet();
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{1=100}" + "'", str17.equals("{1=100}"));
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        java.util.Set set10 = defaultedMap1.entrySet();
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10L);
        boolean b6 = defaultedMap1.equals((java.lang.Object) "hi!");
        java.util.Set set7 = defaultedMap1.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        int i17 = defaultedMap15.size();
        java.util.Set set18 = defaultedMap15.keySet();
        java.util.Collection collection19 = defaultedMap15.values();
        boolean b21 = defaultedMap15.equals((java.lang.Object) (short) 1);
        java.lang.Object obj23 = defaultedMap15.get((java.lang.Object) 1);
        java.lang.Object obj24 = defaultedMap11.get((java.lang.Object) 1);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        defaultedMap11.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100L + "'", obj23.equals(100L));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100L + "'", obj24.equals(100L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b3 = defaultedMap1.isEmpty();
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b14 = defaultedMap11.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set20 = defaultedMap19.keySet();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate21, predicate22);
        defaultedMap11.putAll(map23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str27 = defaultedMap26.toString();
        boolean b29 = defaultedMap26.containsValue((java.lang.Object) 10L);
        boolean b31 = defaultedMap26.equals((java.lang.Object) "hi!");
        java.util.Set set32 = defaultedMap26.entrySet();
        boolean b34 = defaultedMap26.containsKey((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set37 = defaultedMap36.keySet();
        int i38 = defaultedMap36.size();
        java.lang.String str39 = defaultedMap36.toString();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set42 = defaultedMap41.keySet();
        int i43 = defaultedMap41.size();
        java.util.Set set44 = defaultedMap41.keySet();
        java.util.Collection collection45 = defaultedMap41.values();
        boolean b47 = defaultedMap41.equals((java.lang.Object) (short) 1);
        java.lang.Object obj49 = defaultedMap41.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set53 = defaultedMap52.keySet();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate55);
        java.lang.Object obj57 = defaultedMap41.put((java.lang.Object) "{}", (java.lang.Object) predicate54);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate54, predicate58);
        boolean b60 = defaultedMap26.containsValue((java.lang.Object) map59);
        boolean b61 = defaultedMap11.equals((java.lang.Object) b60);
        java.lang.Object obj62 = defaultedMap9.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set65 = defaultedMap64.keySet();
        int i66 = defaultedMap64.size();
        java.util.Set set67 = defaultedMap64.keySet();
        java.util.Collection collection68 = defaultedMap64.values();
        java.util.Collection collection69 = defaultedMap64.values();
        java.util.Collection collection70 = defaultedMap64.values();
        java.util.Set set71 = defaultedMap64.entrySet();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set74 = defaultedMap73.keySet();
        int i75 = defaultedMap73.size();
        java.util.Set set76 = defaultedMap73.keySet();
        java.util.Collection collection77 = defaultedMap73.values();
        boolean b79 = defaultedMap73.equals((java.lang.Object) (short) 1);
        boolean b81 = defaultedMap73.equals((java.lang.Object) 100);
        java.lang.Object obj82 = defaultedMap9.put((java.lang.Object) defaultedMap64, (java.lang.Object) 100);
        boolean b83 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100L + "'", obj17.equals(100L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "hi!" + "'", obj62.equals("hi!"));
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue(i75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.containsKey(obj10);
        java.util.Set set12 = defaultedMap1.entrySet();
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        int i17 = defaultedMap15.size();
        java.lang.String str18 = defaultedMap15.toString();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate24);
        boolean b28 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) "{}", (java.lang.Object) predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set28 = defaultedMap27.keySet();
        java.util.Set set29 = defaultedMap27.keySet();
        defaultedMap27.clear();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap1.put((java.lang.Object) defaultedMap27, obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set35 = defaultedMap34.keySet();
        java.util.Set set36 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap34);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        defaultedMap37.clear();
        java.lang.Object obj42 = defaultedMap1.remove((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        collections.Factory factory2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.containsKey(obj10);
        java.util.Set set12 = defaultedMap1.entrySet();
        java.lang.String str13 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.keySet();
        int i17 = defaultedMap15.size();
        java.lang.String str18 = defaultedMap15.toString();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        boolean b20 = defaultedMap15.containsValue((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set23 = defaultedMap22.keySet();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate24);
        java.lang.String str28 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set6 = defaultedMap5.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate7, predicate8);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) map9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str13 = defaultedMap12.toString();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate23, predicate28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set34 = defaultedMap33.keySet();
        int i35 = defaultedMap33.size();
        java.lang.String str36 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set39 = defaultedMap38.keySet();
        int i40 = defaultedMap38.size();
        java.util.Set set41 = defaultedMap38.keySet();
        java.util.Collection collection42 = defaultedMap38.values();
        boolean b44 = defaultedMap38.equals((java.lang.Object) (short) 1);
        java.lang.Object obj46 = defaultedMap38.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set50 = defaultedMap49.keySet();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap38.put((java.lang.Object) "{}", (java.lang.Object) predicate51);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate51, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate23, predicate51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set12 = defaultedMap11.keySet();
        int i13 = defaultedMap11.size();
        java.util.Set set14 = defaultedMap11.keySet();
        java.util.Collection collection15 = defaultedMap11.values();
        boolean b17 = defaultedMap11.equals((java.lang.Object) (short) 1);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap11.get(obj18);
        java.util.Set set20 = defaultedMap11.entrySet();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) set20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) set20);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100L + "'", obj19.equals(100L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100L + "'", obj21.equals(100L));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str9 = defaultedMap8.toString();
        boolean b11 = defaultedMap8.containsValue((java.lang.Object) 10L);
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        int i13 = defaultedMap1.size();
        java.util.Set set14 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str17 = defaultedMap16.toString();
        boolean b19 = defaultedMap16.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set25 = defaultedMap24.keySet();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set31 = defaultedMap30.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate27, predicate32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set38 = defaultedMap37.keySet();
        int i39 = defaultedMap37.size();
        java.util.Set set40 = defaultedMap37.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set43 = defaultedMap42.keySet();
        int i44 = defaultedMap42.size();
        java.lang.String str45 = defaultedMap42.toString();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        boolean b47 = defaultedMap42.containsValue((java.lang.Object) predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str50 = defaultedMap49.toString();
        boolean b52 = defaultedMap49.containsValue((java.lang.Object) 10L);
        java.lang.Object obj53 = defaultedMap37.put((java.lang.Object) b47, (java.lang.Object) 10L);
        java.util.Set set54 = defaultedMap37.keySet();
        java.lang.Object obj55 = defaultedMap1.put((java.lang.Object) defaultedMap16, (java.lang.Object) set54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set58 = defaultedMap57.keySet();
        java.util.Set set59 = defaultedMap57.keySet();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set62 = defaultedMap61.keySet();
        java.util.Set set63 = defaultedMap61.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap61);
        java.util.Collection collection65 = defaultedMap61.values();
        defaultedMap57.putAll((java.util.Map) defaultedMap61);
        defaultedMap1.putAll((java.util.Map) defaultedMap57);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.String str13 = defaultedMap12.toString();
        boolean b15 = defaultedMap12.containsValue((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap12.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set21 = defaultedMap20.keySet();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate22, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate29);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate23, predicate28);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate8, predicate23);
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate(map32, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Collection collection5 = defaultedMap1.values();
        java.util.Collection collection6 = defaultedMap1.values();
        java.util.Collection collection7 = defaultedMap1.values();
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        int i3 = defaultedMap1.size();
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set7 = defaultedMap6.keySet();
        int i8 = defaultedMap6.size();
        java.util.Set set9 = defaultedMap6.keySet();
        java.util.Collection collection10 = defaultedMap6.values();
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set18 = defaultedMap17.keySet();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap6.put((java.lang.Object) "{}", (java.lang.Object) predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate19, predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set27 = defaultedMap26.keySet();
        int i28 = defaultedMap26.size();
        java.util.Set set29 = defaultedMap26.keySet();
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set33 = defaultedMap32.keySet();
        int i34 = defaultedMap32.size();
        java.util.Set set35 = defaultedMap32.keySet();
        java.util.Collection collection36 = defaultedMap32.values();
        java.util.Collection collection37 = defaultedMap32.values();
        boolean b39 = defaultedMap32.containsKey((java.lang.Object) 100L);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) b39);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map40);
    }
}

