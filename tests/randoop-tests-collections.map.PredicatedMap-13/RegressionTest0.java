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
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection6 = defaultedMap3.values();
        java.lang.Object obj8 = defaultedMap3.remove((java.lang.Object) "");
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) 0.0f);
        java.lang.String str20 = defaultedMap7.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        int i5 = defaultedMap1.size();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection15 = defaultedMap12.values();
        java.util.Collection collection16 = defaultedMap12.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) 0);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        collections.Transformer transformer38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 0L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 10);
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) true, (java.lang.Object) defaultedMap13);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) "");
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.Factory factory36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) 1.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        boolean b15 = defaultedMap10.equals((java.lang.Object) (byte) 0);
        boolean b17 = defaultedMap10.containsValue((java.lang.Object) (-1L));
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) (short) 0);
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) map19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) 0);
        java.util.Set set10 = defaultedMap1.keySet();
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        java.lang.Object obj12 = defaultedMap1.put((java.lang.Object) 10.0f, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        int i22 = defaultedMap19.size();
        boolean b23 = defaultedMap19.isEmpty();
        java.lang.Object obj24 = defaultedMap7.get((java.lang.Object) defaultedMap19);
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.util.Collection collection15 = defaultedMap11.values();
        boolean b17 = defaultedMap11.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap19.clear();
        java.util.Set set21 = defaultedMap19.entrySet();
        java.lang.Object obj22 = defaultedMap11.remove((java.lang.Object) set21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set21);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) "");
        defaultedMap45.clear();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate52, predicate53);
        boolean b55 = defaultedMap21.containsValue((java.lang.Object) defaultedMap45);
        java.util.Set set56 = defaultedMap45.keySet();
        int i57 = defaultedMap45.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(i57 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        java.lang.Object obj14 = defaultedMap9.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        boolean b21 = defaultedMap16.equals((java.lang.Object) (byte) 0);
        java.util.Set set22 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj28 = defaultedMap9.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap26);
        java.lang.String str29 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) (short) 0);
        java.lang.Object obj36 = null;
        java.lang.Object obj38 = defaultedMap31.put(obj36, (java.lang.Object) (short) 1);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) 100.0f);
        defaultedMap26.putAll(map40);
        java.util.Set set42 = defaultedMap26.keySet();
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) set42);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection15 = defaultedMap12.values();
        java.util.Collection collection16 = defaultedMap12.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap19.values();
        java.util.Collection collection23 = defaultedMap19.values();
        boolean b25 = defaultedMap19.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap27.clear();
        java.util.Set set29 = defaultedMap27.entrySet();
        java.lang.Object obj30 = defaultedMap19.remove((java.lang.Object) set29);
        java.lang.Object obj31 = defaultedMap12.get(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 'a');
        int i36 = defaultedMap33.size();
        boolean b37 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.String str42 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.String str48 = defaultedMap45.toString();
        boolean b50 = defaultedMap45.equals((java.lang.Object) (byte) 10);
        int i51 = defaultedMap45.size();
        java.util.Collection collection52 = defaultedMap45.values();
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) true, (java.lang.Object) defaultedMap45);
        java.lang.Object obj55 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj57 = defaultedMap45.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection62 = defaultedMap59.values();
        java.lang.Object obj64 = defaultedMap59.remove((java.lang.Object) "");
        java.util.Collection collection65 = defaultedMap59.values();
        defaultedMap45.putAll((java.util.Map) defaultedMap59);
        boolean b67 = defaultedMap33.containsValue((java.lang.Object) defaultedMap45);
        defaultedMap12.putAll((java.util.Map) defaultedMap33);
        collections.Transformer transformer69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, transformer69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.Factory factory44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj48 = null;
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.String str55 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.String str61 = defaultedMap58.toString();
        boolean b63 = defaultedMap58.equals((java.lang.Object) (byte) 10);
        int i64 = defaultedMap58.size();
        java.util.Collection collection65 = defaultedMap58.values();
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) true, (java.lang.Object) defaultedMap58);
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.Object obj70 = defaultedMap58.get((java.lang.Object) 0.0f);
        java.lang.Object obj71 = defaultedMap45.remove(obj70);
        boolean b73 = defaultedMap45.equals((java.lang.Object) 10.0f);
        java.lang.Object obj74 = defaultedMap8.get((java.lang.Object) defaultedMap45);
        java.lang.String str75 = defaultedMap8.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100 + "'", obj60.equals(100));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100 + "'", obj68.equals(100));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + "" + "'", obj74.equals(""));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        int i22 = defaultedMap19.size();
        int i23 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 10);
        int i37 = defaultedMap31.size();
        java.util.Collection collection38 = defaultedMap31.values();
        java.lang.Object obj39 = defaultedMap25.put((java.lang.Object) true, (java.lang.Object) defaultedMap31);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) "");
        java.util.Collection collection51 = defaultedMap45.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj53 = defaultedMap11.put((java.lang.Object) i23, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection58 = defaultedMap55.values();
        java.lang.Object obj60 = defaultedMap55.remove((java.lang.Object) "");
        defaultedMap55.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate63);
        boolean b65 = defaultedMap31.containsValue((java.lang.Object) defaultedMap55);
        java.util.Set set66 = defaultedMap55.keySet();
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) defaultedMap55);
        int i68 = defaultedMap55.size();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) 'a');
        java.lang.String str73 = defaultedMap70.toString();
        boolean b75 = defaultedMap70.equals((java.lang.Object) (byte) 10);
        int i76 = defaultedMap70.size();
        java.util.Collection collection77 = defaultedMap70.values();
        java.lang.Object obj78 = null;
        java.lang.Object obj79 = defaultedMap70.get(obj78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate80, predicate81);
        java.lang.Object obj83 = defaultedMap55.get((java.lang.Object) predicate80);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100 + "'", obj67.equals(100));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100 + "'", obj72.equals(100));
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 100 + "'", obj79.equals(100));
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 100 + "'", obj83.equals(100));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap6.clear();
        java.lang.Object obj9 = defaultedMap6.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) false, obj9);
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{false=100}" + "'", str12.equals("{false=100}"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        boolean b44 = defaultedMap21.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) defaultedMap7, obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.lang.Object obj20 = defaultedMap7.put((java.lang.Object) str15, (java.lang.Object) b19);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100 + "'", obj12.equals(100));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap22.equals((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap22.keySet();
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap22);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        boolean b10 = defaultedMap5.equals((java.lang.Object) (byte) 0);
        boolean b12 = defaultedMap5.containsValue((java.lang.Object) (-1L));
        java.util.Set set13 = defaultedMap5.entrySet();
        defaultedMap5.clear();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate15, predicate16);
        java.util.Set set18 = defaultedMap5.entrySet();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) set18);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap9.clear();
        java.util.Set set11 = defaultedMap9.entrySet();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) set11);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj48 = null;
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        boolean b57 = defaultedMap52.equals((java.lang.Object) (byte) 0);
        boolean b58 = defaultedMap45.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection59 = defaultedMap45.values();
        java.lang.String str60 = defaultedMap45.toString();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 'a');
        int i65 = defaultedMap62.size();
        boolean b66 = defaultedMap62.isEmpty();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj70 = defaultedMap68.get((java.lang.Object) 'a');
        java.lang.String str71 = defaultedMap68.toString();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj76 = defaultedMap74.get((java.lang.Object) 'a');
        java.lang.String str77 = defaultedMap74.toString();
        boolean b79 = defaultedMap74.equals((java.lang.Object) (byte) 10);
        int i80 = defaultedMap74.size();
        java.util.Collection collection81 = defaultedMap74.values();
        java.lang.Object obj82 = defaultedMap68.put((java.lang.Object) true, (java.lang.Object) defaultedMap74);
        java.lang.Object obj84 = defaultedMap74.get((java.lang.Object) 'a');
        java.lang.Object obj86 = defaultedMap74.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b90 = defaultedMap88.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection91 = defaultedMap88.values();
        java.lang.Object obj93 = defaultedMap88.remove((java.lang.Object) "");
        java.util.Collection collection94 = defaultedMap88.values();
        defaultedMap74.putAll((java.util.Map) defaultedMap88);
        boolean b96 = defaultedMap62.containsValue((java.lang.Object) defaultedMap74);
        collections.map.DefaultedMap defaultedMap97 = new collections.map.DefaultedMap((java.lang.Object) b96);
        java.lang.Object obj98 = defaultedMap21.put((java.lang.Object) str60, (java.lang.Object) defaultedMap97);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{null=#}" + "'", str60.equals("{null=#}"));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100 + "'", obj64.equals(100));
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{}" + "'", str71.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 100 + "'", obj76.equals(100));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue(i80 == 0);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 100 + "'", obj84.equals(100));
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 100 + "'", obj86.equals(100));
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        int i48 = defaultedMap45.size();
        int i49 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 'a');
        java.lang.Object obj54 = null;
        java.lang.Object obj56 = defaultedMap51.put(obj54, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap58.equals((java.lang.Object) (byte) 0);
        boolean b64 = defaultedMap51.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection65 = defaultedMap51.values();
        java.lang.Object obj66 = defaultedMap45.get((java.lang.Object) collection65);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) collection65);
        collections.Transformer transformer68 = null;
        try {
            java.util.Map map69 = collections.map.DefaultedMap.decorate(map67, transformer68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100 + "'", obj53.equals(100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100 + "'", obj66.equals(100));
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        int i22 = defaultedMap19.size();
        int i23 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 10);
        int i37 = defaultedMap31.size();
        java.util.Collection collection38 = defaultedMap31.values();
        java.lang.Object obj39 = defaultedMap25.put((java.lang.Object) true, (java.lang.Object) defaultedMap31);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) "");
        java.util.Collection collection51 = defaultedMap45.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj53 = defaultedMap11.put((java.lang.Object) i23, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection58 = defaultedMap55.values();
        java.lang.Object obj60 = defaultedMap55.remove((java.lang.Object) "");
        defaultedMap55.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate63);
        boolean b65 = defaultedMap31.containsValue((java.lang.Object) defaultedMap55);
        java.util.Set set66 = defaultedMap55.keySet();
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) defaultedMap55);
        int i68 = defaultedMap55.size();
        java.lang.String str69 = defaultedMap55.toString();
        collections.Transformer transformer70 = null;
        try {
            java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, transformer70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100 + "'", obj67.equals(100));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) 0.0f);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap45.equals((java.lang.Object) (byte) 0);
        boolean b52 = defaultedMap45.containsValue((java.lang.Object) (-1L));
        java.util.Set set53 = defaultedMap45.entrySet();
        defaultedMap45.clear();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate55, predicate56);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap59.putAll((java.util.Map) defaultedMap61);
        boolean b64 = defaultedMap59.equals((java.lang.Object) (byte) 0);
        boolean b66 = defaultedMap59.containsValue((java.lang.Object) (-1L));
        java.util.Set set67 = defaultedMap59.entrySet();
        defaultedMap59.clear();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate69, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate55, predicate69);
        collections.Transformer transformer73 = null;
        try {
            java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, transformer73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 'a');
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) (short) 0);
        java.lang.Object obj28 = null;
        java.lang.Object obj30 = defaultedMap23.put(obj28, (java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0f);
        defaultedMap18.putAll(map32);
        java.util.Set set34 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) (short) -1);
        java.util.Set set39 = defaultedMap36.entrySet();
        boolean b40 = defaultedMap18.containsValue((java.lang.Object) set39);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100 + "'", obj38.equals(100));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        java.util.Collection collection38 = defaultedMap17.values();
        boolean b39 = defaultedMap17.isEmpty();
        java.util.Collection collection40 = defaultedMap17.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 10);
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) true, (java.lang.Object) defaultedMap13);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) "");
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.clear();
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap45.equals((java.lang.Object) (byte) 0);
        java.lang.String str51 = defaultedMap45.toString();
        java.util.Collection collection52 = defaultedMap45.values();
        java.lang.Object obj53 = defaultedMap41.remove((java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 'a');
        java.lang.String str25 = defaultedMap22.toString();
        boolean b27 = defaultedMap22.equals((java.lang.Object) (byte) 10);
        int i28 = defaultedMap22.size();
        java.lang.Object obj29 = defaultedMap11.put(obj20, (java.lang.Object) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap22);
        int i31 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100 + "'", obj20.equals(100));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i31 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) "");
        defaultedMap45.clear();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate52, predicate53);
        boolean b55 = defaultedMap21.containsValue((java.lang.Object) defaultedMap45);
        java.util.Collection collection56 = defaultedMap45.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(collection56);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection15 = defaultedMap12.values();
        java.util.Collection collection16 = defaultedMap12.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap19.values();
        java.util.Collection collection23 = defaultedMap19.values();
        boolean b25 = defaultedMap19.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap27.clear();
        java.util.Set set29 = defaultedMap27.entrySet();
        java.lang.Object obj30 = defaultedMap19.remove((java.lang.Object) set29);
        java.lang.Object obj31 = defaultedMap12.get(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 'a');
        int i36 = defaultedMap33.size();
        boolean b37 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.String str42 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.String str48 = defaultedMap45.toString();
        boolean b50 = defaultedMap45.equals((java.lang.Object) (byte) 10);
        int i51 = defaultedMap45.size();
        java.util.Collection collection52 = defaultedMap45.values();
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) true, (java.lang.Object) defaultedMap45);
        java.lang.Object obj55 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj57 = defaultedMap45.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b61 = defaultedMap59.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection62 = defaultedMap59.values();
        java.lang.Object obj64 = defaultedMap59.remove((java.lang.Object) "");
        java.util.Collection collection65 = defaultedMap59.values();
        defaultedMap45.putAll((java.util.Map) defaultedMap59);
        boolean b67 = defaultedMap33.containsValue((java.lang.Object) defaultedMap45);
        defaultedMap12.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) 'a');
        int i73 = defaultedMap70.size();
        int i74 = defaultedMap70.size();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj78 = defaultedMap76.get((java.lang.Object) 'a');
        java.lang.Object obj79 = null;
        java.lang.Object obj81 = defaultedMap76.put(obj79, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap83.putAll((java.util.Map) defaultedMap85);
        boolean b88 = defaultedMap83.equals((java.lang.Object) (byte) 0);
        boolean b89 = defaultedMap76.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection90 = defaultedMap76.values();
        java.lang.Object obj91 = defaultedMap70.get((java.lang.Object) collection90);
        java.util.Collection collection92 = defaultedMap70.values();
        java.lang.Object obj93 = defaultedMap12.remove((java.lang.Object) defaultedMap70);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100 + "'", obj72.equals(100));
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(i74 == 0);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 100 + "'", obj78.equals(100));
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 100 + "'", obj91.equals(100));
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        java.util.Collection collection11 = defaultedMap7.values();
        boolean b13 = defaultedMap7.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap15.clear();
        java.util.Set set17 = defaultedMap15.entrySet();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        boolean b20 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 10);
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) true, (java.lang.Object) defaultedMap13);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) "");
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) b35);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) b35);
        defaultedMap37.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj48 = null;
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.String str55 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.String str61 = defaultedMap58.toString();
        boolean b63 = defaultedMap58.equals((java.lang.Object) (byte) 10);
        int i64 = defaultedMap58.size();
        java.util.Collection collection65 = defaultedMap58.values();
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) true, (java.lang.Object) defaultedMap58);
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.Object obj70 = defaultedMap58.get((java.lang.Object) 0.0f);
        java.lang.Object obj71 = defaultedMap45.remove(obj70);
        boolean b73 = defaultedMap45.equals((java.lang.Object) 10.0f);
        java.lang.Object obj74 = defaultedMap8.get((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        boolean b81 = defaultedMap76.equals((java.lang.Object) (byte) 0);
        boolean b83 = defaultedMap76.containsValue((java.lang.Object) (-1L));
        java.util.Set set84 = defaultedMap76.entrySet();
        defaultedMap76.clear();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate86, predicate87);
        boolean b89 = defaultedMap8.containsValue((java.lang.Object) defaultedMap76);
        int i90 = defaultedMap76.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100 + "'", obj60.equals(100));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100 + "'", obj68.equals(100));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + "" + "'", obj74.equals(""));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue(i90 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        int i5 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 'a');
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        int i12 = defaultedMap6.size();
        java.util.Collection collection13 = defaultedMap6.values();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap6.get(obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.util.Collection collection21 = defaultedMap17.values();
        boolean b22 = defaultedMap6.equals((java.lang.Object) defaultedMap17);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) 1.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 'a');
        java.lang.String str23 = defaultedMap20.toString();
        boolean b25 = defaultedMap20.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap20.get((java.lang.Object) 1.0f);
        java.util.Collection collection28 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 'a');
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = defaultedMap30.put(obj33, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap37.equals((java.lang.Object) (byte) 0);
        boolean b43 = defaultedMap30.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection44 = defaultedMap30.values();
        java.lang.Object obj45 = defaultedMap9.put((java.lang.Object) defaultedMap20, (java.lang.Object) collection44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        collections.Transformer transformer47 = null;
        try {
            java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, transformer47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100 + "'", obj46.equals(100));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate(map10, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 'a');
        int i9 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        java.util.Collection collection17 = defaultedMap11.values();
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap21.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        defaultedMap21.clear();
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) (byte) -1);
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection43 = defaultedMap40.values();
        java.lang.Object obj44 = defaultedMap17.put(obj38, (java.lang.Object) collection43);
        java.util.Set set45 = defaultedMap17.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        int i22 = defaultedMap19.size();
        int i23 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 10);
        int i37 = defaultedMap31.size();
        java.util.Collection collection38 = defaultedMap31.values();
        java.lang.Object obj39 = defaultedMap25.put((java.lang.Object) true, (java.lang.Object) defaultedMap31);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) "");
        java.util.Collection collection51 = defaultedMap45.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj53 = defaultedMap11.put((java.lang.Object) i23, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection58 = defaultedMap55.values();
        java.lang.Object obj60 = defaultedMap55.remove((java.lang.Object) "");
        defaultedMap55.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate63);
        boolean b65 = defaultedMap31.containsValue((java.lang.Object) defaultedMap55);
        java.util.Set set66 = defaultedMap55.keySet();
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) defaultedMap55);
        int i68 = defaultedMap55.size();
        java.util.Collection collection69 = defaultedMap55.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100 + "'", obj67.equals(100));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertNotNull(collection69);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 'a');
        java.lang.String str17 = defaultedMap14.toString();
        boolean b19 = defaultedMap14.equals((java.lang.Object) (byte) 10);
        int i20 = defaultedMap14.size();
        java.util.Collection collection21 = defaultedMap14.values();
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) true, (java.lang.Object) defaultedMap14);
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) 'a');
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.lang.Object obj27 = defaultedMap1.remove(obj26);
        boolean b29 = defaultedMap1.equals((java.lang.Object) 10.0f);
        int i30 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        boolean b12 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 'a');
        java.lang.String str17 = defaultedMap14.toString();
        boolean b19 = defaultedMap14.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) 1.0f);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap25.toString();
        boolean b30 = defaultedMap25.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) 1.0f);
        java.util.Collection collection33 = defaultedMap25.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) 'a');
        java.lang.Object obj38 = null;
        java.lang.Object obj40 = defaultedMap35.put(obj38, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        boolean b47 = defaultedMap42.equals((java.lang.Object) (byte) 0);
        boolean b48 = defaultedMap35.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection49 = defaultedMap35.values();
        java.lang.Object obj50 = defaultedMap14.put((java.lang.Object) defaultedMap25, (java.lang.Object) collection49);
        java.lang.Object obj51 = defaultedMap6.get((java.lang.Object) defaultedMap25);
        boolean b52 = defaultedMap1.containsKey((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100 + "'", obj37.equals(100));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100 + "'", obj51.equals(100));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj16 = defaultedMap9.get((java.lang.Object) 1.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 'a');
        java.lang.String str23 = defaultedMap20.toString();
        boolean b25 = defaultedMap20.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap20.get((java.lang.Object) 1.0f);
        java.util.Collection collection28 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) 'a');
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = defaultedMap30.put(obj33, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap37.equals((java.lang.Object) (byte) 0);
        boolean b43 = defaultedMap30.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection44 = defaultedMap30.values();
        java.lang.Object obj45 = defaultedMap9.put((java.lang.Object) defaultedMap20, (java.lang.Object) collection44);
        java.lang.Object obj46 = defaultedMap1.get((java.lang.Object) defaultedMap20);
        int i47 = defaultedMap20.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100 + "'", obj46.equals(100));
        org.junit.Assert.assertTrue(i47 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 'a');
        java.lang.String str14 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 'a');
        java.lang.String str20 = defaultedMap17.toString();
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 10);
        int i23 = defaultedMap17.size();
        java.util.Collection collection24 = defaultedMap17.values();
        java.lang.Object obj25 = defaultedMap11.put((java.lang.Object) true, (java.lang.Object) defaultedMap17);
        java.lang.Object obj27 = defaultedMap17.get((java.lang.Object) 'a');
        java.lang.Object obj29 = defaultedMap17.get((java.lang.Object) 0.0f);
        java.util.Collection collection30 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) collection30);
        boolean b32 = defaultedMap1.containsValue((java.lang.Object) collection30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) b32);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i6 = defaultedMap1.size();
        java.util.Map map7 = null;
        try {
            defaultedMap1.putAll(map7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap12.put((java.lang.Object) defaultedMap18, obj20);
        java.lang.Object obj23 = defaultedMap18.remove((java.lang.Object) (-1.0f));
        boolean b24 = defaultedMap1.containsKey((java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 'a');
        int i9 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        java.util.Collection collection17 = defaultedMap11.values();
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) collection17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) collection17);
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        java.util.Set set14 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection15 = defaultedMap1.values();
        java.util.Set set16 = defaultedMap1.keySet();
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        defaultedMap23.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj48 = null;
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.String str55 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.String str61 = defaultedMap58.toString();
        boolean b63 = defaultedMap58.equals((java.lang.Object) (byte) 10);
        int i64 = defaultedMap58.size();
        java.util.Collection collection65 = defaultedMap58.values();
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) true, (java.lang.Object) defaultedMap58);
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.Object obj70 = defaultedMap58.get((java.lang.Object) 0.0f);
        java.lang.Object obj71 = defaultedMap45.remove(obj70);
        boolean b73 = defaultedMap45.equals((java.lang.Object) 10.0f);
        java.lang.Object obj74 = defaultedMap8.get((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        boolean b81 = defaultedMap76.equals((java.lang.Object) (byte) 0);
        boolean b83 = defaultedMap76.containsValue((java.lang.Object) (-1L));
        java.util.Set set84 = defaultedMap76.entrySet();
        defaultedMap76.clear();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate86, predicate87);
        boolean b89 = defaultedMap8.containsValue((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj93 = defaultedMap91.get((java.lang.Object) (short) -1);
        java.util.Set set94 = defaultedMap91.entrySet();
        defaultedMap91.clear();
        boolean b96 = defaultedMap8.equals((java.lang.Object) defaultedMap91);
        collections.Factory factory97 = null;
        try {
            java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, factory97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100 + "'", obj60.equals(100));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100 + "'", obj68.equals(100));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + "" + "'", obj74.equals(""));
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 100 + "'", obj93.equals(100));
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertTrue(b96 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection15 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 'a');
        java.lang.Object obj20 = null;
        java.lang.Object obj22 = defaultedMap17.put(obj20, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection29 = defaultedMap26.values();
        java.lang.Object obj31 = defaultedMap26.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        boolean b38 = defaultedMap33.equals((java.lang.Object) (byte) 0);
        java.util.Set set39 = defaultedMap33.keySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.Object obj45 = defaultedMap26.put((java.lang.Object) defaultedMap33, (java.lang.Object) defaultedMap43);
        java.lang.String str46 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 'a');
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) (short) 0);
        java.lang.Object obj53 = null;
        java.lang.Object obj55 = defaultedMap48.put(obj53, (java.lang.Object) (short) 1);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) 100.0f);
        defaultedMap43.putAll(map57);
        java.lang.Object obj59 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap43);
        boolean b60 = defaultedMap17.isEmpty();
        java.util.Collection collection61 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection66 = defaultedMap63.values();
        java.lang.Object obj68 = defaultedMap63.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) (short) -1);
        java.util.Set set73 = defaultedMap70.entrySet();
        defaultedMap70.clear();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b78 = defaultedMap76.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection79 = defaultedMap76.values();
        java.util.Collection collection80 = defaultedMap76.values();
        boolean b82 = defaultedMap76.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap84.clear();
        java.util.Set set86 = defaultedMap84.entrySet();
        java.lang.Object obj87 = defaultedMap76.remove((java.lang.Object) set86);
        java.lang.Object obj88 = defaultedMap70.remove((java.lang.Object) defaultedMap76);
        java.lang.Object obj89 = new java.lang.Object();
        java.lang.Object obj90 = defaultedMap70.get(obj89);
        java.lang.Object obj91 = defaultedMap63.get((java.lang.Object) defaultedMap70);
        java.util.Collection collection92 = defaultedMap63.values();
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap63);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100 + "'", obj50.equals(100));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100 + "'", obj52.equals(100));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100 + "'", obj72.equals(100));
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 100 + "'", obj90.equals(100));
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 100 + "'", obj91.equals(100));
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj10 = null;
        java.lang.Object obj12 = defaultedMap7.put(obj10, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 'a');
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) (short) 0);
        java.lang.Object obj19 = null;
        java.lang.Object obj21 = defaultedMap14.put(obj19, (java.lang.Object) (short) 1);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 100.0f);
        defaultedMap7.putAll(map23);
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 'a');
        java.lang.Object obj31 = null;
        java.lang.Object obj33 = defaultedMap28.put(obj31, (java.lang.Object) '#');
        int i34 = defaultedMap28.size();
        java.lang.Object obj36 = defaultedMap28.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection41 = defaultedMap38.values();
        java.lang.Object obj43 = defaultedMap38.remove((java.lang.Object) "");
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) 'a');
        int i49 = defaultedMap46.size();
        int i50 = defaultedMap46.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.String str55 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.String str61 = defaultedMap58.toString();
        boolean b63 = defaultedMap58.equals((java.lang.Object) (byte) 10);
        int i64 = defaultedMap58.size();
        java.util.Collection collection65 = defaultedMap58.values();
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) true, (java.lang.Object) defaultedMap58);
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.Object obj70 = defaultedMap58.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b74 = defaultedMap72.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection75 = defaultedMap72.values();
        java.lang.Object obj77 = defaultedMap72.remove((java.lang.Object) "");
        java.util.Collection collection78 = defaultedMap72.values();
        defaultedMap58.putAll((java.util.Map) defaultedMap72);
        java.lang.Object obj80 = defaultedMap38.put((java.lang.Object) i50, (java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b84 = defaultedMap82.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection85 = defaultedMap82.values();
        java.lang.Object obj87 = defaultedMap82.remove((java.lang.Object) "");
        defaultedMap82.clear();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap82, predicate89, predicate90);
        boolean b92 = defaultedMap58.containsValue((java.lang.Object) defaultedMap82);
        java.util.Set set93 = defaultedMap82.keySet();
        java.lang.Object obj94 = defaultedMap28.get((java.lang.Object) defaultedMap82);
        int i95 = defaultedMap82.size();
        java.lang.String str96 = defaultedMap82.toString();
        java.lang.Object obj97 = defaultedMap1.put(obj26, (java.lang.Object) defaultedMap82);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100 + "'", obj30.equals(100));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i34 == 1);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100 + "'", obj48.equals(100));
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100 + "'", obj60.equals(100));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100 + "'", obj68.equals(100));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + 100 + "'", obj94.equals(100));
        org.junit.Assert.assertTrue(i95 == 0);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "{}" + "'", str96.equals("{}"));
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        java.util.Collection collection38 = defaultedMap17.values();
        boolean b39 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 'a');
        java.lang.String str44 = defaultedMap41.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 'a');
        java.lang.String str50 = defaultedMap47.toString();
        boolean b52 = defaultedMap47.equals((java.lang.Object) (byte) 10);
        int i53 = defaultedMap47.size();
        java.util.Collection collection54 = defaultedMap47.values();
        java.lang.Object obj55 = defaultedMap41.put((java.lang.Object) true, (java.lang.Object) defaultedMap47);
        boolean b57 = defaultedMap47.containsValue((java.lang.Object) (byte) 100);
        boolean b58 = defaultedMap17.equals((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj10 = null;
        java.lang.Object obj12 = defaultedMap7.put(obj10, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        boolean b19 = defaultedMap14.equals((java.lang.Object) (byte) 0);
        boolean b20 = defaultedMap7.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection21 = defaultedMap7.values();
        java.lang.Object obj22 = defaultedMap1.get((java.lang.Object) collection21);
        java.util.Map map23 = null;
        try {
            defaultedMap1.putAll(map23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        boolean b50 = defaultedMap45.equals((java.lang.Object) (byte) 0);
        boolean b52 = defaultedMap45.containsValue((java.lang.Object) (-1L));
        java.util.Set set53 = defaultedMap45.entrySet();
        defaultedMap45.clear();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate55, predicate56);
        collections.Predicate predicate58 = null;
        try {
            java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate56, predicate58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap23.equals((java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1L));
        java.util.Set set31 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap33.put((java.lang.Object) defaultedMap39, obj41);
        java.lang.Object obj43 = defaultedMap23.get((java.lang.Object) defaultedMap39);
        java.util.Collection collection44 = defaultedMap39.values();
        boolean b45 = defaultedMap18.containsKey((java.lang.Object) defaultedMap39);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 'a');
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) (short) 0);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection18 = defaultedMap15.values();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap22.equals((java.lang.Object) (byte) 0);
        java.util.Set set28 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        java.lang.Object obj34 = defaultedMap15.put((java.lang.Object) defaultedMap22, (java.lang.Object) defaultedMap32);
        java.lang.String str35 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        boolean b42 = defaultedMap37.equals((java.lang.Object) (byte) 0);
        boolean b44 = defaultedMap37.containsValue((java.lang.Object) (-1L));
        java.util.Set set45 = defaultedMap37.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        java.lang.Object obj55 = null;
        java.lang.Object obj56 = defaultedMap47.put((java.lang.Object) defaultedMap53, obj55);
        java.lang.Object obj57 = defaultedMap37.get((java.lang.Object) defaultedMap53);
        java.util.Collection collection58 = defaultedMap53.values();
        boolean b59 = defaultedMap32.containsKey((java.lang.Object) defaultedMap53);
        boolean b60 = defaultedMap8.containsValue((java.lang.Object) defaultedMap32);
        java.lang.Object obj61 = defaultedMap1.remove((java.lang.Object) b60);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100 + "'", obj12.equals(100));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        java.util.Set set18 = defaultedMap7.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 'a');
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) (short) 0);
        java.lang.Object obj28 = null;
        java.lang.Object obj30 = defaultedMap23.put(obj28, (java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0f);
        defaultedMap18.putAll(map32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 'a');
        int i46 = defaultedMap43.size();
        int i47 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 'a');
        java.lang.String str52 = defaultedMap49.toString();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) 'a');
        java.lang.String str58 = defaultedMap55.toString();
        boolean b60 = defaultedMap55.equals((java.lang.Object) (byte) 10);
        int i61 = defaultedMap55.size();
        java.util.Collection collection62 = defaultedMap55.values();
        java.lang.Object obj63 = defaultedMap49.put((java.lang.Object) true, (java.lang.Object) defaultedMap55);
        java.lang.Object obj65 = defaultedMap55.get((java.lang.Object) 'a');
        java.lang.Object obj67 = defaultedMap55.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection72 = defaultedMap69.values();
        java.lang.Object obj74 = defaultedMap69.remove((java.lang.Object) "");
        java.util.Collection collection75 = defaultedMap69.values();
        defaultedMap55.putAll((java.util.Map) defaultedMap69);
        java.lang.Object obj77 = defaultedMap35.put((java.lang.Object) i47, (java.lang.Object) defaultedMap55);
        java.util.Collection collection78 = defaultedMap35.values();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection83 = defaultedMap80.values();
        java.lang.Object obj85 = defaultedMap80.remove((java.lang.Object) "");
        defaultedMap80.clear();
        collections.Predicate predicate87 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate87, predicate88);
        boolean b90 = defaultedMap35.equals((java.lang.Object) predicate87);
        defaultedMap18.putAll((java.util.Map) defaultedMap35);
        collections.Transformer transformer92 = null;
        try {
            java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100 + "'", obj45.equals(100));
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertTrue(i47 == 0);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100 + "'", obj51.equals(100));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i61 == 0);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100 + "'", obj65.equals(100));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100 + "'", obj67.equals(100));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b90 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) 0.0f);
        java.util.Collection collection20 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 'a');
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) (short) 0);
        java.lang.Object obj27 = null;
        java.lang.Object obj29 = defaultedMap22.put(obj27, (java.lang.Object) (short) 1);
        java.util.Collection collection30 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        boolean b37 = defaultedMap32.equals((java.lang.Object) (byte) 0);
        java.lang.String str38 = defaultedMap32.toString();
        boolean b40 = defaultedMap32.containsKey((java.lang.Object) "{null=1}");
        java.lang.Object obj41 = defaultedMap7.put((java.lang.Object) defaultedMap22, (java.lang.Object) defaultedMap32);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection11 = defaultedMap8.values();
        java.util.Collection collection12 = defaultedMap8.values();
        boolean b14 = defaultedMap8.equals((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap23.equals((java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1L));
        java.util.Set set31 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap33.put((java.lang.Object) defaultedMap39, obj41);
        java.lang.Object obj43 = defaultedMap23.get((java.lang.Object) defaultedMap39);
        java.util.Collection collection44 = defaultedMap39.values();
        boolean b45 = defaultedMap18.containsKey((java.lang.Object) defaultedMap39);
        java.util.Set set46 = defaultedMap39.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        boolean b24 = defaultedMap17.containsValue((java.lang.Object) (-1L));
        java.util.Set set25 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.util.Collection collection31 = defaultedMap27.values();
        boolean b33 = defaultedMap27.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap35.clear();
        java.util.Set set37 = defaultedMap35.entrySet();
        java.lang.Object obj38 = defaultedMap27.remove((java.lang.Object) set37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) set37);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 'a');
        int i45 = defaultedMap42.size();
        boolean b46 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 'a');
        java.lang.String str51 = defaultedMap48.toString();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) 'a');
        java.lang.String str57 = defaultedMap54.toString();
        boolean b59 = defaultedMap54.equals((java.lang.Object) (byte) 10);
        int i60 = defaultedMap54.size();
        java.util.Collection collection61 = defaultedMap54.values();
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) true, (java.lang.Object) defaultedMap54);
        java.lang.Object obj64 = defaultedMap54.get((java.lang.Object) 'a');
        java.lang.Object obj66 = defaultedMap54.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b70 = defaultedMap68.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection71 = defaultedMap68.values();
        java.lang.Object obj73 = defaultedMap68.remove((java.lang.Object) "");
        java.util.Collection collection74 = defaultedMap68.values();
        defaultedMap54.putAll((java.util.Map) defaultedMap68);
        boolean b76 = defaultedMap42.containsValue((java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) b76);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) b76);
        defaultedMap17.putAll((java.util.Map) defaultedMap78);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100 + "'", obj44.equals(100));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100 + "'", obj50.equals(100));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 100 + "'", obj56.equals(100));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100 + "'", obj64.equals(100));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100 + "'", obj66.equals(100));
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue(b76 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.String str3 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = defaultedMap11.put((java.lang.Object) defaultedMap17, obj19);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap17);
        java.util.Collection collection22 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 'a');
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) (short) 0);
        java.lang.Object obj29 = null;
        java.lang.Object obj31 = defaultedMap24.put(obj29, (java.lang.Object) (short) 1);
        java.util.Collection collection32 = defaultedMap24.values();
        boolean b33 = defaultedMap17.containsKey((java.lang.Object) defaultedMap24);
        java.util.Set set34 = defaultedMap17.entrySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = defaultedMap1.put(obj6, (java.lang.Object) (short) 1);
        java.util.Collection collection9 = defaultedMap1.values();
        int i10 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        boolean b16 = defaultedMap1.isEmpty();
        java.util.Set set17 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) set17);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) defaultedMap7, obj9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) collection12);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 'a');
        java.lang.Object obj20 = null;
        java.lang.Object obj22 = defaultedMap17.put(obj20, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap17.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap17.putAll(map41);
        java.lang.String str43 = defaultedMap17.toString();
        boolean b44 = defaultedMap14.containsKey((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{null=1}" + "'", str43.equals("{null=1}"));
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 10);
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) true, (java.lang.Object) defaultedMap13);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) "");
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.clear();
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) defaultedMap41);
        int i44 = defaultedMap41.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 'a');
        int i14 = defaultedMap11.size();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        java.util.Collection collection16 = defaultedMap11.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        boolean b17 = defaultedMap7.containsValue((java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        java.lang.Object obj22 = null;
        java.lang.Object obj24 = defaultedMap19.put(obj22, (java.lang.Object) '#');
        int i25 = defaultedMap19.size();
        java.lang.Object obj27 = defaultedMap19.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection32 = defaultedMap29.values();
        java.lang.Object obj34 = defaultedMap29.remove((java.lang.Object) "");
        defaultedMap29.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 'a');
        int i40 = defaultedMap37.size();
        int i41 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 'a');
        java.lang.String str46 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 'a');
        java.lang.String str52 = defaultedMap49.toString();
        boolean b54 = defaultedMap49.equals((java.lang.Object) (byte) 10);
        int i55 = defaultedMap49.size();
        java.util.Collection collection56 = defaultedMap49.values();
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) true, (java.lang.Object) defaultedMap49);
        java.lang.Object obj59 = defaultedMap49.get((java.lang.Object) 'a');
        java.lang.Object obj61 = defaultedMap49.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection66 = defaultedMap63.values();
        java.lang.Object obj68 = defaultedMap63.remove((java.lang.Object) "");
        java.util.Collection collection69 = defaultedMap63.values();
        defaultedMap49.putAll((java.util.Map) defaultedMap63);
        java.lang.Object obj71 = defaultedMap29.put((java.lang.Object) i41, (java.lang.Object) defaultedMap49);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection76 = defaultedMap73.values();
        java.lang.Object obj78 = defaultedMap73.remove((java.lang.Object) "");
        defaultedMap73.clear();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate80, predicate81);
        boolean b83 = defaultedMap49.containsValue((java.lang.Object) defaultedMap73);
        java.util.Set set84 = defaultedMap73.keySet();
        java.lang.Object obj85 = defaultedMap19.get((java.lang.Object) defaultedMap73);
        int i86 = defaultedMap73.size();
        java.lang.Object obj88 = defaultedMap73.get((java.lang.Object) 10.0d);
        boolean b89 = defaultedMap7.containsKey((java.lang.Object) defaultedMap73);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
        org.junit.Assert.assertTrue(i40 == 0);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100 + "'", obj45.equals(100));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100 + "'", obj51.equals(100));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100 + "'", obj59.equals(100));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 100 + "'", obj85.equals(100));
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 100 + "'", obj88.equals(100));
        org.junit.Assert.assertTrue(b89 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        int i18 = defaultedMap7.size();
        java.util.Set set19 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = defaultedMap1.put(obj6, (java.lang.Object) (short) 1);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.Object obj10 = null;
        boolean b11 = defaultedMap1.containsValue(obj10);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        boolean b22 = defaultedMap18.isEmpty();
        java.util.Collection collection23 = defaultedMap18.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        boolean b27 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap19.get((java.lang.Object) (-1L));
        int i23 = defaultedMap19.size();
        boolean b24 = defaultedMap7.equals((java.lang.Object) i23);
        java.util.Set set25 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 'a');
        int i30 = defaultedMap27.size();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection35 = defaultedMap32.values();
        java.lang.Object obj37 = defaultedMap32.remove((java.lang.Object) "");
        java.util.Collection collection38 = defaultedMap32.values();
        java.lang.Object obj39 = defaultedMap27.get((java.lang.Object) collection38);
        boolean b40 = defaultedMap7.containsKey((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 10);
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) true, (java.lang.Object) defaultedMap13);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) 'a');
        int i24 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 'a');
        java.lang.Object obj29 = null;
        java.lang.Object obj31 = defaultedMap26.put(obj29, (java.lang.Object) '#');
        int i32 = defaultedMap26.size();
        java.lang.Object obj34 = defaultedMap26.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection39 = defaultedMap36.values();
        java.lang.Object obj41 = defaultedMap36.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 'a');
        java.lang.String str50 = defaultedMap47.toString();
        boolean b52 = defaultedMap47.equals((java.lang.Object) (byte) 10);
        int i53 = defaultedMap47.size();
        java.lang.Object obj54 = defaultedMap36.put(obj45, (java.lang.Object) defaultedMap47);
        defaultedMap26.putAll((java.util.Map) defaultedMap47);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) defaultedMap26);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 1);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100 + "'", obj45.equals(100));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set17 = defaultedMap16.entrySet();
        java.lang.Object obj18 = defaultedMap1.get((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        java.util.Collection collection44 = defaultedMap1.values();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap1.equals(obj45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj48 = null;
        java.lang.Object obj50 = defaultedMap45.put(obj48, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.String str55 = defaultedMap52.toString();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.String str61 = defaultedMap58.toString();
        boolean b63 = defaultedMap58.equals((java.lang.Object) (byte) 10);
        int i64 = defaultedMap58.size();
        java.util.Collection collection65 = defaultedMap58.values();
        java.lang.Object obj66 = defaultedMap52.put((java.lang.Object) true, (java.lang.Object) defaultedMap58);
        java.lang.Object obj68 = defaultedMap58.get((java.lang.Object) 'a');
        java.lang.Object obj70 = defaultedMap58.get((java.lang.Object) 0.0f);
        java.lang.Object obj71 = defaultedMap45.remove(obj70);
        boolean b73 = defaultedMap45.equals((java.lang.Object) 10.0f);
        java.lang.Object obj74 = defaultedMap8.get((java.lang.Object) defaultedMap45);
        collections.Transformer transformer75 = null;
        try {
            java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, transformer75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100 + "'", obj60.equals(100));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100 + "'", obj68.equals(100));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + "" + "'", obj74.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 'a');
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) (short) 0);
        java.lang.Object obj13 = null;
        java.lang.Object obj15 = defaultedMap8.put(obj13, (java.lang.Object) (short) 1);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0f);
        defaultedMap1.putAll(map17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) 10L);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100 + "'", obj12.equals(100));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100 + "'", obj20.equals(100));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection10 = defaultedMap7.values();
        java.util.Collection collection11 = defaultedMap7.values();
        boolean b13 = defaultedMap7.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap15.clear();
        java.util.Set set17 = defaultedMap15.entrySet();
        java.lang.Object obj18 = defaultedMap7.remove((java.lang.Object) set17);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) defaultedMap7);
        java.util.Collection collection20 = defaultedMap7.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) 0.0f);
        java.util.Set set20 = defaultedMap7.keySet();
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        int i44 = defaultedMap1.size();
        java.lang.String str45 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{0={}}" + "'", str45.equals("{0={}}"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = defaultedMap1.get(obj6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) "");
        java.util.Set set10 = defaultedMap9.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection15 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        defaultedMap12.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) set10, (java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection16 = defaultedMap13.values();
        java.lang.Object obj18 = defaultedMap13.remove((java.lang.Object) "");
        defaultedMap13.clear();
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) 0);
        int i22 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.lang.String str30 = defaultedMap24.toString();
        boolean b32 = defaultedMap24.containsKey((java.lang.Object) "{null=1}");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b39 = defaultedMap34.equals((java.lang.Object) (byte) 0);
        boolean b41 = defaultedMap34.containsValue((java.lang.Object) (-1L));
        java.util.Set set42 = defaultedMap34.entrySet();
        defaultedMap34.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate44, predicate45);
        java.lang.Object obj47 = defaultedMap13.put((java.lang.Object) "{null=1}", (java.lang.Object) defaultedMap34);
        java.lang.Object obj48 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Set set49 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100 + "'", obj48.equals(100));
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        boolean b11 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap19.get((java.lang.Object) (-1L));
        int i23 = defaultedMap19.size();
        boolean b24 = defaultedMap7.equals((java.lang.Object) i23);
        java.util.Collection collection25 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.util.Collection collection31 = defaultedMap27.values();
        boolean b33 = defaultedMap27.equals((java.lang.Object) 1.0f);
        java.util.Set set34 = defaultedMap27.keySet();
        java.lang.Object obj35 = defaultedMap7.get((java.lang.Object) set34);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 10);
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) true, (java.lang.Object) defaultedMap13);
        java.lang.Object obj23 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) "");
        java.util.Collection collection33 = defaultedMap27.values();
        defaultedMap13.putAll((java.util.Map) defaultedMap27);
        boolean b35 = defaultedMap1.containsValue((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.clear();
        java.lang.Object obj40 = defaultedMap37.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b43 = defaultedMap1.containsKey((java.lang.Object) defaultedMap41);
        java.lang.Object obj44 = null;
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, obj44);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.String str42 = defaultedMap39.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.String str48 = defaultedMap45.toString();
        boolean b50 = defaultedMap45.equals((java.lang.Object) (byte) 10);
        int i51 = defaultedMap45.size();
        java.util.Collection collection52 = defaultedMap45.values();
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) true, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection58 = defaultedMap55.values();
        java.lang.Object obj60 = defaultedMap55.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        boolean b67 = defaultedMap62.equals((java.lang.Object) (byte) 0);
        java.util.Set set68 = defaultedMap62.keySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap70.putAll((java.util.Map) defaultedMap72);
        java.lang.Object obj74 = defaultedMap55.put((java.lang.Object) defaultedMap62, (java.lang.Object) defaultedMap72);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) defaultedMap55);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (-1L));
        java.util.Set set15 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate17, predicate18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate18);
        java.util.Set set21 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.Object obj15 = null;
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        java.lang.String str22 = defaultedMap19.toString();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap25.toString();
        boolean b30 = defaultedMap25.equals((java.lang.Object) (byte) 10);
        int i31 = defaultedMap25.size();
        java.util.Collection collection32 = defaultedMap25.values();
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) true, (java.lang.Object) defaultedMap25);
        java.lang.Object obj35 = defaultedMap25.get((java.lang.Object) 'a');
        java.lang.Object obj37 = defaultedMap25.get((java.lang.Object) 0.0f);
        java.lang.Object obj38 = defaultedMap12.remove(obj37);
        boolean b40 = defaultedMap12.equals((java.lang.Object) 10.0f);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100 + "'", obj37.equals(100));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) 1.0f);
        java.util.Collection collection20 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 'a');
        java.lang.Object obj25 = null;
        java.lang.Object obj27 = defaultedMap22.put(obj25, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        boolean b35 = defaultedMap22.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection36 = defaultedMap22.values();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) collection36);
        java.util.Set set38 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        int i48 = defaultedMap45.size();
        int i49 = defaultedMap45.size();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 'a');
        java.lang.Object obj54 = null;
        java.lang.Object obj56 = defaultedMap51.put(obj54, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap58.putAll((java.util.Map) defaultedMap60);
        boolean b63 = defaultedMap58.equals((java.lang.Object) (byte) 0);
        boolean b64 = defaultedMap51.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection65 = defaultedMap51.values();
        java.lang.Object obj66 = defaultedMap45.get((java.lang.Object) collection65);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) collection65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap69.clear();
        java.lang.Object obj72 = defaultedMap69.get((java.lang.Object) (-1L));
        int i73 = defaultedMap69.size();
        boolean b74 = defaultedMap27.containsKey((java.lang.Object) i73);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100 + "'", obj53.equals(100));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100 + "'", obj66.equals(100));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100 + "'", obj72.equals(100));
        org.junit.Assert.assertTrue(i73 == 0);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection15 = defaultedMap1.values();
        java.lang.String str16 = defaultedMap1.toString();
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{null=#}" + "'", str16.equals("{null=#}"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 'a');
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) (short) 0);
        java.lang.Object obj28 = null;
        java.lang.Object obj30 = defaultedMap23.put(obj28, (java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0f);
        java.lang.Object obj33 = defaultedMap18.remove((java.lang.Object) map32);
        boolean b34 = defaultedMap18.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        java.lang.Object obj14 = defaultedMap9.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) (short) -1);
        java.util.Set set19 = defaultedMap16.entrySet();
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection25 = defaultedMap22.values();
        java.util.Collection collection26 = defaultedMap22.values();
        boolean b28 = defaultedMap22.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap30.clear();
        java.util.Set set32 = defaultedMap30.entrySet();
        java.lang.Object obj33 = defaultedMap22.remove((java.lang.Object) set32);
        java.lang.Object obj34 = defaultedMap16.remove((java.lang.Object) defaultedMap22);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap16.get(obj35);
        java.lang.Object obj37 = defaultedMap9.get((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.Object obj42 = null;
        java.lang.Object obj44 = defaultedMap39.put(obj42, (java.lang.Object) '#');
        int i45 = defaultedMap39.size();
        java.lang.Object obj47 = defaultedMap39.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj54 = defaultedMap49.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        boolean b61 = defaultedMap56.equals((java.lang.Object) (byte) 0);
        java.util.Set set62 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.lang.Object obj68 = defaultedMap49.put((java.lang.Object) defaultedMap56, (java.lang.Object) defaultedMap66);
        java.lang.Object obj69 = defaultedMap39.get((java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 'a');
        java.lang.String str74 = defaultedMap71.toString();
        boolean b76 = defaultedMap71.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj78 = defaultedMap71.get((java.lang.Object) 1.0f);
        java.lang.Object obj79 = defaultedMap9.put((java.lang.Object) defaultedMap39, (java.lang.Object) defaultedMap71);
        java.lang.Object obj80 = defaultedMap1.get(obj79);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100 + "'", obj37.equals(100));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 1);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100 + "'", obj69.equals(100));
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100 + "'", obj73.equals(100));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 100 + "'", obj78.equals(100));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 100 + "'", obj80.equals(100));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        java.util.Collection collection13 = defaultedMap9.values();
        boolean b15 = defaultedMap9.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.clear();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap9.remove((java.lang.Object) set19);
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj19 = defaultedMap7.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection24 = defaultedMap21.values();
        java.lang.Object obj26 = defaultedMap21.remove((java.lang.Object) "");
        java.util.Collection collection27 = defaultedMap21.values();
        defaultedMap7.putAll((java.util.Map) defaultedMap21);
        boolean b29 = defaultedMap21.isEmpty();
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap21.equals(obj30);
        defaultedMap21.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) (short) -1);
        boolean b31 = defaultedMap1.containsKey(obj30);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100 + "'", obj30.equals(100));
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj5 = defaultedMap3.get((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 10);
        int i15 = defaultedMap9.size();
        java.util.Collection collection16 = defaultedMap9.values();
        java.lang.Object obj17 = defaultedMap3.put((java.lang.Object) true, (java.lang.Object) defaultedMap9);
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap21.clear();
        java.lang.Object obj24 = defaultedMap21.get((java.lang.Object) (-1L));
        int i25 = defaultedMap21.size();
        boolean b26 = defaultedMap9.equals((java.lang.Object) i25);
        java.util.Set set27 = defaultedMap9.keySet();
        java.lang.Object obj28 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b15 = defaultedMap8.containsValue((java.lang.Object) (-1L));
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) (short) 0);
        java.lang.Object obj24 = null;
        java.lang.Object obj26 = defaultedMap19.put(obj24, (java.lang.Object) (short) 1);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 100.0f);
        defaultedMap8.putAll(map28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap31.put((java.lang.Object) defaultedMap37, obj39);
        java.lang.Object obj41 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        int i15 = defaultedMap12.size();
        java.lang.String str16 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap18.equals((java.lang.Object) (byte) 0);
        boolean b25 = defaultedMap18.containsValue((java.lang.Object) (-1L));
        java.util.Set set26 = defaultedMap18.entrySet();
        defaultedMap18.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate28, predicate29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) predicate29);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) 1.0f);
        java.util.Collection collection20 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 'a');
        java.lang.Object obj25 = null;
        java.lang.Object obj27 = defaultedMap22.put(obj25, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        boolean b35 = defaultedMap22.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection36 = defaultedMap22.values();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) collection36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection42 = defaultedMap39.values();
        java.lang.Object obj44 = defaultedMap39.remove((java.lang.Object) "");
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 'a');
        int i50 = defaultedMap47.size();
        int i51 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 'a');
        java.lang.String str56 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj61 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.String str62 = defaultedMap59.toString();
        boolean b64 = defaultedMap59.equals((java.lang.Object) (byte) 10);
        int i65 = defaultedMap59.size();
        java.util.Collection collection66 = defaultedMap59.values();
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) true, (java.lang.Object) defaultedMap59);
        java.lang.Object obj69 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.Object obj71 = defaultedMap59.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection76 = defaultedMap73.values();
        java.lang.Object obj78 = defaultedMap73.remove((java.lang.Object) "");
        java.util.Collection collection79 = defaultedMap73.values();
        defaultedMap59.putAll((java.util.Map) defaultedMap73);
        java.lang.Object obj81 = defaultedMap39.put((java.lang.Object) i51, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b85 = defaultedMap83.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection86 = defaultedMap83.values();
        java.lang.Object obj88 = defaultedMap83.remove((java.lang.Object) "");
        defaultedMap83.clear();
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate90, predicate91);
        boolean b93 = defaultedMap59.containsValue((java.lang.Object) defaultedMap83);
        java.util.Set set94 = defaultedMap83.keySet();
        java.lang.Object obj95 = defaultedMap1.remove((java.lang.Object) defaultedMap83);
        java.lang.String str96 = defaultedMap83.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100 + "'", obj69.equals(100));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100 + "'", obj71.equals(100));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "{}" + "'", str96.equals("{}"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) 'a');
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.equals((java.lang.Object) (byte) 10);
        int i24 = defaultedMap18.size();
        java.util.Collection collection25 = defaultedMap18.values();
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) true, (java.lang.Object) defaultedMap18);
        java.lang.Object obj28 = defaultedMap18.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection33 = defaultedMap30.values();
        java.lang.Object obj35 = defaultedMap30.remove((java.lang.Object) "");
        defaultedMap30.clear();
        java.lang.Object obj38 = defaultedMap30.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 'a');
        int i43 = defaultedMap40.size();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) defaultedMap40);
        java.lang.Object obj45 = defaultedMap1.put(obj28, (java.lang.Object) defaultedMap40);
        java.util.Set set46 = defaultedMap40.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100 + "'", obj20.equals(100));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100 + "'", obj42.equals(100));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        java.util.Collection collection14 = defaultedMap1.values();
        boolean b15 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = defaultedMap1.put(obj6, (java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        boolean b11 = defaultedMap1.isEmpty();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) defaultedMap7, obj9);
        java.lang.Object obj12 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        boolean b19 = defaultedMap14.equals((java.lang.Object) (byte) 0);
        boolean b21 = defaultedMap14.containsValue((java.lang.Object) (-1L));
        java.util.Set set22 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection27 = defaultedMap24.values();
        java.util.Collection collection28 = defaultedMap24.values();
        boolean b30 = defaultedMap24.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.clear();
        java.util.Set set34 = defaultedMap32.entrySet();
        java.lang.Object obj35 = defaultedMap24.remove((java.lang.Object) set34);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) set34);
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap23);
        defaultedMap1.putAll((java.util.Map) defaultedMap23);
        java.util.Set set27 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) 'a');
        int i5 = defaultedMap2.size();
        int i6 = defaultedMap2.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 'a');
        java.lang.Object obj11 = null;
        java.lang.Object obj13 = defaultedMap8.put(obj11, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        boolean b21 = defaultedMap8.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection22 = defaultedMap8.values();
        java.lang.Object obj23 = defaultedMap2.get((java.lang.Object) collection22);
        java.util.Collection collection24 = defaultedMap2.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        boolean b31 = defaultedMap26.equals((java.lang.Object) (byte) 0);
        boolean b33 = defaultedMap26.containsValue((java.lang.Object) (-1L));
        java.util.Set set34 = defaultedMap26.entrySet();
        defaultedMap26.clear();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate36, predicate37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 'a');
        int i43 = defaultedMap40.size();
        java.lang.String str44 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        boolean b51 = defaultedMap46.equals((java.lang.Object) (byte) 0);
        boolean b53 = defaultedMap46.containsValue((java.lang.Object) (-1L));
        java.util.Set set54 = defaultedMap46.entrySet();
        defaultedMap46.clear();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate56, predicate57);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate37, predicate57);
        try {
            java.util.Map map61 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100 + "'", obj42.equals(100));
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        java.lang.String str12 = defaultedMap9.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        boolean b20 = defaultedMap15.equals((java.lang.Object) (byte) 10);
        int i21 = defaultedMap15.size();
        java.util.Collection collection22 = defaultedMap15.values();
        java.lang.Object obj23 = defaultedMap9.put((java.lang.Object) true, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        boolean b30 = defaultedMap25.equals((java.lang.Object) (byte) 0);
        boolean b32 = defaultedMap25.containsValue((java.lang.Object) (-1L));
        java.util.Set set33 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.util.Collection collection39 = defaultedMap35.values();
        boolean b41 = defaultedMap35.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap43.clear();
        java.util.Set set45 = defaultedMap43.entrySet();
        java.lang.Object obj46 = defaultedMap35.remove((java.lang.Object) set45);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) set45);
        java.lang.Object obj48 = defaultedMap9.get((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 'a');
        java.lang.String str53 = defaultedMap50.toString();
        boolean b55 = defaultedMap50.equals((java.lang.Object) (byte) 10);
        int i56 = defaultedMap50.size();
        java.util.Collection collection57 = defaultedMap50.values();
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap50.get(obj58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate60, predicate61);
        java.lang.Object obj63 = defaultedMap25.remove((java.lang.Object) predicate61);
        java.lang.Object obj64 = defaultedMap1.get(obj63);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100 + "'", obj48.equals(100));
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100 + "'", obj52.equals(100));
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100 + "'", obj59.equals(100));
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + '#' + "'", obj64.equals('#'));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate8, predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 0);
        boolean b19 = defaultedMap12.containsValue((java.lang.Object) (-1L));
        java.util.Set set20 = defaultedMap12.entrySet();
        boolean b21 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) set7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        java.lang.Object obj31 = defaultedMap8.get((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection36 = defaultedMap33.values();
        java.lang.Object obj38 = defaultedMap33.remove((java.lang.Object) "");
        boolean b39 = defaultedMap33.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) 'a');
        java.lang.String str44 = defaultedMap41.toString();
        boolean b46 = defaultedMap41.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj48 = defaultedMap41.get((java.lang.Object) 1.0f);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.String str55 = defaultedMap52.toString();
        boolean b57 = defaultedMap52.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) 1.0f);
        java.util.Collection collection60 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) 'a');
        java.lang.Object obj65 = null;
        java.lang.Object obj67 = defaultedMap62.put(obj65, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        boolean b74 = defaultedMap69.equals((java.lang.Object) (byte) 0);
        boolean b75 = defaultedMap62.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection76 = defaultedMap62.values();
        java.lang.Object obj77 = defaultedMap41.put((java.lang.Object) defaultedMap52, (java.lang.Object) collection76);
        java.lang.Object obj78 = defaultedMap33.get((java.lang.Object) defaultedMap52);
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, obj78);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100 + "'", obj48.equals(100));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100 + "'", obj59.equals(100));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100 + "'", obj64.equals(100));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 100 + "'", obj78.equals(100));
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) 1.0f);
        java.util.Collection collection20 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 'a');
        java.lang.Object obj25 = null;
        java.lang.Object obj27 = defaultedMap22.put(obj25, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        boolean b35 = defaultedMap22.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection36 = defaultedMap22.values();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) collection36);
        boolean b38 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        int i22 = defaultedMap19.size();
        int i23 = defaultedMap19.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.equals((java.lang.Object) (byte) 10);
        int i37 = defaultedMap31.size();
        java.util.Collection collection38 = defaultedMap31.values();
        java.lang.Object obj39 = defaultedMap25.put((java.lang.Object) true, (java.lang.Object) defaultedMap31);
        java.lang.Object obj41 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.Object obj43 = defaultedMap31.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) "");
        java.util.Collection collection51 = defaultedMap45.values();
        defaultedMap31.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj53 = defaultedMap11.put((java.lang.Object) i23, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection58 = defaultedMap55.values();
        java.lang.Object obj60 = defaultedMap55.remove((java.lang.Object) "");
        defaultedMap55.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate62, predicate63);
        boolean b65 = defaultedMap31.containsValue((java.lang.Object) defaultedMap55);
        java.util.Set set66 = defaultedMap55.keySet();
        java.lang.Object obj67 = defaultedMap1.get((java.lang.Object) defaultedMap55);
        int i68 = defaultedMap55.size();
        java.lang.String str69 = defaultedMap55.toString();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection74 = defaultedMap71.values();
        java.lang.Object obj76 = defaultedMap71.remove((java.lang.Object) "");
        defaultedMap71.clear();
        java.lang.Object obj79 = defaultedMap71.remove((java.lang.Object) 0);
        java.util.Set set80 = defaultedMap71.keySet();
        java.lang.Object obj81 = defaultedMap55.get((java.lang.Object) defaultedMap71);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100 + "'", obj67.equals(100));
        org.junit.Assert.assertTrue(i68 == 0);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 100 + "'", obj81.equals(100));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.equals(obj5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        int i16 = defaultedMap13.size();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b20 = defaultedMap18.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj23 = defaultedMap18.remove((java.lang.Object) "");
        java.util.Collection collection24 = defaultedMap18.values();
        java.lang.Object obj25 = defaultedMap13.get((java.lang.Object) collection24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) collection24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection31 = defaultedMap28.values();
        java.lang.Object obj33 = defaultedMap28.remove((java.lang.Object) "");
        defaultedMap28.clear();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate35, predicate36);
        boolean b38 = defaultedMap8.containsKey((java.lang.Object) predicate35);
        boolean b39 = defaultedMap1.equals((java.lang.Object) b38);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.String str15 = defaultedMap11.toString();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap11.get(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        boolean b26 = defaultedMap19.containsValue((java.lang.Object) (-1L));
        java.util.Set set27 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap29.put((java.lang.Object) defaultedMap35, obj37);
        java.lang.Object obj39 = defaultedMap19.get((java.lang.Object) defaultedMap35);
        java.util.Collection collection40 = defaultedMap35.values();
        java.lang.Object obj41 = defaultedMap1.put(obj17, (java.lang.Object) collection40);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap18.equals((java.lang.Object) (byte) 0);
        java.util.Set set24 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj30 = defaultedMap11.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap28);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 'a');
        java.lang.String str36 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.String str42 = defaultedMap39.toString();
        boolean b44 = defaultedMap39.equals((java.lang.Object) (byte) 10);
        int i45 = defaultedMap39.size();
        java.util.Collection collection46 = defaultedMap39.values();
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) true, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection52 = defaultedMap49.values();
        java.lang.Object obj54 = defaultedMap49.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        boolean b61 = defaultedMap56.equals((java.lang.Object) (byte) 0);
        java.util.Set set62 = defaultedMap56.keySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap64.putAll((java.util.Map) defaultedMap66);
        java.lang.Object obj68 = defaultedMap49.put((java.lang.Object) defaultedMap56, (java.lang.Object) defaultedMap66);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap49);
        java.util.Collection collection70 = defaultedMap39.values();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b74 = defaultedMap72.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection75 = defaultedMap72.values();
        java.lang.Object obj77 = defaultedMap72.remove((java.lang.Object) "");
        defaultedMap72.clear();
        java.lang.Object obj80 = defaultedMap72.remove((java.lang.Object) 0);
        java.util.Set set81 = defaultedMap72.keySet();
        java.lang.Object obj82 = defaultedMap28.put((java.lang.Object) defaultedMap39, (java.lang.Object) set81);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap28.get(obj83);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 100 + "'", obj84.equals(100));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        boolean b7 = defaultedMap1.equals((java.lang.Object) 1.0f);
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.Object obj15 = null;
        java.lang.Object obj17 = defaultedMap12.put(obj15, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        boolean b25 = defaultedMap12.containsKey((java.lang.Object) (byte) 0);
        java.util.Set set26 = defaultedMap12.entrySet();
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) set26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100 + "'", obj7.equals(100));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (short) -1);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.lang.Object obj25 = defaultedMap14.remove((java.lang.Object) set24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object obj28 = defaultedMap8.get(obj27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Set set30 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.String str35 = defaultedMap32.toString();
        boolean b37 = defaultedMap32.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) 1.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 'a');
        java.lang.String str46 = defaultedMap43.toString();
        boolean b48 = defaultedMap43.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj50 = defaultedMap43.get((java.lang.Object) 1.0f);
        java.util.Collection collection51 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 'a');
        java.lang.Object obj56 = null;
        java.lang.Object obj58 = defaultedMap53.put(obj56, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        boolean b65 = defaultedMap60.equals((java.lang.Object) (byte) 0);
        boolean b66 = defaultedMap53.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection67 = defaultedMap53.values();
        java.lang.Object obj68 = defaultedMap32.put((java.lang.Object) defaultedMap43, (java.lang.Object) collection67);
        java.util.Set set69 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 'a');
        java.lang.Object obj74 = null;
        java.lang.Object obj76 = defaultedMap71.put(obj74, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj80 = defaultedMap78.get((java.lang.Object) 'a');
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) (short) 0);
        java.lang.Object obj83 = null;
        java.lang.Object obj85 = defaultedMap78.put(obj83, (java.lang.Object) (short) 1);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) 100.0f);
        defaultedMap71.putAll(map87);
        java.lang.Object obj89 = defaultedMap8.put((java.lang.Object) set69, (java.lang.Object) defaultedMap71);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj93 = defaultedMap91.get((java.lang.Object) (short) -1);
        java.util.Set set94 = defaultedMap91.entrySet();
        java.util.Map map95 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) set94);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100 + "'", obj45.equals(100));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100 + "'", obj50.equals(100));
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100 + "'", obj73.equals(100));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 100 + "'", obj80.equals(100));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 100 + "'", obj82.equals(100));
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 100 + "'", obj93.equals(100));
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        java.lang.String str38 = defaultedMap7.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 'a');
        int i14 = defaultedMap11.size();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        boolean b16 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 0);
        java.util.Set set19 = defaultedMap13.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.lang.Object obj25 = defaultedMap6.put((java.lang.Object) defaultedMap13, (java.lang.Object) defaultedMap23);
        java.lang.String str26 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 'a');
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) (short) 0);
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = defaultedMap28.put(obj33, (java.lang.Object) (short) 1);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) 100.0f);
        defaultedMap23.putAll(map37);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100 + "'", obj30.equals(100));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100 + "'", obj32.equals(100));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection15 = defaultedMap12.values();
        java.util.Collection collection16 = defaultedMap12.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap19.values();
        java.util.Collection collection23 = defaultedMap19.values();
        boolean b25 = defaultedMap19.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap27.clear();
        java.util.Set set29 = defaultedMap27.entrySet();
        java.lang.Object obj30 = defaultedMap19.remove((java.lang.Object) set29);
        java.lang.Object obj31 = defaultedMap12.get(obj30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 'a');
        java.lang.String str36 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.String str42 = defaultedMap39.toString();
        boolean b44 = defaultedMap39.equals((java.lang.Object) (byte) 10);
        int i45 = defaultedMap39.size();
        java.util.Collection collection46 = defaultedMap39.values();
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) true, (java.lang.Object) defaultedMap39);
        java.lang.Object obj49 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.Object obj51 = defaultedMap39.get((java.lang.Object) 0.0f);
        java.util.Set set52 = defaultedMap39.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) map53);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100 + "'", obj51.equals(100));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection11 = defaultedMap8.values();
        java.util.Collection collection12 = defaultedMap8.values();
        boolean b14 = defaultedMap8.equals((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) (short) -1);
        java.util.Set set20 = defaultedMap17.entrySet();
        defaultedMap17.clear();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection26 = defaultedMap23.values();
        java.util.Collection collection27 = defaultedMap23.values();
        boolean b29 = defaultedMap23.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap31.clear();
        java.util.Set set33 = defaultedMap31.entrySet();
        java.lang.Object obj34 = defaultedMap23.remove((java.lang.Object) set33);
        java.lang.Object obj35 = defaultedMap17.remove((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) 'a');
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) (short) 0);
        java.lang.Object obj42 = null;
        java.lang.Object obj44 = defaultedMap37.put(obj42, (java.lang.Object) (short) 1);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) 100.0f);
        boolean b47 = defaultedMap37.isEmpty();
        java.lang.Object obj48 = defaultedMap17.remove((java.lang.Object) defaultedMap37);
        defaultedMap1.putAll((java.util.Map) defaultedMap37);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        int i8 = defaultedMap1.size();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 'a');
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) (short) 0);
        java.lang.Object obj28 = null;
        java.lang.Object obj30 = defaultedMap23.put(obj28, (java.lang.Object) (short) 1);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) 100.0f);
        defaultedMap18.putAll(map32);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection14 = defaultedMap11.values();
        java.lang.Object obj16 = defaultedMap11.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap18.equals((java.lang.Object) (byte) 0);
        java.util.Set set24 = defaultedMap18.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.lang.Object obj30 = defaultedMap11.put((java.lang.Object) defaultedMap18, (java.lang.Object) defaultedMap28);
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        boolean b32 = defaultedMap28.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) set7);
        boolean b9 = defaultedMap8.isEmpty();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap10.clear();
        java.util.Set set12 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap22.equals((java.lang.Object) (byte) 0);
        boolean b29 = defaultedMap22.containsValue((java.lang.Object) (-1L));
        java.util.Set set30 = defaultedMap22.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection35 = defaultedMap32.values();
        java.util.Collection collection36 = defaultedMap32.values();
        boolean b38 = defaultedMap32.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap40.clear();
        java.util.Set set42 = defaultedMap40.entrySet();
        java.lang.Object obj43 = defaultedMap32.remove((java.lang.Object) set42);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) set42);
        boolean b45 = defaultedMap8.containsValue((java.lang.Object) set42);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        int i18 = defaultedMap7.size();
        boolean b20 = defaultedMap7.containsValue((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap12.put((java.lang.Object) defaultedMap18, obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) 'a');
        int i26 = defaultedMap23.size();
        java.lang.String str27 = defaultedMap23.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        boolean b36 = defaultedMap29.containsValue((java.lang.Object) (-1L));
        java.util.Set set37 = defaultedMap29.entrySet();
        defaultedMap29.clear();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate39, predicate40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) predicate40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap44.equals((java.lang.Object) (byte) 0);
        boolean b51 = defaultedMap44.containsValue((java.lang.Object) (-1L));
        java.util.Set set52 = defaultedMap44.entrySet();
        defaultedMap44.clear();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate40, predicate55);
        boolean b58 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        boolean b18 = defaultedMap13.equals((java.lang.Object) (byte) 10);
        int i19 = defaultedMap13.size();
        java.util.Collection collection20 = defaultedMap13.values();
        java.lang.Object obj21 = defaultedMap7.put((java.lang.Object) true, (java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap23.equals((java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1L));
        java.util.Set set31 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection36 = defaultedMap33.values();
        java.util.Collection collection37 = defaultedMap33.values();
        boolean b39 = defaultedMap33.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap41.clear();
        java.util.Set set43 = defaultedMap41.entrySet();
        java.lang.Object obj44 = defaultedMap33.remove((java.lang.Object) set43);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) set43);
        java.lang.Object obj46 = defaultedMap7.get((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) 'a');
        java.lang.String str51 = defaultedMap48.toString();
        boolean b53 = defaultedMap48.equals((java.lang.Object) (byte) 10);
        int i54 = defaultedMap48.size();
        java.util.Collection collection55 = defaultedMap48.values();
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap48.get(obj56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate58, predicate59);
        java.lang.Object obj61 = defaultedMap23.remove((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b65 = defaultedMap63.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection66 = defaultedMap63.values();
        java.util.Collection collection67 = defaultedMap63.values();
        java.lang.Object obj68 = defaultedMap23.get((java.lang.Object) collection67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) (short) -1);
        boolean b74 = defaultedMap70.containsKey((java.lang.Object) (byte) 100);
        java.lang.Object obj75 = defaultedMap1.put(obj68, (java.lang.Object) defaultedMap70);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100 + "'", obj15.equals(100));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100 + "'", obj46.equals(100));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100 + "'", obj50.equals(100));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100 + "'", obj57.equals(100));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100 + "'", obj68.equals(100));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 100 + "'", obj72.equals(100));
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (-1L));
        java.util.Set set15 = defaultedMap7.entrySet();
        defaultedMap7.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate17, predicate18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) predicate18);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        java.lang.String str5 = defaultedMap1.toString();
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) str6);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection7 = defaultedMap4.values();
        java.lang.Object obj9 = defaultedMap4.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        boolean b20 = defaultedMap15.equals((java.lang.Object) (byte) 10);
        int i21 = defaultedMap15.size();
        java.lang.Object obj22 = defaultedMap4.put(obj13, (java.lang.Object) defaultedMap15);
        boolean b23 = defaultedMap4.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b23);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.equals((java.lang.Object) (byte) 10);
        int i15 = defaultedMap9.size();
        java.util.Collection collection16 = defaultedMap9.values();
        java.util.Set set17 = defaultedMap9.keySet();
        boolean b18 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) defaultedMap7, obj9);
        java.lang.Object obj12 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap7.keySet();
        int i14 = defaultedMap7.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (short) -1);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.lang.Object obj25 = defaultedMap14.remove((java.lang.Object) set24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object obj28 = defaultedMap8.get(obj27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection30 = defaultedMap1.values();
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap1.containsValue(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (short) 0);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) 10L);
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        boolean b13 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        boolean b43 = defaultedMap9.containsValue((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap45.clear();
        java.lang.Object obj48 = defaultedMap45.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.util.Set set50 = defaultedMap49.keySet();
        boolean b51 = defaultedMap9.containsKey((java.lang.Object) defaultedMap49);
        java.lang.Object obj52 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        java.util.Set set53 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection58 = defaultedMap55.values();
        java.lang.Object obj60 = defaultedMap55.remove((java.lang.Object) "");
        defaultedMap55.clear();
        java.lang.Object obj63 = defaultedMap55.remove((java.lang.Object) 0);
        java.util.Set set64 = defaultedMap55.keySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap55);
        java.lang.Object obj66 = defaultedMap1.get((java.lang.Object) defaultedMap65);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100 + "'", obj48.equals(100));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100 + "'", obj52.equals(100));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 100 + "'", obj66.equals(100));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap5.putAll((java.util.Map) defaultedMap7);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.put((java.lang.Object) defaultedMap7, obj9);
        java.lang.Object obj12 = defaultedMap7.remove((java.lang.Object) (-1.0f));
        java.util.Set set13 = defaultedMap7.keySet();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection20 = defaultedMap17.values();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        boolean b29 = defaultedMap24.equals((java.lang.Object) (byte) 0);
        java.util.Set set30 = defaultedMap24.keySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.lang.Object obj36 = defaultedMap17.put((java.lang.Object) defaultedMap24, (java.lang.Object) defaultedMap34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap17);
        collections.Transformer transformer38 = null;
        try {
            java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, transformer38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 10);
        int i18 = defaultedMap12.size();
        java.lang.Object obj19 = defaultedMap1.put(obj10, (java.lang.Object) defaultedMap12);
        boolean b20 = defaultedMap1.isEmpty();
        java.lang.String str21 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{100={}}" + "'", str21.equals("{100={}}"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        java.lang.String str21 = defaultedMap18.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        boolean b28 = defaultedMap23.equals((java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (-1L));
        java.util.Set set31 = defaultedMap23.entrySet();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap37.putAll((java.util.Map) defaultedMap39);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap33.put((java.lang.Object) defaultedMap39, obj41);
        java.lang.Object obj43 = defaultedMap23.get((java.lang.Object) defaultedMap39);
        java.util.Collection collection44 = defaultedMap39.values();
        boolean b45 = defaultedMap18.containsKey((java.lang.Object) defaultedMap39);
        java.util.Set set46 = defaultedMap39.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100 + "'", obj43.equals(100));
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.util.Set set4 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0f);
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 'a');
        int i14 = defaultedMap11.size();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection19 = defaultedMap16.values();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) "");
        java.util.Collection collection22 = defaultedMap16.values();
        java.lang.Object obj23 = defaultedMap11.get((java.lang.Object) collection22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) collection22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 'a');
        java.lang.String str29 = defaultedMap26.toString();
        boolean b31 = defaultedMap26.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) 1.0f);
        java.util.Collection collection34 = defaultedMap26.values();
        java.lang.Object obj35 = defaultedMap1.put((java.lang.Object) defaultedMap24, (java.lang.Object) collection34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection40 = defaultedMap37.values();
        java.lang.Object obj42 = defaultedMap37.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        boolean b49 = defaultedMap44.equals((java.lang.Object) (byte) 0);
        java.util.Set set50 = defaultedMap44.keySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.Object obj56 = defaultedMap37.put((java.lang.Object) defaultedMap44, (java.lang.Object) defaultedMap54);
        java.lang.String str57 = defaultedMap54.toString();
        boolean b58 = defaultedMap54.isEmpty();
        boolean b59 = defaultedMap24.containsKey((java.lang.Object) b58);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.keySet();
        java.util.Set set7 = defaultedMap5.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        java.lang.Object obj14 = defaultedMap9.remove((java.lang.Object) "");
        boolean b15 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 'a');
        java.lang.Object obj20 = null;
        java.lang.Object obj22 = defaultedMap17.put(obj20, (java.lang.Object) '#');
        int i23 = defaultedMap17.size();
        java.lang.Object obj25 = defaultedMap17.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection30 = defaultedMap27.values();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        boolean b39 = defaultedMap34.equals((java.lang.Object) (byte) 0);
        java.util.Set set40 = defaultedMap34.keySet();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj46 = defaultedMap27.put((java.lang.Object) defaultedMap34, (java.lang.Object) defaultedMap44);
        java.lang.Object obj47 = defaultedMap17.get((java.lang.Object) defaultedMap44);
        java.lang.Object obj48 = defaultedMap5.put((java.lang.Object) b15, obj47);
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 100 + "'", obj4.equals(100));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100 + "'", obj25.equals(100));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) 10L);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        boolean b11 = defaultedMap6.equals((java.lang.Object) (byte) 0);
        boolean b13 = defaultedMap6.containsValue((java.lang.Object) (-1L));
        java.util.Set set14 = defaultedMap6.entrySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b18 = defaultedMap16.containsKey((java.lang.Object) (short) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap16.put((java.lang.Object) defaultedMap22, obj24);
        java.lang.Object obj26 = defaultedMap6.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection31 = defaultedMap28.values();
        java.lang.Object obj33 = defaultedMap28.remove((java.lang.Object) "");
        boolean b34 = defaultedMap28.isEmpty();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 'a');
        java.lang.String str39 = defaultedMap36.toString();
        boolean b41 = defaultedMap36.equals((java.lang.Object) (byte) 10);
        int i42 = defaultedMap36.size();
        java.util.Set set43 = defaultedMap36.keySet();
        java.lang.Object obj44 = defaultedMap28.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap22.put((java.lang.Object) defaultedMap28, obj45);
        java.lang.Object obj47 = defaultedMap1.get(obj45);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100 + "'", obj38.equals(100));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100 + "'", obj44.equals(100));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = defaultedMap1.put(obj6, (java.lang.Object) (short) 1);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection11 = defaultedMap8.values();
        java.util.Collection collection12 = defaultedMap8.values();
        boolean b14 = defaultedMap8.equals((java.lang.Object) 1.0f);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.clear();
        java.util.Set set19 = defaultedMap17.entrySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) set19);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection26 = defaultedMap23.values();
        java.lang.Object obj28 = defaultedMap23.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        boolean b35 = defaultedMap30.equals((java.lang.Object) (byte) 0);
        java.util.Set set36 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.Object obj42 = defaultedMap23.put((java.lang.Object) defaultedMap30, (java.lang.Object) defaultedMap40);
        java.lang.String str43 = defaultedMap40.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) 'a');
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) (short) 0);
        java.lang.Object obj50 = null;
        java.lang.Object obj52 = defaultedMap45.put(obj50, (java.lang.Object) (short) 1);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 100.0f);
        defaultedMap40.putAll(map54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 'a');
        java.lang.String str60 = defaultedMap57.toString();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) 'a');
        java.lang.String str66 = defaultedMap63.toString();
        boolean b68 = defaultedMap63.equals((java.lang.Object) (byte) 10);
        int i69 = defaultedMap63.size();
        java.util.Collection collection70 = defaultedMap63.values();
        java.lang.Object obj71 = defaultedMap57.put((java.lang.Object) true, (java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection76 = defaultedMap73.values();
        java.lang.Object obj78 = defaultedMap73.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap80.putAll((java.util.Map) defaultedMap82);
        boolean b85 = defaultedMap80.equals((java.lang.Object) (byte) 0);
        java.util.Set set86 = defaultedMap80.keySet();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap88.putAll((java.util.Map) defaultedMap90);
        java.lang.Object obj92 = defaultedMap73.put((java.lang.Object) defaultedMap80, (java.lang.Object) defaultedMap90);
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) defaultedMap73);
        java.util.Collection collection94 = defaultedMap63.values();
        boolean b95 = defaultedMap40.containsKey((java.lang.Object) collection94);
        java.lang.Object obj96 = defaultedMap20.get((java.lang.Object) b95);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100 + "'", obj59.equals(100));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100 + "'", obj65.equals(100));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) 1.0f);
        java.util.Collection collection20 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 'a');
        java.lang.Object obj25 = null;
        java.lang.Object obj27 = defaultedMap22.put(obj25, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        boolean b35 = defaultedMap22.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection36 = defaultedMap22.values();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) collection36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection42 = defaultedMap39.values();
        java.lang.Object obj44 = defaultedMap39.remove((java.lang.Object) "");
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 'a');
        int i50 = defaultedMap47.size();
        int i51 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 'a');
        java.lang.String str56 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj61 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.String str62 = defaultedMap59.toString();
        boolean b64 = defaultedMap59.equals((java.lang.Object) (byte) 10);
        int i65 = defaultedMap59.size();
        java.util.Collection collection66 = defaultedMap59.values();
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) true, (java.lang.Object) defaultedMap59);
        java.lang.Object obj69 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.Object obj71 = defaultedMap59.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection76 = defaultedMap73.values();
        java.lang.Object obj78 = defaultedMap73.remove((java.lang.Object) "");
        java.util.Collection collection79 = defaultedMap73.values();
        defaultedMap59.putAll((java.util.Map) defaultedMap73);
        java.lang.Object obj81 = defaultedMap39.put((java.lang.Object) i51, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b85 = defaultedMap83.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection86 = defaultedMap83.values();
        java.lang.Object obj88 = defaultedMap83.remove((java.lang.Object) "");
        defaultedMap83.clear();
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate90, predicate91);
        boolean b93 = defaultedMap59.containsValue((java.lang.Object) defaultedMap83);
        java.util.Set set94 = defaultedMap83.keySet();
        java.lang.Object obj95 = defaultedMap1.remove((java.lang.Object) defaultedMap83);
        collections.Factory factory96 = null;
        try {
            java.util.Map map97 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap83, factory96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100 + "'", obj69.equals(100));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100 + "'", obj71.equals(100));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(obj95);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.containsValue(obj5);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        int i18 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 'a');
        java.lang.String str23 = defaultedMap20.toString();
        boolean b25 = defaultedMap20.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj27 = defaultedMap20.get((java.lang.Object) 1.0f);
        java.util.Collection collection28 = defaultedMap20.values();
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) collection28);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100 + "'", obj27.equals(100));
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = defaultedMap1.put(obj6, (java.lang.Object) (short) 1);
        java.util.Collection collection9 = defaultedMap1.values();
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{null=1}" + "'", str10.equals("{null=1}"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (short) -1);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.lang.Object obj25 = defaultedMap14.remove((java.lang.Object) set24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object obj28 = defaultedMap8.get(obj27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Collection collection30 = defaultedMap8.values();
        defaultedMap8.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        java.lang.Object obj14 = defaultedMap9.remove((java.lang.Object) "");
        boolean b15 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        java.util.Set set14 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj20 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection25 = defaultedMap22.values();
        java.lang.Object obj27 = defaultedMap22.remove((java.lang.Object) "");
        defaultedMap22.clear();
        java.lang.Object obj30 = defaultedMap22.remove((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.String str35 = defaultedMap32.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 'a');
        java.lang.String str41 = defaultedMap38.toString();
        boolean b43 = defaultedMap38.equals((java.lang.Object) (byte) 10);
        int i44 = defaultedMap38.size();
        java.util.Collection collection45 = defaultedMap38.values();
        java.lang.Object obj46 = defaultedMap32.put((java.lang.Object) true, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b53 = defaultedMap48.equals((java.lang.Object) (byte) 0);
        boolean b55 = defaultedMap48.containsValue((java.lang.Object) (-1L));
        java.util.Set set56 = defaultedMap48.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection61 = defaultedMap58.values();
        java.util.Collection collection62 = defaultedMap58.values();
        boolean b64 = defaultedMap58.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap66.clear();
        java.util.Set set68 = defaultedMap66.entrySet();
        java.lang.Object obj69 = defaultedMap58.remove((java.lang.Object) set68);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) set68);
        java.lang.Object obj71 = defaultedMap32.get((java.lang.Object) defaultedMap48);
        java.lang.Object obj72 = defaultedMap1.put((java.lang.Object) defaultedMap22, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj76 = defaultedMap74.get((java.lang.Object) 'a');
        int i77 = defaultedMap74.size();
        int i78 = defaultedMap74.size();
        java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) i78);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100 + "'", obj40.equals(100));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100 + "'", obj71.equals(100));
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 100 + "'", obj76.equals(100));
        org.junit.Assert.assertTrue(i77 == 0);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj19 = defaultedMap12.get((java.lang.Object) 1.0f);
        java.util.Collection collection20 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 'a');
        java.lang.Object obj25 = null;
        java.lang.Object obj27 = defaultedMap22.put(obj25, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        boolean b34 = defaultedMap29.equals((java.lang.Object) (byte) 0);
        boolean b35 = defaultedMap22.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection36 = defaultedMap22.values();
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) defaultedMap12, (java.lang.Object) collection36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection42 = defaultedMap39.values();
        java.lang.Object obj44 = defaultedMap39.remove((java.lang.Object) "");
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 'a');
        int i50 = defaultedMap47.size();
        int i51 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 'a');
        java.lang.String str56 = defaultedMap53.toString();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj61 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.String str62 = defaultedMap59.toString();
        boolean b64 = defaultedMap59.equals((java.lang.Object) (byte) 10);
        int i65 = defaultedMap59.size();
        java.util.Collection collection66 = defaultedMap59.values();
        java.lang.Object obj67 = defaultedMap53.put((java.lang.Object) true, (java.lang.Object) defaultedMap59);
        java.lang.Object obj69 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.Object obj71 = defaultedMap59.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b75 = defaultedMap73.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection76 = defaultedMap73.values();
        java.lang.Object obj78 = defaultedMap73.remove((java.lang.Object) "");
        java.util.Collection collection79 = defaultedMap73.values();
        defaultedMap59.putAll((java.util.Map) defaultedMap73);
        java.lang.Object obj81 = defaultedMap39.put((java.lang.Object) i51, (java.lang.Object) defaultedMap59);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b85 = defaultedMap83.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection86 = defaultedMap83.values();
        java.lang.Object obj88 = defaultedMap83.remove((java.lang.Object) "");
        defaultedMap83.clear();
        collections.Predicate predicate90 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap83, predicate90, predicate91);
        boolean b93 = defaultedMap59.containsValue((java.lang.Object) defaultedMap83);
        java.util.Set set94 = defaultedMap83.keySet();
        java.lang.Object obj95 = defaultedMap1.remove((java.lang.Object) defaultedMap83);
        java.util.Set set96 = defaultedMap1.keySet();
        java.lang.String str97 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100 + "'", obj8.equals(100));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100 + "'", obj14.equals(100));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100 + "'", obj19.equals(100));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(i65 == 0);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 100 + "'", obj69.equals(100));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100 + "'", obj71.equals(100));
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertNotNull(set96);
        org.junit.Assert.assertTrue("'" + str97 + "' != '" + "{}" + "'", str97.equals("{}"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        int i18 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 'a');
        java.lang.Object obj23 = null;
        java.lang.Object obj25 = defaultedMap20.put(obj23, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 'a');
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj35 = defaultedMap33.get((java.lang.Object) 'a');
        java.lang.String str36 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) 'a');
        java.lang.String str42 = defaultedMap39.toString();
        boolean b44 = defaultedMap39.equals((java.lang.Object) (byte) 10);
        int i45 = defaultedMap39.size();
        java.util.Collection collection46 = defaultedMap39.values();
        java.lang.Object obj47 = defaultedMap33.put((java.lang.Object) true, (java.lang.Object) defaultedMap39);
        java.lang.Object obj49 = defaultedMap39.get((java.lang.Object) 'a');
        int i50 = defaultedMap39.size();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.Object obj55 = null;
        java.lang.Object obj57 = defaultedMap52.put(obj55, (java.lang.Object) '#');
        int i58 = defaultedMap52.size();
        java.lang.Object obj60 = defaultedMap52.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection65 = defaultedMap62.values();
        java.lang.Object obj67 = defaultedMap62.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj75 = defaultedMap73.get((java.lang.Object) 'a');
        java.lang.String str76 = defaultedMap73.toString();
        boolean b78 = defaultedMap73.equals((java.lang.Object) (byte) 10);
        int i79 = defaultedMap73.size();
        java.lang.Object obj80 = defaultedMap62.put(obj71, (java.lang.Object) defaultedMap73);
        defaultedMap52.putAll((java.util.Map) defaultedMap73);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap52);
        java.lang.Object obj83 = defaultedMap28.get((java.lang.Object) defaultedMap39);
        defaultedMap26.putAll((java.util.Map) defaultedMap39);
        boolean b85 = defaultedMap7.containsValue((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100 + "'", obj22.equals(100));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100 + "'", obj30.equals(100));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100 + "'", obj35.equals(100));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100 + "'", obj41.equals(100));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100 + "'", obj60.equals(100));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100 + "'", obj71.equals(100));
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + 100 + "'", obj75.equals(100));
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(i79 == 0);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 100 + "'", obj83.equals(100));
        org.junit.Assert.assertTrue(b85 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        boolean b24 = defaultedMap19.equals((java.lang.Object) (byte) 0);
        java.util.Set set25 = defaultedMap19.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection31 = defaultedMap28.values();
        java.lang.Object obj33 = defaultedMap28.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        boolean b40 = defaultedMap35.equals((java.lang.Object) (byte) 0);
        java.util.Set set41 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap43.putAll((java.util.Map) defaultedMap45);
        java.lang.Object obj47 = defaultedMap28.put((java.lang.Object) defaultedMap35, (java.lang.Object) defaultedMap45);
        java.lang.String str48 = defaultedMap45.toString();
        java.lang.Object obj49 = defaultedMap26.get((java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 'a');
        java.lang.String str54 = defaultedMap51.toString();
        boolean b56 = defaultedMap51.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = defaultedMap51.get((java.lang.Object) 1.0f);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) 10.0f);
        boolean b61 = defaultedMap26.equals((java.lang.Object) defaultedMap51);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100 + "'", obj53.equals(100));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 100 + "'", obj58.equals(100));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 10);
        int i7 = defaultedMap1.size();
        java.util.Collection collection8 = defaultedMap1.values();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        java.lang.String str11 = defaultedMap1.toString();
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) 'a');
        java.lang.String str17 = defaultedMap14.toString();
        boolean b19 = defaultedMap14.equals((java.lang.Object) (byte) 10);
        int i20 = defaultedMap14.size();
        java.util.Collection collection21 = defaultedMap14.values();
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) true, (java.lang.Object) defaultedMap14);
        java.lang.Object obj24 = defaultedMap14.get((java.lang.Object) 'a');
        java.lang.Object obj26 = defaultedMap14.get((java.lang.Object) 0.0f);
        java.lang.Object obj27 = defaultedMap1.remove(obj26);
        boolean b29 = defaultedMap1.equals((java.lang.Object) 10.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100 + "'", obj16.equals(100));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100 + "'", obj26.equals(100));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) (short) 0);
        java.lang.Object obj6 = null;
        java.lang.Object obj8 = defaultedMap1.put(obj6, (java.lang.Object) (short) 1);
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap1.equals(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection15 = defaultedMap12.values();
        java.lang.Object obj17 = defaultedMap12.remove((java.lang.Object) "");
        defaultedMap12.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate19, predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate20, predicate22);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100 + "'", obj5.equals(100));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection13 = defaultedMap10.values();
        java.lang.Object obj15 = defaultedMap10.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        boolean b22 = defaultedMap17.equals((java.lang.Object) (byte) 0);
        java.util.Set set23 = defaultedMap17.keySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj29 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) defaultedMap27);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) (short) 0);
        java.lang.Object obj37 = null;
        java.lang.Object obj39 = defaultedMap32.put(obj37, (java.lang.Object) (short) 1);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 100.0f);
        defaultedMap27.putAll(map41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) defaultedMap8, (java.lang.Object) defaultedMap27);
        boolean b44 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) 'a');
        java.lang.String str49 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.String str55 = defaultedMap52.toString();
        boolean b57 = defaultedMap52.equals((java.lang.Object) (byte) 10);
        int i58 = defaultedMap52.size();
        java.util.Collection collection59 = defaultedMap52.values();
        java.lang.Object obj60 = defaultedMap46.put((java.lang.Object) true, (java.lang.Object) defaultedMap52);
        java.lang.Object obj62 = defaultedMap52.get((java.lang.Object) 'a');
        java.lang.Object obj64 = defaultedMap52.get((java.lang.Object) 0.0f);
        java.util.Collection collection65 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) collection65);
        defaultedMap1.putAll((java.util.Map) defaultedMap66);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100 + "'", obj36.equals(100));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100 + "'", obj48.equals(100));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100 + "'", obj54.equals(100));
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(i58 == 0);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 100 + "'", obj62.equals(100));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 100 + "'", obj64.equals(100));
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (byte) 10);
        int i13 = defaultedMap7.size();
        java.util.Collection collection14 = defaultedMap7.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) defaultedMap7);
        java.lang.Object obj17 = defaultedMap7.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj21 = defaultedMap19.get((java.lang.Object) 'a');
        int i22 = defaultedMap19.size();
        boolean b23 = defaultedMap19.isEmpty();
        java.lang.Object obj24 = defaultedMap7.get((java.lang.Object) defaultedMap19);
        java.util.Set set25 = defaultedMap7.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100 + "'", obj9.equals(100));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100 + "'", obj21.equals(100));
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100 + "'", obj24.equals(100));
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) (short) 0);
        java.lang.Object obj14 = null;
        java.lang.Object obj16 = defaultedMap9.put(obj14, (java.lang.Object) (short) 1);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100.0f);
        boolean b19 = defaultedMap9.isEmpty();
        boolean b20 = defaultedMap1.containsValue((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.put((java.lang.Object) 1L, (java.lang.Object) (short) 100);
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection12 = defaultedMap9.values();
        java.lang.Object obj14 = defaultedMap9.remove((java.lang.Object) "");
        boolean b15 = defaultedMap9.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        boolean b20 = defaultedMap15.equals((java.lang.Object) (byte) 0);
        boolean b22 = defaultedMap15.containsValue((java.lang.Object) (-1L));
        java.util.Set set23 = defaultedMap15.entrySet();
        defaultedMap15.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate25, predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate26, predicate28);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection15 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.String str21 = defaultedMap17.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap23.clear();
        java.util.Set set25 = defaultedMap23.entrySet();
        boolean b26 = defaultedMap17.equals((java.lang.Object) set25);
        boolean b27 = defaultedMap1.containsValue((java.lang.Object) set25);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (short) -1);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.lang.Object obj25 = defaultedMap14.remove((java.lang.Object) set24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object obj28 = defaultedMap8.get(obj27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        java.util.Set set30 = defaultedMap8.entrySet();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        java.lang.String str35 = defaultedMap32.toString();
        boolean b37 = defaultedMap32.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) 1.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) 'a');
        java.lang.String str46 = defaultedMap43.toString();
        boolean b48 = defaultedMap43.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj50 = defaultedMap43.get((java.lang.Object) 1.0f);
        java.util.Collection collection51 = defaultedMap43.values();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) 'a');
        java.lang.Object obj56 = null;
        java.lang.Object obj58 = defaultedMap53.put(obj56, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        boolean b65 = defaultedMap60.equals((java.lang.Object) (byte) 0);
        boolean b66 = defaultedMap53.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection67 = defaultedMap53.values();
        java.lang.Object obj68 = defaultedMap32.put((java.lang.Object) defaultedMap43, (java.lang.Object) collection67);
        java.util.Set set69 = defaultedMap43.entrySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 'a');
        java.lang.Object obj74 = null;
        java.lang.Object obj76 = defaultedMap71.put(obj74, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj80 = defaultedMap78.get((java.lang.Object) 'a');
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) (short) 0);
        java.lang.Object obj83 = null;
        java.lang.Object obj85 = defaultedMap78.put(obj83, (java.lang.Object) (short) 1);
        java.util.Map map87 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) 100.0f);
        defaultedMap71.putAll(map87);
        java.lang.Object obj89 = defaultedMap8.put((java.lang.Object) set69, (java.lang.Object) defaultedMap71);
        int i90 = defaultedMap8.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100 + "'", obj34.equals(100));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100 + "'", obj45.equals(100));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100 + "'", obj50.equals(100));
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 100 + "'", obj55.equals(100));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100 + "'", obj73.equals(100));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 100 + "'", obj80.equals(100));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 100 + "'", obj82.equals(100));
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue(i90 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection9 = defaultedMap6.values();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) "");
        java.util.Collection collection12 = defaultedMap6.values();
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 'a');
        boolean b19 = defaultedMap16.isEmpty();
        boolean b20 = defaultedMap14.containsKey((java.lang.Object) b19);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100 + "'", obj13.equals(100));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100 + "'", obj18.equals(100));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        java.lang.Object obj6 = defaultedMap1.put(obj4, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        boolean b13 = defaultedMap8.equals((java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection15 = defaultedMap1.values();
        java.util.Set set16 = defaultedMap1.keySet();
        int i17 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b21 = defaultedMap19.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection22 = defaultedMap19.values();
        java.lang.Object obj24 = defaultedMap19.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) (short) -1);
        java.util.Set set29 = defaultedMap26.entrySet();
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection35 = defaultedMap32.values();
        java.util.Collection collection36 = defaultedMap32.values();
        boolean b38 = defaultedMap32.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap40.clear();
        java.util.Set set42 = defaultedMap40.entrySet();
        java.lang.Object obj43 = defaultedMap32.remove((java.lang.Object) set42);
        java.lang.Object obj44 = defaultedMap26.remove((java.lang.Object) defaultedMap32);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = defaultedMap26.get(obj45);
        java.lang.Object obj47 = defaultedMap19.get((java.lang.Object) defaultedMap26);
        java.util.Collection collection48 = defaultedMap19.values();
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap51.putAll((java.util.Map) defaultedMap53);
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) 100L);
        boolean b57 = defaultedMap1.containsKey((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100 + "'", obj3.equals(100));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100 + "'", obj46.equals(100));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100 + "'", obj49.equals(100));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 'a');
        int i12 = defaultedMap9.size();
        int i13 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 'a');
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (byte) 10);
        int i27 = defaultedMap21.size();
        java.util.Collection collection28 = defaultedMap21.values();
        java.lang.Object obj29 = defaultedMap15.put((java.lang.Object) true, (java.lang.Object) defaultedMap21);
        java.lang.Object obj31 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj33 = defaultedMap21.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection38 = defaultedMap35.values();
        java.lang.Object obj40 = defaultedMap35.remove((java.lang.Object) "");
        java.util.Collection collection41 = defaultedMap35.values();
        defaultedMap21.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) i13, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection48 = defaultedMap45.values();
        java.lang.Object obj50 = defaultedMap45.remove((java.lang.Object) "");
        defaultedMap45.clear();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate52, predicate53);
        boolean b55 = defaultedMap21.containsValue((java.lang.Object) defaultedMap45);
        java.util.Set set56 = defaultedMap45.keySet();
        boolean b58 = defaultedMap45.containsValue((java.lang.Object) "{null=#}");
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj62 = defaultedMap60.get((java.lang.Object) 'a');
        int i63 = defaultedMap60.size();
        boolean b64 = defaultedMap60.isEmpty();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) 'a');
        java.lang.String str69 = defaultedMap66.toString();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) 'a');
        java.lang.String str75 = defaultedMap72.toString();
        boolean b77 = defaultedMap72.equals((java.lang.Object) (byte) 10);
        int i78 = defaultedMap72.size();
        java.util.Collection collection79 = defaultedMap72.values();
        java.lang.Object obj80 = defaultedMap66.put((java.lang.Object) true, (java.lang.Object) defaultedMap72);
        java.lang.Object obj82 = defaultedMap72.get((java.lang.Object) 'a');
        java.lang.Object obj84 = defaultedMap72.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b88 = defaultedMap86.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection89 = defaultedMap86.values();
        java.lang.Object obj91 = defaultedMap86.remove((java.lang.Object) "");
        java.util.Collection collection92 = defaultedMap86.values();
        defaultedMap72.putAll((java.util.Map) defaultedMap86);
        boolean b94 = defaultedMap60.containsValue((java.lang.Object) defaultedMap72);
        collections.map.DefaultedMap defaultedMap95 = new collections.map.DefaultedMap((java.lang.Object) b94);
        collections.map.DefaultedMap defaultedMap96 = new collections.map.DefaultedMap((java.lang.Object) b94);
        int i97 = defaultedMap96.size();
        defaultedMap45.putAll((java.util.Map) defaultedMap96);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100 + "'", obj11.equals(100));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100 + "'", obj17.equals(100));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100 + "'", obj23.equals(100));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100 + "'", obj31.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 100 + "'", obj62.equals(100));
        org.junit.Assert.assertTrue(i63 == 0);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100 + "'", obj68.equals(100));
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 100 + "'", obj74.equals(100));
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(i78 == 0);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 100 + "'", obj82.equals(100));
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 100 + "'", obj84.equals(100));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(collection92);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertTrue(i97 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection4 = defaultedMap1.values();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) (short) -1);
        java.util.Set set11 = defaultedMap8.entrySet();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Collection collection18 = defaultedMap14.values();
        boolean b20 = defaultedMap14.equals((java.lang.Object) 1.0f);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.lang.Object obj25 = defaultedMap14.remove((java.lang.Object) set24);
        java.lang.Object obj26 = defaultedMap8.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object obj28 = defaultedMap8.get(obj27);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 'a');
        java.lang.Object obj34 = null;
        java.lang.Object obj36 = defaultedMap31.put(obj34, (java.lang.Object) '#');
        int i37 = defaultedMap31.size();
        java.lang.Object obj39 = defaultedMap31.get((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (short) 0);
        java.util.Collection collection44 = defaultedMap41.values();
        java.lang.Object obj46 = defaultedMap41.remove((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        boolean b53 = defaultedMap48.equals((java.lang.Object) (byte) 0);
        java.util.Set set54 = defaultedMap48.keySet();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        java.lang.Object obj60 = defaultedMap41.put((java.lang.Object) defaultedMap48, (java.lang.Object) defaultedMap58);
        java.lang.Object obj61 = defaultedMap31.get((java.lang.Object) defaultedMap58);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) 'a');
        java.lang.String str66 = defaultedMap63.toString();
        boolean b68 = defaultedMap63.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj70 = defaultedMap63.get((java.lang.Object) 1.0f);
        java.lang.Object obj71 = defaultedMap1.put((java.lang.Object) defaultedMap31, (java.lang.Object) defaultedMap63);
        java.lang.String str72 = defaultedMap63.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100 + "'", obj10.equals(100));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100 + "'", obj28.equals(100));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100 + "'", obj29.equals(100));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100 + "'", obj33.equals(100));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(i37 == 1);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100 + "'", obj39.equals(100));
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100 + "'", obj61.equals(100));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100 + "'", obj65.equals(100));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100 + "'", obj70.equals(100));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap1.equals((java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (-1L));
        java.util.Set set9 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        boolean b16 = defaultedMap11.equals((java.lang.Object) (byte) 0);
        boolean b18 = defaultedMap11.containsValue((java.lang.Object) (-1L));
        java.util.Set set19 = defaultedMap11.entrySet();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        boolean b27 = defaultedMap22.equals((java.lang.Object) (byte) 0);
        java.lang.String str28 = defaultedMap22.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        boolean b35 = defaultedMap30.equals((java.lang.Object) (byte) 0);
        java.util.Set set36 = defaultedMap30.keySet();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) set36);
        boolean b38 = defaultedMap22.equals((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 'a');
        java.lang.String str43 = defaultedMap40.toString();
        boolean b45 = defaultedMap40.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj47 = defaultedMap40.get((java.lang.Object) 1.0f);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 'a');
        java.lang.String str54 = defaultedMap51.toString();
        boolean b56 = defaultedMap51.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj58 = defaultedMap51.get((java.lang.Object) 1.0f);
        java.util.Collection collection59 = defaultedMap51.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100);
        java.lang.Object obj63 = defaultedMap61.get((java.lang.Object) 'a');
        java.lang.Object obj64 = null;
        java.lang.Object obj66 = defaultedMap61.put(obj64, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100);
        defaultedMap68.putAll((java.util.Map) defaultedMap70);
        boolean b73 = defaultedMap68.equals((java.lang.Object) (byte) 0);
        boolean b74 = defaultedMap61.containsKey((java.lang.Object) (byte) 0);
        java.util.Collection collection75 = defaultedMap61.values();
        java.lang.Object obj76 = defaultedMap40.put((java.lang.Object) defaultedMap51, (java.lang.Object) collection75);
        java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) collection75);
        java.lang.Object obj78 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) map77);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100 + "'", obj42.equals(100));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100 + "'", obj47.equals(100));
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100 + "'", obj53.equals(100));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 100 + "'", obj58.equals(100));
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100 + "'", obj63.equals(100));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj78);
    }
}

