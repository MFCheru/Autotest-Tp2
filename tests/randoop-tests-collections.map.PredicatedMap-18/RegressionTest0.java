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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.util.Collection collection3 = defaultedMap1.values();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap6.containsValue((java.lang.Object) b14);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        defaultedMap11.clear();
        java.util.Set set15 = defaultedMap11.entrySet();
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.util.Set set17 = defaultedMap11.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100L + "'", obj16.equals(100L));
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 10.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Set set19 = defaultedMap17.entrySet();
        boolean b20 = defaultedMap11.containsKey((java.lang.Object) set19);
        boolean b21 = defaultedMap11.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10.0d);
        boolean b6 = defaultedMap1.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = defaultedMap5.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap1.get(obj13);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) set19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.util.Set set25 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        java.util.Set set36 = defaultedMap34.entrySet();
        java.util.Set set37 = defaultedMap34.keySet();
        java.lang.Object obj38 = defaultedMap27.get((java.lang.Object) set37);
        boolean b39 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap41.clear();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap27.remove((java.lang.Object) collection43);
        java.lang.Object obj45 = defaultedMap12.put((java.lang.Object) set25, (java.lang.Object) defaultedMap27);
        boolean b46 = defaultedMap5.containsValue((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap52);
        boolean b55 = defaultedMap52.containsKey((java.lang.Object) (short) 10);
        defaultedMap52.clear();
        java.lang.String str57 = defaultedMap52.toString();
        boolean b58 = defaultedMap5.equals((java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100L + "'", obj38.equals(100L));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue(b58 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        int i15 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 0L);
        java.lang.String str12 = defaultedMap5.toString();
        java.lang.String str13 = defaultedMap5.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10.0d);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        java.lang.String str10 = defaultedMap5.toString();
        java.util.Collection collection11 = defaultedMap5.values();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap28.clear();
        java.util.Set set30 = defaultedMap28.entrySet();
        java.util.Set set31 = defaultedMap28.keySet();
        java.lang.Object obj32 = defaultedMap21.get((java.lang.Object) set31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) set31);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100L + "'", obj32.equals(100L));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100L + "'", obj33.equals(100L));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) (short) 10);
        java.util.Set set24 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 10.0d);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b35 = defaultedMap26.containsKey((java.lang.Object) set34);
        boolean b36 = defaultedMap6.containsValue((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap42);
        boolean b45 = defaultedMap42.containsKey((java.lang.Object) (short) 10);
        java.util.Set set46 = defaultedMap42.entrySet();
        java.lang.Object obj47 = defaultedMap26.get((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap4.clear();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap4.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Collection collection19 = defaultedMap17.values();
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        java.util.Collection collection24 = defaultedMap22.values();
        boolean b25 = defaultedMap12.equals((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        boolean b29 = defaultedMap27.isEmpty();
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.util.Collection collection34 = defaultedMap32.values();
        boolean b35 = defaultedMap27.containsKey((java.lang.Object) defaultedMap32);
        boolean b36 = defaultedMap32.isEmpty();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate38, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate10, predicate38);
        boolean b43 = defaultedMap1.equals((java.lang.Object) defaultedMap4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        boolean b19 = defaultedMap17.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) predicate21, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        boolean b46 = defaultedMap38.containsKey((java.lang.Object) defaultedMap43);
        defaultedMap6.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap49.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj54 = defaultedMap49.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap53);
        boolean b56 = defaultedMap53.containsKey((java.lang.Object) (short) 10);
        java.util.Set set57 = defaultedMap53.entrySet();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap59.clear();
        java.lang.Object obj62 = defaultedMap59.remove((java.lang.Object) 10.0d);
        defaultedMap53.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap65.clear();
        java.util.Set set67 = defaultedMap65.entrySet();
        boolean b68 = defaultedMap59.containsKey((java.lang.Object) set67);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) b68);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(map69);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 10.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        boolean b8 = defaultedMap6.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap15);
        java.util.Set set17 = defaultedMap11.keySet();
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100L + "'", obj18.equals(100L));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.util.Set set18 = defaultedMap13.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        boolean b8 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        boolean b14 = defaultedMap6.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap16.clear();
        java.util.Collection collection18 = defaultedMap16.values();
        boolean b19 = defaultedMap6.equals((java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        java.util.Collection collection28 = defaultedMap26.values();
        boolean b29 = defaultedMap21.containsKey((java.lang.Object) defaultedMap26);
        boolean b30 = defaultedMap26.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate32, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap44.clear();
        java.util.Set set46 = defaultedMap44.entrySet();
        java.util.Set set47 = defaultedMap44.keySet();
        java.lang.Object obj48 = defaultedMap37.get((java.lang.Object) set47);
        boolean b49 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        java.util.Collection collection53 = defaultedMap51.values();
        java.lang.Object obj54 = defaultedMap37.remove((java.lang.Object) collection53);
        boolean b55 = defaultedMap37.isEmpty();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap57.clear();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj62 = defaultedMap57.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap61);
        boolean b64 = defaultedMap61.containsKey((java.lang.Object) (short) 10);
        boolean b66 = defaultedMap61.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap68.clear();
        boolean b70 = defaultedMap68.isEmpty();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate71, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap75.clear();
        boolean b77 = defaultedMap75.isEmpty();
        defaultedMap75.clear();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap80.clear();
        java.util.Collection collection82 = defaultedMap80.values();
        boolean b83 = defaultedMap75.containsKey((java.lang.Object) defaultedMap80);
        boolean b84 = defaultedMap80.isEmpty();
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate85, predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate72, predicate86);
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate86, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate89);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100L + "'", obj48.equals(100L));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue(b77 == true);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.util.Set set20 = defaultedMap1.entrySet();
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.Transformer transformer31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, transformer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) (short) 10);
        java.util.Set set24 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 10.0d);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b35 = defaultedMap26.containsKey((java.lang.Object) set34);
        boolean b36 = defaultedMap6.containsValue((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap45.clear();
        java.util.Set set47 = defaultedMap45.entrySet();
        java.util.Set set48 = defaultedMap45.keySet();
        java.lang.Object obj49 = defaultedMap38.get((java.lang.Object) set48);
        boolean b50 = defaultedMap38.isEmpty();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap52.clear();
        java.util.Collection collection54 = defaultedMap52.values();
        java.lang.Object obj55 = defaultedMap38.remove((java.lang.Object) collection54);
        boolean b56 = defaultedMap38.isEmpty();
        java.lang.String str57 = defaultedMap38.toString();
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) str57);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{-1={}}" + "'", str57.equals("{-1={}}"));
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        java.util.Collection collection39 = defaultedMap37.values();
        boolean b40 = defaultedMap32.containsKey((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        java.util.Collection collection44 = defaultedMap42.values();
        boolean b45 = defaultedMap32.equals((java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = defaultedMap19.get((java.lang.Object) defaultedMap32);
        java.util.Set set47 = defaultedMap19.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertNotNull(set47);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Collection collection17 = defaultedMap15.values();
        defaultedMap15.clear();
        java.util.Set set19 = defaultedMap15.entrySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate(map13, (java.lang.Object) set19);
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate(map13, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap19.clear();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        java.util.Collection collection26 = defaultedMap24.values();
        boolean b27 = defaultedMap19.containsKey((java.lang.Object) defaultedMap24);
        boolean b28 = defaultedMap24.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap38);
        boolean b41 = defaultedMap38.containsKey((java.lang.Object) (short) 10);
        java.util.Set set42 = defaultedMap38.entrySet();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap44.clear();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj49 = defaultedMap44.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        boolean b53 = defaultedMap51.isEmpty();
        defaultedMap51.clear();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap51);
        boolean b56 = defaultedMap38.containsKey((java.lang.Object) defaultedMap48);
        java.util.Set set57 = defaultedMap38.entrySet();
        java.util.Map map58 = collections.map.DefaultedMap.decorate(map32, (java.lang.Object) defaultedMap38);
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = defaultedMap38.get(obj59);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100L + "'", obj60.equals(100L));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.util.Collection collection3 = defaultedMap1.values();
        defaultedMap1.clear();
        java.util.Set set5 = defaultedMap1.entrySet();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        boolean b26 = defaultedMap24.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj43 = defaultedMap13.put((java.lang.Object) predicate28, (java.lang.Object) map42);
        collections.Predicate predicate44 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap46.clear();
        boolean b48 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        java.util.Collection collection53 = defaultedMap51.values();
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) defaultedMap51);
        boolean b55 = defaultedMap51.isEmpty();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate44, predicate57);
        boolean b60 = defaultedMap5.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap69.clear();
        boolean b71 = defaultedMap69.isEmpty();
        defaultedMap69.clear();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap74.clear();
        java.util.Collection collection76 = defaultedMap74.values();
        boolean b77 = defaultedMap69.containsKey((java.lang.Object) defaultedMap74);
        boolean b78 = defaultedMap62.equals((java.lang.Object) defaultedMap74);
        java.lang.Object obj80 = defaultedMap62.remove((java.lang.Object) false);
        java.util.Set set81 = defaultedMap62.entrySet();
        boolean b82 = defaultedMap13.containsValue((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.util.Set set18 = defaultedMap1.keySet();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        java.lang.String str10 = defaultedMap5.toString();
        defaultedMap5.clear();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) "");
        boolean b14 = defaultedMap5.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap20.clear();
        boolean b22 = defaultedMap20.isEmpty();
        defaultedMap20.clear();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) defaultedMap20);
        defaultedMap6.putAll(map24);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Collection collection17 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) collection17);
        boolean b19 = defaultedMap1.isEmpty();
        java.lang.String str20 = defaultedMap1.toString();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10);
        java.util.Set set23 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{-1={}}" + "'", str20.equals("{-1={}}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.keySet();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        boolean b30 = defaultedMap22.containsKey((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.util.Collection collection34 = defaultedMap32.values();
        boolean b35 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        boolean b39 = defaultedMap37.isEmpty();
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        java.util.Collection collection44 = defaultedMap42.values();
        boolean b45 = defaultedMap37.containsKey((java.lang.Object) defaultedMap42);
        boolean b46 = defaultedMap42.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate48);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate48);
        java.util.Set set54 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap6.values();
        java.util.Set set16 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap3.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap3.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap10.clear();
        boolean b12 = defaultedMap10.isEmpty();
        defaultedMap10.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Collection collection17 = defaultedMap15.values();
        boolean b18 = defaultedMap10.containsKey((java.lang.Object) defaultedMap15);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate19, predicate20);
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) true);
        java.util.Collection collection24 = defaultedMap15.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        boolean b28 = defaultedMap26.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap33.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap40.clear();
        boolean b42 = defaultedMap40.isEmpty();
        defaultedMap40.clear();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap40);
        java.lang.Object obj45 = defaultedMap15.put((java.lang.Object) predicate30, (java.lang.Object) map44);
        collections.Predicate predicate46 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap48.clear();
        boolean b50 = defaultedMap48.isEmpty();
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap53.clear();
        java.util.Collection collection55 = defaultedMap53.values();
        boolean b56 = defaultedMap48.containsKey((java.lang.Object) defaultedMap53);
        boolean b57 = defaultedMap53.isEmpty();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate58, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate59);
        boolean b62 = defaultedMap7.containsKey((java.lang.Object) defaultedMap15);
        boolean b63 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        java.util.Collection collection20 = defaultedMap18.values();
        boolean b21 = defaultedMap13.containsKey((java.lang.Object) defaultedMap18);
        boolean b22 = defaultedMap18.isEmpty();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        defaultedMap27.clear();
        java.util.Set set31 = defaultedMap27.entrySet();
        java.util.Map map32 = collections.map.DefaultedMap.decorate(map25, (java.lang.Object) set31);
        boolean b33 = defaultedMap11.containsValue((java.lang.Object) map25);
        java.lang.Object obj34 = defaultedMap5.remove((java.lang.Object) defaultedMap11);
        int i35 = defaultedMap5.size();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(i35 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.lang.String str34 = defaultedMap32.toString();
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) defaultedMap32);
        int i36 = defaultedMap19.size();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Collection collection19 = defaultedMap17.values();
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate21);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        java.util.Set set36 = defaultedMap34.entrySet();
        java.util.Set set37 = defaultedMap34.keySet();
        java.lang.Object obj38 = defaultedMap27.get((java.lang.Object) set37);
        boolean b39 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap41.clear();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap27.remove((java.lang.Object) collection43);
        boolean b45 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj52 = defaultedMap47.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap51);
        boolean b54 = defaultedMap51.containsKey((java.lang.Object) (short) 10);
        boolean b56 = defaultedMap51.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap58.clear();
        boolean b60 = defaultedMap58.isEmpty();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate61, predicate62);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap65.clear();
        boolean b67 = defaultedMap65.isEmpty();
        defaultedMap65.clear();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap70.clear();
        java.util.Collection collection72 = defaultedMap70.values();
        boolean b73 = defaultedMap65.containsKey((java.lang.Object) defaultedMap70);
        boolean b74 = defaultedMap70.isEmpty();
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate62, predicate76);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate76, predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate76);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100L + "'", obj38.equals(100L));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) set19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.util.Set set25 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        java.util.Set set36 = defaultedMap34.entrySet();
        java.util.Set set37 = defaultedMap34.keySet();
        java.lang.Object obj38 = defaultedMap27.get((java.lang.Object) set37);
        boolean b39 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap41.clear();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap27.remove((java.lang.Object) collection43);
        java.lang.Object obj45 = defaultedMap12.put((java.lang.Object) set25, (java.lang.Object) defaultedMap27);
        boolean b46 = defaultedMap5.containsValue((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap55.clear();
        boolean b57 = defaultedMap55.isEmpty();
        defaultedMap55.clear();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap55);
        boolean b60 = defaultedMap5.equals((java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap66);
        boolean b69 = defaultedMap66.containsKey((java.lang.Object) (short) 10);
        defaultedMap66.clear();
        boolean b71 = defaultedMap52.containsValue((java.lang.Object) defaultedMap66);
        java.util.Set set72 = defaultedMap52.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100L + "'", obj38.equals(100L));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        defaultedMap11.clear();
        java.util.Set set15 = defaultedMap11.entrySet();
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.util.Set set27 = defaultedMap25.entrySet();
        java.util.Set set28 = defaultedMap25.keySet();
        java.lang.Object obj29 = defaultedMap18.get((java.lang.Object) set28);
        boolean b30 = defaultedMap18.isEmpty();
        java.util.Set set31 = defaultedMap18.keySet();
        boolean b32 = defaultedMap5.equals((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100L + "'", obj16.equals(100L));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100L + "'", obj29.equals(100L));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.lang.String str34 = defaultedMap32.toString();
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap41);
        boolean b44 = defaultedMap41.containsKey((java.lang.Object) (short) 10);
        boolean b46 = defaultedMap41.containsValue((java.lang.Object) 1L);
        java.lang.Object obj48 = defaultedMap41.get((java.lang.Object) "");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap54);
        boolean b57 = defaultedMap54.containsKey((java.lang.Object) (short) 10);
        java.lang.String str58 = defaultedMap54.toString();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) str58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap61.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj66 = defaultedMap61.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap65);
        boolean b68 = defaultedMap65.containsKey((java.lang.Object) (short) 10);
        java.util.Set set69 = defaultedMap65.entrySet();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap71.clear();
        java.lang.Object obj74 = defaultedMap71.remove((java.lang.Object) 10.0d);
        defaultedMap65.putAll((java.util.Map) defaultedMap71);
        java.lang.Object obj76 = defaultedMap32.put((java.lang.Object) map59, (java.lang.Object) defaultedMap71);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100L + "'", obj48.equals(100L));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        defaultedMap11.clear();
        java.util.Set set15 = defaultedMap11.entrySet();
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.util.Collection collection17 = defaultedMap5.values();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100L + "'", obj16.equals(100L));
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap16);
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        defaultedMap16.clear();
        boolean b22 = defaultedMap16.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        java.util.Set set33 = defaultedMap31.entrySet();
        java.util.Set set34 = defaultedMap31.keySet();
        java.lang.Object obj35 = defaultedMap24.get((java.lang.Object) set34);
        boolean b36 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        java.util.Collection collection40 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap24.remove((java.lang.Object) collection40);
        java.lang.Object obj42 = defaultedMap6.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap19.clear();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        java.util.Collection collection26 = defaultedMap24.values();
        boolean b27 = defaultedMap19.containsKey((java.lang.Object) defaultedMap24);
        boolean b28 = defaultedMap24.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap41.clear();
        boolean b43 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap46.clear();
        java.util.Collection collection48 = defaultedMap46.values();
        boolean b49 = defaultedMap41.containsKey((java.lang.Object) defaultedMap46);
        boolean b50 = defaultedMap34.equals((java.lang.Object) defaultedMap46);
        boolean b52 = defaultedMap34.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj59 = defaultedMap54.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap58);
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) (short) 10);
        java.util.Set set62 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap64.clear();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 10.0d);
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap64);
        boolean b70 = defaultedMap5.containsValue((java.lang.Object) map69);
        int i71 = defaultedMap5.size();
        boolean b72 = defaultedMap5.isEmpty();
        boolean b73 = defaultedMap5.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Collection collection19 = defaultedMap17.values();
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        boolean b28 = defaultedMap26.isEmpty();
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap26.containsKey((java.lang.Object) defaultedMap31);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate35, predicate36);
        java.lang.Object obj39 = defaultedMap31.remove((java.lang.Object) true);
        java.util.Collection collection40 = defaultedMap31.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        boolean b44 = defaultedMap42.isEmpty();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap49.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj54 = defaultedMap49.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap56.clear();
        boolean b58 = defaultedMap56.isEmpty();
        defaultedMap56.clear();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) defaultedMap56);
        java.lang.Object obj61 = defaultedMap31.put((java.lang.Object) predicate46, (java.lang.Object) map60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap63.clear();
        boolean b65 = defaultedMap63.isEmpty();
        defaultedMap63.clear();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap68.clear();
        java.util.Collection collection70 = defaultedMap68.values();
        boolean b71 = defaultedMap63.containsKey((java.lang.Object) defaultedMap68);
        defaultedMap31.putAll((java.util.Map) defaultedMap63);
        boolean b73 = defaultedMap1.equals((java.lang.Object) defaultedMap31);
        boolean b75 = defaultedMap1.containsKey((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        boolean b19 = defaultedMap17.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) predicate21, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        boolean b46 = defaultedMap38.containsKey((java.lang.Object) defaultedMap43);
        defaultedMap6.putAll((java.util.Map) defaultedMap38);
        int i48 = defaultedMap6.size();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap50.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap57.clear();
        boolean b59 = defaultedMap57.isEmpty();
        defaultedMap57.clear();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap62.clear();
        java.util.Collection collection64 = defaultedMap62.values();
        boolean b65 = defaultedMap57.containsKey((java.lang.Object) defaultedMap62);
        boolean b66 = defaultedMap50.equals((java.lang.Object) defaultedMap62);
        boolean b68 = defaultedMap50.containsValue((java.lang.Object) (byte) 10);
        java.util.Set set69 = defaultedMap50.entrySet();
        boolean b70 = defaultedMap6.equals((java.lang.Object) set69);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(i48 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        java.util.Set set12 = defaultedMap6.entrySet();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) defaultedMap8);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10.0d);
        defaultedMap1.clear();
        java.lang.String str6 = defaultedMap1.toString();
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        java.util.Set set7 = defaultedMap1.keySet();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        boolean b13 = defaultedMap11.isEmpty();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap16.clear();
        java.util.Collection collection18 = defaultedMap16.values();
        boolean b19 = defaultedMap11.containsKey((java.lang.Object) defaultedMap16);
        java.util.Set set20 = defaultedMap11.keySet();
        boolean b21 = defaultedMap5.containsValue((java.lang.Object) set20);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.lang.String str34 = defaultedMap32.toString();
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) defaultedMap32);
        java.util.Set set36 = defaultedMap19.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap12.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap16);
        boolean b19 = defaultedMap16.containsKey((java.lang.Object) (short) 10);
        defaultedMap16.clear();
        boolean b22 = defaultedMap16.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        java.util.Set set33 = defaultedMap31.entrySet();
        java.util.Set set34 = defaultedMap31.keySet();
        java.lang.Object obj35 = defaultedMap24.get((java.lang.Object) set34);
        boolean b36 = defaultedMap24.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        java.util.Collection collection40 = defaultedMap38.values();
        java.lang.Object obj41 = defaultedMap24.remove((java.lang.Object) collection40);
        java.lang.Object obj42 = defaultedMap6.put((java.lang.Object) defaultedMap16, (java.lang.Object) defaultedMap24);
        java.lang.String str43 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj50 = defaultedMap45.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap49);
        boolean b52 = defaultedMap49.containsKey((java.lang.Object) (short) 10);
        boolean b54 = defaultedMap49.containsValue((java.lang.Object) 1L);
        java.lang.Object obj56 = defaultedMap49.get((java.lang.Object) "");
        defaultedMap6.putAll((java.util.Map) defaultedMap49);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{{}={-1={}}}" + "'", str43.equals("{{}={-1={}}}"));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 100L + "'", obj56.equals(100L));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap16.clear();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap16.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap20);
        boolean b23 = defaultedMap20.containsKey((java.lang.Object) (short) 10);
        java.util.Set set24 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        java.lang.Object obj29 = defaultedMap26.remove((java.lang.Object) 10.0d);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.util.Set set34 = defaultedMap32.entrySet();
        boolean b35 = defaultedMap26.containsKey((java.lang.Object) set34);
        boolean b36 = defaultedMap6.containsValue((java.lang.Object) defaultedMap26);
        java.lang.String str37 = defaultedMap26.toString();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap5.remove((java.lang.Object) 10.0f);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.util.Set set25 = defaultedMap22.keySet();
        java.lang.Object obj26 = defaultedMap15.get((java.lang.Object) set25);
        boolean b27 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap29.clear();
        java.util.Collection collection31 = defaultedMap29.values();
        java.lang.Object obj32 = defaultedMap15.remove((java.lang.Object) collection31);
        boolean b33 = defaultedMap15.isEmpty();
        java.lang.String str34 = defaultedMap15.toString();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 10);
        java.lang.Object obj37 = defaultedMap5.remove((java.lang.Object) map36);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100L + "'", obj26.equals(100L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{-1={}}" + "'", str34.equals("{-1={}}"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.lang.Object obj14 = defaultedMap11.remove((java.lang.Object) 10.0d);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        java.util.Set set16 = defaultedMap5.entrySet();
        java.util.Set set17 = defaultedMap5.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap6.equals(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap14.clear();
        boolean b16 = defaultedMap14.isEmpty();
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap19.clear();
        java.util.Collection collection21 = defaultedMap19.values();
        boolean b22 = defaultedMap14.containsKey((java.lang.Object) defaultedMap19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate23, predicate24);
        defaultedMap6.putAll((java.util.Map) defaultedMap19);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap6.equals(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        boolean b30 = defaultedMap22.containsKey((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.util.Collection collection34 = defaultedMap32.values();
        boolean b35 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        boolean b39 = defaultedMap37.isEmpty();
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        java.util.Collection collection44 = defaultedMap42.values();
        boolean b45 = defaultedMap37.containsKey((java.lang.Object) defaultedMap42);
        boolean b46 = defaultedMap42.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate48);
        java.lang.Object obj53 = defaultedMap6.get((java.lang.Object) predicate20);
        collections.Transformer transformer54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100L + "'", obj53.equals(100L));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        boolean b15 = defaultedMap13.isEmpty();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj19 = defaultedMap5.remove((java.lang.Object) predicate17);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap5.equals(obj20);
        java.util.Set set22 = defaultedMap5.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        boolean b26 = defaultedMap24.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj43 = defaultedMap13.put((java.lang.Object) predicate28, (java.lang.Object) map42);
        collections.Predicate predicate44 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap46.clear();
        boolean b48 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        java.util.Collection collection53 = defaultedMap51.values();
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) defaultedMap51);
        boolean b55 = defaultedMap51.isEmpty();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate44, predicate57);
        boolean b60 = defaultedMap5.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap66);
        boolean b69 = defaultedMap66.containsKey((java.lang.Object) (short) 10);
        java.util.Set set70 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap74.clear();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap79.clear();
        java.util.Collection collection81 = defaultedMap79.values();
        boolean b82 = defaultedMap74.containsKey((java.lang.Object) defaultedMap79);
        boolean b83 = defaultedMap79.isEmpty();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate84, predicate85);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap88.clear();
        java.util.Collection collection90 = defaultedMap88.values();
        defaultedMap88.clear();
        java.util.Set set92 = defaultedMap88.entrySet();
        java.util.Map map93 = collections.map.DefaultedMap.decorate(map86, (java.lang.Object) set92);
        boolean b94 = defaultedMap72.containsValue((java.lang.Object) map86);
        java.lang.Object obj95 = defaultedMap66.remove((java.lang.Object) defaultedMap72);
        java.lang.Object obj96 = defaultedMap13.get((java.lang.Object) defaultedMap66);
        collections.Transformer transformer97 = null;
        try {
            java.util.Map map98 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap66, transformer97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + 100L + "'", obj96.equals(100L));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        java.util.Collection collection20 = defaultedMap1.values();
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap10.clear();
        java.util.Set set12 = defaultedMap10.entrySet();
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) set12);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap25);
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) (short) 10);
        java.util.Set set29 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 10.0d);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b39 = defaultedMap31.equals((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap45);
        boolean b47 = defaultedMap31.containsValue((java.lang.Object) defaultedMap41);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 0L);
        java.lang.Object obj13 = defaultedMap5.remove((java.lang.Object) 10.0f);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap19.clear();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        java.util.Collection collection26 = defaultedMap24.values();
        boolean b27 = defaultedMap19.containsKey((java.lang.Object) defaultedMap24);
        boolean b28 = defaultedMap24.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate30);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        java.util.Set set44 = defaultedMap42.entrySet();
        java.util.Set set45 = defaultedMap42.keySet();
        java.lang.Object obj46 = defaultedMap35.get((java.lang.Object) set45);
        boolean b47 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap49.clear();
        java.util.Collection collection51 = defaultedMap49.values();
        java.lang.Object obj52 = defaultedMap35.remove((java.lang.Object) collection51);
        boolean b53 = defaultedMap35.isEmpty();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj60 = defaultedMap55.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap59);
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) (short) 10);
        boolean b64 = defaultedMap59.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap66.clear();
        boolean b68 = defaultedMap66.isEmpty();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate69, predicate70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap73.clear();
        boolean b75 = defaultedMap73.isEmpty();
        defaultedMap73.clear();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap78.clear();
        java.util.Collection collection80 = defaultedMap78.values();
        boolean b81 = defaultedMap73.containsKey((java.lang.Object) defaultedMap78);
        boolean b82 = defaultedMap78.isEmpty();
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate70, predicate84);
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate84, predicate87);
        java.util.Map map89 = collections.map.PredicatedMap.decorate(map32, predicate33, predicate87);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        java.util.Collection collection39 = defaultedMap37.values();
        boolean b40 = defaultedMap32.containsKey((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        java.util.Collection collection44 = defaultedMap42.values();
        boolean b45 = defaultedMap32.equals((java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = defaultedMap19.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap55.clear();
        boolean b57 = defaultedMap55.isEmpty();
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap60.clear();
        java.util.Collection collection62 = defaultedMap60.values();
        boolean b63 = defaultedMap55.containsKey((java.lang.Object) defaultedMap60);
        boolean b64 = defaultedMap48.equals((java.lang.Object) defaultedMap60);
        boolean b66 = defaultedMap48.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap68.clear();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj73 = defaultedMap68.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap72);
        boolean b75 = defaultedMap72.containsKey((java.lang.Object) (short) 10);
        java.util.Set set76 = defaultedMap72.entrySet();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap78.clear();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) 10.0d);
        defaultedMap72.putAll((java.util.Map) defaultedMap78);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap48, (java.lang.Object) defaultedMap78);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b86 = defaultedMap78.equals((java.lang.Object) 100L);
        boolean b87 = defaultedMap32.containsValue((java.lang.Object) b86);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100L + "'", obj46.equals(100L));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertTrue(b87 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Collection collection17 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) collection17);
        boolean b19 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        java.util.Collection collection28 = defaultedMap26.values();
        boolean b29 = defaultedMap21.containsKey((java.lang.Object) defaultedMap26);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate30, predicate31);
        java.lang.Object obj34 = defaultedMap26.remove((java.lang.Object) true);
        java.util.Collection collection35 = defaultedMap26.values();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        java.util.Set set14 = defaultedMap1.keySet();
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) "{-1={}}");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap9);
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        java.util.Collection collection20 = defaultedMap18.values();
        boolean b21 = defaultedMap13.containsKey((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap23.clear();
        java.util.Collection collection25 = defaultedMap23.values();
        boolean b26 = defaultedMap13.equals((java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap28.clear();
        boolean b30 = defaultedMap28.isEmpty();
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap33.clear();
        java.util.Collection collection35 = defaultedMap33.values();
        boolean b36 = defaultedMap28.containsKey((java.lang.Object) defaultedMap33);
        boolean b37 = defaultedMap33.isEmpty();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate38, predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate11, predicate39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) map43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap46.clear();
        java.lang.Object obj49 = defaultedMap46.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        boolean b53 = defaultedMap51.isEmpty();
        java.lang.Object obj54 = defaultedMap46.get((java.lang.Object) defaultedMap51);
        java.util.Set set55 = defaultedMap46.entrySet();
        boolean b56 = defaultedMap44.containsKey((java.lang.Object) set55);
        boolean b57 = defaultedMap1.containsValue((java.lang.Object) set55);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100L + "'", obj54.equals(100L));
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap10.clear();
        java.util.Set set12 = defaultedMap10.entrySet();
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Set set17 = defaultedMap15.entrySet();
        java.util.Set set18 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        java.util.Set set29 = defaultedMap27.entrySet();
        java.util.Set set30 = defaultedMap27.keySet();
        java.lang.Object obj31 = defaultedMap20.get((java.lang.Object) set30);
        boolean b32 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap20.remove((java.lang.Object) collection36);
        java.lang.Object obj38 = defaultedMap5.put((java.lang.Object) set18, (java.lang.Object) defaultedMap20);
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Collection collection17 = defaultedMap15.values();
        java.lang.Object obj18 = defaultedMap1.remove((java.lang.Object) collection17);
        boolean b19 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        java.lang.String str23 = defaultedMap21.toString();
        java.util.Set set24 = defaultedMap21.entrySet();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap31);
        boolean b34 = defaultedMap31.containsKey((java.lang.Object) (short) 10);
        defaultedMap31.clear();
        boolean b37 = defaultedMap31.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap39.clear();
        boolean b41 = defaultedMap39.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate42, predicate43);
        java.lang.Object obj45 = defaultedMap31.remove((java.lang.Object) predicate43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap47.clear();
        boolean b49 = defaultedMap47.isEmpty();
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap52.clear();
        java.util.Collection collection54 = defaultedMap52.values();
        boolean b55 = defaultedMap47.containsKey((java.lang.Object) defaultedMap52);
        boolean b56 = defaultedMap52.isEmpty();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate58);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap61.clear();
        java.util.Collection collection63 = defaultedMap61.values();
        defaultedMap61.clear();
        java.util.Set set65 = defaultedMap61.entrySet();
        java.util.Map map66 = collections.map.DefaultedMap.decorate(map59, (java.lang.Object) set65);
        java.lang.Object obj67 = defaultedMap21.put((java.lang.Object) predicate43, (java.lang.Object) map66);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj67);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.lang.String str9 = defaultedMap5.toString();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap14.clear();
        boolean b16 = defaultedMap14.isEmpty();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = defaultedMap21.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        boolean b34 = defaultedMap32.isEmpty();
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        java.util.Collection collection39 = defaultedMap37.values();
        boolean b40 = defaultedMap32.containsKey((java.lang.Object) defaultedMap37);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate41, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate41);
        java.util.Map map45 = collections.map.PredicatedMap.decorate(map12, predicate17, predicate41);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap47.clear();
        boolean b49 = defaultedMap47.isEmpty();
        defaultedMap47.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap52.clear();
        java.util.Collection collection54 = defaultedMap52.values();
        boolean b55 = defaultedMap47.containsKey((java.lang.Object) defaultedMap52);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate56, predicate57);
        java.lang.Object obj60 = defaultedMap52.remove((java.lang.Object) true);
        java.util.Collection collection61 = defaultedMap52.values();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap63.clear();
        boolean b65 = defaultedMap63.isEmpty();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap70.clear();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj75 = defaultedMap70.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap77.clear();
        boolean b79 = defaultedMap77.isEmpty();
        defaultedMap77.clear();
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) defaultedMap77);
        java.lang.Object obj82 = defaultedMap52.put((java.lang.Object) predicate67, (java.lang.Object) map81);
        java.util.Map map83 = collections.map.DefaultedMap.decorate(map12, (java.lang.Object) map81);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        java.lang.String str15 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate11, predicate12);
        int i14 = defaultedMap6.size();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        boolean b11 = defaultedMap5.containsKey((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        java.util.Collection collection20 = defaultedMap18.values();
        boolean b21 = defaultedMap13.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        java.lang.Object obj26 = defaultedMap18.remove((java.lang.Object) true);
        java.lang.Object obj27 = defaultedMap5.get((java.lang.Object) defaultedMap18);
        java.lang.String str28 = defaultedMap18.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        java.lang.String str10 = defaultedMap5.toString();
        boolean b12 = defaultedMap5.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) false);
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) false);
        java.util.Set set20 = defaultedMap1.entrySet();
        java.util.Set set21 = defaultedMap1.keySet();
        java.util.Set set22 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        boolean b19 = defaultedMap17.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) predicate21, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        boolean b46 = defaultedMap38.containsKey((java.lang.Object) defaultedMap43);
        defaultedMap6.putAll((java.util.Map) defaultedMap38);
        boolean b48 = defaultedMap38.isEmpty();
        java.util.Set set49 = defaultedMap38.keySet();
        java.util.Set set50 = defaultedMap38.entrySet();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap5.clear();
        java.lang.String str7 = defaultedMap5.toString();
        java.util.Set set8 = defaultedMap5.entrySet();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) set8);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap10.clear();
        java.util.Set set12 = defaultedMap10.entrySet();
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Set set17 = defaultedMap15.entrySet();
        java.util.Set set18 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        java.util.Set set29 = defaultedMap27.entrySet();
        java.util.Set set30 = defaultedMap27.keySet();
        java.lang.Object obj31 = defaultedMap20.get((java.lang.Object) set30);
        boolean b32 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap20.remove((java.lang.Object) collection36);
        java.lang.Object obj38 = defaultedMap5.put((java.lang.Object) set18, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap45.clear();
        boolean b47 = defaultedMap45.isEmpty();
        java.lang.Object obj48 = defaultedMap40.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap5.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        java.util.Set set53 = defaultedMap51.entrySet();
        boolean b54 = defaultedMap5.equals((java.lang.Object) set53);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100L + "'", obj48.equals(100L));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue(b54 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        java.util.Collection collection28 = defaultedMap26.values();
        boolean b29 = defaultedMap21.containsKey((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap21.equals((java.lang.Object) defaultedMap31);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        java.util.Set set36 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        boolean b10 = defaultedMap5.containsValue((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap19.clear();
        boolean b21 = defaultedMap19.isEmpty();
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        java.util.Collection collection26 = defaultedMap24.values();
        boolean b27 = defaultedMap19.containsKey((java.lang.Object) defaultedMap24);
        boolean b28 = defaultedMap24.isEmpty();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate29, predicate30);
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate16, predicate30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap34.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap41.clear();
        boolean b43 = defaultedMap41.isEmpty();
        defaultedMap41.clear();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap46.clear();
        java.util.Collection collection48 = defaultedMap46.values();
        boolean b49 = defaultedMap41.containsKey((java.lang.Object) defaultedMap46);
        boolean b50 = defaultedMap34.equals((java.lang.Object) defaultedMap46);
        boolean b52 = defaultedMap34.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj59 = defaultedMap54.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap58);
        boolean b61 = defaultedMap58.containsKey((java.lang.Object) (short) 10);
        java.util.Set set62 = defaultedMap58.entrySet();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap64.clear();
        java.lang.Object obj67 = defaultedMap64.remove((java.lang.Object) 10.0d);
        defaultedMap58.putAll((java.util.Map) defaultedMap64);
        java.util.Map map69 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) defaultedMap64);
        boolean b70 = defaultedMap5.containsValue((java.lang.Object) map69);
        int i71 = defaultedMap5.size();
        java.util.Set set72 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap74.clear();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap79.clear();
        java.util.Collection collection81 = defaultedMap79.values();
        boolean b82 = defaultedMap74.containsKey((java.lang.Object) defaultedMap79);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate83, predicate84);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap87.clear();
        boolean b89 = defaultedMap87.isEmpty();
        defaultedMap87.clear();
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap92.clear();
        java.util.Collection collection94 = defaultedMap92.values();
        boolean b95 = defaultedMap87.containsKey((java.lang.Object) defaultedMap92);
        collections.Predicate predicate96 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate97 = collections.PredicateUtils.truePredicate();
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap92, predicate96, predicate97);
        java.util.Map map99 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate84, predicate96);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertTrue(i71 == 0);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertNotNull(map99);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        defaultedMap6.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        boolean b15 = defaultedMap13.isEmpty();
        defaultedMap13.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        java.util.Collection collection20 = defaultedMap18.values();
        boolean b21 = defaultedMap13.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate22, predicate23);
        java.lang.Object obj26 = defaultedMap18.remove((java.lang.Object) true);
        java.util.Collection collection27 = defaultedMap18.values();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap29.clear();
        boolean b31 = defaultedMap29.isEmpty();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap36.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj41 = defaultedMap36.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap43.clear();
        boolean b45 = defaultedMap43.isEmpty();
        defaultedMap43.clear();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) defaultedMap43);
        java.lang.Object obj48 = defaultedMap18.put((java.lang.Object) predicate33, (java.lang.Object) map47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap50.clear();
        boolean b52 = defaultedMap50.isEmpty();
        defaultedMap50.clear();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap55.clear();
        java.util.Collection collection57 = defaultedMap55.values();
        boolean b58 = defaultedMap50.containsKey((java.lang.Object) defaultedMap55);
        defaultedMap18.putAll((java.util.Map) defaultedMap50);
        boolean b60 = defaultedMap6.containsValue((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap50);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.lang.Object obj4 = defaultedMap1.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        boolean b8 = defaultedMap6.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set10 = defaultedMap6.entrySet();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap6.get(obj11);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap12);
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) set19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        java.util.Set set24 = defaultedMap22.entrySet();
        java.util.Set set25 = defaultedMap22.keySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        java.util.Set set36 = defaultedMap34.entrySet();
        java.util.Set set37 = defaultedMap34.keySet();
        java.lang.Object obj38 = defaultedMap27.get((java.lang.Object) set37);
        boolean b39 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap41.clear();
        java.util.Collection collection43 = defaultedMap41.values();
        java.lang.Object obj44 = defaultedMap27.remove((java.lang.Object) collection43);
        java.lang.Object obj45 = defaultedMap12.put((java.lang.Object) set25, (java.lang.Object) defaultedMap27);
        boolean b46 = defaultedMap5.containsValue((java.lang.Object) set25);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap48.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap55.clear();
        boolean b57 = defaultedMap55.isEmpty();
        defaultedMap55.clear();
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) defaultedMap55);
        boolean b60 = defaultedMap5.equals((java.lang.Object) defaultedMap52);
        boolean b61 = defaultedMap52.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap63.clear();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj68 = defaultedMap63.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap67);
        java.lang.Object obj71 = defaultedMap63.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap74.clear();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap79.clear();
        java.util.Collection collection81 = defaultedMap79.values();
        boolean b82 = defaultedMap74.containsKey((java.lang.Object) defaultedMap79);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate83, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate72, predicate83);
        java.lang.Object obj87 = defaultedMap52.get((java.lang.Object) predicate83);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100L + "'", obj38.equals(100L));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 100L + "'", obj87.equals(100L));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        boolean b10 = defaultedMap6.isEmpty();
        int i11 = defaultedMap6.size();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap18);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap22.clear();
        boolean b24 = defaultedMap22.isEmpty();
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        java.util.Collection collection29 = defaultedMap27.values();
        boolean b30 = defaultedMap22.containsKey((java.lang.Object) defaultedMap27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.util.Collection collection34 = defaultedMap32.values();
        boolean b35 = defaultedMap22.equals((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        boolean b39 = defaultedMap37.isEmpty();
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        java.util.Collection collection44 = defaultedMap42.values();
        boolean b45 = defaultedMap37.containsKey((java.lang.Object) defaultedMap42);
        boolean b46 = defaultedMap42.isEmpty();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate20, predicate48);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap55.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj60 = defaultedMap55.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap59);
        boolean b62 = defaultedMap59.containsKey((java.lang.Object) (short) 10);
        java.util.Set set63 = defaultedMap59.entrySet();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap65.clear();
        java.lang.Object obj68 = defaultedMap65.remove((java.lang.Object) 10.0d);
        defaultedMap59.putAll((java.util.Map) defaultedMap65);
        java.util.Collection collection70 = defaultedMap59.values();
        boolean b71 = defaultedMap1.containsValue((java.lang.Object) defaultedMap59);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        boolean b19 = defaultedMap17.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) predicate21, (java.lang.Object) map35);
        collections.Predicate predicate37 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap39.clear();
        boolean b41 = defaultedMap39.isEmpty();
        defaultedMap39.clear();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap44.clear();
        java.util.Collection collection46 = defaultedMap44.values();
        boolean b47 = defaultedMap39.containsKey((java.lang.Object) defaultedMap44);
        boolean b48 = defaultedMap44.isEmpty();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate37, predicate50);
        java.lang.String str53 = defaultedMap6.toString();
        int i54 = defaultedMap6.size();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue(i54 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        java.util.Collection collection13 = defaultedMap11.values();
        defaultedMap11.clear();
        java.util.Set set15 = defaultedMap11.entrySet();
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100L + "'", obj16.equals(100L));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap5.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Collection collection19 = defaultedMap17.values();
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        boolean b21 = defaultedMap5.equals((java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap23.clear();
        java.util.Collection collection25 = defaultedMap23.values();
        defaultedMap23.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap42.clear();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap47.clear();
        java.util.Collection collection49 = defaultedMap47.values();
        boolean b50 = defaultedMap42.containsKey((java.lang.Object) defaultedMap47);
        boolean b51 = defaultedMap35.equals((java.lang.Object) defaultedMap47);
        java.util.Set set52 = defaultedMap35.keySet();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap54.clear();
        boolean b56 = defaultedMap54.isEmpty();
        defaultedMap54.clear();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap59.clear();
        java.util.Collection collection61 = defaultedMap59.values();
        boolean b62 = defaultedMap54.containsKey((java.lang.Object) defaultedMap59);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate63, predicate64);
        java.lang.Object obj67 = defaultedMap59.remove((java.lang.Object) true);
        java.util.Collection collection68 = defaultedMap59.values();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap70.clear();
        boolean b72 = defaultedMap70.isEmpty();
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap77.clear();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj82 = defaultedMap77.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap84.clear();
        boolean b86 = defaultedMap84.isEmpty();
        defaultedMap84.clear();
        java.util.Map map88 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) defaultedMap84);
        java.lang.Object obj89 = defaultedMap59.put((java.lang.Object) predicate74, (java.lang.Object) map88);
        java.lang.Object obj90 = defaultedMap32.put((java.lang.Object) set52, (java.lang.Object) map88);
        java.lang.Object obj91 = defaultedMap23.get((java.lang.Object) set52);
        boolean b92 = defaultedMap5.equals((java.lang.Object) set52);
        java.lang.Object obj93 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + obj91 + "' != '" + 100L + "'", obj91.equals(100L));
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap18.clear();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap18);
        boolean b23 = defaultedMap5.containsKey((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        boolean b27 = defaultedMap25.isEmpty();
        defaultedMap25.clear();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap30.clear();
        java.util.Collection collection32 = defaultedMap30.values();
        boolean b33 = defaultedMap25.containsKey((java.lang.Object) defaultedMap30);
        java.util.Set set34 = defaultedMap25.entrySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap25);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        boolean b19 = defaultedMap17.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) predicate21, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        boolean b46 = defaultedMap38.containsKey((java.lang.Object) defaultedMap43);
        boolean b47 = defaultedMap43.isEmpty();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        boolean b51 = defaultedMap6.containsValue((java.lang.Object) predicate49);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        java.util.Set set9 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        boolean b20 = defaultedMap18.isEmpty();
        defaultedMap18.clear();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap18);
        boolean b23 = defaultedMap5.containsKey((java.lang.Object) defaultedMap15);
        defaultedMap5.clear();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        java.lang.Object obj19 = defaultedMap1.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        boolean b23 = defaultedMap21.isEmpty();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap26.clear();
        java.util.Collection collection28 = defaultedMap26.values();
        boolean b29 = defaultedMap21.containsKey((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap21.equals((java.lang.Object) defaultedMap31);
        java.lang.Object obj35 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        java.lang.String str36 = defaultedMap31.toString();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        java.util.Set set10 = defaultedMap8.entrySet();
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) set11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap19);
        boolean b22 = defaultedMap19.containsKey((java.lang.Object) (short) 10);
        java.util.Set set23 = defaultedMap19.entrySet();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap25.remove((java.lang.Object) 10.0d);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj30 = defaultedMap1.remove((java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap32.clear();
        java.lang.String str34 = defaultedMap32.toString();
        java.lang.Object obj35 = defaultedMap19.get((java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap37.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj42 = defaultedMap37.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap45.clear();
        boolean b47 = defaultedMap45.isEmpty();
        defaultedMap45.clear();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap50.clear();
        java.util.Collection collection52 = defaultedMap50.values();
        boolean b53 = defaultedMap45.containsKey((java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap55.clear();
        java.util.Collection collection57 = defaultedMap55.values();
        boolean b58 = defaultedMap45.equals((java.lang.Object) defaultedMap55);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap60.clear();
        boolean b62 = defaultedMap60.isEmpty();
        defaultedMap60.clear();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap65.clear();
        java.util.Collection collection67 = defaultedMap65.values();
        boolean b68 = defaultedMap60.containsKey((java.lang.Object) defaultedMap65);
        boolean b69 = defaultedMap65.isEmpty();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate70, predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate71, predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) map75);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap78.clear();
        java.lang.Object obj81 = defaultedMap78.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap83.clear();
        boolean b85 = defaultedMap83.isEmpty();
        java.lang.Object obj86 = defaultedMap78.get((java.lang.Object) defaultedMap83);
        java.util.Set set87 = defaultedMap78.entrySet();
        boolean b88 = defaultedMap76.containsKey((java.lang.Object) set87);
        java.lang.Object obj89 = defaultedMap32.remove((java.lang.Object) b88);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 100L + "'", obj86.equals(100L));
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) -1);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Collection collection19 = defaultedMap17.values();
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate21);
        boolean b25 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 10L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap13);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap21.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap25);
        boolean b28 = defaultedMap25.containsKey((java.lang.Object) (short) 10);
        java.util.Set set29 = defaultedMap25.entrySet();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        java.lang.Object obj34 = defaultedMap31.remove((java.lang.Object) 10.0d);
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b39 = defaultedMap31.equals((java.lang.Object) 100L);
        boolean b41 = defaultedMap31.containsKey((java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.equals(obj5);
        java.util.Set set7 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap10.clear();
        java.util.Set set12 = defaultedMap10.entrySet();
        java.lang.Object obj13 = defaultedMap5.get((java.lang.Object) set12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap15.clear();
        java.util.Set set17 = defaultedMap15.entrySet();
        java.util.Set set18 = defaultedMap15.keySet();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap20.clear();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap20.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap27.clear();
        java.util.Set set29 = defaultedMap27.entrySet();
        java.util.Set set30 = defaultedMap27.keySet();
        java.lang.Object obj31 = defaultedMap20.get((java.lang.Object) set30);
        boolean b32 = defaultedMap20.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap34.clear();
        java.util.Collection collection36 = defaultedMap34.values();
        java.lang.Object obj37 = defaultedMap20.remove((java.lang.Object) collection36);
        java.lang.Object obj38 = defaultedMap5.put((java.lang.Object) set18, (java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap40.remove((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap45.clear();
        boolean b47 = defaultedMap45.isEmpty();
        java.lang.Object obj48 = defaultedMap40.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = defaultedMap5.get((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        boolean b53 = defaultedMap51.isEmpty();
        defaultedMap51.clear();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap56.clear();
        java.util.Collection collection58 = defaultedMap56.values();
        boolean b59 = defaultedMap51.containsKey((java.lang.Object) defaultedMap56);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap61.clear();
        boolean b63 = defaultedMap61.isEmpty();
        defaultedMap61.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap66.clear();
        java.util.Collection collection68 = defaultedMap66.values();
        boolean b69 = defaultedMap61.containsKey((java.lang.Object) defaultedMap66);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap71.clear();
        java.util.Collection collection73 = defaultedMap71.values();
        boolean b74 = defaultedMap61.equals((java.lang.Object) defaultedMap71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap76.clear();
        boolean b78 = defaultedMap76.isEmpty();
        defaultedMap76.clear();
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap81.clear();
        java.util.Collection collection83 = defaultedMap81.values();
        boolean b84 = defaultedMap76.containsKey((java.lang.Object) defaultedMap81);
        boolean b85 = defaultedMap81.isEmpty();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap81, predicate86, predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate87, predicate89);
        boolean b91 = defaultedMap56.containsKey((java.lang.Object) predicate89);
        defaultedMap40.putAll((java.util.Map) defaultedMap56);
        boolean b93 = defaultedMap40.isEmpty();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100L + "'", obj31.equals(100L));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100L + "'", obj48.equals(100L));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue(b93 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) true);
        java.util.Collection collection15 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        boolean b19 = defaultedMap17.isEmpty();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap24.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        boolean b33 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) defaultedMap31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) predicate21, (java.lang.Object) map35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap43.clear();
        java.util.Collection collection45 = defaultedMap43.values();
        boolean b46 = defaultedMap38.containsKey((java.lang.Object) defaultedMap43);
        defaultedMap6.putAll((java.util.Map) defaultedMap38);
        boolean b48 = defaultedMap38.isEmpty();
        java.util.Set set49 = defaultedMap38.keySet();
        boolean b50 = defaultedMap38.isEmpty();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        boolean b3 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap6.clear();
        java.util.Collection collection8 = defaultedMap6.values();
        boolean b9 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Set set10 = defaultedMap1.entrySet();
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap18.clear();
        java.util.Set set20 = defaultedMap18.entrySet();
        java.util.Set set21 = defaultedMap18.keySet();
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) set21);
        boolean b23 = defaultedMap11.isEmpty();
        java.util.Set set24 = defaultedMap11.keySet();
        boolean b26 = defaultedMap11.containsKey((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap28.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap35.clear();
        boolean b37 = defaultedMap35.isEmpty();
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap40.clear();
        java.util.Collection collection42 = defaultedMap40.values();
        boolean b43 = defaultedMap35.containsKey((java.lang.Object) defaultedMap40);
        boolean b44 = defaultedMap28.equals((java.lang.Object) defaultedMap40);
        java.lang.Object obj46 = defaultedMap28.remove((java.lang.Object) false);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap48.clear();
        boolean b50 = defaultedMap48.isEmpty();
        defaultedMap48.clear();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap53.clear();
        java.util.Collection collection55 = defaultedMap53.values();
        boolean b56 = defaultedMap48.containsKey((java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap58.clear();
        java.util.Collection collection60 = defaultedMap58.values();
        boolean b61 = defaultedMap48.equals((java.lang.Object) defaultedMap58);
        java.lang.Object obj62 = defaultedMap28.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap5.put((java.lang.Object) 1.0d, (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap65.clear();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj70 = defaultedMap65.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap69);
        boolean b72 = defaultedMap69.containsKey((java.lang.Object) (short) 10);
        java.util.Set set73 = defaultedMap69.entrySet();
        java.lang.Object obj74 = defaultedMap28.get((java.lang.Object) set73);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100L + "'", obj22.equals(100L));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 100L + "'", obj62.equals(100L));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 100L + "'", obj74.equals(100L));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) 10);
        defaultedMap5.clear();
        java.lang.String str10 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap12.clear();
        boolean b14 = defaultedMap12.isEmpty();
        defaultedMap12.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap17.clear();
        java.util.Collection collection19 = defaultedMap17.values();
        boolean b20 = defaultedMap12.containsKey((java.lang.Object) defaultedMap17);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate21, predicate22);
        java.lang.Object obj25 = defaultedMap17.remove((java.lang.Object) true);
        java.util.Collection collection26 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap28.clear();
        boolean b30 = defaultedMap28.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate31, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj40 = defaultedMap35.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap42.clear();
        boolean b44 = defaultedMap42.isEmpty();
        defaultedMap42.clear();
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) defaultedMap42);
        java.lang.Object obj47 = defaultedMap17.put((java.lang.Object) predicate32, (java.lang.Object) map46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap49.clear();
        boolean b51 = defaultedMap49.isEmpty();
        defaultedMap49.clear();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap54.clear();
        java.util.Collection collection56 = defaultedMap54.values();
        boolean b57 = defaultedMap49.containsKey((java.lang.Object) defaultedMap54);
        defaultedMap17.putAll((java.util.Map) defaultedMap49);
        defaultedMap5.putAll((java.util.Map) defaultedMap49);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap8.clear();
        boolean b10 = defaultedMap8.isEmpty();
        defaultedMap8.clear();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap13.clear();
        java.util.Collection collection15 = defaultedMap13.values();
        boolean b16 = defaultedMap8.containsKey((java.lang.Object) defaultedMap13);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate17, predicate18);
        java.lang.Object obj21 = defaultedMap13.remove((java.lang.Object) true);
        java.util.Collection collection22 = defaultedMap13.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap24.clear();
        boolean b26 = defaultedMap24.isEmpty();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate27, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap31.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap38.clear();
        boolean b40 = defaultedMap38.isEmpty();
        defaultedMap38.clear();
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap38);
        java.lang.Object obj43 = defaultedMap13.put((java.lang.Object) predicate28, (java.lang.Object) map42);
        collections.Predicate predicate44 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap46.clear();
        boolean b48 = defaultedMap46.isEmpty();
        defaultedMap46.clear();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap51.clear();
        java.util.Collection collection53 = defaultedMap51.values();
        boolean b54 = defaultedMap46.containsKey((java.lang.Object) defaultedMap51);
        boolean b55 = defaultedMap51.isEmpty();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate44, predicate57);
        boolean b60 = defaultedMap5.containsKey((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap62.clear();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj67 = defaultedMap62.put((java.lang.Object) (-1), (java.lang.Object) defaultedMap66);
        boolean b69 = defaultedMap66.containsKey((java.lang.Object) (short) 10);
        java.util.Set set70 = defaultedMap66.entrySet();
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap74.clear();
        boolean b76 = defaultedMap74.isEmpty();
        defaultedMap74.clear();
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap79.clear();
        java.util.Collection collection81 = defaultedMap79.values();
        boolean b82 = defaultedMap74.containsKey((java.lang.Object) defaultedMap79);
        boolean b83 = defaultedMap79.isEmpty();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap79, predicate84, predicate85);
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        defaultedMap88.clear();
        java.util.Collection collection90 = defaultedMap88.values();
        defaultedMap88.clear();
        java.util.Set set92 = defaultedMap88.entrySet();
        java.util.Map map93 = collections.map.DefaultedMap.decorate(map86, (java.lang.Object) set92);
        boolean b94 = defaultedMap72.containsValue((java.lang.Object) map86);
        java.lang.Object obj95 = defaultedMap66.remove((java.lang.Object) defaultedMap72);
        java.lang.Object obj96 = defaultedMap13.get((java.lang.Object) defaultedMap66);
        collections.Predicate predicate97 = collections.PredicateUtils.notNullPredicate();
        boolean b98 = defaultedMap13.equals((java.lang.Object) predicate97);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue(b94 == false);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + obj96 + "' != '" + 100L + "'", obj96.equals(100L));
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertTrue(b98 == false);
    }
}

