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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap16);
        boolean b19 = defaultedMap11.containsValue((java.lang.Object) 1);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        int i9 = defaultedMap6.size();
        java.util.Collection collection10 = defaultedMap6.values();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) predicateUtils13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        int i18 = defaultedMap17.size();
        java.util.Map map19 = collections.map.DefaultedMap.decorate(map15, (java.lang.Object) i18);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate(map19, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        boolean b13 = defaultedMap1.equals((java.lang.Object) map12);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b16 = defaultedMap6.equals((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0L);
        java.util.Collection collection12 = defaultedMap7.values();
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap15.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.util.Collection collection24 = defaultedMap21.values();
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b26 = defaultedMap7.containsValue((java.lang.Object) defaultedMap21);
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0L);
        java.util.Collection collection12 = defaultedMap7.values();
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap15.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.util.Collection collection24 = defaultedMap21.values();
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        boolean b26 = defaultedMap7.containsValue((java.lang.Object) defaultedMap21);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap21.equals(obj27);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b16 = defaultedMap6.equals((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Collection collection20 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        int i16 = defaultedMap13.size();
        java.util.Collection collection17 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) predicateUtils20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap24.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        java.util.Set set36 = defaultedMap35.keySet();
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) defaultedMap35);
        boolean b38 = defaultedMap1.equals(obj37);
        boolean b39 = defaultedMap1.isEmpty();
        java.util.Collection collection40 = defaultedMap1.values();
        collections.Factory factory41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b16 = defaultedMap6.equals((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        int i18 = defaultedMap6.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        int i9 = defaultedMap6.size();
        java.util.Collection collection10 = defaultedMap6.values();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) predicateUtils13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap17.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        java.util.Set set31 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap1.get(obj33);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 0);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate18, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate13, predicate19);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj23 = defaultedMap9.remove((java.lang.Object) predicate22);
        boolean b24 = defaultedMap1.equals(obj23);
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 0);
        java.util.Collection collection18 = defaultedMap15.values();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate25);
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate25);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate19);
        defaultedMap1.clear();
        java.util.Set set30 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        int i13 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 0);
        int i18 = defaultedMap15.size();
        java.util.Collection collection19 = defaultedMap15.values();
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) predicateUtils22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicateUtils22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b36 = defaultedMap26.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        java.util.Set set38 = defaultedMap37.keySet();
        java.lang.Object obj39 = defaultedMap10.get((java.lang.Object) defaultedMap37);
        java.util.Collection collection40 = defaultedMap10.values();
        java.lang.Object obj41 = defaultedMap6.put((java.lang.Object) false, (java.lang.Object) defaultedMap10);
        int i42 = defaultedMap10.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0L);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b32 = defaultedMap22.equals((java.lang.Object) 100.0f);
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap20.remove(obj35);
        java.util.Collection collection37 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate42, predicate43);
        boolean b46 = defaultedMap39.containsKey((java.lang.Object) 100);
        java.util.Set set47 = defaultedMap39.keySet();
        java.lang.Object obj48 = defaultedMap1.put((java.lang.Object) collection37, (java.lang.Object) set47);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        java.util.Collection collection16 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) defaultedMap21);
        java.util.Set set28 = defaultedMap21.keySet();
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) set28);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b19 = defaultedMap9.equals((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) b19);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        int i14 = defaultedMap13.size();
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) i14);
        java.lang.String str16 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (byte) 10);
        java.lang.Object obj14 = new java.lang.Object();
        boolean b15 = defaultedMap11.equals(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        boolean b24 = defaultedMap17.containsKey((java.lang.Object) 100);
        java.lang.Object obj25 = defaultedMap11.remove((java.lang.Object) 100);
        java.util.Collection collection26 = defaultedMap11.values();
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        int i9 = defaultedMap6.size();
        java.util.Collection collection10 = defaultedMap6.values();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) predicateUtils13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap17.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        java.util.Set set31 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.Factory factory33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) 100);
        java.util.Collection collection16 = defaultedMap1.values();
        int i17 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(i17 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Map map12 = null;
        try {
            defaultedMap1.putAll(map12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) defaultedMap13);
        java.util.Set set20 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        int i30 = defaultedMap27.size();
        java.util.Collection collection31 = defaultedMap27.values();
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap27.remove((java.lang.Object) predicateUtils34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicateUtils34);
        java.util.Set set37 = defaultedMap22.keySet();
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap22);
        defaultedMap5.clear();
        boolean b40 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 0);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.lang.Object obj20 = defaultedMap6.get((java.lang.Object) defaultedMap14);
        java.util.Set set21 = defaultedMap14.keySet();
        boolean b23 = defaultedMap14.equals((java.lang.Object) '#');
        boolean b24 = defaultedMap14.isEmpty();
        java.util.Set set25 = defaultedMap14.entrySet();
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) set25);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b21 = defaultedMap11.equals((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap9.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap9.remove(obj24);
        java.util.Collection collection26 = defaultedMap9.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj35 = defaultedMap21.remove((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0);
        int i40 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        int i45 = defaultedMap42.size();
        java.util.Collection collection46 = defaultedMap42.values();
        java.lang.Object obj48 = defaultedMap42.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        java.lang.Object obj50 = defaultedMap42.remove((java.lang.Object) predicateUtils49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicateUtils49);
        java.util.Set set52 = defaultedMap37.keySet();
        boolean b53 = defaultedMap21.containsKey((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = new java.lang.Object();
        boolean b59 = defaultedMap55.equals(obj58);
        java.lang.Object obj60 = defaultedMap1.put((java.lang.Object) b53, obj58);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) 0);
        int i68 = defaultedMap65.size();
        java.util.Collection collection69 = defaultedMap65.values();
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) 100.0f);
        java.util.Set set72 = defaultedMap65.keySet();
        java.lang.Object obj73 = defaultedMap63.remove((java.lang.Object) defaultedMap65);
        boolean b74 = defaultedMap1.equals((java.lang.Object) defaultedMap65);
        boolean b75 = defaultedMap65.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 0L);
        java.util.Collection collection16 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 0);
        java.util.Collection collection28 = defaultedMap25.values();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 0);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate22, predicate29);
        java.lang.Object obj39 = defaultedMap3.get((java.lang.Object) predicate22);
        collections.Transformer transformer40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.util.Set set3 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b25 = defaultedMap15.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        int i34 = defaultedMap15.size();
        int i35 = defaultedMap15.size();
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) i35);
        java.util.Collection collection37 = defaultedMap1.values();
        java.util.Set set38 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap3.equals(obj6);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) 100);
        java.util.Set set18 = defaultedMap10.keySet();
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj13 = defaultedMap8.get((java.lang.Object) true);
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = new java.lang.Object();
        boolean b20 = defaultedMap16.equals(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate25, predicate26);
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100);
        java.lang.Object obj30 = defaultedMap16.remove((java.lang.Object) 100);
        java.lang.String str31 = defaultedMap16.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) 0L);
        java.util.Collection collection39 = defaultedMap34.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 0);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 0);
        java.util.Collection collection51 = defaultedMap48.values();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) 0);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate52, predicate58);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate45, predicate52);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) 0);
        java.util.Collection collection66 = defaultedMap63.values();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate52, predicate67);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap17.remove(obj32);
        java.util.Collection collection34 = defaultedMap17.values();
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) 0);
        int i37 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) 100);
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        int i13 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 0);
        int i18 = defaultedMap15.size();
        java.util.Collection collection19 = defaultedMap15.values();
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils22 = new collections.PredicateUtils();
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) predicateUtils22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) predicateUtils22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap30.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b36 = defaultedMap26.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b36);
        java.util.Set set38 = defaultedMap37.keySet();
        java.lang.Object obj39 = defaultedMap10.get((java.lang.Object) defaultedMap37);
        java.util.Collection collection40 = defaultedMap10.values();
        java.lang.Object obj41 = defaultedMap6.put((java.lang.Object) false, (java.lang.Object) defaultedMap10);
        boolean b42 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 0);
        int i47 = defaultedMap44.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 0);
        int i52 = defaultedMap49.size();
        java.util.Collection collection53 = defaultedMap49.values();
        java.lang.Object obj55 = defaultedMap49.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils56 = new collections.PredicateUtils();
        java.lang.Object obj57 = defaultedMap49.remove((java.lang.Object) predicateUtils56);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap44, (java.lang.Object) predicateUtils56);
        java.util.Set set59 = defaultedMap44.keySet();
        java.lang.Object obj60 = defaultedMap6.remove((java.lang.Object) set59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 0);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate65, predicate66);
        boolean b69 = defaultedMap62.containsKey((java.lang.Object) 100);
        java.util.Set set70 = defaultedMap62.keySet();
        java.util.Set set71 = defaultedMap62.entrySet();
        java.lang.Object obj72 = defaultedMap6.get((java.lang.Object) defaultedMap62);
        java.util.Collection collection73 = defaultedMap6.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0L + "'", obj55.equals(0L));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0L + "'", obj64.equals(0L));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0L + "'", obj72.equals(0L));
        org.junit.Assert.assertNotNull(collection73);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 0L);
        java.util.Collection collection22 = defaultedMap17.values();
        boolean b23 = defaultedMap11.equals((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap11);
        boolean b25 = defaultedMap1.equals((java.lang.Object) defaultedMap24);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '#');
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 0L);
        java.util.Collection collection16 = defaultedMap11.values();
        java.util.Collection collection17 = defaultedMap11.values();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap11);
        java.util.Collection collection19 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj14 = defaultedMap7.put((java.lang.Object) (byte) 1, (java.lang.Object) 0L);
        boolean b15 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        boolean b16 = defaultedMap9.isEmpty();
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        int i20 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        java.util.Collection collection26 = defaultedMap22.values();
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) predicateUtils29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicateUtils29);
        java.util.Set set32 = defaultedMap17.keySet();
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        int i34 = defaultedMap17.size();
        int i35 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) '#');
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) b39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = new java.lang.Object();
        boolean b48 = defaultedMap44.equals(obj47);
        boolean b49 = defaultedMap42.containsValue((java.lang.Object) defaultedMap44);
        boolean b50 = defaultedMap17.containsValue((java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) 0L);
        java.util.Collection collection57 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap52);
        boolean b59 = defaultedMap17.equals((java.lang.Object) defaultedMap58);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b59 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        int i20 = defaultedMap9.size();
        java.util.Set set21 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0);
        java.util.Collection collection26 = defaultedMap23.values();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate33);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj37 = defaultedMap23.remove((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap45.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b51 = defaultedMap41.equals((java.lang.Object) 100.0f);
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.lang.Object obj54 = null;
        java.lang.Object obj55 = defaultedMap39.remove(obj54);
        java.util.Collection collection56 = defaultedMap39.values();
        java.lang.Object obj58 = defaultedMap23.put((java.lang.Object) defaultedMap39, (java.lang.Object) 0);
        defaultedMap9.putAll((java.util.Map) defaultedMap39);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b16 = defaultedMap6.equals((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        int i9 = defaultedMap6.size();
        java.util.Set set10 = defaultedMap6.keySet();
        java.lang.String str11 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        java.util.Collection collection16 = defaultedMap13.values();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate22, predicate23);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        int i30 = defaultedMap27.size();
        java.util.Set set31 = defaultedMap27.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate23, predicate32);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) predicate32);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        int i20 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b37 = defaultedMap27.equals((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        java.lang.Object obj40 = defaultedMap9.get((java.lang.Object) defaultedMap22);
        collections.Transformer transformer41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) defaultedMap13);
        java.util.Set set20 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        int i30 = defaultedMap27.size();
        java.util.Collection collection31 = defaultedMap27.values();
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap27.remove((java.lang.Object) predicateUtils34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicateUtils34);
        java.util.Set set37 = defaultedMap22.keySet();
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap22);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        java.util.Collection collection11 = defaultedMap8.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 0);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate18);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj22 = defaultedMap8.remove((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0);
        int i27 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        int i32 = defaultedMap29.size();
        java.util.Collection collection33 = defaultedMap29.values();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap29.remove((java.lang.Object) predicateUtils36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicateUtils36);
        java.util.Set set39 = defaultedMap24.keySet();
        boolean b40 = defaultedMap8.containsKey((java.lang.Object) defaultedMap24);
        int i41 = defaultedMap24.size();
        java.lang.Object obj42 = defaultedMap1.get((java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        int i9 = defaultedMap6.size();
        java.util.Collection collection10 = defaultedMap6.values();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) predicateUtils13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils13);
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) (byte) 10);
        java.util.Set set22 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        java.lang.Object obj32 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) 0L);
        java.util.Collection collection40 = defaultedMap35.values();
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) defaultedMap35);
        defaultedMap19.putAll((java.util.Map) defaultedMap35);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap35);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '#');
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        java.util.Collection collection7 = defaultedMap1.values();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap1.containsKey(obj8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        int i20 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        java.util.Collection collection26 = defaultedMap22.values();
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) predicateUtils29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicateUtils29);
        java.util.Set set32 = defaultedMap17.keySet();
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap39.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b45 = defaultedMap35.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate50, predicate51);
        java.lang.Object obj53 = defaultedMap35.get((java.lang.Object) defaultedMap47);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) 0);
        java.util.Collection collection58 = defaultedMap55.values();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj63 = defaultedMap61.get((java.lang.Object) 0);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate59, predicate65);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj69 = defaultedMap55.remove((java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 0);
        int i74 = defaultedMap71.size();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj78 = defaultedMap76.get((java.lang.Object) 0);
        int i79 = defaultedMap76.size();
        java.util.Collection collection80 = defaultedMap76.values();
        java.lang.Object obj82 = defaultedMap76.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils83 = new collections.PredicateUtils();
        java.lang.Object obj84 = defaultedMap76.remove((java.lang.Object) predicateUtils83);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) predicateUtils83);
        java.util.Set set86 = defaultedMap71.keySet();
        boolean b87 = defaultedMap55.containsKey((java.lang.Object) defaultedMap71);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj91 = defaultedMap89.get((java.lang.Object) (byte) 10);
        java.lang.Object obj92 = new java.lang.Object();
        boolean b93 = defaultedMap89.equals(obj92);
        java.lang.Object obj94 = defaultedMap35.put((java.lang.Object) b87, obj92);
        defaultedMap35.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0L + "'", obj63.equals(0L));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0L + "'", obj78.equals(0L));
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0L + "'", obj82.equals(0L));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 0L + "'", obj91.equals(0L));
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        java.util.Collection collection11 = defaultedMap8.values();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 0);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate12, predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        java.util.Set set26 = defaultedMap22.keySet();
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate27);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b16 = defaultedMap6.equals((java.lang.Object) 100.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        java.util.Set set18 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap17.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b23 = defaultedMap13.equals((java.lang.Object) 100.0f);
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.util.Set set26 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) 0L);
        java.util.Collection collection33 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 0);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        java.util.Collection collection45 = defaultedMap42.values();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 0);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate46, predicate52);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate39, predicate46);
        defaultedMap28.clear();
        boolean b57 = defaultedMap11.containsKey((java.lang.Object) defaultedMap28);
        boolean b58 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        int i20 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        java.util.Collection collection26 = defaultedMap22.values();
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) predicateUtils29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicateUtils29);
        java.util.Set set32 = defaultedMap17.keySet();
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        int i34 = defaultedMap17.size();
        int i35 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b39 = defaultedMap37.equals((java.lang.Object) '#');
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) b39);
        java.util.Collection collection41 = defaultedMap17.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap3.equals(obj6);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        int i23 = defaultedMap20.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 0);
        int i28 = defaultedMap25.size();
        java.util.Collection collection29 = defaultedMap25.values();
        java.lang.Object obj31 = defaultedMap25.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils32 = new collections.PredicateUtils();
        java.lang.Object obj33 = defaultedMap25.remove((java.lang.Object) predicateUtils32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) predicateUtils32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap40.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b46 = defaultedMap36.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) b46);
        java.util.Set set48 = defaultedMap47.keySet();
        java.lang.Object obj49 = defaultedMap20.get((java.lang.Object) defaultedMap47);
        java.util.Collection collection50 = defaultedMap20.values();
        java.lang.Object obj51 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) defaultedMap20);
        boolean b52 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) 0);
        int i57 = defaultedMap54.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj61 = defaultedMap59.get((java.lang.Object) 0);
        int i62 = defaultedMap59.size();
        java.util.Collection collection63 = defaultedMap59.values();
        java.lang.Object obj65 = defaultedMap59.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils66 = new collections.PredicateUtils();
        java.lang.Object obj67 = defaultedMap59.remove((java.lang.Object) predicateUtils66);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) predicateUtils66);
        java.util.Set set69 = defaultedMap54.keySet();
        java.lang.Object obj70 = defaultedMap16.remove((java.lang.Object) set69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) 0);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate75, predicate76);
        boolean b79 = defaultedMap72.containsKey((java.lang.Object) 100);
        java.util.Set set80 = defaultedMap72.keySet();
        java.util.Set set81 = defaultedMap72.entrySet();
        java.lang.Object obj82 = defaultedMap16.get((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj86 = defaultedMap84.get((java.lang.Object) 0);
        int i87 = defaultedMap84.size();
        java.util.Set set88 = defaultedMap84.keySet();
        defaultedMap84.clear();
        boolean b90 = defaultedMap72.containsValue((java.lang.Object) defaultedMap84);
        java.util.Set set91 = defaultedMap84.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap84);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0L + "'", obj22.equals(0L));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0L + "'", obj61.equals(0L));
        org.junit.Assert.assertTrue(i62 == 0);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0L + "'", obj82.equals(0L));
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 0L + "'", obj86.equals(0L));
        org.junit.Assert.assertTrue(i87 == 0);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(set91);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 0L);
        java.util.Collection collection10 = defaultedMap5.values();
        java.util.Collection collection11 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        java.util.Collection collection16 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate25);
        java.lang.Object obj27 = defaultedMap13.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj28 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) 0L);
        java.util.Collection collection35 = defaultedMap30.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 0);
        java.util.Collection collection47 = defaultedMap44.values();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 0);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate48, predicate54);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate41, predicate48);
        defaultedMap13.putAll(map57);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        int i20 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        java.util.Collection collection26 = defaultedMap22.values();
        java.lang.Object obj28 = defaultedMap22.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils29 = new collections.PredicateUtils();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) predicateUtils29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) predicateUtils29);
        java.util.Set set32 = defaultedMap17.keySet();
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        boolean b34 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0);
        int i6 = defaultedMap3.size();
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj35 = defaultedMap21.remove((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0);
        int i40 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        int i45 = defaultedMap42.size();
        java.util.Collection collection46 = defaultedMap42.values();
        java.lang.Object obj48 = defaultedMap42.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        java.lang.Object obj50 = defaultedMap42.remove((java.lang.Object) predicateUtils49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicateUtils49);
        java.util.Set set52 = defaultedMap37.keySet();
        boolean b53 = defaultedMap21.containsKey((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = new java.lang.Object();
        boolean b59 = defaultedMap55.equals(obj58);
        java.lang.Object obj60 = defaultedMap1.put((java.lang.Object) b53, obj58);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) 0);
        int i68 = defaultedMap65.size();
        java.util.Collection collection69 = defaultedMap65.values();
        java.lang.Object obj71 = defaultedMap65.get((java.lang.Object) 100.0f);
        java.util.Set set72 = defaultedMap65.keySet();
        java.lang.Object obj73 = defaultedMap63.remove((java.lang.Object) defaultedMap65);
        boolean b74 = defaultedMap1.equals((java.lang.Object) defaultedMap65);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0L + "'", obj71.equals(0L));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        int i12 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b24 = defaultedMap14.equals((java.lang.Object) 100.0f);
        defaultedMap9.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        int i30 = defaultedMap27.size();
        java.util.Set set31 = defaultedMap27.keySet();
        java.lang.String str32 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0);
        java.util.Collection collection37 = defaultedMap34.values();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate38, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 0);
        int i51 = defaultedMap48.size();
        java.util.Set set52 = defaultedMap48.keySet();
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate44, predicate53);
        java.lang.Object obj56 = defaultedMap9.get((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 0);
        int i61 = defaultedMap58.size();
        java.util.Set set62 = defaultedMap58.keySet();
        java.lang.String str63 = defaultedMap58.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) 0);
        java.util.Collection collection68 = defaultedMap65.values();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 0);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate74, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate69, predicate75);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj81 = defaultedMap79.get((java.lang.Object) 0);
        int i82 = defaultedMap79.size();
        java.util.Set set83 = defaultedMap79.keySet();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate75, predicate84);
        java.util.Map map87 = collections.map.PredicatedMap.decorate(map7, predicate44, predicate75);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) predicate44);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0L + "'", obj60.equals(0L));
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0L + "'", obj81.equals(0L));
        org.junit.Assert.assertTrue(i82 == 0);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate11);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap19.equals((java.lang.Object) 100.0f);
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap17.remove(obj32);
        java.util.Collection collection34 = defaultedMap17.values();
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 0);
        int i41 = defaultedMap38.size();
        java.util.Set set42 = defaultedMap38.keySet();
        defaultedMap38.clear();
        boolean b44 = defaultedMap17.containsKey((java.lang.Object) defaultedMap38);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        java.util.Set set20 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 0L);
        java.util.Collection collection27 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0);
        java.util.Collection collection39 = defaultedMap36.values();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate33, predicate40);
        java.lang.Object obj50 = defaultedMap9.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) (byte) 10);
        java.lang.Object obj55 = new java.lang.Object();
        boolean b56 = defaultedMap52.equals(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 0);
        java.util.Collection collection61 = defaultedMap58.values();
        defaultedMap52.putAll((java.util.Map) defaultedMap58);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) 0);
        java.util.Collection collection67 = defaultedMap64.values();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) 0);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate68, predicate74);
        java.lang.Object obj77 = defaultedMap52.remove((java.lang.Object) predicate74);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj81 = defaultedMap79.get((java.lang.Object) 0);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate82, predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate74, predicate83);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0L + "'", obj60.equals(0L));
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0L + "'", obj66.equals(0L));
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0L + "'", obj72.equals(0L));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0L + "'", obj81.equals(0L));
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        int i9 = defaultedMap6.size();
        java.util.Collection collection10 = defaultedMap6.values();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) predicateUtils13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) 10);
        java.lang.Object obj20 = new java.lang.Object();
        boolean b21 = defaultedMap17.equals(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate26, predicate27);
        boolean b30 = defaultedMap23.containsKey((java.lang.Object) 100);
        java.lang.Object obj31 = defaultedMap17.remove((java.lang.Object) 100);
        java.util.Collection collection32 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        int i35 = defaultedMap17.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L + "'", obj6.equals(0L));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        int i16 = defaultedMap13.size();
        java.util.Collection collection17 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) predicateUtils20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap24.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        java.util.Set set36 = defaultedMap35.keySet();
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) defaultedMap35);
        boolean b38 = defaultedMap1.equals(obj37);
        boolean b39 = defaultedMap1.isEmpty();
        collections.Transformer transformer40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate11, predicate12);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) defaultedMap8);
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 0L);
        java.util.Collection collection22 = defaultedMap17.values();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap17);
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        java.lang.String str25 = defaultedMap17.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0L);
        java.util.Collection collection12 = defaultedMap7.values();
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap16.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        java.util.Set set28 = defaultedMap27.keySet();
        java.util.Set set29 = defaultedMap27.entrySet();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set29);
        java.util.Set set31 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0L + "'", obj22.equals(0L));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        java.util.Set set20 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 0L);
        java.util.Collection collection27 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0);
        java.util.Collection collection39 = defaultedMap36.values();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate33, predicate40);
        java.lang.Object obj50 = defaultedMap9.get((java.lang.Object) defaultedMap22);
        defaultedMap22.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 0L);
        java.util.Collection collection17 = defaultedMap12.values();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap12);
        collections.Transformer transformer19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap19.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b25 = defaultedMap15.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        java.lang.Object obj33 = defaultedMap15.get((java.lang.Object) defaultedMap27);
        int i34 = defaultedMap15.size();
        int i35 = defaultedMap15.size();
        java.lang.Object obj36 = defaultedMap1.put((java.lang.Object) 100L, (java.lang.Object) i35);
        java.util.Collection collection37 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap3.equals((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        boolean b21 = defaultedMap1.containsKey((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        java.util.Set set25 = defaultedMap18.keySet();
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        java.util.Collection collection31 = defaultedMap28.values();
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0);
        int i37 = defaultedMap34.size();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 0);
        int i42 = defaultedMap39.size();
        java.util.Collection collection43 = defaultedMap39.values();
        java.lang.Object obj45 = defaultedMap39.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils46 = new collections.PredicateUtils();
        java.lang.Object obj47 = defaultedMap39.remove((java.lang.Object) predicateUtils46);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicateUtils46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap54.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b60 = defaultedMap50.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) b60);
        java.util.Set set62 = defaultedMap61.keySet();
        java.lang.Object obj63 = defaultedMap34.get((java.lang.Object) defaultedMap61);
        java.util.Set set64 = defaultedMap34.keySet();
        java.lang.Object obj65 = defaultedMap28.remove((java.lang.Object) set64);
        boolean b66 = defaultedMap1.containsValue((java.lang.Object) set64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) (byte) 10);
        java.lang.Object obj73 = new java.lang.Object();
        boolean b74 = defaultedMap70.equals(obj73);
        boolean b75 = defaultedMap68.containsValue((java.lang.Object) defaultedMap70);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj79 = defaultedMap77.get((java.lang.Object) 0);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate80, predicate81);
        boolean b84 = defaultedMap77.containsKey((java.lang.Object) 100);
        java.util.Set set85 = defaultedMap77.keySet();
        java.lang.Object obj86 = defaultedMap70.remove((java.lang.Object) defaultedMap77);
        java.lang.Object obj88 = defaultedMap77.get((java.lang.Object) (-1));
        java.util.Set set89 = defaultedMap77.keySet();
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap77);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0L + "'", obj36.equals(0L));
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0L + "'", obj41.equals(0L));
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0L + "'", obj45.equals(0L));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0L + "'", obj63.equals(0L));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0L + "'", obj72.equals(0L));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0L + "'", obj79.equals(0L));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0L + "'", obj88.equals(0L));
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) 100);
        java.util.Set set15 = defaultedMap7.keySet();
        java.util.Set set16 = defaultedMap7.entrySet();
        int i17 = defaultedMap7.size();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) i17);
        java.lang.String str19 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) (byte) 10);
        java.lang.Object obj12 = new java.lang.Object();
        boolean b13 = defaultedMap9.equals(obj12);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) defaultedMap9);
        boolean b15 = defaultedMap1.containsValue((java.lang.Object) b14);
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 0);
        java.util.Collection collection18 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0);
        int i27 = defaultedMap24.size();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        int i32 = defaultedMap29.size();
        java.util.Collection collection33 = defaultedMap29.values();
        java.lang.Object obj35 = defaultedMap29.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils36 = new collections.PredicateUtils();
        java.lang.Object obj37 = defaultedMap29.remove((java.lang.Object) predicateUtils36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) predicateUtils36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap44.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b50 = defaultedMap40.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) b50);
        java.util.Set set52 = defaultedMap51.keySet();
        java.lang.Object obj53 = defaultedMap24.get((java.lang.Object) defaultedMap51);
        java.util.Collection collection54 = defaultedMap24.values();
        java.lang.Object obj55 = defaultedMap20.put((java.lang.Object) false, (java.lang.Object) defaultedMap24);
        defaultedMap12.putAll((java.util.Map) defaultedMap20);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Collection collection9 = defaultedMap1.values();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate14, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate15);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj19 = defaultedMap5.remove((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        int i24 = defaultedMap21.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0);
        int i29 = defaultedMap26.size();
        java.util.Collection collection30 = defaultedMap26.values();
        java.lang.Object obj32 = defaultedMap26.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils33 = new collections.PredicateUtils();
        java.lang.Object obj34 = defaultedMap26.remove((java.lang.Object) predicateUtils33);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) predicateUtils33);
        java.util.Set set36 = defaultedMap21.keySet();
        boolean b37 = defaultedMap5.containsKey((java.lang.Object) defaultedMap21);
        int i38 = defaultedMap21.size();
        int i39 = defaultedMap21.size();
        java.util.Set set40 = defaultedMap21.keySet();
        boolean b41 = defaultedMap1.containsKey((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0L + "'", obj32.equals(0L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b14 = defaultedMap12.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 0L);
        java.util.Collection collection12 = defaultedMap7.values();
        boolean b13 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        int i20 = defaultedMap9.size();
        java.util.Set set21 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) 10);
        java.lang.Object obj26 = new java.lang.Object();
        boolean b27 = defaultedMap23.equals(obj26);
        defaultedMap9.putAll((java.util.Map) defaultedMap23);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate21, predicate22);
        java.lang.Object obj24 = defaultedMap10.get((java.lang.Object) defaultedMap18);
        java.util.Set set25 = defaultedMap10.keySet();
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) set25);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap21.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 0);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate37);
        java.lang.Object obj39 = defaultedMap21.get((java.lang.Object) defaultedMap33);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 0);
        java.util.Collection collection44 = defaultedMap41.values();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate45, predicate51);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj55 = defaultedMap41.remove((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 0);
        int i60 = defaultedMap57.size();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 0);
        int i65 = defaultedMap62.size();
        java.util.Collection collection66 = defaultedMap62.values();
        java.lang.Object obj68 = defaultedMap62.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils69 = new collections.PredicateUtils();
        java.lang.Object obj70 = defaultedMap62.remove((java.lang.Object) predicateUtils69);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) predicateUtils69);
        java.util.Set set72 = defaultedMap57.keySet();
        boolean b73 = defaultedMap41.containsKey((java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj77 = defaultedMap75.get((java.lang.Object) (byte) 10);
        java.lang.Object obj78 = new java.lang.Object();
        boolean b79 = defaultedMap75.equals(obj78);
        java.lang.Object obj80 = defaultedMap21.put((java.lang.Object) b73, obj78);
        java.lang.Object obj81 = defaultedMap9.get((java.lang.Object) b73);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0L + "'", obj59.equals(0L));
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0L + "'", obj64.equals(0L));
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0L + "'", obj68.equals(0L));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0L + "'", obj77.equals(0L));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0L + "'", obj81.equals(0L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) defaultedMap13);
        java.util.Set set20 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        int i30 = defaultedMap27.size();
        java.util.Collection collection31 = defaultedMap27.values();
        java.lang.Object obj33 = defaultedMap27.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils34 = new collections.PredicateUtils();
        java.lang.Object obj35 = defaultedMap27.remove((java.lang.Object) predicateUtils34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) predicateUtils34);
        java.util.Set set37 = defaultedMap22.keySet();
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) defaultedMap5, (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0);
        int i50 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 0);
        int i55 = defaultedMap52.size();
        java.util.Collection collection56 = defaultedMap52.values();
        java.lang.Object obj58 = defaultedMap52.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils59 = new collections.PredicateUtils();
        java.lang.Object obj60 = defaultedMap52.remove((java.lang.Object) predicateUtils59);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) predicateUtils59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) 0);
        java.lang.Object obj72 = defaultedMap67.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b73 = defaultedMap63.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) b73);
        java.util.Set set75 = defaultedMap74.keySet();
        java.lang.Object obj76 = defaultedMap47.get((java.lang.Object) defaultedMap74);
        boolean b77 = defaultedMap40.equals(obj76);
        boolean b78 = defaultedMap40.isEmpty();
        java.util.Collection collection79 = defaultedMap40.values();
        int i80 = defaultedMap40.size();
        java.lang.Object obj81 = defaultedMap1.remove((java.lang.Object) i80);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0L + "'", obj42.equals(0L));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0L + "'", obj54.equals(0L));
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0L + "'", obj65.equals(0L));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0L + "'", obj69.equals(0L));
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0L + "'", obj76.equals(0L));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.util.Collection collection24 = defaultedMap21.values();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate25, predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj35 = defaultedMap21.remove((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0);
        int i40 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        int i45 = defaultedMap42.size();
        java.util.Collection collection46 = defaultedMap42.values();
        java.lang.Object obj48 = defaultedMap42.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils49 = new collections.PredicateUtils();
        java.lang.Object obj50 = defaultedMap42.remove((java.lang.Object) predicateUtils49);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) predicateUtils49);
        java.util.Set set52 = defaultedMap37.keySet();
        boolean b53 = defaultedMap21.containsKey((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = new java.lang.Object();
        boolean b59 = defaultedMap55.equals(obj58);
        java.lang.Object obj60 = defaultedMap1.put((java.lang.Object) b53, obj58);
        defaultedMap1.clear();
        java.util.Set set62 = defaultedMap1.keySet();
        java.util.Set set63 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0L + "'", obj48.equals(0L));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        java.util.Set set20 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 0L);
        java.util.Collection collection27 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0);
        java.util.Collection collection39 = defaultedMap36.values();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate45, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate40, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate33, predicate40);
        java.lang.Object obj50 = defaultedMap9.get((java.lang.Object) defaultedMap22);
        java.util.Set set51 = defaultedMap22.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) 100);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) str10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        int i16 = defaultedMap13.size();
        java.util.Collection collection17 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b23 = defaultedMap21.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 0);
        java.util.Collection collection28 = defaultedMap25.values();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 0);
        int i36 = defaultedMap33.size();
        java.util.Set set37 = defaultedMap33.keySet();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate38);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0);
        int i45 = defaultedMap42.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap51.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b57 = defaultedMap47.equals((java.lang.Object) 100.0f);
        defaultedMap42.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj62 = defaultedMap60.get((java.lang.Object) 0);
        int i63 = defaultedMap60.size();
        java.util.Set set64 = defaultedMap60.keySet();
        java.lang.String str65 = defaultedMap60.toString();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) 0);
        java.util.Collection collection70 = defaultedMap67.values();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj75 = defaultedMap73.get((java.lang.Object) 0);
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate76, predicate77);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate71, predicate77);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj83 = defaultedMap81.get((java.lang.Object) 0);
        int i84 = defaultedMap81.size();
        java.util.Set set85 = defaultedMap81.keySet();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate77, predicate86);
        java.lang.Object obj89 = defaultedMap42.get((java.lang.Object) predicate77);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate38, predicate77);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0L + "'", obj62.equals(0L));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0L + "'", obj69.equals(0L));
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 0L + "'", obj75.equals(0L));
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0L + "'", obj83.equals(0L));
        org.junit.Assert.assertTrue(i84 == 0);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 0L + "'", obj89.equals(0L));
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.util.Collection collection24 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        java.lang.Object obj35 = defaultedMap21.get((java.lang.Object) defaultedMap29);
        java.util.Set set36 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) set36);
        defaultedMap1.putAll((java.util.Map) defaultedMap37);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Collection collection20 = defaultedMap13.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.equals(obj10);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0);
        int i9 = defaultedMap6.size();
        java.util.Collection collection10 = defaultedMap6.values();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) predicateUtils13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicateUtils13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap17.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) b27);
        java.util.Set set29 = defaultedMap28.keySet();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        java.util.Collection collection31 = defaultedMap1.values();
        java.util.Set set32 = defaultedMap1.keySet();
        java.lang.String str33 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap1.remove((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0L + "'", obj8.equals(0L));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0L);
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        java.util.Set set13 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b17 = defaultedMap15.equals((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0);
        java.util.Collection collection22 = defaultedMap19.values();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0);
        int i30 = defaultedMap27.size();
        java.util.Set set31 = defaultedMap27.keySet();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate24, predicate32);
        boolean b35 = defaultedMap12.containsKey((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 0);
        java.util.Collection collection40 = defaultedMap37.values();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 0);
        java.util.Collection collection52 = defaultedMap49.values();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 0);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate60, predicate61);
        java.lang.Object obj63 = defaultedMap49.get((java.lang.Object) defaultedMap57);
        java.util.Set set64 = defaultedMap49.keySet();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) 0);
        int i69 = defaultedMap66.size();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 0);
        int i74 = defaultedMap71.size();
        java.util.Collection collection75 = defaultedMap71.values();
        java.lang.Object obj77 = defaultedMap71.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils78 = new collections.PredicateUtils();
        java.lang.Object obj79 = defaultedMap71.remove((java.lang.Object) predicateUtils78);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, (java.lang.Object) predicateUtils78);
        java.util.Set set81 = defaultedMap66.keySet();
        java.lang.Object obj82 = defaultedMap45.put((java.lang.Object) defaultedMap49, (java.lang.Object) defaultedMap66);
        collections.Predicate predicate83 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj87 = defaultedMap85.get((java.lang.Object) 0);
        java.util.Collection collection88 = defaultedMap85.values();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj93 = defaultedMap91.get((java.lang.Object) 0);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap91, predicate94, predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate89, predicate95);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate83, predicate89);
        java.util.Map map99 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate42, predicate83);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0L + "'", obj59.equals(0L));
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0L + "'", obj63.equals(0L));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0L + "'", obj68.equals(0L));
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0L + "'", obj77.equals(0L));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0L + "'", obj87.equals(0L));
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 0L + "'", obj93.equals(0L));
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (byte) 10);
        java.lang.Object obj4 = new java.lang.Object();
        boolean b5 = defaultedMap1.equals(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = defaultedMap13.equals(obj16);
        int i18 = defaultedMap13.size();
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap9.keySet();
        boolean b18 = defaultedMap9.equals((java.lang.Object) '#');
        boolean b19 = defaultedMap9.isEmpty();
        int i20 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0);
        int i25 = defaultedMap22.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b37 = defaultedMap27.equals((java.lang.Object) 100.0f);
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        java.lang.Object obj40 = defaultedMap9.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj41 = null;
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, obj41);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0L + "'", obj33.equals(0L));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) 10);
        java.lang.Object obj6 = new java.lang.Object();
        boolean b7 = defaultedMap3.equals(obj6);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0);
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) 100);
        java.util.Set set18 = defaultedMap10.keySet();
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj21 = defaultedMap10.get((java.lang.Object) (-1));
        java.util.Set set22 = defaultedMap10.entrySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b3 = defaultedMap1.equals((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap1.keySet();
        java.util.Set set5 = defaultedMap1.entrySet();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) true);
        boolean b10 = defaultedMap8.equals((java.lang.Object) '#');
        java.util.Collection collection11 = defaultedMap8.values();
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap8.containsValue(obj12);
        java.util.Collection collection14 = defaultedMap8.values();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + true + "'", obj15.equals(true));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        int i16 = defaultedMap13.size();
        java.util.Collection collection17 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) predicateUtils20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap24.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        java.util.Set set36 = defaultedMap35.keySet();
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) defaultedMap35);
        boolean b38 = defaultedMap1.equals(obj37);
        java.lang.String str39 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        java.util.Map map7 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate5, predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.String str10 = defaultedMap9.toString();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) str10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) (byte) 10);
        java.lang.Object obj18 = new java.lang.Object();
        boolean b19 = defaultedMap15.equals(obj18);
        boolean b20 = defaultedMap13.containsValue((java.lang.Object) defaultedMap15);
        defaultedMap13.clear();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap9.get((java.lang.Object) defaultedMap17);
        java.util.Set set24 = defaultedMap17.keySet();
        boolean b26 = defaultedMap17.equals((java.lang.Object) '#');
        boolean b27 = defaultedMap17.isEmpty();
        java.util.Set set28 = defaultedMap17.entrySet();
        boolean b29 = defaultedMap6.containsValue((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set16 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 0);
        java.util.Collection collection22 = defaultedMap19.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        int i31 = defaultedMap28.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 0);
        int i36 = defaultedMap33.size();
        java.util.Collection collection37 = defaultedMap33.values();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils40 = new collections.PredicateUtils();
        java.lang.Object obj41 = defaultedMap33.remove((java.lang.Object) predicateUtils40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) predicateUtils40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b54 = defaultedMap44.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) b54);
        java.util.Set set56 = defaultedMap55.keySet();
        java.lang.Object obj57 = defaultedMap28.get((java.lang.Object) defaultedMap55);
        java.util.Collection collection58 = defaultedMap28.values();
        java.lang.Object obj59 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) defaultedMap28);
        boolean b60 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 0);
        int i65 = defaultedMap62.size();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) 0);
        int i70 = defaultedMap67.size();
        java.util.Collection collection71 = defaultedMap67.values();
        java.lang.Object obj73 = defaultedMap67.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils74 = new collections.PredicateUtils();
        java.lang.Object obj75 = defaultedMap67.remove((java.lang.Object) predicateUtils74);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) predicateUtils74);
        java.util.Set set77 = defaultedMap62.keySet();
        java.lang.Object obj78 = defaultedMap24.remove((java.lang.Object) set77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj82 = defaultedMap80.get((java.lang.Object) 0);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate83, predicate84);
        boolean b87 = defaultedMap80.containsKey((java.lang.Object) 100);
        java.util.Set set88 = defaultedMap80.keySet();
        java.util.Set set89 = defaultedMap80.entrySet();
        java.lang.Object obj90 = defaultedMap24.get((java.lang.Object) defaultedMap80);
        int i91 = defaultedMap24.size();
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap24);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0L + "'", obj39.equals(0L));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0L + "'", obj50.equals(0L));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0L + "'", obj57.equals(0L));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0L + "'", obj64.equals(0L));
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0L + "'", obj69.equals(0L));
        org.junit.Assert.assertTrue(i70 == 0);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0L + "'", obj73.equals(0L));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0L + "'", obj82.equals(0L));
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0L + "'", obj90.equals(0L));
        org.junit.Assert.assertTrue(i91 == 1);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) 0L);
        java.util.Collection collection14 = defaultedMap9.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate19, predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0);
        java.util.Collection collection26 = defaultedMap23.values();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) 0);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate27, predicate33);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate20, predicate27);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) (byte) 10);
        java.lang.Object obj41 = new java.lang.Object();
        boolean b42 = defaultedMap38.equals(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 0);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate47, predicate48);
        boolean b51 = defaultedMap44.containsKey((java.lang.Object) 100);
        java.lang.Object obj52 = defaultedMap38.remove((java.lang.Object) 100);
        java.util.Collection collection53 = defaultedMap38.values();
        java.lang.Object obj54 = defaultedMap7.put((java.lang.Object) defaultedMap9, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) 0);
        java.util.Collection collection59 = defaultedMap56.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) defaultedMap61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) 0);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate67, predicate68);
        java.lang.Object obj70 = defaultedMap56.get((java.lang.Object) defaultedMap64);
        boolean b71 = defaultedMap64.isEmpty();
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) b71);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0L + "'", obj11.equals(0L));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0L + "'", obj31.equals(0L));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0L + "'", obj66.equals(0L));
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0L + "'", obj70.equals(0L));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 0);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 0L);
        java.util.Collection collection16 = defaultedMap11.values();
        java.util.Collection collection17 = defaultedMap11.values();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) defaultedMap11);
        java.util.Collection collection19 = defaultedMap11.values();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        int i4 = defaultedMap1.size();
        java.util.Collection collection5 = defaultedMap1.values();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 100.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b20 = defaultedMap10.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) b20);
        java.util.Set set22 = defaultedMap21.keySet();
        java.util.Set set23 = defaultedMap21.entrySet();
        java.lang.Object obj24 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap3.equals((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.util.Set set16 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 0L);
        java.util.Collection collection23 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 0);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 0);
        java.util.Collection collection35 = defaultedMap32.values();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 0);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate36, predicate42);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate29, predicate36);
        defaultedMap18.clear();
        boolean b47 = defaultedMap1.containsKey((java.lang.Object) defaultedMap18);
        java.util.Set set48 = defaultedMap18.entrySet();
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0L + "'", obj20.equals(0L));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0L + "'", obj22.equals(0L));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 0);
        int i11 = defaultedMap8.size();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 0);
        int i16 = defaultedMap13.size();
        java.util.Collection collection17 = defaultedMap13.values();
        java.lang.Object obj19 = defaultedMap13.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils20 = new collections.PredicateUtils();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) predicateUtils20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) predicateUtils20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b34 = defaultedMap24.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) b34);
        java.util.Set set36 = defaultedMap35.keySet();
        java.lang.Object obj37 = defaultedMap8.get((java.lang.Object) defaultedMap35);
        boolean b38 = defaultedMap1.equals(obj37);
        boolean b39 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i41 = defaultedMap40.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0L + "'", obj19.equals(0L));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0L + "'", obj26.equals(0L));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0L + "'", obj30.equals(0L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0L + "'", obj37.equals(0L));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(i41 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap3.equals((java.lang.Object) 100.0f);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) 'a');
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap1.remove(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap23.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b29 = defaultedMap19.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        java.util.Set set31 = defaultedMap30.keySet();
        java.util.Set set32 = defaultedMap30.entrySet();
        defaultedMap30.clear();
        boolean b34 = defaultedMap1.containsKey((java.lang.Object) defaultedMap30);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 0);
        java.util.Collection collection39 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 0);
        int i48 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 0);
        int i53 = defaultedMap50.size();
        java.util.Collection collection54 = defaultedMap50.values();
        java.lang.Object obj56 = defaultedMap50.get((java.lang.Object) 100.0f);
        collections.PredicateUtils predicateUtils57 = new collections.PredicateUtils();
        java.lang.Object obj58 = defaultedMap50.remove((java.lang.Object) predicateUtils57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) predicateUtils57);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj63 = defaultedMap61.get((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj67 = defaultedMap65.get((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap65.put((java.lang.Object) 100.0f, (java.lang.Object) (-1.0d));
        boolean b71 = defaultedMap61.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) b71);
        java.util.Set set73 = defaultedMap72.keySet();
        java.lang.Object obj74 = defaultedMap45.get((java.lang.Object) defaultedMap72);
        java.util.Collection collection75 = defaultedMap45.values();
        java.lang.Object obj76 = defaultedMap41.put((java.lang.Object) false, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj80 = defaultedMap78.get((java.lang.Object) 0);
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) 0L);
        boolean b83 = defaultedMap78.isEmpty();
        boolean b84 = defaultedMap45.equals((java.lang.Object) defaultedMap78);
        java.lang.Object obj85 = defaultedMap1.get((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0L + "'", obj5.equals(0L));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0L + "'", obj21.equals(0L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0L + "'", obj47.equals(0L));
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0L + "'", obj56.equals(0L));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0L + "'", obj63.equals(0L));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0L + "'", obj67.equals(0L));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0L + "'", obj74.equals(0L));
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0L + "'", obj80.equals(0L));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0L + "'", obj82.equals(0L));
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 0L + "'", obj85.equals(0L));
    }
}

