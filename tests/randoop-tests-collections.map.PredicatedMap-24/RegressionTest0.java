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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map7, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.Transformer transformer3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10L);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        java.util.Set set15 = defaultedMap10.keySet();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        int i15 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.util.Set set11 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i4 = defaultedMap3.size();
        java.util.Set set5 = defaultedMap3.keySet();
        java.util.Set set6 = defaultedMap3.keySet();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate7, predicate8);
        try {
            java.util.Map map10 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.util.Collection collection17 = defaultedMap12.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '4' + "'", obj11.equals('4'));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        boolean b22 = defaultedMap12.containsKey((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b26 = defaultedMap24.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Collection collection28 = defaultedMap27.values();
        boolean b29 = defaultedMap12.containsValue((java.lang.Object) collection28);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b23 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1L));
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap32);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        boolean b38 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i41 = defaultedMap40.size();
        java.util.Set set42 = defaultedMap40.entrySet();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b46 = defaultedMap40.isEmpty();
        collections.Predicate predicate47 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate50);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.entrySet();
        java.lang.Object obj61 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b62 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b66 = defaultedMap64.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b73 = defaultedMap71.equals((java.lang.Object) (-1L));
        boolean b74 = defaultedMap67.containsValue((java.lang.Object) defaultedMap71);
        defaultedMap56.putAll((java.util.Map) defaultedMap67);
        boolean b76 = defaultedMap40.equals((java.lang.Object) defaultedMap56);
        java.util.Set set77 = defaultedMap56.keySet();
        java.lang.Object obj78 = defaultedMap1.remove((java.lang.Object) defaultedMap56);
        collections.Transformer transformer79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, transformer79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) i2);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) set15);
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap16);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        int i5 = defaultedMap4.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap11.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b28 = defaultedMap26.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        boolean b32 = defaultedMap20.containsValue((java.lang.Object) map31);
        java.lang.Object obj33 = defaultedMap7.remove((java.lang.Object) b32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, obj33);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        boolean b5 = defaultedMap4.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection23 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap25.containsKey((java.lang.Object) defaultedMap31);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        boolean b40 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + '4' + "'", obj35.equals('4'));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) false);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate(map5, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) defaultedMap10);
        boolean b15 = defaultedMap4.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + '4' + "'", obj14.equals('4'));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) ' ');
        boolean b22 = defaultedMap10.containsValue((java.lang.Object) map21);
        java.lang.String str23 = defaultedMap10.toString();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b19 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b30 = defaultedMap28.equals((java.lang.Object) (-1L));
        boolean b31 = defaultedMap24.containsValue((java.lang.Object) defaultedMap28);
        defaultedMap13.putAll((java.util.Map) defaultedMap24);
        boolean b33 = defaultedMap4.equals((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        java.lang.Object obj22 = defaultedMap12.get((java.lang.Object) predicate19);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + '4' + "'", obj22.equals('4'));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b11 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) defaultedMap20);
        defaultedMap5.putAll((java.util.Map) defaultedMap16);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b36 = defaultedMap34.equals((java.lang.Object) (-1L));
        boolean b37 = defaultedMap30.containsValue((java.lang.Object) defaultedMap34);
        boolean b38 = defaultedMap30.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection42 = defaultedMap41.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b48 = defaultedMap46.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        java.lang.Object obj54 = defaultedMap46.get((java.lang.Object) defaultedMap50);
        boolean b55 = defaultedMap44.containsKey((java.lang.Object) defaultedMap50);
        defaultedMap41.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap41);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap5.put((java.lang.Object) defaultedMap41, obj58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i62 = defaultedMap61.size();
        java.util.Set set63 = defaultedMap61.entrySet();
        java.lang.Object obj66 = defaultedMap61.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        defaultedMap41.putAll((java.util.Map) defaultedMap61);
        java.lang.Object obj68 = defaultedMap1.get((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + '4' + "'", obj54.equals('4'));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + '4' + "'", obj68.equals('4'));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.entrySet();
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection14 = defaultedMap13.values();
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap13.equals(obj15);
        java.lang.Object obj17 = defaultedMap5.put(obj11, (java.lang.Object) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b9 = defaultedMap7.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap5.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) map25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) b26);
        boolean b28 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        defaultedMap30.putAll(map35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection40 = defaultedMap39.values();
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap39.equals(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i45 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i48 = defaultedMap47.size();
        java.util.Set set49 = defaultedMap47.entrySet();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) predicate52);
        boolean b56 = defaultedMap47.equals((java.lang.Object) defaultedMap55);
        boolean b57 = defaultedMap44.containsKey((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection62 = defaultedMap61.values();
        java.lang.String str63 = defaultedMap61.toString();
        java.lang.Object obj64 = defaultedMap59.remove((java.lang.Object) str63);
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        defaultedMap39.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj67 = defaultedMap1.remove((java.lang.Object) defaultedMap44);
        int i68 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(i68 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b12 = defaultedMap6.isEmpty();
        collections.Predicate predicate13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i23 = defaultedMap22.size();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b39 = defaultedMap37.equals((java.lang.Object) (-1L));
        boolean b40 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        defaultedMap22.putAll((java.util.Map) defaultedMap33);
        boolean b42 = defaultedMap6.equals((java.lang.Object) defaultedMap22);
        java.util.Set set43 = defaultedMap22.keySet();
        java.lang.Object obj44 = defaultedMap4.get((java.lang.Object) set43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i47 = defaultedMap46.size();
        java.util.Set set48 = defaultedMap46.keySet();
        java.util.Set set49 = defaultedMap46.keySet();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate50, predicate51);
        java.lang.Object obj53 = defaultedMap4.get((java.lang.Object) map52);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false + "'", obj53.equals(false));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        boolean b22 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i25 = defaultedMap24.size();
        java.util.Set set26 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        java.util.Set set34 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) set34);
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) defaultedMap21, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i40 = defaultedMap39.size();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b45 = defaultedMap43.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        java.lang.Object obj51 = defaultedMap43.get((java.lang.Object) defaultedMap47);
        java.lang.Object obj52 = defaultedMap39.remove((java.lang.Object) defaultedMap43);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + '4' + "'", obj36.equals('4'));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + '4' + "'", obj51.equals('4'));
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        defaultedMap12.putAll((java.util.Map) defaultedMap22);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.String str20 = defaultedMap18.toString();
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj22 = new java.lang.Object();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, obj22);
        java.util.Collection collection24 = defaultedMap18.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b23 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1L));
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap32);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i40 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i43 = defaultedMap42.size();
        java.util.Set set44 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) predicate47);
        boolean b51 = defaultedMap42.equals((java.lang.Object) defaultedMap50);
        boolean b52 = defaultedMap39.containsKey((java.lang.Object) defaultedMap42);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i60 = defaultedMap59.size();
        java.util.Set set61 = defaultedMap59.entrySet();
        java.lang.Object obj64 = defaultedMap59.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection68 = defaultedMap67.values();
        java.lang.Object obj69 = null;
        boolean b70 = defaultedMap67.equals(obj69);
        java.lang.Object obj71 = defaultedMap59.put(obj65, (java.lang.Object) defaultedMap67);
        defaultedMap55.putAll((java.util.Map) defaultedMap67);
        java.lang.Object obj73 = defaultedMap17.remove((java.lang.Object) defaultedMap55);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b10 = defaultedMap4.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b21 = defaultedMap19.equals((java.lang.Object) (-1L));
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) defaultedMap19);
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b28 = defaultedMap26.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b35 = defaultedMap33.equals((java.lang.Object) (-1L));
        boolean b36 = defaultedMap29.containsValue((java.lang.Object) defaultedMap33);
        boolean b37 = defaultedMap29.isEmpty();
        defaultedMap4.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection41 = defaultedMap40.values();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b47 = defaultedMap45.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        java.lang.Object obj53 = defaultedMap45.get((java.lang.Object) defaultedMap49);
        boolean b54 = defaultedMap43.containsKey((java.lang.Object) defaultedMap49);
        defaultedMap40.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = defaultedMap4.put((java.lang.Object) defaultedMap40, obj57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i61 = defaultedMap60.size();
        java.util.Set set62 = defaultedMap60.entrySet();
        java.lang.Object obj65 = defaultedMap60.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        defaultedMap40.putAll((java.util.Map) defaultedMap60);
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) defaultedMap60);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + '4' + "'", obj53.equals('4'));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + '4' + "'", obj67.equals('4'));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        java.util.Collection collection12 = defaultedMap8.values();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        boolean b14 = defaultedMap8.containsValue((java.lang.Object) predicate13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) defaultedMap9);
        boolean b14 = defaultedMap1.containsKey(obj13);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '4' + "'", obj13.equals('4'));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i15 = defaultedMap14.size();
        java.util.Set set16 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b20 = defaultedMap18.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        boolean b28 = defaultedMap21.containsValue((java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = defaultedMap14.get((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection32 = defaultedMap31.values();
        java.lang.String str33 = defaultedMap31.toString();
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        defaultedMap1.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.entrySet();
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection46 = defaultedMap45.values();
        java.lang.Object obj47 = null;
        boolean b48 = defaultedMap45.equals(obj47);
        java.lang.Object obj49 = defaultedMap37.put(obj43, (java.lang.Object) defaultedMap45);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, obj49);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '4' + "'", obj11.equals('4'));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '4' + "'", obj29.equals('4'));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.PredicateUtils predicateUtils5 = new collections.PredicateUtils();
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) predicateUtils5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1L));
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap27.get(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj39 = defaultedMap34.get((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj46 = defaultedMap41.get((java.lang.Object) predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate38, predicate45);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + '4' + "'", obj32.equals('4'));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100.0d + "'", obj39.equals(100.0d));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0d + "'", obj46.equals(100.0d));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b9 = defaultedMap7.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap5.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) map25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) b26);
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        defaultedMap8.clear();
        boolean b13 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) b13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        java.util.Collection collection15 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        java.lang.Object obj22 = defaultedMap10.get((java.lang.Object) predicate18);
        int i23 = defaultedMap10.size();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + '4' + "'", obj22.equals('4'));
        org.junit.Assert.assertTrue(i23 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b12 = defaultedMap6.isEmpty();
        collections.Predicate predicate13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) predicate16);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate13, predicate16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i23 = defaultedMap22.size();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b28 = defaultedMap22.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b39 = defaultedMap37.equals((java.lang.Object) (-1L));
        boolean b40 = defaultedMap33.containsValue((java.lang.Object) defaultedMap37);
        defaultedMap22.putAll((java.util.Map) defaultedMap33);
        boolean b42 = defaultedMap6.equals((java.lang.Object) defaultedMap22);
        java.util.Set set43 = defaultedMap22.keySet();
        java.lang.Object obj44 = defaultedMap4.get((java.lang.Object) set43);
        collections.Transformer transformer45 = null;
        try {
            java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + false + "'", obj44.equals(false));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b23 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1L));
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap32);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        boolean b38 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i41 = defaultedMap40.size();
        java.util.Set set42 = defaultedMap40.entrySet();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b46 = defaultedMap40.isEmpty();
        collections.Predicate predicate47 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate50);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.entrySet();
        java.lang.Object obj61 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b62 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b66 = defaultedMap64.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b73 = defaultedMap71.equals((java.lang.Object) (-1L));
        boolean b74 = defaultedMap67.containsValue((java.lang.Object) defaultedMap71);
        defaultedMap56.putAll((java.util.Map) defaultedMap67);
        boolean b76 = defaultedMap40.equals((java.lang.Object) defaultedMap56);
        java.util.Set set77 = defaultedMap56.keySet();
        java.lang.Object obj78 = defaultedMap1.remove((java.lang.Object) defaultedMap56);
        java.util.Collection collection79 = defaultedMap56.values();
        collections.Transformer transformer80 = null;
        try {
            java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, transformer80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) set18);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap9.put((java.lang.Object) '4', (java.lang.Object) defaultedMap19);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        defaultedMap7.clear();
        boolean b11 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) set18);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap9.put((java.lang.Object) '4', (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) b25);
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) predicateUtils27);
        java.lang.Object obj29 = defaultedMap9.get((java.lang.Object) predicateUtils27);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b13 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection17 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        boolean b30 = defaultedMap19.containsKey((java.lang.Object) defaultedMap25);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection36 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b42 = defaultedMap40.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        java.lang.Object obj48 = defaultedMap40.get((java.lang.Object) defaultedMap44);
        boolean b49 = defaultedMap38.containsKey((java.lang.Object) defaultedMap44);
        defaultedMap35.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap35);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '4' + "'", obj29.equals('4'));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + '4' + "'", obj48.equals('4'));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap8.get(obj12);
        defaultedMap8.clear();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '4' + "'", obj13.equals('4'));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate20);
        boolean b24 = defaultedMap15.equals((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i27 = defaultedMap26.size();
        java.util.Set set28 = defaultedMap26.entrySet();
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i34 = defaultedMap33.size();
        java.util.Set set35 = defaultedMap33.keySet();
        java.util.Set set36 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) set36);
        java.lang.Object obj38 = defaultedMap26.get((java.lang.Object) set36);
        java.lang.Object obj39 = defaultedMap10.put((java.lang.Object) defaultedMap23, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i42 = defaultedMap41.size();
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) defaultedMap41);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        java.lang.String str45 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + '4' + "'", obj38.equals('4'));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + '4' + "'", obj44.equals('4'));
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        int i5 = defaultedMap4.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection3 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i6 = defaultedMap5.size();
        java.util.Set set7 = defaultedMap5.keySet();
        java.lang.Object obj8 = defaultedMap2.remove((java.lang.Object) set7);
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) set7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) ' ');
        boolean b22 = defaultedMap10.containsValue((java.lang.Object) map21);
        java.lang.String str23 = defaultedMap10.toString();
        boolean b25 = defaultedMap10.containsValue((java.lang.Object) 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        boolean b18 = defaultedMap9.equals((java.lang.Object) defaultedMap17);
        boolean b19 = defaultedMap6.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.String str25 = defaultedMap23.toString();
        java.lang.Object obj26 = defaultedMap21.remove((java.lang.Object) str25);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set29 = defaultedMap6.entrySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection6 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i9 = defaultedMap8.size();
        java.util.Set set10 = defaultedMap8.keySet();
        java.lang.Object obj11 = defaultedMap5.remove((java.lang.Object) set10);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b19 = defaultedMap13.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b30 = defaultedMap28.equals((java.lang.Object) (-1L));
        boolean b31 = defaultedMap24.containsValue((java.lang.Object) defaultedMap28);
        defaultedMap13.putAll((java.util.Map) defaultedMap24);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b37 = defaultedMap35.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1L));
        boolean b45 = defaultedMap38.containsValue((java.lang.Object) defaultedMap42);
        boolean b46 = defaultedMap38.isEmpty();
        defaultedMap13.putAll((java.util.Map) defaultedMap38);
        java.util.Set set48 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap4.put((java.lang.Object) defaultedMap13, (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.entrySet();
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i25 = defaultedMap24.size();
        java.util.Set set26 = defaultedMap24.keySet();
        defaultedMap24.clear();
        boolean b28 = defaultedMap18.containsKey((java.lang.Object) defaultedMap24);
        java.lang.Object obj29 = defaultedMap12.get((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '4' + "'", obj29.equals('4'));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection23 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) defaultedMap31);
        boolean b36 = defaultedMap25.containsKey((java.lang.Object) defaultedMap31);
        defaultedMap22.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        java.util.Collection collection40 = defaultedMap22.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + '4' + "'", obj35.equals('4'));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b13 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.String str20 = defaultedMap18.toString();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) str20);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i26 = defaultedMap25.size();
        java.util.Set set27 = defaultedMap25.keySet();
        java.util.Set set28 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) set28);
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object obj38 = defaultedMap36.get(obj37);
        java.lang.String str39 = defaultedMap36.toString();
        boolean b40 = defaultedMap36.isEmpty();
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap29, (java.lang.Object) defaultedMap36);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        java.lang.Object obj11 = defaultedMap3.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) b16);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + '4' + "'", obj11.equals('4'));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0d + "'", obj17.equals(100.0d));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b9 = defaultedMap7.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap5.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) map25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) b26);
        boolean b28 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        defaultedMap30.putAll(map35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) map35);
        java.util.Set set38 = defaultedMap1.keySet();
        java.util.Set set39 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i42 = defaultedMap41.size();
        java.util.Set set43 = defaultedMap41.keySet();
        java.util.Set set44 = defaultedMap41.keySet();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) set44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i48 = defaultedMap47.size();
        java.util.Set set49 = defaultedMap47.entrySet();
        java.lang.Object obj52 = defaultedMap47.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b53 = defaultedMap47.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b57 = defaultedMap55.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b64 = defaultedMap62.equals((java.lang.Object) (-1L));
        boolean b65 = defaultedMap58.containsValue((java.lang.Object) defaultedMap62);
        defaultedMap47.putAll((java.util.Map) defaultedMap58);
        defaultedMap47.clear();
        boolean b68 = defaultedMap45.containsKey((java.lang.Object) defaultedMap47);
        boolean b69 = defaultedMap1.containsValue((java.lang.Object) b68);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        defaultedMap12.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj25 = defaultedMap12.get((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + '4' + "'", obj25.equals('4'));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b23 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1L));
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap32);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i40 = defaultedMap39.size();
        java.util.Set set41 = defaultedMap39.entrySet();
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i46 = defaultedMap45.size();
        java.util.Set set47 = defaultedMap45.keySet();
        defaultedMap45.clear();
        boolean b49 = defaultedMap39.containsKey((java.lang.Object) defaultedMap45);
        boolean b50 = defaultedMap1.containsKey((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b13 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.String str20 = defaultedMap18.toString();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) str20);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap28);
        java.util.Set set32 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b5 = defaultedMap3.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b12 = defaultedMap10.equals((java.lang.Object) (-1L));
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) defaultedMap10);
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap10);
        defaultedMap10.clear();
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.lang.Object obj11 = defaultedMap6.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b12 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1L));
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) defaultedMap21);
        defaultedMap6.putAll((java.util.Map) defaultedMap17);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b30 = defaultedMap28.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b37 = defaultedMap35.equals((java.lang.Object) (-1L));
        boolean b38 = defaultedMap31.containsValue((java.lang.Object) defaultedMap35);
        boolean b39 = defaultedMap31.isEmpty();
        defaultedMap6.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection43 = defaultedMap42.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate52, predicate53);
        java.lang.Object obj55 = defaultedMap47.get((java.lang.Object) defaultedMap51);
        boolean b56 = defaultedMap45.containsKey((java.lang.Object) defaultedMap51);
        defaultedMap42.putAll((java.util.Map) defaultedMap45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap42);
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = defaultedMap6.put((java.lang.Object) defaultedMap42, obj59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i63 = defaultedMap62.size();
        java.util.Set set64 = defaultedMap62.entrySet();
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        defaultedMap42.putAll((java.util.Map) defaultedMap62);
        boolean b69 = defaultedMap1.containsKey((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + '4' + "'", obj55.equals('4'));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i16 = defaultedMap15.size();
        java.util.Set set17 = defaultedMap15.keySet();
        java.util.Set set18 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) set18);
        defaultedMap19.clear();
        java.lang.Object obj21 = defaultedMap9.put((java.lang.Object) '4', (java.lang.Object) defaultedMap19);
        defaultedMap9.clear();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.String str3 = defaultedMap1.toString();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate13, predicate14);
        java.lang.Object obj16 = defaultedMap8.get((java.lang.Object) defaultedMap12);
        boolean b17 = defaultedMap6.containsKey((java.lang.Object) defaultedMap12);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection21 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap25.get((java.lang.Object) defaultedMap29);
        boolean b34 = defaultedMap23.containsKey((java.lang.Object) defaultedMap29);
        defaultedMap20.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b43 = defaultedMap41.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b50 = defaultedMap48.equals((java.lang.Object) (-1L));
        boolean b51 = defaultedMap44.containsValue((java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i54 = defaultedMap53.size();
        java.util.Set set55 = defaultedMap53.entrySet();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) predicate58);
        boolean b62 = defaultedMap53.equals((java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i65 = defaultedMap64.size();
        java.util.Set set66 = defaultedMap64.entrySet();
        java.lang.Object obj69 = defaultedMap64.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i72 = defaultedMap71.size();
        java.util.Set set73 = defaultedMap71.keySet();
        java.util.Set set74 = defaultedMap71.keySet();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) set74);
        java.lang.Object obj76 = defaultedMap64.get((java.lang.Object) set74);
        java.lang.Object obj77 = defaultedMap48.put((java.lang.Object) defaultedMap61, (java.lang.Object) defaultedMap64);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i80 = defaultedMap79.size();
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) defaultedMap79);
        java.lang.Object obj82 = defaultedMap39.get((java.lang.Object) defaultedMap61);
        java.lang.Object obj83 = defaultedMap37.get((java.lang.Object) defaultedMap39);
        java.util.Map map84 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj83);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '4' + "'", obj33.equals('4'));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(i72 == 0);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + '4' + "'", obj76.equals('4'));
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '4' + "'", obj82.equals('4'));
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) defaultedMap10);
        boolean b15 = defaultedMap4.containsKey((java.lang.Object) defaultedMap10);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i19 = defaultedMap18.size();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1L));
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        boolean b46 = defaultedMap37.equals((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i49 = defaultedMap48.size();
        java.util.Set set50 = defaultedMap48.entrySet();
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i56 = defaultedMap55.size();
        java.util.Set set57 = defaultedMap55.keySet();
        java.util.Set set58 = defaultedMap55.keySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) set58);
        java.lang.Object obj60 = defaultedMap48.get((java.lang.Object) set58);
        java.lang.Object obj61 = defaultedMap32.put((java.lang.Object) defaultedMap45, (java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i64 = defaultedMap63.size();
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap63);
        java.lang.Object obj66 = defaultedMap4.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap45);
        int i67 = defaultedMap4.size();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + '4' + "'", obj14.equals('4'));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + '4' + "'", obj60.equals('4'));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(i67 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        java.util.Set set13 = defaultedMap9.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b8 = defaultedMap6.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1L));
        boolean b16 = defaultedMap9.containsValue((java.lang.Object) defaultedMap13);
        java.util.Collection collection17 = defaultedMap13.values();
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap13.containsValue(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i22 = defaultedMap21.size();
        java.util.Set set23 = defaultedMap21.keySet();
        java.util.Set set24 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) set24);
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b30 = defaultedMap28.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i39 = defaultedMap38.size();
        java.util.Set set40 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b51 = defaultedMap49.equals((java.lang.Object) (-1L));
        boolean b52 = defaultedMap45.containsValue((java.lang.Object) defaultedMap49);
        java.lang.Object obj53 = defaultedMap38.get((java.lang.Object) defaultedMap49);
        java.lang.Object obj54 = defaultedMap28.get(obj53);
        boolean b55 = defaultedMap25.containsKey((java.lang.Object) defaultedMap28);
        defaultedMap13.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i59 = defaultedMap58.size();
        java.util.Set set60 = defaultedMap58.entrySet();
        java.lang.Object obj63 = defaultedMap58.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b64 = defaultedMap58.isEmpty();
        collections.Predicate predicate65 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) predicate68);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate65, predicate68);
        java.lang.Object obj73 = defaultedMap1.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap58);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + '4' + "'", obj36.equals('4'));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + '4' + "'", obj53.equals('4'));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + '4' + "'", obj54.equals('4'));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj73);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1L));
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) defaultedMap30);
        boolean b34 = defaultedMap26.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap26);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b23 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1L));
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap32);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        boolean b38 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i41 = defaultedMap40.size();
        java.util.Set set42 = defaultedMap40.entrySet();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b46 = defaultedMap40.isEmpty();
        collections.Predicate predicate47 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate50);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.entrySet();
        java.lang.Object obj61 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b62 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b66 = defaultedMap64.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b73 = defaultedMap71.equals((java.lang.Object) (-1L));
        boolean b74 = defaultedMap67.containsValue((java.lang.Object) defaultedMap71);
        defaultedMap56.putAll((java.util.Map) defaultedMap67);
        boolean b76 = defaultedMap40.equals((java.lang.Object) defaultedMap56);
        java.util.Set set77 = defaultedMap56.keySet();
        java.lang.Object obj78 = defaultedMap1.remove((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b83 = defaultedMap81.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b90 = defaultedMap88.equals((java.lang.Object) (-1L));
        boolean b91 = defaultedMap84.containsValue((java.lang.Object) defaultedMap88);
        java.util.Collection collection92 = defaultedMap88.values();
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) defaultedMap88);
        java.util.Collection collection94 = defaultedMap88.values();
        collections.map.DefaultedMap defaultedMap96 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i97 = defaultedMap96.size();
        java.util.Set set98 = defaultedMap96.entrySet();
        java.lang.Object obj99 = defaultedMap88.get((java.lang.Object) defaultedMap96);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue(i97 == 0);
        org.junit.Assert.assertNotNull(set98);
        org.junit.Assert.assertTrue("'" + obj99 + "' != '" + '4' + "'", obj99.equals('4'));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection10 = defaultedMap9.values();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap9.equals(obj11);
        java.lang.Object obj13 = defaultedMap1.put(obj7, (java.lang.Object) defaultedMap9);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b13 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.String str20 = defaultedMap18.toString();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) str20);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i26 = defaultedMap25.size();
        java.util.Set set27 = defaultedMap25.entrySet();
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i33 = defaultedMap32.size();
        java.util.Set set34 = defaultedMap32.keySet();
        java.util.Set set35 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) set35);
        java.lang.Object obj37 = defaultedMap25.get((java.lang.Object) set35);
        java.lang.Object obj38 = defaultedMap1.get(obj37);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + '4' + "'", obj37.equals('4'));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + '4' + "'", obj38.equals('4'));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate16, predicate17);
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate17);
        collections.Factory factory20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map19, factory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b13 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1L));
        boolean b26 = defaultedMap19.containsValue((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i29 = defaultedMap28.size();
        java.util.Set set30 = defaultedMap28.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) predicate33);
        boolean b37 = defaultedMap28.equals((java.lang.Object) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i40 = defaultedMap39.size();
        java.util.Set set41 = defaultedMap39.entrySet();
        java.lang.Object obj44 = defaultedMap39.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i47 = defaultedMap46.size();
        java.util.Set set48 = defaultedMap46.keySet();
        java.util.Set set49 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) set49);
        java.lang.Object obj51 = defaultedMap39.get((java.lang.Object) set49);
        java.lang.Object obj52 = defaultedMap23.put((java.lang.Object) defaultedMap36, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap39);
        boolean b54 = defaultedMap4.containsValue((java.lang.Object) defaultedMap53);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + '4' + "'", obj51.equals('4'));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b13 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection19 = defaultedMap18.values();
        java.lang.String str20 = defaultedMap18.toString();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) str20);
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        boolean b23 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap28);
        java.util.Set set32 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection15 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap25.equals(obj27);
        java.lang.Object obj29 = defaultedMap17.put(obj23, (java.lang.Object) defaultedMap25);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap25.get(obj30);
        java.lang.Object obj32 = defaultedMap9.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap25);
        java.util.Collection collection33 = defaultedMap25.values();
        java.util.Set set34 = defaultedMap25.keySet();
        boolean b36 = defaultedMap25.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + '4' + "'", obj31.equals('4'));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap8.get(obj12);
        defaultedMap8.clear();
        boolean b15 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '4' + "'", obj13.equals('4'));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) predicate2);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = defaultedMap5.get(obj6);
        java.lang.String str8 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b21 = defaultedMap19.equals((java.lang.Object) (-1L));
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap19.get(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj31 = defaultedMap26.get((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj38 = defaultedMap33.get((java.lang.Object) predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate30, predicate37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate30, predicate43);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate43, predicate46);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '4' + "'", obj24.equals('4'));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0d + "'", obj31.equals(100.0d));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100.0d + "'", obj38.equals(100.0d));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.entrySet();
        boolean b9 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap4.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.Predicate predicate8 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b23 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b27 = defaultedMap25.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b34 = defaultedMap32.equals((java.lang.Object) (-1L));
        boolean b35 = defaultedMap28.containsValue((java.lang.Object) defaultedMap32);
        defaultedMap17.putAll((java.util.Map) defaultedMap28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap17);
        boolean b38 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i41 = defaultedMap40.size();
        java.util.Set set42 = defaultedMap40.entrySet();
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b46 = defaultedMap40.isEmpty();
        collections.Predicate predicate47 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate47, predicate50);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i57 = defaultedMap56.size();
        java.util.Set set58 = defaultedMap56.entrySet();
        java.lang.Object obj61 = defaultedMap56.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b62 = defaultedMap56.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b66 = defaultedMap64.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b73 = defaultedMap71.equals((java.lang.Object) (-1L));
        boolean b74 = defaultedMap67.containsValue((java.lang.Object) defaultedMap71);
        defaultedMap56.putAll((java.util.Map) defaultedMap67);
        boolean b76 = defaultedMap40.equals((java.lang.Object) defaultedMap56);
        java.util.Set set77 = defaultedMap56.keySet();
        java.lang.Object obj78 = defaultedMap1.remove((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b83 = defaultedMap81.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap84, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b90 = defaultedMap88.equals((java.lang.Object) (-1L));
        boolean b91 = defaultedMap84.containsValue((java.lang.Object) defaultedMap88);
        java.util.Collection collection92 = defaultedMap88.values();
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) '#', (java.lang.Object) defaultedMap88);
        java.util.Collection collection94 = defaultedMap88.values();
        int i95 = defaultedMap88.size();
        java.util.Collection collection96 = defaultedMap88.values();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertNotNull(collection96);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.keySet();
        java.util.Set set9 = defaultedMap6.keySet();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate10, predicate16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap8.get(obj12);
        java.util.Collection collection14 = defaultedMap8.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + '4' + "'", obj13.equals('4'));
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        int i5 = defaultedMap4.size();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i10 = defaultedMap9.size();
        java.util.Set set11 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate14, predicate15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) predicate14);
        boolean b18 = defaultedMap9.equals((java.lang.Object) defaultedMap17);
        boolean b19 = defaultedMap6.containsKey((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection24 = defaultedMap23.values();
        java.lang.String str25 = defaultedMap23.toString();
        java.lang.Object obj26 = defaultedMap21.remove((java.lang.Object) str25);
        defaultedMap6.putAll((java.util.Map) defaultedMap21);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i31 = defaultedMap30.size();
        java.util.Set set32 = defaultedMap30.keySet();
        java.util.Set set33 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) set33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i42 = defaultedMap41.size();
        java.util.Set set43 = defaultedMap41.keySet();
        java.util.Set set44 = defaultedMap41.keySet();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate46);
        boolean b49 = defaultedMap1.equals((java.lang.Object) predicate38);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i5 = defaultedMap4.size();
        java.util.Set set6 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        boolean b13 = defaultedMap4.equals((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap4);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection17 = defaultedMap16.values();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate26, predicate27);
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        boolean b30 = defaultedMap19.containsKey((java.lang.Object) defaultedMap25);
        defaultedMap16.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap16);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b37 = defaultedMap35.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b44 = defaultedMap42.equals((java.lang.Object) (-1L));
        boolean b45 = defaultedMap38.containsValue((java.lang.Object) defaultedMap42);
        defaultedMap42.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj54 = defaultedMap49.get((java.lang.Object) predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b60 = defaultedMap58.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b67 = defaultedMap65.equals((java.lang.Object) (-1L));
        boolean b68 = defaultedMap61.containsValue((java.lang.Object) defaultedMap65);
        boolean b69 = defaultedMap56.equals((java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b73 = defaultedMap71.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) ' ');
        boolean b77 = defaultedMap65.containsValue((java.lang.Object) map76);
        java.lang.String str78 = defaultedMap65.toString();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i82 = defaultedMap81.size();
        java.util.Set set83 = defaultedMap81.keySet();
        java.util.Set set84 = defaultedMap81.keySet();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate79, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate53, predicate79);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '4' + "'", obj29.equals('4'));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100.0d + "'", obj54.equals(100.0d));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100.0d + "'", obj4.equals(100.0d));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap11.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b28 = defaultedMap26.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        boolean b32 = defaultedMap20.containsValue((java.lang.Object) map31);
        java.lang.Object obj33 = defaultedMap7.remove((java.lang.Object) b32);
        boolean b34 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i37 = defaultedMap36.size();
        java.util.Set set38 = defaultedMap36.entrySet();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b42 = defaultedMap40.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b49 = defaultedMap47.equals((java.lang.Object) (-1L));
        boolean b50 = defaultedMap43.containsValue((java.lang.Object) defaultedMap47);
        java.lang.Object obj51 = defaultedMap36.get((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection54 = defaultedMap53.values();
        java.lang.String str55 = defaultedMap53.toString();
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj57 = new java.lang.Object();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, obj57);
        boolean b59 = defaultedMap7.containsValue((java.lang.Object) defaultedMap53);
        boolean b60 = defaultedMap5.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i63 = defaultedMap62.size();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i66 = defaultedMap65.size();
        java.util.Set set67 = defaultedMap65.entrySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) predicate70);
        boolean b74 = defaultedMap65.equals((java.lang.Object) defaultedMap73);
        boolean b75 = defaultedMap62.containsKey((java.lang.Object) defaultedMap65);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection80 = defaultedMap79.values();
        java.lang.String str81 = defaultedMap79.toString();
        java.lang.Object obj82 = defaultedMap77.remove((java.lang.Object) str81);
        defaultedMap62.putAll((java.util.Map) defaultedMap77);
        boolean b84 = defaultedMap62.isEmpty();
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b88 = defaultedMap86.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap89, (java.lang.Object) ' ');
        boolean b92 = defaultedMap62.containsKey((java.lang.Object) defaultedMap89);
        boolean b93 = defaultedMap5.containsKey((java.lang.Object) b92);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + '4' + "'", obj51.equals('4'));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(i66 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertTrue(b93 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b23 = defaultedMap21.equals((java.lang.Object) (-1L));
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) defaultedMap21);
        boolean b25 = defaultedMap12.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b29 = defaultedMap27.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) ' ');
        boolean b33 = defaultedMap21.containsValue((java.lang.Object) map32);
        java.lang.String str34 = defaultedMap21.toString();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i38 = defaultedMap37.size();
        java.util.Set set39 = defaultedMap37.keySet();
        java.util.Set set40 = defaultedMap37.keySet();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate35, predicate42);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) map44);
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + '4' + "'", obj45.equals('4'));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        boolean b10 = defaultedMap1.containsValue((java.lang.Object) (-1.0f));
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        java.util.Collection collection12 = defaultedMap8.values();
        java.lang.Object obj13 = new java.lang.Object();
        boolean b14 = defaultedMap8.containsValue(obj13);
        int i15 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection18 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b24 = defaultedMap22.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        java.lang.Object obj30 = defaultedMap22.get((java.lang.Object) defaultedMap26);
        boolean b31 = defaultedMap20.containsKey((java.lang.Object) defaultedMap26);
        defaultedMap17.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b37 = defaultedMap17.containsValue((java.lang.Object) defaultedMap36);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap8.put((java.lang.Object) defaultedMap17, obj38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '4' + "'", obj30.equals('4'));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b9 = defaultedMap7.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap5.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) map25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) b26);
        boolean b28 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        defaultedMap30.putAll(map35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) map35);
        java.util.Set set38 = defaultedMap1.keySet();
        boolean b39 = defaultedMap1.isEmpty();
        collections.Transformer transformer40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i8 = defaultedMap7.size();
        java.util.Set set9 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b15 = defaultedMap13.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        boolean b23 = defaultedMap16.containsValue((java.lang.Object) defaultedMap20);
        boolean b24 = defaultedMap11.equals((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b28 = defaultedMap26.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) ' ');
        boolean b32 = defaultedMap20.containsValue((java.lang.Object) map31);
        java.lang.Object obj33 = defaultedMap7.remove((java.lang.Object) b32);
        boolean b34 = defaultedMap7.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        defaultedMap36.putAll(map41);
        boolean b43 = defaultedMap7.equals((java.lang.Object) map41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i46 = defaultedMap45.size();
        java.util.Set set47 = defaultedMap45.entrySet();
        boolean b48 = defaultedMap7.equals((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection51 = defaultedMap50.values();
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap50.equals(obj52);
        boolean b54 = defaultedMap7.containsValue((java.lang.Object) b53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b58 = defaultedMap56.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b65 = defaultedMap63.equals((java.lang.Object) (-1L));
        boolean b66 = defaultedMap59.containsValue((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i69 = defaultedMap68.size();
        java.util.Set set70 = defaultedMap68.entrySet();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) predicate73);
        boolean b77 = defaultedMap68.equals((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i80 = defaultedMap79.size();
        java.util.Set set81 = defaultedMap79.entrySet();
        java.lang.Object obj84 = defaultedMap79.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i87 = defaultedMap86.size();
        java.util.Set set88 = defaultedMap86.keySet();
        java.util.Set set89 = defaultedMap86.keySet();
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) set89);
        java.lang.Object obj91 = defaultedMap79.get((java.lang.Object) set89);
        java.lang.Object obj92 = defaultedMap63.put((java.lang.Object) defaultedMap76, (java.lang.Object) defaultedMap79);
        java.lang.Object obj93 = defaultedMap5.put((java.lang.Object) defaultedMap7, (java.lang.Object) defaultedMap76);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + '4' + "'", obj91.equals('4'));
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1L));
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) defaultedMap30);
        boolean b34 = defaultedMap26.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap26);
        java.util.Set set36 = defaultedMap26.keySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b9 = defaultedMap7.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap5.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) map25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) b26);
        java.util.Set set28 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b12 = defaultedMap9.containsValue((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection15 = defaultedMap14.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap25.equals(obj27);
        java.lang.Object obj29 = defaultedMap17.put(obj23, (java.lang.Object) defaultedMap25);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap25.get(obj30);
        java.lang.Object obj32 = defaultedMap9.put((java.lang.Object) defaultedMap14, (java.lang.Object) defaultedMap25);
        java.util.Collection collection33 = defaultedMap25.values();
        java.util.Set set34 = defaultedMap25.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        defaultedMap36.putAll(map41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i45 = defaultedMap44.size();
        java.util.Set set46 = defaultedMap44.keySet();
        java.util.Set set47 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) set47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i56 = defaultedMap55.size();
        java.util.Set set57 = defaultedMap55.keySet();
        java.util.Set set58 = defaultedMap55.keySet();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection65 = defaultedMap64.values();
        java.lang.Object obj66 = defaultedMap36.put((java.lang.Object) predicate60, (java.lang.Object) defaultedMap64);
        java.util.Set set67 = defaultedMap36.keySet();
        boolean b68 = defaultedMap25.equals((java.lang.Object) set67);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + '4' + "'", obj31.equals('4'));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b14 = defaultedMap12.equals((java.lang.Object) (-1L));
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        defaultedMap12.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap12.equals(obj24);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + '4' + "'", obj16.equals('4'));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b9 = defaultedMap7.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b16 = defaultedMap14.equals((java.lang.Object) (-1L));
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) defaultedMap14);
        boolean b18 = defaultedMap5.equals((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b22 = defaultedMap20.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) ' ');
        boolean b26 = defaultedMap14.containsValue((java.lang.Object) map25);
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) b26);
        boolean b28 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        defaultedMap30.putAll(map35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i40 = defaultedMap39.size();
        java.util.Set set41 = defaultedMap39.entrySet();
        boolean b42 = defaultedMap1.equals((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b46 = defaultedMap44.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b53 = defaultedMap51.equals((java.lang.Object) (-1L));
        boolean b54 = defaultedMap47.containsValue((java.lang.Object) defaultedMap51);
        java.util.Collection collection55 = defaultedMap51.values();
        boolean b56 = defaultedMap39.containsKey((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.equals(obj3);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i14 = defaultedMap13.size();
        java.util.Set set15 = defaultedMap13.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        boolean b22 = defaultedMap13.equals((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i25 = defaultedMap24.size();
        java.util.Set set26 = defaultedMap24.entrySet();
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.keySet();
        java.util.Set set34 = defaultedMap31.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap24.get((java.lang.Object) set34);
        java.lang.Object obj37 = defaultedMap8.put((java.lang.Object) defaultedMap21, (java.lang.Object) defaultedMap24);
        java.util.Set set38 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        java.lang.Object obj46 = defaultedMap39.put((java.lang.Object) predicate43, (java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + '4' + "'", obj36.equals('4'));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10L);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1L));
        boolean b26 = defaultedMap19.containsValue((java.lang.Object) defaultedMap23);
        boolean b27 = defaultedMap14.equals((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b33 = defaultedMap31.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b40 = defaultedMap38.equals((java.lang.Object) (-1L));
        boolean b41 = defaultedMap34.containsValue((java.lang.Object) defaultedMap38);
        boolean b42 = defaultedMap29.equals((java.lang.Object) defaultedMap38);
        java.util.Collection collection43 = defaultedMap38.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate46, predicate47);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate46);
        java.lang.Object obj50 = defaultedMap38.get((java.lang.Object) predicate46);
        java.lang.Object obj51 = defaultedMap23.remove(obj50);
        java.util.Map map52 = collections.map.DefaultedMap.decorate(map11, obj50);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + '4' + "'", obj50.equals('4'));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.entrySet();
        boolean b9 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b13 = defaultedMap11.equals((java.lang.Object) (-1L));
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) false);
        boolean b16 = defaultedMap1.equals((java.lang.Object) map15);
        java.util.Collection collection17 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) b3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i7 = defaultedMap6.size();
        java.util.Set set8 = defaultedMap6.entrySet();
        boolean b9 = defaultedMap4.equals((java.lang.Object) defaultedMap6);
        java.util.Set set10 = defaultedMap4.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i13 = defaultedMap12.size();
        java.util.Set set14 = defaultedMap12.keySet();
        java.util.Set set15 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) set15);
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) (byte) 100, (java.lang.Object) defaultedMap16);
        java.util.Collection collection18 = defaultedMap16.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i3 = defaultedMap2.size();
        java.util.Set set4 = defaultedMap2.keySet();
        java.util.Set set5 = defaultedMap2.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) set5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Collection collection10 = defaultedMap1.values();
        boolean b11 = defaultedMap1.isEmpty();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + '4' + "'", obj9.equals('4'));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        boolean b11 = defaultedMap1.isEmpty();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b3 = defaultedMap1.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b10 = defaultedMap8.equals((java.lang.Object) (-1L));
        boolean b11 = defaultedMap4.containsValue((java.lang.Object) defaultedMap8);
        defaultedMap8.clear();
        boolean b13 = defaultedMap8.isEmpty();
        java.util.Set set14 = defaultedMap8.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '4');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) "hi!", (java.lang.Object) (short) 100);
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b11 = defaultedMap9.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b18 = defaultedMap16.equals((java.lang.Object) (-1L));
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b25 = defaultedMap23.equals((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (-1L));
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '4');
        boolean b32 = defaultedMap30.equals((java.lang.Object) (-1L));
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) defaultedMap30);
        boolean b34 = defaultedMap26.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap26);
        java.util.Set set36 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Object obj44 = defaultedMap42.get(obj43);
        java.lang.String str45 = defaultedMap42.toString();
        boolean b46 = defaultedMap42.isEmpty();
        java.util.Set set47 = defaultedMap42.keySet();
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + '4' + "'", obj48.equals('4'));
    }
}

